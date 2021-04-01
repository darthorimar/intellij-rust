/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.lang.core.psi.ext

import com.intellij.util.ProcessingContext
import org.rust.lang.core.RsPsiPattern
import org.rust.lang.core.psi.RsFunction
import org.rust.lang.core.psi.RsMetaItem
import org.rust.lang.core.psi.RsMetaItemArgs
import org.rust.lang.core.psi.RsTraitItem

/**
 * Returns identifier name if path inside meta item consists only of this identifier.
 * Otherwise, returns `null`
 */
val RsMetaItem.name: String? get() {
    val path = path ?: return null
    if (path.hasColonColon) return null
    return path.referenceName
}

val RsMetaItem.id: String?
    get() = generateSequence(path) { it.path }
        .asIterable()
        .reversed()
        .takeIf { it.isNotEmpty() }
        ?.map { it.referenceName ?: return null }
        ?.joinToString("::")

val RsMetaItem.value: String? get() = litExpr?.stringValue

val RsMetaItem.hasEq: Boolean get() = greenStub?.hasEq ?: (eq != null)

fun RsMetaItem.resolveToDerivedTrait(): RsTraitItem? =
    path?.reference?.multiResolve()?.filterIsInstance<RsTraitItem>()?.singleOrNull()

fun RsMetaItem.resolveToProcMacro(): RsFunction? =
    path?.reference?.multiResolve()?.filterIsInstance<RsFunction>()?.singleOrNull()

val RsMetaItem.owner: RsDocAndAttributeOwner?
    get() = ancestorStrict<RsAttr>()?.owner

/**
 * In the case of `#[foo(bar)]`, the `foo(bar)` meta item is considered "root" but `bar` is not.
 * In the case of `#[cfg_attr(windows, foo(bar))]`, the `foo(bar)` is also considered "root" meta item
 * because after `cfg_attr` expanding the `foo(bar)` will turn into `#[foo(bar)]`.
 * This also applied to nested `cfg_attr`s, e.g. `#[cfg_attr(windows, cfg_attr(foobar, foo(bar)))]`
 */
fun RsMetaItem.isRootMetaItem(context: ProcessingContext? = null): Boolean {
    val parent = parent
    if (parent is RsAttr) {
        context?.put(RsPsiPattern.META_ITEM_ATTR, parent)
        return true
    }

    return isCfgAttrBody(context)
}

/**
 * ```
 * #[cfg_attr(condition, attr)]
 *                     //^
 * ```
 */
private fun RsMetaItem.isCfgAttrBody(context: ProcessingContext?): Boolean {
    val parent = parent as? RsMetaItemArgs ?: return false
    val parentMetaItem = parent.parent as? RsMetaItem ?: return false

    if (!parentMetaItem.isCfgAttrMetaItem(context)) return false

    val conditionPart = parent.metaItemList.firstOrNull()
    return this != conditionPart
}

/** `#[cfg_attr()]` */
private fun RsMetaItem.isCfgAttrMetaItem(context: ProcessingContext?): Boolean {
    return name == "cfg_attr" && isRootMetaItem(context)
}
