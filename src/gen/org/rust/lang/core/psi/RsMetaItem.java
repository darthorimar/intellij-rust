// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.ext.RsPossibleMacroCall;
import org.rust.lang.core.stubs.common.RsMetaItemPsiOrStub;
import com.intellij.psi.StubBasedPsiElement;
import org.rust.lang.core.stubs.RsMetaItemStub;

public interface RsMetaItem extends RsPossibleMacroCall, RsMetaItemPsiOrStub, StubBasedPsiElement<RsMetaItemStub> {

  @Nullable
  RsCompactTT getCompactTT();

  @Nullable
  RsLitExpr getLitExpr();

  @Nullable
  RsMetaItemArgs getMetaItemArgs();

  @Nullable
  RsPath getPath();

  @Nullable
  PsiElement getEq();

}
