// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsMacroExpansionReferenceGroup extends RsElement {

  @Nullable
  RsMacroExpansionContents getMacroExpansionContents();

  @Nullable
  RsMacroExpansionGroupSeparator getMacroExpansionGroupSeparator();

  @NotNull
  PsiElement getDollar();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getPlus();

  @Nullable
  PsiElement getQ();

  @Nullable
  PsiElement getRparen();

}
