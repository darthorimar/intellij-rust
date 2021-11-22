// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsMatchArm extends RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsMatchArmGuard getMatchArmGuard();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsPat getPat();

  @Nullable
  PsiElement getComma();

  @Nullable
  PsiElement getFatArrow();

}
