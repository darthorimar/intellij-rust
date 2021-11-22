// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsVisStub;

public interface RsVis extends RsElement, StubBasedPsiElement<RsVisStub> {

  @Nullable
  RsVisRestriction getVisRestriction();

  @Nullable
  PsiElement getCrate();

  @Nullable
  PsiElement getPub();

}
