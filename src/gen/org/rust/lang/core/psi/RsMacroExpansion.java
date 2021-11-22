// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsMacroExpansion extends RsElement {

  @Nullable
  RsMacroExpansionContents getMacroExpansionContents();

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
