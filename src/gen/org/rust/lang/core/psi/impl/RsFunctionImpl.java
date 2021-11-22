// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsFunctionImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsFunctionStub;

public class RsFunctionImpl extends RsFunctionImplMixin implements RsFunction {

  public RsFunctionImpl(ASTNode node) {
    super(node);
  }

  public RsFunctionImpl(RsFunctionStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitFunction(this);
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
  public RsTypeParameterList getTypeParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsValueParameterList getValueParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsValueParameterList.class);
  }

  @Override
  @Nullable
  public RsWhereClause getWhereClause() {
    return PsiTreeUtil.getStubChildOfType(this, RsWhereClause.class);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

  @Override
  @Nullable
  public PsiElement getConst() {
    return findChildByType(CONST);
  }

  @Override
  @NotNull
  public PsiElement getFn() {
    return notNullChild(findChildByType(FN));
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
