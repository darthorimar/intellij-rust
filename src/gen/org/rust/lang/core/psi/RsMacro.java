// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMacroDefinitionBase;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsMacroStub;

public interface RsMacro extends RsMacroDefinitionBase, StubBasedPsiElement<RsMacroStub> {

  @NotNull
  PsiElement getExcl();

  @Nullable
  PsiElement getIdentifier();

}
