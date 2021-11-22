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

public class RsForInTypeImpl extends RsTypeReferenceImpl implements RsForInType {

  public RsForInTypeImpl(ASTNode node) {
    super(node);
  }

  public RsForInTypeImpl(StubBase stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitForInType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsFnPointerType getFnPointerType() {
    return PsiTreeUtil.getStubChildOfType(this, RsFnPointerType.class);
  }

  @Override
  @NotNull
  public RsForLifetimes getForLifetimes() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsForLifetimes.class));
  }

  @Override
  @Nullable
  public RsTraitRef getTraitRef() {
    return PsiTreeUtil.getStubChildOfType(this, RsTraitRef.class);
  }

}
