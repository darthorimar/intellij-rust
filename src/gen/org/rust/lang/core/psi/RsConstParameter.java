// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsGenericParameter;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsConstParameterStub;

public interface RsConstParameter extends RsGenericParameter, RsOuterAttributeOwner, RsInferenceContextOwner, StubBasedPsiElement<RsConstParameterStub> {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getConst();

  @Nullable
  PsiElement getIdentifier();

}
