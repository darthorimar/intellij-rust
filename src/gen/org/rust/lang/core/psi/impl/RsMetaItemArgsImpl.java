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
import org.rust.lang.core.stubs.RsMetaItemArgsStub;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class RsMetaItemArgsImpl extends RsStubbedElementImpl<RsMetaItemArgsStub> implements RsMetaItemArgs {

  public RsMetaItemArgsImpl(ASTNode node) {
    super(node);
  }

  public RsMetaItemArgsImpl(RsMetaItemArgsStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMetaItemArgs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsLitExpr> getLitExprList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsLitExpr.class);
  }

  @Override
  @NotNull
  public List<RsMetaItem> getMetaItemList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsMetaItem.class);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return notNullChild(findChildByType(RPAREN));
  }

}
