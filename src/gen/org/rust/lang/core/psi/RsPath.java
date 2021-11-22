// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsPathReferenceElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPathStub;

public interface RsPath extends RsPathReferenceElement, StubBasedPsiElement<RsPathStub> {

  @Nullable
  RsPath getPath();

  @Nullable
  RsRetType getRetType();

  @Nullable
  RsTypeArgumentList getTypeArgumentList();

  @Nullable
  RsTypeQual getTypeQual();

  @Nullable
  RsValueParameterList getValueParameterList();

  @Nullable
  PsiElement getColoncolon();

  @Nullable
  PsiElement getCself();

  @Nullable
  PsiElement getCrate();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getSelf();

  @Nullable
  PsiElement getSuper();

}
