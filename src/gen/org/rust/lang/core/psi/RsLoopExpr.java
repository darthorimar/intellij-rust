// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsLabeledExpression;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.psi.ext.RsLooplikeExpr;

public interface RsLoopExpr extends RsExpr, RsLabeledExpression, RsOuterAttributeOwner, RsLooplikeExpr {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsLabelDecl getLabelDecl();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getLoop();

}
