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

public class RsMacroPatternContentsImpl extends RsElementImpl implements RsMacroPatternContents {

  public RsMacroPatternContentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroPatternContents(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsMacroBinding> getMacroBindingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBinding.class);
  }

  @Override
  @NotNull
  public List<RsMacroBindingGroup> getMacroBindingGroupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBindingGroup.class);
  }

  @Override
  @NotNull
  public List<RsMacroPattern> getMacroPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroPattern.class);
  }

}
