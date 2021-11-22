// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsTraitItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsTraitItemStub;

public class RsTraitItemImpl extends RsTraitItemImplMixin implements RsTraitItem {

  public RsTraitItemImpl(ASTNode node) {
    super(node);
  }

  public RsTraitItemImpl(RsTraitItemStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTraitItem(this);
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
  public RsTypeParamBounds getTypeParamBounds() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeParameterList getTypeParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsWhereClause getWhereClause() {
    return PsiTreeUtil.getStubChildOfType(this, RsWhereClause.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getTrait() {
    return notNullChild(findChildByType(TRAIT));
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
