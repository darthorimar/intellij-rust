// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsStructOrEnumItemElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsEnumItemStub;

public interface RsEnumItem extends RsStructOrEnumItemElement, StubBasedPsiElement<RsEnumItemStub> {

  @Nullable
  RsEnumBody getEnumBody();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsWhereClause getWhereClause();

  @NotNull
  PsiElement getEnum();

  @Nullable
  PsiElement getIdentifier();

}
