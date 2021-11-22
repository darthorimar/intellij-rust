// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsTupleExpr extends RsExpr {

  @NotNull
  List<RsExpr> getExprList();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
