// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPolyboundStub;

public interface RsPolybound extends RsElement, StubBasedPsiElement<RsPolyboundStub> {

  @NotNull
  RsBound getBound();

  @Nullable
  RsForLifetimes getForLifetimes();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getQ();

  @Nullable
  PsiElement getRparen();

}
