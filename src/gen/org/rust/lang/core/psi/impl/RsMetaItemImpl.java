// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsMetaItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsMetaItemStub;

public class RsMetaItemImpl extends RsMetaItemImplMixin implements RsMetaItem {

  public RsMetaItemImpl(ASTNode node) {
    super(node);
  }

  public RsMetaItemImpl(RsMetaItemStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMetaItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsCompactTT getCompactTT() {
    return PsiTreeUtil.getChildOfType(this, RsCompactTT.class);
  }

  @Override
  @Nullable
  public RsLitExpr getLitExpr() {
    return PsiTreeUtil.getStubChildOfType(this, RsLitExpr.class);
  }

  @Override
  @Nullable
  public RsMetaItemArgs getMetaItemArgs() {
    return PsiTreeUtil.getStubChildOfType(this, RsMetaItemArgs.class);
  }

  @Override
  @Nullable
  public RsPath getPath() {
    return PsiTreeUtil.getStubChildOfType(this, RsPath.class);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

}
