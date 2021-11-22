// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsGenericParameter;
import org.rust.lang.core.psi.ext.RsTypeDeclarationElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsTypeParameterStub;

public interface RsTypeParameter extends RsGenericParameter, RsTypeDeclarationElement, RsOuterAttributeOwner, StubBasedPsiElement<RsTypeParameterStub> {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getIdentifier();

}
