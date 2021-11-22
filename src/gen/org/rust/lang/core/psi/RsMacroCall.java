// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.macros.RsExpandedElement;
import org.rust.lang.core.psi.ext.RsPossibleMacroCall;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsModificationTrackerOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsMacroCallStub;

public interface RsMacroCall extends RsOuterAttributeOwner, RsExpandedElement, RsPossibleMacroCall, RsAttrProcMacroOwner, RsModificationTrackerOwner, StubBasedPsiElement<RsMacroCallStub> {

  @Nullable
  RsAsmMacroArgument getAsmMacroArgument();

  @Nullable
  RsAssertMacroArgument getAssertMacroArgument();

  @Nullable
  RsConcatMacroArgument getConcatMacroArgument();

  @Nullable
  RsEnvMacroArgument getEnvMacroArgument();

  @Nullable
  RsExprMacroArgument getExprMacroArgument();

  @Nullable
  RsFormatMacroArgument getFormatMacroArgument();

  @Nullable
  RsIncludeMacroArgument getIncludeMacroArgument();

  @Nullable
  RsMacroArgument getMacroArgument();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsPath getPath();

  @Nullable
  RsVecMacroArgument getVecMacroArgument();

  @Nullable
  RsVis getVis();

  @NotNull
  PsiElement getExcl();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getIdentifier();

}
