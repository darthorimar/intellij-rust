// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsAssocTypeBindingMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsAssocTypeBindingStub;

public class RsAssocTypeBindingImpl extends RsAssocTypeBindingMixin implements RsAssocTypeBinding {

  public RsAssocTypeBindingImpl(ASTNode node) {
    super(node);
  }

  public RsAssocTypeBindingImpl(RsAssocTypeBindingStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitAssocTypeBinding(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsPolybound> getPolyboundList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsPolybound.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
