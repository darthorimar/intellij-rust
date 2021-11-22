// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsPatStruct extends RsPat {

  @NotNull
  List<RsPatField> getPatFieldList();

  @Nullable
  RsPatRest getPatRest();

  @NotNull
  RsPath getPath();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
