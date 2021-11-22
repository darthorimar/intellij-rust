// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsAliasStub;

public interface RsAlias extends RsNameIdentifierOwner, StubBasedPsiElement<RsAliasStub> {

  @Nullable
  PsiElement getUnderscore();

  @NotNull
  PsiElement getAs();

  @Nullable
  PsiElement getIdentifier();

}
