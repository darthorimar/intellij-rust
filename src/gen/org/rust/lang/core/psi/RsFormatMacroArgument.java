// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsFormatMacroArgument extends RsElement {

  @NotNull
  List<RsFormatMacroArg> getFormatMacroArgList();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getRparen();

}
