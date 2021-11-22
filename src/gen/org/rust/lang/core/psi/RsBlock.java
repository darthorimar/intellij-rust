// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsItemsOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public interface RsBlock extends RsItemsOwner, StubBasedPsiElement<RsPlaceholderStub> {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsInnerAttr> getInnerAttrList();

  @NotNull
  List<RsStmt> getStmtList();

  @NotNull
  List<RsToBeUpped> getToBeUppedList();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
