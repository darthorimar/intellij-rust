// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsUseSpeckStub;

public interface RsUseSpeck extends RsElement, StubBasedPsiElement<RsUseSpeckStub> {

  @Nullable
  RsAlias getAlias();

  @Nullable
  RsPath getPath();

  @Nullable
  RsUseGroup getUseGroup();

  @Nullable
  PsiElement getColoncolon();

  @Nullable
  PsiElement getMul();

}
