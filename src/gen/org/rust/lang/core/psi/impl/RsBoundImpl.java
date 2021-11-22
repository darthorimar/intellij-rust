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

public class RsBoundImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsBound {

  public RsBoundImpl(ASTNode node) {
    super(node);
  }

  public RsBoundImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBound(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsLifetime getLifetime() {
    return PsiTreeUtil.getStubChildOfType(this, RsLifetime.class);
  }

  @Override
  @Nullable
  public RsTraitRef getTraitRef() {
    return PsiTreeUtil.getStubChildOfType(this, RsTraitRef.class);
  }

}
