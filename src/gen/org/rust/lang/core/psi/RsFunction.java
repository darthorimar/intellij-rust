// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsFunctionOrLambda;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsGenericDeclaration;
import org.rust.lang.core.psi.ext.RsInnerAttributeOwner;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsAbstractable;
import org.rust.lang.core.psi.ext.RsUnsafetyOwner;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsFunctionStub;

public interface RsFunction extends RsFunctionOrLambda, RsQualifiedNamedElement, RsGenericDeclaration, RsInnerAttributeOwner, RsItemElement, RsAttrProcMacroOwner, RsNameIdentifierOwner, RsAbstractable, RsUnsafetyOwner, RsInferenceContextOwner, StubBasedPsiElement<RsFunctionStub> {

  @Nullable
  RsExternAbi getExternAbi();

  @Nullable
  RsRetType getRetType();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsValueParameterList getValueParameterList();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getConst();

  @NotNull
  PsiElement getFn();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getUnsafe();

}
