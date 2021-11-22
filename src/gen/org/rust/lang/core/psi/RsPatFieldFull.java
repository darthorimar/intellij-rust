// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;

public interface RsPatFieldFull extends RsMandatoryReferenceElement {

  @NotNull
  RsPat getPat();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getIdentifier();

}
