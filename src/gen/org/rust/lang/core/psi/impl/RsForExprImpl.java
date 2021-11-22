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

public class RsForExprImpl extends RsExprImpl implements RsForExpr {

  public RsForExprImpl(ASTNode node) {
    super(node);
  }

  public RsForExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitForExpr(this);
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
  public RsExpr getExpr() {
    return PsiTreeUtil.getStubChildOfType(this, RsExpr.class);
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
  @Nullable
  public RsPat getPat() {
    return PsiTreeUtil.getChildOfType(this, RsPat.class);
  }

  @Override
  @NotNull
  public PsiElement getFor() {
    return notNullChild(findChildByType(FOR));
  }

  @Override
  @Nullable
  public PsiElement getIn() {
    return findChildByType(IN);
  }

}
