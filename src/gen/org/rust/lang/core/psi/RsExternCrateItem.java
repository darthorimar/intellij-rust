// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsExternCrateItemStub;

public interface RsExternCrateItem extends RsMandatoryReferenceElement, RsNameIdentifierOwner, RsItemElement, RsAttrProcMacroOwner, StubBasedPsiElement<RsExternCrateItemStub> {

  @Nullable
  RsAlias getAlias();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getCrate();

  @NotNull
  PsiElement getExtern();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getSelf();

}
