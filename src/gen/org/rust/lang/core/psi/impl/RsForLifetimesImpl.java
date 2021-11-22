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

public class RsForLifetimesImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsForLifetimes {

  public RsForLifetimesImpl(ASTNode node) {
    super(node);
  }

  public RsForLifetimesImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitForLifetimes(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsLifetimeParameter> getLifetimeParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsLifetimeParameter.class);
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

  @Override
  @NotNull
  public PsiElement getFor() {
    return notNullChild(findChildByType(FOR));
  }

}
