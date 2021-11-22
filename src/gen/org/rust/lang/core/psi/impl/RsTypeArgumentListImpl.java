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

public class RsTypeArgumentListImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsTypeArgumentList {

  public RsTypeArgumentListImpl(ASTNode node) {
    super(node);
  }

  public RsTypeArgumentListImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeArgumentList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsAssocTypeBinding> getAssocTypeBindingList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsAssocTypeBinding.class);
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @NotNull
  public List<RsLifetime> getLifetimeList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsLifetime.class);
  }

  @Override
  @NotNull
  public List<RsTypeReference> getTypeReferenceList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getColoncolon() {
    return findChildByType(COLONCOLON);
  }

  @Override
  @Nullable
  public PsiElement getGt() {
    return findChildByType(GT);
  }

  @Override
  @NotNull
  public PsiElement getLt() {
    return notNullChild(findChildByType(LT));
  }

}
