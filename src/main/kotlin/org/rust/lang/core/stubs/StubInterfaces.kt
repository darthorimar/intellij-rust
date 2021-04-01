/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.lang.core.stubs

import com.intellij.util.BitUtil
import org.rust.lang.core.psi.ext.QueryAttributes
import org.rust.lang.core.psi.ext.RsDocAndAttributeOwner
import org.rust.lang.core.psi.ext.getTraversedRawAttributes
import org.rust.lang.core.psi.ext.name
import org.rust.lang.core.resolve.KNOWN_DERIVABLE_TRAITS
import org.rust.stdext.BitFlagsBuilder

interface RsNamedStub {
    val name: String?
}

/**
 * These properties are stored in stubs for performance reasons: it's much cheaper to check
 * a flag in a stub then traverse a PSI
 */
interface RsAttributeOwnerStub {
    val hasAttrs: Boolean

    // #[cfg()]
    val mayHaveCfg: Boolean

    // #[cfg_attr()]
    val hasCfgAttr: Boolean

    // #[macro_use]
    val mayHaveMacroUse: Boolean

    // #[derive(FooBar)]
    val mayHaveCustomDerive: Boolean

    companion object : BitFlagsBuilder(Limit.BYTE) {
        val ATTRS_MASK: Int = nextBitMask()
        val CFG_MASK: Int = nextBitMask()
        val CFG_ATTR_MASK: Int = nextBitMask()
        val HAS_MACRO_USE_MASK: Int = nextBitMask()
        val HAS_CUSTOM_DERIVE: Int = nextBitMask()

        fun extractFlags(element: RsDocAndAttributeOwner): Int =
            extractFlags(element.getTraversedRawAttributes(withCfgAttrAttribute = true))

        fun extractFlags(attrs: QueryAttributes): Int {
            var hasAttrs = false
            var hasCfg = false
            var hasCfgAttr = false
            var hasMacroUse = false
            var hasCustomDerive = false
            for (meta in attrs.metaItems) {
                hasAttrs = true
                when (meta.name) {
                    "cfg" -> hasCfg = true
                    "cfg_attr" -> hasCfgAttr = true
                    "macro_use" -> hasMacroUse = true
                    "derive" -> {
                        hasCustomDerive = hasCustomDerive || meta.metaItemArgs?.metaItemList.orEmpty()
                            .any { KNOWN_DERIVABLE_TRAITS[it.name]?.isStd != true }
                    }
                }
            }
            var flags = 0
            flags = BitUtil.set(flags, ATTRS_MASK, hasAttrs)
            flags = BitUtil.set(flags, CFG_MASK, hasCfg)
            flags = BitUtil.set(flags, CFG_ATTR_MASK, hasCfgAttr)
            flags = BitUtil.set(flags, HAS_MACRO_USE_MASK, hasMacroUse)
            flags = BitUtil.set(flags, HAS_CUSTOM_DERIVE, hasCustomDerive)
            return flags
        }
    }
}
