// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsReferenceElement;

public interface RsIndexExpr extends RsExpr, RsReferenceElement {

  @NotNull
  List<RsExpr> getExprList();

  @NotNull
  PsiElement getLbrack();

  @NotNull
  PsiElement getRbrack();

}
