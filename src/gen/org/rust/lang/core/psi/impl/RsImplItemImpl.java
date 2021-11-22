// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsImplItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsImplItemStub;

public class RsImplItemImpl extends RsImplItemImplMixin implements RsImplItem {

  public RsImplItemImpl(ASTNode node) {
    super(node);
  }

  public RsImplItemImpl(RsImplItemStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitImplItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsMembers getMembers() {
    return PsiTreeUtil.getStubChildOfType(this, RsMembers.class);
  }

  @Override
  @Nullable
  public RsTraitRef getTraitRef() {
    return PsiTreeUtil.getStubChildOfType(this, RsTraitRef.class);
  }

  @Override
  @Nullable
  public RsTypeParameterList getTypeParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeReference.class);
  }

  @Override
  @Nullable
  public RsWhereClause getWhereClause() {
    return PsiTreeUtil.getStubChildOfType(this, RsWhereClause.class);
  }

  @Override
  @Nullable
  public PsiElement getDotdot() {
    return findChildByType(DOTDOT);
  }

  @Override
  @Nullable
  public PsiElement getExcl() {
    return findChildByType(EXCL);
  }

  @Override
  @Nullable
  public PsiElement getConst() {
    return findChildByType(CONST);
  }

  @Override
  @Nullable
  public PsiElement getFor() {
    return findChildByType(FOR);
  }

  @Override
  @NotNull
  public PsiElement getImpl() {
    return notNullChild(findChildByType(IMPL));
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
