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

public class RsConditionImpl extends RsElementImpl implements RsCondition {

  public RsConditionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, RsExpr.class);
  }

  @Override
  @Nullable
  public RsPat getPat() {
    return PsiTreeUtil.getChildOfType(this, RsPat.class);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getLet() {
    return findChildByType(LET);
  }

}
