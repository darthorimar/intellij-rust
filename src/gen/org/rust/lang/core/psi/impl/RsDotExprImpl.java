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

public class RsDotExprImpl extends RsExprImpl implements RsDotExpr {

  public RsDotExprImpl(ASTNode node) {
    super(node);
  }

  public RsDotExprImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitDotExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsExpr getExpr() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsExpr.class));
  }

  @Override
  @Nullable
  public RsFieldLookup getFieldLookup() {
    return PsiTreeUtil.getChildOfType(this, RsFieldLookup.class);
  }

  @Override
  @Nullable
  public RsMethodCall getMethodCall() {
    return PsiTreeUtil.getChildOfType(this, RsMethodCall.class);
  }

  @Override
  @NotNull
  public PsiElement getDot() {
    return notNullChild(findChildByType(DOT));
  }

}
