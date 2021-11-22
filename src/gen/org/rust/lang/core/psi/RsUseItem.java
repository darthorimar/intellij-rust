// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsUseItemStub;

public interface RsUseItem extends RsItemElement, RsAttrProcMacroOwner, StubBasedPsiElement<RsUseItemStub> {

  @Nullable
  RsUseSpeck getUseSpeck();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getUse();

}
