// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;

public interface RsBaseType extends RsTypeReference, RsInferenceContextOwner {

  @Nullable
  RsPath getPath();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getUnderscore();

}
