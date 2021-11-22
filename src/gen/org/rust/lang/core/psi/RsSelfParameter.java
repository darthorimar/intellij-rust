// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsSelfParameterStub;

public interface RsSelfParameter extends RsNameIdentifierOwner, RsOuterAttributeOwner, StubBasedPsiElement<RsSelfParameterStub> {

  @Nullable
  RsLifetime getLifetime();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getMut();

  @NotNull
  PsiElement getSelf();

}
