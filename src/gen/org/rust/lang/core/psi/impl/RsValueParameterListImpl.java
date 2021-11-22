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

public class RsValueParameterListImpl extends RsStubbedElementImpl<RsPlaceholderStub> implements RsValueParameterList {

  public RsValueParameterListImpl(ASTNode node) {
    super(node);
  }

  public RsValueParameterListImpl(RsPlaceholderStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitValueParameterList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsSelfParameter getSelfParameter() {
    return PsiTreeUtil.getStubChildOfType(this, RsSelfParameter.class);
  }

  @Override
  @NotNull
  public List<RsValueParameter> getValueParameterList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, RsValueParameter.class);
  }

  @Override
  @Nullable
  public RsVariadic getVariadic() {
    return PsiTreeUtil.getStubChildOfType(this, RsVariadic.class);
  }

}
