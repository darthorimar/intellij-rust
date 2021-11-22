// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsStructLiteralField extends RsMandatoryReferenceElement, RsOuterAttributeOwner {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getIdentifier();

}
