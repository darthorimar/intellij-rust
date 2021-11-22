// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsEnumItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsEnumItemStub;

public class RsEnumItemImpl extends RsEnumItemImplMixin implements RsEnumItem {

  public RsEnumItemImpl(ASTNode node) {
    super(node);
  }

  public RsEnumItemImpl(RsEnumItemStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitEnumItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsEnumBody getEnumBody() {
    return PsiTreeUtil.getStubChildOfType(this, RsEnumBody.class);
  }

  @Override
  @Nullable
  public RsTypeParameterList getTypeParameterList() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsWhereClause getWhereClause() {
    return PsiTreeUtil.getStubChildOfType(this, RsWhereClause.class);
  }

  @Override
  @NotNull
  public PsiElement getEnum() {
    return notNullChild(findChildByType(ENUM));
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
