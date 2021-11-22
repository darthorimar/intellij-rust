// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsMacro2ImplMixin;
import org.rust.lang.core.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import org.rust.lang.core.stubs.RsMacro2Stub;

public class RsMacro2Impl extends RsMacro2ImplMixin implements RsMacro2 {

  public RsMacro2Impl(ASTNode node) {
    super(node);
  }

  public RsMacro2Impl(RsMacro2Stub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacro2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsMacroCase> getMacroCaseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroCase.class);
  }

  @Override
  @Nullable
  public RsMacroExpansionContents getMacroExpansionContents() {
    return PsiTreeUtil.getChildOfType(this, RsMacroExpansionContents.class);
  }

  @Override
  @Nullable
  public RsMacroPatternContents getMacroPatternContents() {
    return PsiTreeUtil.getChildOfType(this, RsMacroPatternContents.class);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getMacroKw() {
    return notNullChild(findChildByType(MACRO_KW));
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
