// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsGenericParameter;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsLifetimeParameterStub;

public interface RsLifetimeParameter extends RsGenericParameter, RsOuterAttributeOwner, StubBasedPsiElement<RsLifetimeParameterStub> {

  @Nullable
  RsLifetimeParamBounds getLifetimeParamBounds();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getQuoteIdentifier();

}
