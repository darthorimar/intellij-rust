// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.RsElementTypes.*;
import org.rust.lang.core.psi.*;

public class RsPatStructImpl extends RsPatImpl implements RsPatStruct {

  public RsPatStructImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPatStruct(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsPatField> getPatFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsPatField.class);
  }

  @Override
  @Nullable
  public RsPatRest getPatRest() {
    return PsiTreeUtil.getChildOfType(this, RsPatRest.class);
  }

  @Override
  @NotNull
  public RsPath getPath() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RsPath.class));
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return notNullChild(findChildByType(LBRACE));
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return notNullChild(findChildByType(RBRACE));
  }

}
