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

public class RsAsmMacroRegOperandImpl extends RsElementImpl implements RsAsmMacroRegOperand {

  public RsAsmMacroRegOperandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitAsmMacroRegOperand(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsAsmMacroRegDir getAsmMacroRegDir() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsAsmMacroRegDir.class));
  }

  @Override
  @NotNull
  public RsAsmMacroRegSpec getAsmMacroRegSpec() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsAsmMacroRegSpec.class));
  }

  @Override
  @NotNull
  public List<RsAsmMacroRegTarget> getAsmMacroRegTargetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsAsmMacroRegTarget.class);
  }

  @Override
  @Nullable
  public PsiElement getFatArrow() {
    return findChildByType(FAT_ARROW);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return notNullChild(findChildByType(RPAREN));
  }

}
