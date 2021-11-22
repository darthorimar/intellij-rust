// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsIfExpr extends RsExpr, RsOuterAttributeOwner {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsCondition getCondition();

  @Nullable
  RsElseBranch getElseBranch();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getIf();

}
