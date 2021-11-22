// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMacroDefinitionBase;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsMacro2Stub;

public interface RsMacro2 extends RsMacroDefinitionBase, RsItemElement, RsAttrProcMacroOwner, StubBasedPsiElement<RsMacro2Stub> {

  @NotNull
  List<RsMacroCase> getMacroCaseList();

  @Nullable
  RsMacroExpansionContents getMacroExpansionContents();

  @Nullable
  RsMacroPatternContents getMacroPatternContents();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @NotNull
  PsiElement getMacroKw();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getIdentifier();

}
