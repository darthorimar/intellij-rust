// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsLifetimeParameterImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsLifetimeParameterStub;

public class RsLifetimeParameterImpl extends RsLifetimeParameterImplMixin implements RsLifetimeParameter {

  public RsLifetimeParameterImpl(ASTNode node) {
    super(node);
  }

  public RsLifetimeParameterImpl(RsLifetimeParameterStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitLifetimeParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsLifetimeParamBounds getLifetimeParamBounds() {
    return PsiTreeUtil.getChildOfType(this, RsLifetimeParamBounds.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @NotNull
  public PsiElement getQuoteIdentifier() {
    return notNullChild(findChildByType(QUOTE_IDENTIFIER));
  }

}
