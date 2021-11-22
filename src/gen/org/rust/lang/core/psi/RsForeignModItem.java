// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsInnerAttributeOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsForeignModStub;

public interface RsForeignModItem extends RsItemElement, RsAttrProcMacroOwner, RsInnerAttributeOwner, StubBasedPsiElement<RsForeignModStub> {

  @NotNull
  RsExternAbi getExternAbi();

  @NotNull
  List<RsInnerAttr> getInnerAttrList();

  @NotNull
  List<RsToBeUpped> getToBeUppedList();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getUnsafe();

}
