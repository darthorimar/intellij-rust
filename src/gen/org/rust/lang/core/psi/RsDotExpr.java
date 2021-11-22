// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RsDotExpr extends RsExpr {

  @NotNull
  RsExpr getExpr();

  @Nullable
  RsFieldLookup getFieldLookup();

  @Nullable
  RsMethodCall getMethodCall();

  @NotNull
  PsiElement getDot();

}
