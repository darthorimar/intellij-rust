// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.ContributedReferenceHost;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;

public interface RsLitExpr extends RsExpr, PsiLanguageInjectionHost, ContributedReferenceHost, RsOuterAttributeOwner {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  PsiElement getBoolLiteral();

  @Nullable
  PsiElement getByteLiteral();

  @Nullable
  PsiElement getByteStringLiteral();

  @Nullable
  PsiElement getCharLiteral();

  @Nullable
  PsiElement getFloatLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getRawByteStringLiteral();

  @Nullable
  PsiElement getRawStringLiteral();

  @Nullable
  PsiElement getStringLiteral();

}
