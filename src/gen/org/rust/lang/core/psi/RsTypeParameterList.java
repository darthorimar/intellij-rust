// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public interface RsTypeParameterList extends RsElement, StubBasedPsiElement<RsPlaceholderStub> {

  @NotNull
  List<RsConstParameter> getConstParameterList();

  @NotNull
  List<RsLifetimeParameter> getLifetimeParameterList();

  @NotNull
  List<RsTypeParameter> getTypeParameterList();

  @NotNull
  PsiElement getGt();

  @NotNull
  PsiElement getLt();

}
