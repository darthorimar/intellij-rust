// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsIndexExprImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public class RsIndexExprImpl extends RsIndexExprImplMixin implements RsIndexExpr {

  public RsIndexExprImpl(ASTNode node) {
    super(node);
  }

  public RsIndexExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitIndexExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrack() {
    return notNullChild(findChildByType(LBRACK));
  }

  @Override
  @NotNull
  public PsiElement getRbrack() {
    return notNullChild(findChildByType(RBRACK));
  }

}
