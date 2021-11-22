// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsStructOrEnumItemElement;
import org.rust.lang.core.psi.ext.RsFieldsOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsStructItemStub;

public interface RsStructItem extends RsStructOrEnumItemElement, RsFieldsOwner, StubBasedPsiElement<RsStructItemStub> {

  @Nullable
  RsBlockFields getBlockFields();

  @Nullable
  RsTupleFields getTupleFields();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getStruct();

}
