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

public class RsTypeParameterListImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsTypeParameterList {

  public RsTypeParameterListImpl(ASTNode node) {
    super(node);
  }

  public RsTypeParameterListImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeParameterList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsConstParameter> getConstParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsConstParameter.class);
  }

  @Override
  @NotNull
  public List<RsLifetimeParameter> getLifetimeParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsLifetimeParameter.class);
  }

  @Override
  @NotNull
  public List<RsTypeParameter> getTypeParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsTypeParameter.class);
  }

  @Override
  @NotNull
  public PsiElement getGt() {
    return notNullChild(findChildByType(GT));
  }

  @Override
  @NotNull
  public PsiElement getLt() {
    return notNullChild(findChildByType(LT));
  }

}
