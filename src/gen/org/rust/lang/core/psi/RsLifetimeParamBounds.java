// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;

public interface RsLifetimeParamBounds extends RsElement {

  @NotNull
  List<RsLifetime> getLifetimeList();

  @NotNull
  PsiElement getColon();

}
