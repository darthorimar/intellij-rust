// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsLabeledExpression;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.psi.ext.RsLooplikeExpr;

public interface RsForExpr extends RsExpr, RsLabeledExpression, RsOuterAttributeOwner, RsLooplikeExpr {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsLabelDecl getLabelDecl();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsPat getPat();

  @NotNull
  PsiElement getFor();

  @Nullable
  PsiElement getIn();

}
