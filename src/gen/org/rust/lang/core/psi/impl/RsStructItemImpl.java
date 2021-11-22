// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsStructItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsStructItemStub;

public class RsStructItemImpl extends RsStructItemImplMixin implements RsStructItem {

  public RsStructItemImpl(ASTNode node) {
    super(node);
  }

  public RsStructItemImpl(RsStructItemStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitStructItem(this);
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
  @Nullable
  public RsTupleFields getTupleFields() {
    return PsiTreeUtil.getStubChildOfType(this, RsTupleFields.class);
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
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getStruct() {
    return findChildByType(STRUCT);
  }

}
