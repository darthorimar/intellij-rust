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

public class RsBinaryExprImpl extends RsExprImpl implements RsBinaryExpr {

  public RsBinaryExprImpl(ASTNode node) {
    super(node);
  }

  public RsBinaryExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBinaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsBinaryOp getBinaryOp() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsBinaryOp.class));
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @NotNull
  public RsExpr getLeft() {
    List<RsExpr> p1 = getExprList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public RsExpr getRight() {
    List<RsExpr> p1 = getExprList();
    return p1.size() < 2 ? null : p1.get(1);
  }

}
