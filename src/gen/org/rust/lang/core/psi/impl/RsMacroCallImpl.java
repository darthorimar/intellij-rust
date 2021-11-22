// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsMacroCallImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsMacroCallStub;

public class RsMacroCallImpl extends RsMacroCallImplMixin implements RsMacroCall {

  public RsMacroCallImpl(ASTNode node) {
    super(node);
  }

  public RsMacroCallImpl(RsMacroCallStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsAsmMacroArgument getAsmMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsAsmMacroArgument.class);
  }

  @Override
  @Nullable
  public RsAssertMacroArgument getAssertMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsAssertMacroArgument.class);
  }

  @Override
  @Nullable
  public RsConcatMacroArgument getConcatMacroArgument() {
    return PsiTreeUtil.getStubChildOfType(this, RsConcatMacroArgument.class);
  }

  @Override
  @Nullable
  public RsEnvMacroArgument getEnvMacroArgument() {
    return PsiTreeUtil.getStubChildOfType(this, RsEnvMacroArgument.class);
  }

  @Override
  @Nullable
  public RsExprMacroArgument getExprMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsExprMacroArgument.class);
  }

  @Override
  @Nullable
  public RsFormatMacroArgument getFormatMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsFormatMacroArgument.class);
  }

  @Override
  @Nullable
  public RsIncludeMacroArgument getIncludeMacroArgument() {
    return PsiTreeUtil.getStubChildOfType(this, RsIncludeMacroArgument.class);
  }

  @Override
  @Nullable
  public RsMacroArgument getMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsMacroArgument.class);
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
  @Nullable
  public RsVecMacroArgument getVecMacroArgument() {
    return PsiTreeUtil.getChildOfType(this, RsVecMacroArgument.class);
  }

  @Override
  @Nullable
  public RsVis getVis() {
    return PsiTreeUtil.getStubChildOfType(this, RsVis.class);
  }

  @Override
  @NotNull
  public PsiElement getExcl() {
    return notNullChild(findChildByType(EXCL));
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

}
