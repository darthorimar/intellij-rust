// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsFieldDecl;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsNamedFieldDeclStub;

public interface RsNamedFieldDecl extends RsFieldDecl, RsNameIdentifierOwner, RsQualifiedNamedElement, StubBasedPsiElement<RsNamedFieldDeclStub> {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

  @Nullable
  PsiElement getColon();

  @NotNull
  PsiElement getIdentifier();

}
