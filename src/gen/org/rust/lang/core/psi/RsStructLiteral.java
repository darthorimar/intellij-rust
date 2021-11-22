// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsStructLiteral extends RsExpr, RsOuterAttributeOwner {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsPath getPath();

  @NotNull
  RsStructLiteralBody getStructLiteralBody();

}
