// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;

public interface RsMacroBinding extends RsNameIdentifierOwner {

  @NotNull
  RsMetaVarIdentifier getMetaVarIdentifier();

  @Nullable
  PsiElement getColon();

  @NotNull
  PsiElement getDollar();

  @Nullable
  PsiElement getIdentifier();

}
