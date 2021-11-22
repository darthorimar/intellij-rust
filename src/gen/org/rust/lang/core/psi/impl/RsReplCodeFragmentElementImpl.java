// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsElementImpl;
import org.rust.lang.core.psi.*;

public class RsReplCodeFragmentElementImpl extends RsElementImpl implements RsReplCodeFragmentElement {

  public RsReplCodeFragmentElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitReplCodeFragmentElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @NotNull
  public List<RsMacroCall> getMacroCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroCall.class);
  }

  @Override
  @NotNull
  public List<RsStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsStmt.class);
  }

  @Override
  @NotNull
  public List<RsToBeUpped> getToBeUppedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsToBeUpped.class);
  }

}
