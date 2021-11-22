// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsAbstractable;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;
import org.rust.lang.core.macros.RsExpandedElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsConstantStub;

public interface RsConstant extends RsQualifiedNamedElement, RsNameIdentifierOwner, RsItemElement, RsAttrProcMacroOwner, RsAbstractable, RsInferenceContextOwner, RsExpandedElement, StubBasedPsiElement<RsConstantStub> {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getUnderscore();

  @Nullable
  PsiElement getConst();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getMut();

  @Nullable
  PsiElement getStatic();

}
