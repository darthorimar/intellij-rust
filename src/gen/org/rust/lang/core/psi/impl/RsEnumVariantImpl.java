// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsEnumVariantImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsEnumVariantStub;

public class RsEnumVariantImpl extends RsEnumVariantImplMixin implements RsEnumVariant {

  public RsEnumVariantImpl(ASTNode node) {
    super(node);
  }

  public RsEnumVariantImpl(RsEnumVariantStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitEnumVariant(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsBlockFields getBlockFields() {
    return PsiTreeUtil.getStubChildOfType(this, RsBlockFields.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @Nullable
  public RsTupleFields getTupleFields() {
    return PsiTreeUtil.getStubChildOfType(this, RsTupleFields.class);
  }

  @Override
  @Nullable
  public RsVariantDiscriminant getVariantDiscriminant() {
    return PsiTreeUtil.getChildOfType(this, RsVariantDiscriminant.class);
  }

  @Override
  @Nullable
  public RsVis getVis() {
    return PsiTreeUtil.getStubChildOfType(this, RsVis.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
