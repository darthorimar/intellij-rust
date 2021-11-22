// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.psi.ext.RsFieldsOwner;
import org.rust.lang.core.psi.ext.RsVisibilityOwner;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsEnumVariantStub;

public interface RsEnumVariant extends RsQualifiedNamedElement, RsNameIdentifierOwner, RsOuterAttributeOwner, RsFieldsOwner, RsVisibilityOwner, StubBasedPsiElement<RsEnumVariantStub> {

  @Nullable
  RsBlockFields getBlockFields();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTupleFields getTupleFields();

  @Nullable
  RsVariantDiscriminant getVariantDiscriminant();

  @Nullable
  RsVis getVis();

  @NotNull
  PsiElement getIdentifier();

}
