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

public class RsVisRestrictionImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsVisRestriction {

  public RsVisRestrictionImpl(ASTNode node) {
    super(node);
  }

  public RsVisRestrictionImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitVisRestriction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsPath getPath() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsPath.class));
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return notNullChild(findChildByType(RPAREN));
  }

  @Override
  @Nullable
  public PsiElement getIn() {
    return findChildByType(IN);
  }

}
