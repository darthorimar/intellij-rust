// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsTraitOrImpl;
import org.rust.lang.core.psi.ext.RsUnsafetyOwner;
import org.rust.lang.core.psi.ext.RsInnerAttributeOwner;
import org.rust.lang.core.psi.ext.RsTypeDeclarationElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsImplItemStub;

public interface RsImplItem extends RsTraitOrImpl, RsUnsafetyOwner, RsInnerAttributeOwner, RsTypeDeclarationElement, StubBasedPsiElement<RsImplItemStub> {

  @Nullable
  RsMembers getMembers();

  @Nullable
  RsTraitRef getTraitRef();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getDotdot();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getConst();

  @Nullable
  PsiElement getFor();

  @NotNull
  PsiElement getImpl();

  @Nullable
  PsiElement getUnsafe();

}
