// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsUnaryExpr extends RsExpr, RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getMinus();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getBox();

  @Nullable
  PsiElement getConst();

  @Nullable
  PsiElement getMut();

}
