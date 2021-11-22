// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsRefLikeType extends RsTypeReference {

  @Nullable
  RsLifetime getLifetime();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getConst();

  @Nullable
  PsiElement getMut();

}
