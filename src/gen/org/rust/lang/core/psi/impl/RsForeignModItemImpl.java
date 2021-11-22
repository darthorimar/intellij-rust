// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsForeignModItemImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsForeignModStub;

public class RsForeignModItemImpl extends RsForeignModItemImplMixin implements RsForeignModItem {

  public RsForeignModItemImpl(ASTNode node) {
    super(node);
  }

  public RsForeignModItemImpl(RsForeignModStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitForeignModItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsExternAbi getExternAbi() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsExternAbi.class));
  }

  @Override
  @NotNull
  public List<RsInnerAttr> getInnerAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsInnerAttr.class);
  }

  @Override
  @NotNull
  public List<RsToBeUpped> getToBeUppedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsToBeUpped.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return notNullChild(findChildByType(LBRACE));
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
