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
import org.rust.lang.core.stubs.RsInnerAttrStub;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class RsInnerAttrImpl extends RsStubbedElementImpl<RsInnerAttrStub> implements RsInnerAttr {

  public RsInnerAttrImpl(ASTNode node) {
    super(node);
  }

  public RsInnerAttrImpl(RsInnerAttrStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitInnerAttr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsMetaItem getMetaItem() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsMetaItem.class));
  }

  @Override
  @NotNull
  public PsiElement getExcl() {
    return notNullChild(findChildByType(EXCL));
  }

  @Override
  @NotNull
  public PsiElement getLbrack() {
    return notNullChild(findChildByType(LBRACK));
  }

  @Override
  @NotNull
  public PsiElement getRbrack() {
    return notNullChild(findChildByType(RBRACK));
  }

  @Override
  @NotNull
  public PsiElement getSha() {
    return notNullChild(findChildByType(SHA));
  }

}
