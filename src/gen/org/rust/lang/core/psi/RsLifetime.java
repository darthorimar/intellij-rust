// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsLifetimeStub;

public interface RsLifetime extends RsNameIdentifierOwner, RsMandatoryReferenceElement, StubBasedPsiElement<RsLifetimeStub> {

  @NotNull
  PsiElement getQuoteIdentifier();

}
