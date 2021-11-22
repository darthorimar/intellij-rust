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

public class RsMacroExpansionReferenceGroupImpl extends RsElementImpl implements RsMacroExpansionReferenceGroup {

  public RsMacroExpansionReferenceGroupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroExpansionReferenceGroup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsMacroExpansionContents getMacroExpansionContents() {
    return PsiTreeUtil.getChildOfType(this, RsMacroExpansionContents.class);
  }

  @Override
  @Nullable
  public RsMacroExpansionGroupSeparator getMacroExpansionGroupSeparator() {
    return PsiTreeUtil.getChildOfType(this, RsMacroExpansionGroupSeparator.class);
  }

  @Override
  @NotNull
  public PsiElement getDollar() {
    return notNullChild(findChildByType(DOLLAR));
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @Nullable
  public PsiElement getMul() {
    return findChildByType(MUL);
  }

  @Override
  @Nullable
  public PsiElement getPlus() {
    return findChildByType(PLUS);
  }

  @Override
  @Nullable
  public PsiElement getQ() {
    return findChildByType(Q);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
