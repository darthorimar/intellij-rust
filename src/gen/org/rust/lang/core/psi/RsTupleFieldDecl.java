// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsFieldDecl;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsPlaceholderStub;

public interface RsTupleFieldDecl extends RsFieldDecl, StubBasedPsiElement<RsPlaceholderStub> {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

}
