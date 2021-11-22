// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsUseSpeckImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsUseSpeckStub;

public class RsUseSpeckImpl extends RsUseSpeckImplMixin implements RsUseSpeck {

  public RsUseSpeckImpl(ASTNode node) {
    super(node);
  }

  public RsUseSpeckImpl(RsUseSpeckStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitUseSpeck(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsAlias getAlias() {
    return PsiTreeUtil.getStubChildOfType(this, RsAlias.class);
  }

  @Override
  @Nullable
  public RsPath getPath() {
    return PsiTreeUtil.getStubChildOfType(this, RsPath.class);
  }

  @Override
  @Nullable
  public RsUseGroup getUseGroup() {
    return PsiTreeUtil.getStubChildOfType(this, RsUseGroup.class);
  }

  @Override
  @Nullable
  public PsiElement getColoncolon() {
    return findChildByType(COLONCOLON);
  }

  @Override
  @Nullable
  public PsiElement getMul() {
    return findChildByType(MUL);
  }

}
