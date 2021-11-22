// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsModDeclItemStub;

public interface RsModDeclItem extends RsMandatoryReferenceElement, RsNameIdentifierOwner, RsQualifiedNamedElement, RsItemElement, StubBasedPsiElement<RsModDeclItemStub> {

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getMod();

  @Nullable
  PsiElement getUnsafe();

}
