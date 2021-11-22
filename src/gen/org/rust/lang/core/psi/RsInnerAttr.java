// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsAttr;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsInnerAttrStub;

public interface RsInnerAttr extends RsAttr, StubBasedPsiElement<RsInnerAttrStub> {

  @NotNull
  RsMetaItem getMetaItem();

  @NotNull
  PsiElement getExcl();

  @NotNull
  PsiElement getLbrack();

  @NotNull
  PsiElement getRbrack();

  @NotNull
  PsiElement getSha();

}
