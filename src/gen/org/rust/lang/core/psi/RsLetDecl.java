// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsLetDecl extends RsStmt, RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsLetElseBranch getLetElseBranch();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsPat getPat();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getLet();

}
