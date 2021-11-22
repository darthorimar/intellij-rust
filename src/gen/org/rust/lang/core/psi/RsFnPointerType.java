// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsFnPointerType extends RsTypeReference {

  @Nullable
  RsExternAbi getExternAbi();

  @Nullable
  RsRetType getRetType();

  @Nullable
  RsValueParameterList getValueParameterList();

  @NotNull
  PsiElement getFn();

  @Nullable
  PsiElement getUnsafe();

}
