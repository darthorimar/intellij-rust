// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsPathImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsPathStub;

public class RsPathImpl extends RsPathImplMixin implements RsPath {

  public RsPathImpl(ASTNode node) {
    super(node);
  }

  public RsPathImpl(RsPathStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPath(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsPath getPath() {
    return PsiTreeUtil.getStubChildOfType(this, RsPath.class);
  }

  @Override
  @Nullable
  public RsRetType getRetType() {
    return PsiTreeUtil.getStubChildOfType(this, RsRetType.class);
  }

  @Override
  @Nullable
  public RsTypeArgumentList getTypeArgumentList() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeArgumentList.class);
  }

  @Override
  @Nullable
  public RsTypeQual getTypeQual() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeQual.class);
  }

  @Override
  @Nullable
  public RsValueParameterList getValueParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsValueParameterList.class);
  }

  @Override
  @Nullable
  public PsiElement getColoncolon() {
    return findChildByType(COLONCOLON);
  }

  @Override
  @Nullable
  public PsiElement getCself() {
    return findChildByType(CSELF);
  }

  @Override
  @Nullable
  public PsiElement getCrate() {
    return findChildByType(CRATE);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getSelf() {
    return findChildByType(SELF);
  }

  @Override
  @Nullable
  public PsiElement getSuper() {
    return findChildByType(SUPER);
  }

}
