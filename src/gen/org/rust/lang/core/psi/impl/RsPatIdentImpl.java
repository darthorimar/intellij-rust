// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.*;

public class RsPatIdentImpl extends RsPatImpl implements RsPatIdent {

  public RsPatIdentImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPatIdent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsPat getPat() {
    return PsiTreeUtil.getChildOfType(this, RsPat.class);
  }

  @Override
  @NotNull
  public RsPatBinding getPatBinding() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsPatBinding.class));
  }

  @Override
  @Nullable
  public PsiElement getAt() {
    return findChildByType(AT);
  }

}
