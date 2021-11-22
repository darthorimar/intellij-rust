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

public class RsTypeQualImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsTypeQual {

  public RsTypeQualImpl(ASTNode node) {
    super(node);
  }

  public RsTypeQualImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeQual(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsTraitRef getTraitRef() {
    return PsiTreeUtil.getStubChildOfType(this, RsTraitRef.class);
  }

  @Override
  @NotNull
  public RsTypeReference getTypeReference() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsTypeReference.class));
  }

  @Override
  @NotNull
  public PsiElement getColoncolon() {
    return notNullChild(findChildByType(COLONCOLON));
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

  @Override
  @Nullable
  public PsiElement getAs() {
    return findChildByType(AS);
  }

}
