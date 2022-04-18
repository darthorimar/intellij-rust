// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsAssocTypeBindingStub;

public interface RsAssocTypeBinding extends RsMandatoryReferenceElement, StubBasedPsiElement<RsAssocTypeBindingStub> {

  @NotNull
  List<RsPolybound> getPolyboundList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getIdentifier();

}
