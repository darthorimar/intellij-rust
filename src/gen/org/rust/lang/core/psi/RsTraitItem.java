// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsTraitOrImpl;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsUnsafetyOwner;
import org.rust.lang.core.psi.ext.RsInnerAttributeOwner;
import org.rust.lang.core.psi.ext.RsTypeDeclarationElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsTraitItemStub;

public interface RsTraitItem extends RsTraitOrImpl, RsQualifiedNamedElement, RsNameIdentifierOwner, RsUnsafetyOwner, RsInnerAttributeOwner, RsTypeDeclarationElement, StubBasedPsiElement<RsTraitItemStub> {

  @Nullable
  RsMembers getMembers();

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  PsiElement getTrait();

  @Nullable
  PsiElement getUnsafe();

}
