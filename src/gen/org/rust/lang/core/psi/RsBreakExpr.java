// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsLabelReferenceOwner;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsBreakExpr extends RsExpr, RsLabelReferenceOwner, RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsLabel getLabel();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getBreak();

}
