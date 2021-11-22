// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsGenericDeclaration;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsTraitAliasStub;

public interface RsTraitAlias extends RsQualifiedNamedElement, RsItemElement, RsAttrProcMacroOwner, RsGenericDeclaration, RsNameIdentifierOwner, StubBasedPsiElement<RsTraitAliasStub> {

  @Nullable
  RsTraitAliasBounds getTraitAliasBounds();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsWhereClause getWhereClause();

  @NotNull
  PsiElement getEq();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getTrait();

}
