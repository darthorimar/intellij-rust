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

public class RsCompactTTImpl extends RsElementImpl implements RsCompactTT {

  public RsCompactTTImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitCompactTT(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsCompactTT> getCompactTTList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsCompactTT.class);
  }

}
