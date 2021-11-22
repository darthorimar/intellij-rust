// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsUnitExpr extends RsExpr, RsOuterAttributeOwner {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
