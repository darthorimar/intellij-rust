// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsAttr;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public interface RsOuterAttr extends RsAttr, StubBasedPsiElement<RsPlaceholderStub> {

  @NotNull
  RsMetaItem getMetaItem();

  @NotNull
  PsiElement getLbrack();

  @NotNull
  PsiElement getRbrack();

  @NotNull
  PsiElement getSha();

}
