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
import org.rust.lang.core.stubs.RsPlaceholderStub;

public class RsStructLiteralImpl extends RsExprImpl implements RsStructLiteral {

  public RsStructLiteralImpl(ASTNode node) {
    super(node);
  }

  public RsStructLiteralImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitStructLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @NotNull
  public RsPath getPath() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, RsPath.class));
  }

  @Override
  @NotNull
  public RsStructLiteralBody getStructLiteralBody() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsStructLiteralBody.class));
  }

}
