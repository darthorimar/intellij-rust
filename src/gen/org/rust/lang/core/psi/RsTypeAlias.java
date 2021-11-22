// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsGenericDeclaration;
import org.rust.lang.core.psi.ext.RsAbstractable;
import org.rust.lang.core.psi.ext.RsTypeDeclarationElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsTypeAliasStub;

public interface RsTypeAlias extends RsQualifiedNamedElement, RsItemElement, RsAttrProcMacroOwner, RsNameIdentifierOwner, RsGenericDeclaration, RsAbstractable, RsTypeDeclarationElement, StubBasedPsiElement<RsTypeAliasStub> {

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getEq();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getTypeKw();

  @NotNull
  PsiElement getIdentifier();

}
