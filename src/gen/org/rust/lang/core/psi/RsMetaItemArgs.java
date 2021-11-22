// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;
import org.rust.lang.core.stubs.common.RsMetaItemArgsPsiOrStub;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsMetaItemArgsStub;

public interface RsMetaItemArgs extends RsElement, RsMetaItemArgsPsiOrStub, StubBasedPsiElement<RsMetaItemArgsStub> {

  @NotNull
  List<RsLitExpr> getLitExprList();

  @NotNull
  List<RsMetaItem> getMetaItemList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
