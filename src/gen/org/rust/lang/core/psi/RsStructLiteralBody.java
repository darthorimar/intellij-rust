// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsStructLiteralBody extends RsElement {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsStructLiteralField> getStructLiteralFieldList();

  @Nullable
  PsiElement getDotdot();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
