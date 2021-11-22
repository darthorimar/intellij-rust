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

public class RsWherePredImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsWherePred {

  public RsWherePredImpl(ASTNode node) {
    super(node);
  }

  public RsWherePredImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitWherePred(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsForLifetimes getForLifetimes() {
    return PsiTreeUtil.getStubChildOfType(this, RsForLifetimes.class);
  }

  @Override
  @Nullable
  public RsLifetime getLifetime() {
    return PsiTreeUtil.getStubChildOfType(this, RsLifetime.class);
  }

  @Override
  @Nullable
  public RsLifetimeParamBounds getLifetimeParamBounds() {
    return PsiTreeUtil.getChildOfType(this, RsLifetimeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeParamBounds getTypeParamBounds() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeReference.class);
  }

}
