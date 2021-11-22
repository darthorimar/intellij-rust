// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;

public interface RsArrayType extends RsTypeReference, RsInferenceContextOwner {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsTypeReference getTypeReference();

  @NotNull
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getSemicolon();

}
