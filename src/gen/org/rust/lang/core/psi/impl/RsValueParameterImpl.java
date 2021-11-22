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
import org.rust.lang.core.stubs.RsValueParameterStub;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class RsValueParameterImpl extends RsStubbedElementImpl<RsValueParameterStub> implements RsValueParameter {

  public RsValueParameterImpl(ASTNode node) {
    super(node);
  }

  public RsValueParameterImpl(RsValueParameterStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitValueParameter(this);
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
  @Nullable
  public RsPat getPat() {
    return PsiTreeUtil.getChildOfType(this, RsPat.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return PsiTreeUtil.getStubChildOfType(this, RsTypeReference.class);
  }

}
