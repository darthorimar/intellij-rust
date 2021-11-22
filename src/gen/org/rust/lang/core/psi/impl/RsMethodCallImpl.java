// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsMethodCallImplMixin;
import org.rust.lang.core.psi.*;

public class RsMethodCallImpl extends RsMethodCallImplMixin implements RsMethodCall {

  public RsMethodCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMethodCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsTypeArgumentList getTypeArgumentList() {
    return PsiTreeUtil.getChildOfType(this, RsTypeArgumentList.class);
  }

  @Override
  @NotNull
  public RsValueArgumentList getValueArgumentList() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsValueArgumentList.class));
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
