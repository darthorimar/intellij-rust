// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;

public class RsFnPointerTypeImpl extends RsTypeReferenceImpl implements RsFnPointerType {

  public RsFnPointerTypeImpl(ASTNode node) {
    super(node);
  }

  public RsFnPointerTypeImpl(StubBase stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitFnPointerType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsExternAbi getExternAbi() {
    return PsiTreeUtil.getChildOfType(this, RsExternAbi.class);
  }

  @Override
  @Nullable
  public RsRetType getRetType() {
    return PsiTreeUtil.getStubChildOfType(this, RsRetType.class);
  }

  @Override
  @Nullable
  public RsValueParameterList getValueParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsValueParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getFn() {
    return notNullChild(findChildByType(FN));
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
