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
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public class RsWhileExprImpl extends RsExprImpl implements RsWhileExpr {

  public RsWhileExprImpl(ASTNode node) {
    super(node);
  }

  public RsWhileExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitWhileExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsBlock getBlock() {
    return PsiTreeUtil.getStubChildOfType(this, RsBlock.class);
  }

  @Override
  @Nullable
  public RsCondition getCondition() {
    return PsiTreeUtil.getChildOfType(this, RsCondition.class);
  }

  @Override
  @Nullable
  public RsLabelDecl getLabelDecl() {
    return PsiTreeUtil.getChildOfType(this, RsLabelDecl.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @NotNull
  public PsiElement getWhile() {
    return notNullChild(findChildByType(WHILE));
  }

}
