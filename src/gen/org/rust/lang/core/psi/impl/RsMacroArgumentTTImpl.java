// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.ext.RsElementImpl;
import org.rust.lang.core.psi.*;

public class RsMacroArgumentTTImpl extends RsElementImpl implements RsMacroArgumentTT {

  public RsMacroArgumentTTImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroArgumentTT(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsLitExpr> getLitExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsLitExpr.class);
  }

  @Override
  @NotNull
  public List<RsMacroArgumentTT> getMacroArgumentTTList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroArgumentTT.class);
  }

  @Override
  @NotNull
  public List<RsMacroBodyIdent> getMacroBodyIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBodyIdent.class);
  }

  @Override
  @NotNull
  public List<RsMacroBodyQuoteIdent> getMacroBodyQuoteIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBodyQuoteIdent.class);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getLbrack() {
    return findChildByType(LBRACK);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRbrack() {
    return findChildByType(RBRACK);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
