// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsValueParameterStub;

public interface RsValueParameter extends RsOuterAttributeOwner, StubBasedPsiElement<RsValueParameterStub> {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsPat getPat();

  @Nullable
  RsTypeReference getTypeReference();

}
