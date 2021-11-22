// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsAsmMacroRegOperand extends RsElement {

  @NotNull
  RsAsmMacroRegDir getAsmMacroRegDir();

  @NotNull
  RsAsmMacroRegSpec getAsmMacroRegSpec();

  @NotNull
  List<RsAsmMacroRegTarget> getAsmMacroRegTargetList();

  @Nullable
  PsiElement getFatArrow();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
