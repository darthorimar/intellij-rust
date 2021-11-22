// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import org.rust.lang.core.psi.ext.RsElement;
import org.rust.lang.core.psi.ext.RsOuterAttributeOwner;
import org.rust.lang.core.psi.ext.RsTraitOrImpl;
import org.rust.lang.core.psi.ext.RsUnsafetyOwner;
import org.rust.lang.core.psi.ext.RsInnerAttributeOwner;
import org.rust.lang.core.psi.ext.RsTypeDeclarationElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.ContributedReferenceHost;
import org.rust.lang.core.psi.ext.RsQualifiedNamedElement;
import org.rust.lang.core.psi.ext.RsItemElement;
import org.rust.lang.core.psi.ext.RsAttrProcMacroOwner;
import org.rust.lang.core.psi.ext.RsGenericDeclaration;
import org.rust.lang.core.psi.ext.RsNameIdentifierOwner;
import org.rust.lang.core.psi.ext.RsInferenceContextOwner;
import org.rust.lang.core.stubs.common.RsMetaItemArgsPsiOrStub;
import org.rust.lang.core.psi.ext.RsMandatoryReferenceElement;
import org.rust.lang.core.psi.ext.RsPossibleMacroCall;
import org.rust.lang.core.stubs.common.RsMetaItemPsiOrStub;
import org.rust.lang.core.psi.ext.RsReferenceElementBase;
import org.rust.lang.core.psi.ext.RsFieldDecl;
import org.rust.lang.core.macros.RsExpandedElement;
import org.rust.lang.core.psi.ext.RsLabelReferenceOwner;
import org.rust.lang.core.psi.ext.RsMethodOrField;
import org.rust.lang.core.psi.ext.RsMod;
import org.rust.lang.core.psi.ext.RsPathReferenceElement;
import org.rust.lang.core.psi.ext.RsStructOrEnumItemElement;
import org.rust.lang.core.psi.ext.RsFieldsOwner;
import org.rust.lang.core.psi.ext.RsLabeledExpression;
import org.rust.lang.core.psi.ext.RsGenericParameter;
import org.rust.lang.core.psi.ext.RsLooplikeExpr;
import org.rust.lang.core.psi.ext.RsVisibilityOwner;
import org.rust.lang.core.psi.ext.RsReferenceElement;
import org.rust.lang.core.psi.ext.RsModificationTrackerOwner;
import org.rust.lang.core.psi.ext.RsFunctionOrLambda;
import org.rust.lang.core.psi.ext.RsAbstractable;
import org.rust.lang.core.psi.ext.RsAttr;
import org.rust.lang.core.psi.ext.RsItemsOwner;
import org.rust.lang.core.psi.ext.RsMacroDefinitionBase;

public class RsVisitor extends PsiElementVisitor {

  public void visitAlias(@NotNull RsAlias o) {
    visitNameIdentifierOwner(o);
  }

  public void visitArrayExpr(@NotNull RsArrayExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitArrayType(@NotNull RsArrayType o) {
    visitTypeReference(o);
    // visitInferenceContextOwner(o);
  }

  public void visitAsmMacroArg(@NotNull RsAsmMacroArg o) {
    visitElement(o);
  }

  public void visitAsmMacroArgument(@NotNull RsAsmMacroArgument o) {
    visitElement(o);
  }

  public void visitAsmMacroOperand(@NotNull RsAsmMacroOperand o) {
    visitElement(o);
  }

  public void visitAsmMacroOption(@NotNull RsAsmMacroOption o) {
    visitElement(o);
  }

  public void visitAsmMacroOptions(@NotNull RsAsmMacroOptions o) {
    visitElement(o);
  }

  public void visitAsmMacroRegDir(@NotNull RsAsmMacroRegDir o) {
    visitElement(o);
  }

  public void visitAsmMacroRegOperand(@NotNull RsAsmMacroRegOperand o) {
    visitElement(o);
  }

  public void visitAsmMacroRegSpec(@NotNull RsAsmMacroRegSpec o) {
    visitElement(o);
  }

  public void visitAsmMacroRegTarget(@NotNull RsAsmMacroRegTarget o) {
    visitElement(o);
  }

  public void visitAssertMacroArgument(@NotNull RsAssertMacroArgument o) {
    visitElement(o);
  }

  public void visitAssocTypeBinding(@NotNull RsAssocTypeBinding o) {
    visitMandatoryReferenceElement(o);
  }

  public void visitBaseType(@NotNull RsBaseType o) {
    visitTypeReference(o);
    // visitInferenceContextOwner(o);
  }

  public void visitBinaryExpr(@NotNull RsBinaryExpr o) {
    visitExpr(o);
  }

  public void visitBinaryOp(@NotNull RsBinaryOp o) {
    visitMandatoryReferenceElement(o);
  }

  public void visitBindingMode(@NotNull RsBindingMode o) {
    visitElement(o);
  }

  public void visitBlock(@NotNull RsBlock o) {
    visitItemsOwner(o);
  }

  public void visitBlockExpr(@NotNull RsBlockExpr o) {
    visitExpr(o);
    // visitLabeledExpression(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitBlockFields(@NotNull RsBlockFields o) {
    visitElement(o);
  }

  public void visitBound(@NotNull RsBound o) {
    visitElement(o);
  }

  public void visitBreakExpr(@NotNull RsBreakExpr o) {
    visitExpr(o);
    // visitLabelReferenceOwner(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitCallExpr(@NotNull RsCallExpr o) {
    visitExpr(o);
  }

  public void visitCastExpr(@NotNull RsCastExpr o) {
    visitExpr(o);
  }

  public void visitCompactTT(@NotNull RsCompactTT o) {
    visitElement(o);
  }

  public void visitConcatMacroArgument(@NotNull RsConcatMacroArgument o) {
    visitElement(o);
  }

  public void visitCondition(@NotNull RsCondition o) {
    visitElement(o);
  }

  public void visitConstParameter(@NotNull RsConstParameter o) {
    visitGenericParameter(o);
    // visitOuterAttributeOwner(o);
    // visitInferenceContextOwner(o);
  }

  public void visitConstant(@NotNull RsConstant o) {
    visitQualifiedNamedElement(o);
    // visitNameIdentifierOwner(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitAbstractable(o);
    // visitInferenceContextOwner(o);
    // visitExpandedElement(o);
  }

  public void visitContExpr(@NotNull RsContExpr o) {
    visitExpr(o);
    // visitLabelReferenceOwner(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitDotExpr(@NotNull RsDotExpr o) {
    visitExpr(o);
  }

  public void visitElseBranch(@NotNull RsElseBranch o) {
    visitElement(o);
  }

  public void visitEmptyStmt(@NotNull RsEmptyStmt o) {
    visitStmt(o);
  }

  public void visitEnumBody(@NotNull RsEnumBody o) {
    visitElement(o);
  }

  public void visitEnumItem(@NotNull RsEnumItem o) {
    visitStructOrEnumItemElement(o);
  }

  public void visitEnumVariant(@NotNull RsEnumVariant o) {
    visitQualifiedNamedElement(o);
    // visitNameIdentifierOwner(o);
    // visitOuterAttributeOwner(o);
    // visitFieldsOwner(o);
    // visitVisibilityOwner(o);
  }

  public void visitEnvMacroArgument(@NotNull RsEnvMacroArgument o) {
    visitElement(o);
  }

  public void visitExpr(@NotNull RsExpr o) {
    visitExpandedElement(o);
  }

  public void visitExprMacroArgument(@NotNull RsExprMacroArgument o) {
    visitElement(o);
  }

  public void visitExprStmt(@NotNull RsExprStmt o) {
    visitStmt(o);
  }

  public void visitExpressionCodeFragmentElement(@NotNull RsExpressionCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitExternAbi(@NotNull RsExternAbi o) {
    visitElement(o);
  }

  public void visitExternCrateItem(@NotNull RsExternCrateItem o) {
    visitMandatoryReferenceElement(o);
    // visitNameIdentifierOwner(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
  }

  public void visitFieldLookup(@NotNull RsFieldLookup o) {
    visitMethodOrField(o);
  }

  public void visitFnPointerType(@NotNull RsFnPointerType o) {
    visitTypeReference(o);
  }

  public void visitForExpr(@NotNull RsForExpr o) {
    visitExpr(o);
    // visitLabeledExpression(o);
    // visitOuterAttributeOwner(o);
    // visitLooplikeExpr(o);
  }

  public void visitForInType(@NotNull RsForInType o) {
    visitTypeReference(o);
  }

  public void visitForLifetimes(@NotNull RsForLifetimes o) {
    visitElement(o);
  }

  public void visitForeignModItem(@NotNull RsForeignModItem o) {
    visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitInnerAttributeOwner(o);
  }

  public void visitFormatMacroArg(@NotNull RsFormatMacroArg o) {
    visitElement(o);
  }

  public void visitFormatMacroArgument(@NotNull RsFormatMacroArgument o) {
    visitElement(o);
  }

  public void visitFunction(@NotNull RsFunction o) {
    visitFunctionOrLambda(o);
    // visitQualifiedNamedElement(o);
    // visitGenericDeclaration(o);
    // visitInnerAttributeOwner(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitNameIdentifierOwner(o);
    // visitAbstractable(o);
    // visitUnsafetyOwner(o);
    // visitInferenceContextOwner(o);
  }

  public void visitIfExpr(@NotNull RsIfExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitImplItem(@NotNull RsImplItem o) {
    visitTraitOrImpl(o);
    // visitUnsafetyOwner(o);
    // visitInnerAttributeOwner(o);
    // visitTypeDeclarationElement(o);
  }

  public void visitIncludeMacroArgument(@NotNull RsIncludeMacroArgument o) {
    visitElement(o);
  }

  public void visitIndexExpr(@NotNull RsIndexExpr o) {
    visitExpr(o);
    // visitReferenceElement(o);
  }

  public void visitInnerAttr(@NotNull RsInnerAttr o) {
    visitAttr(o);
  }

  public void visitLabel(@NotNull RsLabel o) {
    visitMandatoryReferenceElement(o);
  }

  public void visitLabelDecl(@NotNull RsLabelDecl o) {
    visitNameIdentifierOwner(o);
  }

  public void visitLambdaExpr(@NotNull RsLambdaExpr o) {
    visitExpr(o);
    // visitFunctionOrLambda(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitLetDecl(@NotNull RsLetDecl o) {
    visitStmt(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitLetElseBranch(@NotNull RsLetElseBranch o) {
    visitElement(o);
  }

  public void visitLifetime(@NotNull RsLifetime o) {
    visitNameIdentifierOwner(o);
    // visitMandatoryReferenceElement(o);
  }

  public void visitLifetimeParamBounds(@NotNull RsLifetimeParamBounds o) {
    visitElement(o);
  }

  public void visitLifetimeParameter(@NotNull RsLifetimeParameter o) {
    visitGenericParameter(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitLitExpr(@NotNull RsLitExpr o) {
    visitExpr(o);
    // visitPsiLanguageInjectionHost(o);
    // visitContributedReferenceHost(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitLoopExpr(@NotNull RsLoopExpr o) {
    visitExpr(o);
    // visitLabeledExpression(o);
    // visitOuterAttributeOwner(o);
    // visitLooplikeExpr(o);
  }

  public void visitMacro(@NotNull RsMacro o) {
    visitMacroDefinitionBase(o);
  }

  public void visitMacro2(@NotNull RsMacro2 o) {
    visitMacroDefinitionBase(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
  }

  public void visitMacroArgument(@NotNull RsMacroArgument o) {
    visitElement(o);
  }

  public void visitMacroArgumentTT(@NotNull RsMacroArgumentTT o) {
    visitElement(o);
  }

  public void visitMacroBinding(@NotNull RsMacroBinding o) {
    visitNameIdentifierOwner(o);
  }

  public void visitMacroBindingGroup(@NotNull RsMacroBindingGroup o) {
    visitElement(o);
  }

  public void visitMacroBindingGroupSeparator(@NotNull RsMacroBindingGroupSeparator o) {
    visitElement(o);
  }

  public void visitMacroBody(@NotNull RsMacroBody o) {
    visitElement(o);
  }

  public void visitMacroBodyIdent(@NotNull RsMacroBodyIdent o) {
    visitReferenceElementBase(o);
  }

  public void visitMacroBodyQuoteIdent(@NotNull RsMacroBodyQuoteIdent o) {
    visitReferenceElementBase(o);
  }

  public void visitMacroCall(@NotNull RsMacroCall o) {
    visitOuterAttributeOwner(o);
    // visitExpandedElement(o);
    // visitPossibleMacroCall(o);
    // visitAttrProcMacroOwner(o);
    // visitModificationTrackerOwner(o);
  }

  public void visitMacroCase(@NotNull RsMacroCase o) {
    visitElement(o);
  }

  public void visitMacroExpansion(@NotNull RsMacroExpansion o) {
    visitElement(o);
  }

  public void visitMacroExpansionContents(@NotNull RsMacroExpansionContents o) {
    visitElement(o);
  }

  public void visitMacroExpansionGroupSeparator(@NotNull RsMacroExpansionGroupSeparator o) {
    visitElement(o);
  }

  public void visitMacroExpansionReferenceGroup(@NotNull RsMacroExpansionReferenceGroup o) {
    visitElement(o);
  }

  public void visitMacroExpr(@NotNull RsMacroExpr o) {
    visitExpr(o);
  }

  public void visitMacroPattern(@NotNull RsMacroPattern o) {
    visitElement(o);
  }

  public void visitMacroPatternContents(@NotNull RsMacroPatternContents o) {
    visitElement(o);
  }

  public void visitMacroReference(@NotNull RsMacroReference o) {
    visitMandatoryReferenceElement(o);
  }

  public void visitMacroType(@NotNull RsMacroType o) {
    visitTypeReference(o);
  }

  public void visitMatchArm(@NotNull RsMatchArm o) {
    visitOuterAttributeOwner(o);
  }

  public void visitMatchArmGuard(@NotNull RsMatchArmGuard o) {
    visitElement(o);
  }

  public void visitMatchBody(@NotNull RsMatchBody o) {
    visitElement(o);
  }

  public void visitMatchExpr(@NotNull RsMatchExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitMembers(@NotNull RsMembers o) {
    visitElement(o);
  }

  public void visitMetaItem(@NotNull RsMetaItem o) {
    visitPossibleMacroCall(o);
    // visitMetaItemPsiOrStub(o);
  }

  public void visitMetaItemArgs(@NotNull RsMetaItemArgs o) {
    visitElement(o);
    // visitMetaItemArgsPsiOrStub(o);
  }

  public void visitMetaVarIdentifier(@NotNull RsMetaVarIdentifier o) {
    visitElement(o);
  }

  public void visitMethodCall(@NotNull RsMethodCall o) {
    visitMethodOrField(o);
  }

  public void visitModDeclItem(@NotNull RsModDeclItem o) {
    visitMandatoryReferenceElement(o);
    // visitNameIdentifierOwner(o);
    // visitQualifiedNamedElement(o);
    // visitItemElement(o);
  }

  public void visitModItem(@NotNull RsModItem o) {
    visitNameIdentifierOwner(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitMod(o);
    // visitInnerAttributeOwner(o);
  }

  public void visitNamedFieldDecl(@NotNull RsNamedFieldDecl o) {
    visitFieldDecl(o);
    // visitNameIdentifierOwner(o);
    // visitQualifiedNamedElement(o);
  }

  public void visitOrPat(@NotNull RsOrPat o) {
    visitPat(o);
  }

  public void visitOuterAttr(@NotNull RsOuterAttr o) {
    visitAttr(o);
  }

  public void visitParenExpr(@NotNull RsParenExpr o) {
    visitExpr(o);
  }

  public void visitParenType(@NotNull RsParenType o) {
    visitTypeReference(o);
  }

  public void visitPat(@NotNull RsPat o) {
    visitExpandedElement(o);
  }

  public void visitPatBinding(@NotNull RsPatBinding o) {
    visitNameIdentifierOwner(o);
    // visitMandatoryReferenceElement(o);
  }

  public void visitPatBox(@NotNull RsPatBox o) {
    visitPat(o);
  }

  public void visitPatConst(@NotNull RsPatConst o) {
    visitPat(o);
  }

  public void visitPatField(@NotNull RsPatField o) {
    visitElement(o);
  }

  public void visitPatFieldFull(@NotNull RsPatFieldFull o) {
    visitMandatoryReferenceElement(o);
  }

  public void visitPatIdent(@NotNull RsPatIdent o) {
    visitPat(o);
  }

  public void visitPatMacro(@NotNull RsPatMacro o) {
    visitPat(o);
  }

  public void visitPatRange(@NotNull RsPatRange o) {
    visitPat(o);
  }

  public void visitPatRef(@NotNull RsPatRef o) {
    visitPat(o);
  }

  public void visitPatRest(@NotNull RsPatRest o) {
    visitPat(o);
  }

  public void visitPatSlice(@NotNull RsPatSlice o) {
    visitPat(o);
  }

  public void visitPatStruct(@NotNull RsPatStruct o) {
    visitPat(o);
  }

  public void visitPatTup(@NotNull RsPatTup o) {
    visitPat(o);
  }

  public void visitPatTupleStruct(@NotNull RsPatTupleStruct o) {
    visitPat(o);
  }

  public void visitPatWild(@NotNull RsPatWild o) {
    visitPat(o);
  }

  public void visitPath(@NotNull RsPath o) {
    visitPathReferenceElement(o);
  }

  public void visitPathExpr(@NotNull RsPathExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitPolybound(@NotNull RsPolybound o) {
    visitElement(o);
  }

  public void visitRangeExpr(@NotNull RsRangeExpr o) {
    visitExpr(o);
  }

  public void visitRefLikeType(@NotNull RsRefLikeType o) {
    visitTypeReference(o);
  }

  public void visitReplCodeFragmentElement(@NotNull RsReplCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitRetExpr(@NotNull RsRetExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitRetType(@NotNull RsRetType o) {
    visitElement(o);
  }

  public void visitSelfParameter(@NotNull RsSelfParameter o) {
    visitNameIdentifierOwner(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitStatementCodeFragmentElement(@NotNull RsStatementCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitStmt(@NotNull RsStmt o) {
    visitExpandedElement(o);
  }

  public void visitStructItem(@NotNull RsStructItem o) {
    visitStructOrEnumItemElement(o);
    // visitFieldsOwner(o);
  }

  public void visitStructLiteral(@NotNull RsStructLiteral o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitStructLiteralBody(@NotNull RsStructLiteralBody o) {
    visitElement(o);
  }

  public void visitStructLiteralField(@NotNull RsStructLiteralField o) {
    visitMandatoryReferenceElement(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitTt(@NotNull RsTt o) {
    visitElement(o);
  }

  public void visitToBeUpped(@NotNull RsToBeUpped o) {
    visitElement(o);
  }

  public void visitTraitAlias(@NotNull RsTraitAlias o) {
    visitQualifiedNamedElement(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitGenericDeclaration(o);
    // visitNameIdentifierOwner(o);
  }

  public void visitTraitAliasBounds(@NotNull RsTraitAliasBounds o) {
    visitElement(o);
  }

  public void visitTraitItem(@NotNull RsTraitItem o) {
    visitTraitOrImpl(o);
    // visitQualifiedNamedElement(o);
    // visitNameIdentifierOwner(o);
    // visitUnsafetyOwner(o);
    // visitInnerAttributeOwner(o);
    // visitTypeDeclarationElement(o);
  }

  public void visitTraitRef(@NotNull RsTraitRef o) {
    visitInferenceContextOwner(o);
  }

  public void visitTraitType(@NotNull RsTraitType o) {
    visitTypeReference(o);
  }

  public void visitTryExpr(@NotNull RsTryExpr o) {
    visitExpr(o);
  }

  public void visitTupleExpr(@NotNull RsTupleExpr o) {
    visitExpr(o);
  }

  public void visitTupleFieldDecl(@NotNull RsTupleFieldDecl o) {
    visitFieldDecl(o);
  }

  public void visitTupleFields(@NotNull RsTupleFields o) {
    visitElement(o);
  }

  public void visitTupleType(@NotNull RsTupleType o) {
    visitTypeReference(o);
  }

  public void visitTypeAlias(@NotNull RsTypeAlias o) {
    visitQualifiedNamedElement(o);
    // visitItemElement(o);
    // visitAttrProcMacroOwner(o);
    // visitNameIdentifierOwner(o);
    // visitGenericDeclaration(o);
    // visitAbstractable(o);
    // visitTypeDeclarationElement(o);
  }

  public void visitTypeArgumentList(@NotNull RsTypeArgumentList o) {
    visitElement(o);
  }

  public void visitTypeParamBounds(@NotNull RsTypeParamBounds o) {
    visitElement(o);
  }

  public void visitTypeParameter(@NotNull RsTypeParameter o) {
    visitGenericParameter(o);
    // visitTypeDeclarationElement(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitTypeParameterList(@NotNull RsTypeParameterList o) {
    visitElement(o);
  }

  public void visitTypePathCodeFragmentElement(@NotNull RsTypePathCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitTypeQual(@NotNull RsTypeQual o) {
    visitElement(o);
  }

  public void visitTypeReference(@NotNull RsTypeReference o) {
    visitExpandedElement(o);
  }

  public void visitTypeReferenceCodeFragmentElement(@NotNull RsTypeReferenceCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitUnaryExpr(@NotNull RsUnaryExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitUnitExpr(@NotNull RsUnitExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitUseGroup(@NotNull RsUseGroup o) {
    visitElement(o);
  }

  public void visitUseItem(@NotNull RsUseItem o) {
    visitItemElement(o);
    // visitAttrProcMacroOwner(o);
  }

  public void visitUseSpeck(@NotNull RsUseSpeck o) {
    visitElement(o);
  }

  public void visitValueArgumentList(@NotNull RsValueArgumentList o) {
    visitElement(o);
  }

  public void visitValueParameter(@NotNull RsValueParameter o) {
    visitOuterAttributeOwner(o);
  }

  public void visitValueParameterList(@NotNull RsValueParameterList o) {
    visitElement(o);
  }

  public void visitValuePathCodeFragmentElement(@NotNull RsValuePathCodeFragmentElement o) {
    visitElement(o);
  }

  public void visitVariadic(@NotNull RsVariadic o) {
    visitOuterAttributeOwner(o);
  }

  public void visitVariantDiscriminant(@NotNull RsVariantDiscriminant o) {
    visitInferenceContextOwner(o);
  }

  public void visitVecMacroArgument(@NotNull RsVecMacroArgument o) {
    visitElement(o);
  }

  public void visitVis(@NotNull RsVis o) {
    visitElement(o);
  }

  public void visitVisRestriction(@NotNull RsVisRestriction o) {
    visitElement(o);
  }

  public void visitWhereClause(@NotNull RsWhereClause o) {
    visitElement(o);
  }

  public void visitWherePred(@NotNull RsWherePred o) {
    visitElement(o);
  }

  public void visitWhileExpr(@NotNull RsWhileExpr o) {
    visitExpr(o);
    // visitLabeledExpression(o);
    // visitOuterAttributeOwner(o);
    // visitLooplikeExpr(o);
  }

  public void visitYieldExpr(@NotNull RsYieldExpr o) {
    visitExpr(o);
    // visitOuterAttributeOwner(o);
  }

  public void visitExpandedElement(@NotNull RsExpandedElement o) {
    visitElement(o);
  }

  public void visitAttr(@NotNull RsAttr o) {
    visitElement(o);
  }

  public void visitFieldDecl(@NotNull RsFieldDecl o) {
    visitElement(o);
  }

  public void visitFunctionOrLambda(@NotNull RsFunctionOrLambda o) {
    visitElement(o);
  }

  public void visitGenericParameter(@NotNull RsGenericParameter o) {
    visitElement(o);
  }

  public void visitInferenceContextOwner(@NotNull RsInferenceContextOwner o) {
    visitElement(o);
  }

  public void visitItemElement(@NotNull RsItemElement o) {
    visitElement(o);
  }

  public void visitItemsOwner(@NotNull RsItemsOwner o) {
    visitElement(o);
  }

  public void visitMacroDefinitionBase(@NotNull RsMacroDefinitionBase o) {
    visitElement(o);
  }

  public void visitMandatoryReferenceElement(@NotNull RsMandatoryReferenceElement o) {
    visitElement(o);
  }

  public void visitMethodOrField(@NotNull RsMethodOrField o) {
    visitElement(o);
  }

  public void visitNameIdentifierOwner(@NotNull RsNameIdentifierOwner o) {
    visitElement(o);
  }

  public void visitOuterAttributeOwner(@NotNull RsOuterAttributeOwner o) {
    visitElement(o);
  }

  public void visitPathReferenceElement(@NotNull RsPathReferenceElement o) {
    visitElement(o);
  }

  public void visitPossibleMacroCall(@NotNull RsPossibleMacroCall o) {
    visitElement(o);
  }

  public void visitQualifiedNamedElement(@NotNull RsQualifiedNamedElement o) {
    visitElement(o);
  }

  public void visitReferenceElementBase(@NotNull RsReferenceElementBase o) {
    visitElement(o);
  }

  public void visitStructOrEnumItemElement(@NotNull RsStructOrEnumItemElement o) {
    visitElement(o);
  }

  public void visitTraitOrImpl(@NotNull RsTraitOrImpl o) {
    visitElement(o);
  }

  public void visitElement(@NotNull RsElement o) {
    super.visitElement(o);
  }

}
