// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsReplCodeFragmentElement extends RsElement {

  @NotNull
  List<RsExpr> getExprList();

  @NotNull
  List<RsMacroCall> getMacroCallList();

  @NotNull
  List<RsStmt> getStmtList();

  @NotNull
  List<RsToBeUpped> getToBeUppedList();

}
