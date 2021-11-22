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

public class RsRetExprImpl extends RsExprImpl implements RsRetExpr {

  public RsRetExprImpl(ASTNode node) {
    super(node);
  }

  public RsRetExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitRetExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsExpr getExpr() {
    return PsiTreeUtil.getStubChildOfType(this, RsExpr.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @NotNull
  public PsiElement getReturn() {
    return notNullChild(findChildByType(RETURN));
  }

}
