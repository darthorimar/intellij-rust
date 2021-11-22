// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsFunctionOrLambda;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsLambdaExpr extends RsExpr, RsFunctionOrLambda, RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsRetType getRetType();

  @NotNull
  RsValueParameterList getValueParameterList();

  @Nullable
  PsiElement getMove();

  @Nullable
  PsiElement getStatic();

}
