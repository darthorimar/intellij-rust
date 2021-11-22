// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsStubbedElementImpl;
import org.rust.lang.core.stubs.RsPlaceholderStub;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class RsBlockImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsBlock {

  public RsBlockImpl(ASTNode node) {
    super(node);
  }

  public RsBlockImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBlock(this);
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
  public List<RsInnerAttr> getInnerAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsInnerAttr.class);
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

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return notNullChild(findChildByType(LBRACE));
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

}
