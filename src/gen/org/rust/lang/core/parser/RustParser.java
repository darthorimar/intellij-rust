// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.rust.lang.core.psi.RsElementTypes.*;
import static org.rust.lang.core.parser.RustParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;
import static org.rust.lang.core.parser.RustParserUtil.PathParsingMode.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RustParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    boolean result_;
    if (root_ == EXPRESSION_CODE_FRAGMENT_ELEMENT) {
      result_ = ExpressionCodeFragmentElement(builder_, level_ + 1);
    }
    else if (root_ == MACRO_ARGUMENT) {
      result_ = MacroArgument(builder_, level_ + 1);
    }
    else if (root_ == MACRO_BODY) {
      result_ = MacroBody(builder_, level_ + 1);
    }
    else if (root_ == REPL_CODE_FRAGMENT_ELEMENT) {
      result_ = ReplCodeFragmentElement(builder_, level_ + 1);
    }
    else if (root_ == STATEMENT_CODE_FRAGMENT_ELEMENT) {
      result_ = StatementCodeFragmentElement(builder_, level_ + 1);
    }
    else if (root_ == TYPE_PATH_CODE_FRAGMENT_ELEMENT) {
      result_ = TypePathCodeFragmentElement(builder_, level_ + 1);
    }
    else if (root_ == TYPE_REFERENCE_CODE_FRAGMENT_ELEMENT) {
      result_ = TypeReferenceCodeFragmentElement(builder_, level_ + 1);
    }
    else if (root_ == VALUE_PATH_CODE_FRAGMENT_ELEMENT) {
      result_ = ValuePathCodeFragmentElement(builder_, level_ + 1);
    }
    else {
      result_ = File(builder_, level_ + 1);
    }
    return result_;
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(EMPTY_STMT, EXPR_STMT, LET_DECL, STMT),
    create_token_set_(ARRAY_TYPE, BASE_TYPE, FN_POINTER_TYPE, FOR_IN_TYPE,
      MACRO_TYPE, PAREN_TYPE, REF_LIKE_TYPE, TRAIT_TYPE,
      TUPLE_TYPE, TYPE_REFERENCE),
    create_token_set_(OR_PAT, PAT, PAT_BOX, PAT_CONST,
      PAT_IDENT, PAT_MACRO, PAT_RANGE, PAT_REF,
      PAT_REST, PAT_SLICE, PAT_STRUCT, PAT_TUP,
      PAT_TUPLE_STRUCT, PAT_WILD),
    create_token_set_(ARRAY_EXPR, BINARY_EXPR, BLOCK_EXPR, BREAK_EXPR,
      CALL_EXPR, CAST_EXPR, CONT_EXPR, DOT_EXPR,
      EXPR, FOR_EXPR, IF_EXPR, INDEX_EXPR,
      LAMBDA_EXPR, LIT_EXPR, LOOP_EXPR, MACRO_EXPR,
      MATCH_EXPR, PAREN_EXPR, PATH_EXPR, RANGE_EXPR,
      RET_EXPR, STRUCT_LITERAL, TRY_EXPR, TUPLE_EXPR,
      UNARY_EXPR, UNIT_EXPR, WHILE_EXPR, YIELD_EXPR),
  };

  /* ********************************************************** */
  // '+' | '-'
  public static boolean AddBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AddBinOp")) return false;
    if (!nextTokenIs(builder_, "<operator>", MINUS, PLUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // as ('_' | identifier)
  public static boolean Alias(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Alias")) return false;
    if (!nextTokenIs(builder_, AS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AS);
    result_ = result_ && Alias_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ALIAS, result_);
    return result_;
  }

  // '_' | identifier
  private static boolean Alias_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Alias_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, UNDERSCORE);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* [ RestrictedPat ':' ] TypeReference
  public static boolean AnonParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER, "<anon parameter>");
    result_ = AnonParameter_0(builder_, level_ + 1);
    result_ = result_ && AnonParameter_1(builder_, level_ + 1);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean AnonParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "AnonParameter_0", pos_)) break;
    }
    return true;
  }

  // [ RestrictedPat ':' ]
  private static boolean AnonParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonParameter_1")) return false;
    AnonParameter_1_0(builder_, level_ + 1);
    return true;
  }

  // RestrictedPat ':'
  private static boolean AnonParameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonParameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RestrictedPat(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<exprMode 'StructLiteralsMode.ON' 'StmtMode.OFF' Expr>>
  public static boolean AnyExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnyExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr>");
    result_ = exprMode(builder_, level_ + 1, StructLiteralsMode.ON, StmtMode.OFF, Expr_parser_);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL | BYTE_STRING_LITERAL
  //                       | RAW_STRING_LITERAL | RAW_BYTE_STRING_LITERAL
  //                       | CHAR_LITERAL | BYTE_LITERAL
  //                       | FLOAT_LITERAL | <<parseFloatLiteral>> | INTEGER_LITERAL
  //                       | BOOL_LITERAL
  static boolean AnyLitToken(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnyLitToken")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BYTE_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_BYTE_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, CHAR_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BYTE_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, FLOAT_LITERAL);
    if (!result_) result_ = parseFloatLiteral(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BOOL_LITERAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL | BYTE_STRING_LITERAL
  //                             | RAW_STRING_LITERAL | RAW_BYTE_STRING_LITERAL
  //                             | CHAR_LITERAL | BYTE_LITERAL
  //                             | FLOAT_LITERAL | INTEGER_LITERAL
  //                             | BOOL_LITERAL
  static boolean AnyLitToken_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnyLitToken_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BYTE_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_BYTE_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, CHAR_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BYTE_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, FLOAT_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BOOL_LITERAL);
    return result_;
  }

  /* ********************************************************** */
  // AssocTypeBinding | TypeReference | Lifetime | RestrictedConstExpr
  static boolean AnyTypeArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnyTypeArgument")) return false;
    boolean result_;
    result_ = AssocTypeBinding(builder_, level_ + 1);
    if (!result_) result_ = TypeReference(builder_, level_ + 1);
    if (!result_) result_ = Lifetime(builder_, level_ + 1);
    if (!result_) result_ = RestrictedConstExpr(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // [ AnyExpr ( ';' AnyExpr | (',' AnyExpr)* ','? ) ]
  static boolean ArrayInitializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer")) return false;
    ArrayInitializer_0(builder_, level_ + 1);
    return true;
  }

  // AnyExpr ( ';' AnyExpr | (',' AnyExpr)* ','? )
  private static boolean ArrayInitializer_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AnyExpr(builder_, level_ + 1);
    result_ = result_ && ArrayInitializer_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';' AnyExpr | (',' AnyExpr)* ','?
  private static boolean ArrayInitializer_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ArrayInitializer_0_1_0(builder_, level_ + 1);
    if (!result_) result_ = ArrayInitializer_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';' AnyExpr
  private static boolean ArrayInitializer_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' AnyExpr)* ','?
  private static boolean ArrayInitializer_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ArrayInitializer_0_1_1_0(builder_, level_ + 1);
    result_ = result_ && ArrayInitializer_0_1_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' AnyExpr)*
  private static boolean ArrayInitializer_0_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ArrayInitializer_0_1_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArrayInitializer_0_1_1_0", pos_)) break;
    }
    return true;
  }

  // ',' AnyExpr
  private static boolean ArrayInitializer_0_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean ArrayInitializer_0_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayInitializer_0_1_1_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '[' TypeReference [';' AnyExpr] ']'
  public static boolean ArrayType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_TYPE, null);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TypeReference(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ArrayType_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [';' AnyExpr]
  private static boolean ArrayType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_2")) return false;
    ArrayType_2_0(builder_, level_ + 1);
    return true;
  }

  // ';' AnyExpr
  private static boolean ArrayType_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AsmMacroOperand | STRING_LITERAL | AsmMacroOptions
  public static boolean AsmMacroArg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroArg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_ARG, "<asm macro arg>");
    result_ = AsmMacroOperand(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = AsmMacroOptions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces [ <<comma_separated_list AsmMacroArg>> ] >>
  public static boolean AsmMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_ARGUMENT, "<asm macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::AsmMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ <<comma_separated_list AsmMacroArg>> ]
  private static boolean AsmMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroArgument_0_0")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::AsmMacroArg);
    return true;
  }

  /* ********************************************************** */
  // [ identifier '=' ] ( CONST AnyExpr | 'sym' PathWithoutTypeArgs | AsmMacroRegOperand )
  public static boolean AsmMacroOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOperand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_OPERAND, "<asm macro operand>");
    result_ = AsmMacroOperand_0(builder_, level_ + 1);
    result_ = result_ && AsmMacroOperand_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ identifier '=' ]
  private static boolean AsmMacroOperand_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOperand_0")) return false;
    parseTokens(builder_, 0, IDENTIFIER, EQ);
    return true;
  }

  // CONST AnyExpr | 'sym' PathWithoutTypeArgs | AsmMacroRegOperand
  private static boolean AsmMacroOperand_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOperand_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AsmMacroOperand_1_0(builder_, level_ + 1);
    if (!result_) result_ = AsmMacroOperand_1_1(builder_, level_ + 1);
    if (!result_) result_ = AsmMacroRegOperand(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CONST AnyExpr
  private static boolean AsmMacroOperand_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOperand_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONST);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'sym' PathWithoutTypeArgs
  private static boolean AsmMacroOperand_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOperand_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "sym");
    result_ = result_ && PathWithoutTypeArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean AsmMacroOption(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOption")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ASM_MACRO_OPTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'options' '(' <<comma_separated_list AsmMacroOption>> ')'
  public static boolean AsmMacroOptions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroOptions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_OPTIONS, "<asm macro options>");
    result_ = consumeToken(builder_, "options");
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && comma_separated_list(builder_, level_ + 1, RustParser::AsmMacroOption);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<macroIdentifier>>
  public static boolean AsmMacroRegDir(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegDir")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_REG_DIR, "<asm macro reg dir>");
    result_ = macroIdentifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // AsmMacroRegDir '(' AsmMacroRegSpec ')' AsmMacroRegTarget [ FAT_ARROW AsmMacroRegTarget ]
  public static boolean AsmMacroRegOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegOperand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_REG_OPERAND, "<asm macro reg operand>");
    result_ = AsmMacroRegDir(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && AsmMacroRegSpec(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && AsmMacroRegTarget(builder_, level_ + 1);
    result_ = result_ && AsmMacroRegOperand_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ FAT_ARROW AsmMacroRegTarget ]
  private static boolean AsmMacroRegOperand_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegOperand_5")) return false;
    AsmMacroRegOperand_5_0(builder_, level_ + 1);
    return true;
  }

  // FAT_ARROW AsmMacroRegTarget
  private static boolean AsmMacroRegOperand_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegOperand_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FAT_ARROW);
    result_ = result_ && AsmMacroRegTarget(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL | identifier
  public static boolean AsmMacroRegSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegSpec")) return false;
    if (!nextTokenIs(builder_, "<asm macro reg spec>", IDENTIFIER, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_REG_SPEC, "<asm macro reg spec>");
    result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // UNDERSCORE | AnyExpr
  public static boolean AsmMacroRegTarget(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AsmMacroRegTarget")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASM_MACRO_REG_TARGET, "<asm macro reg target>");
    result_ = consumeToken(builder_, UNDERSCORE);
    if (!result_) result_ = AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces (AnyExpr [ ',' <<comma_separated_list FormatMacroArg>> ])>>
  public static boolean AssertMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssertMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSERT_MACRO_ARGUMENT, "<assert macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::AssertMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // AnyExpr [ ',' <<comma_separated_list FormatMacroArg>> ]
  private static boolean AssertMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssertMacroArgument_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AnyExpr(builder_, level_ + 1);
    result_ = result_ && AssertMacroArgument_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' <<comma_separated_list FormatMacroArg>> ]
  private static boolean AssertMacroArgument_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssertMacroArgument_0_0_1")) return false;
    AssertMacroArgument_0_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' <<comma_separated_list FormatMacroArg>>
  private static boolean AssertMacroArgument_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssertMacroArgument_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && comma_separated_list(builder_, level_ + 1, RustParser::FormatMacroArg);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // gtgteq | ltlteq | '|=' | '^=' | '&=' | '=' | '+=' | '-=' | '*=' | '/=' | '%='
  public static boolean AssignBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, BINARY_OP, "<operator>");
    result_ = gtgteq(builder_, level_ + 1);
    if (!result_) result_ = ltlteq(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OREQ);
    if (!result_) result_ = consumeToken(builder_, XOREQ);
    if (!result_) result_ = consumeToken(builder_, ANDEQ);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, PLUSEQ);
    if (!result_) result_ = consumeToken(builder_, MINUSEQ);
    if (!result_) result_ = consumeToken(builder_, MULEQ);
    if (!result_) result_ = consumeToken(builder_, DIVEQ);
    if (!result_) result_ = consumeToken(builder_, REMEQ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier (AssocTypeBindingType | AssocTypeBindingBound)
  public static boolean AssocTypeBinding(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssocTypeBinding")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && AssocTypeBinding_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSOC_TYPE_BINDING, result_);
    return result_;
  }

  // AssocTypeBindingType | AssocTypeBindingBound
  private static boolean AssocTypeBinding_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssocTypeBinding_1")) return false;
    boolean result_;
    result_ = AssocTypeBindingType(builder_, level_ + 1);
    if (!result_) result_ = AssocTypeBindingBound(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ':' TypeBounds
  static boolean AssocTypeBindingBound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssocTypeBindingBound")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeBounds(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '=' TypeReference
  static boolean AssocTypeBindingType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssocTypeBindingType")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, EQ);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // MetaItemWithoutTT ']' |  MetaItemWithTT ']'
  static boolean AttrUpper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrUpper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AttrUpper_0(builder_, level_ + 1);
    if (!result_) result_ = AttrUpper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MetaItemWithoutTT ']'
  private static boolean AttrUpper_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrUpper_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemWithoutTT(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MetaItemWithTT ']'
  private static boolean AttrUpper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrUpper_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemWithTT(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* Vis?
  static boolean AttrsAndVis(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrsAndVis")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AttrsAndVis_0(builder_, level_ + 1);
    result_ = result_ && AttrsAndVis_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr*
  private static boolean AttrsAndVis_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrsAndVis_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "AttrsAndVis_0", pos_)) break;
    }
    return true;
  }

  // Vis?
  private static boolean AttrsAndVis_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrsAndVis_1")) return false;
    Vis(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '#' | crate | pub
  static boolean AttrsAndVis_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrsAndVis_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SHA);
    if (!result_) result_ = consumeTokenFast(builder_, CRATE);
    if (!result_) result_ = consumeTokenFast(builder_, PUB);
    return result_;
  }

  /* ********************************************************** */
  // TrivialBaseTypeInner | TypePathGenericArgs
  public static boolean BaseType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BaseType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASE_TYPE, "<base type>");
    result_ = TrivialBaseTypeInner(builder_, level_ + 1);
    if (!result_) result_ = TypePathGenericArgs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ref mut? | mut
  public static boolean BindingMode(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BindingMode")) return false;
    if (!nextTokenIs(builder_, "<binding mode>", MUT, REF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINDING_MODE, "<binding mode>");
    result_ = BindingMode_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MUT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ref mut?
  private static boolean BindingMode_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BindingMode_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, REF);
    result_ = result_ && BindingMode_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // mut?
  private static boolean BindingMode_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BindingMode_0_1")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  /* ********************************************************** */
  // '&'
  public static boolean BitAndBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitAndBinOp")) return false;
    if (!nextTokenIs(builder_, "<operator>", AND)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, AND);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '|'
  public static boolean BitOrBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitOrBinOp")) return false;
    if (!nextTokenIs(builder_, "<operator>", OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, OR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ltlt | <<checkGtAllowed>> gtgt
  public static boolean BitShiftBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitShiftBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, BINARY_OP, "<operator>");
    result_ = ltlt(builder_, level_ + 1);
    if (!result_) result_ = BitShiftBinOp_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<checkGtAllowed>> gtgt
  private static boolean BitShiftBinOp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitShiftBinOp_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = checkGtAllowed(builder_, level_ + 1);
    result_ = result_ && gtgt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '^'
  public static boolean BitXorBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitXorBinOp")) return false;
    if (!nextTokenIs(builder_, "<operator>", XOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, XOR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !'}' (BlockElementMacro | BlockElementMacroCall | ExprStmtOrLastExpr | Stmt | Item)
  static boolean BlockElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElement")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = BlockElement_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && BlockElement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::BlockElement_recover);
    return result_ || pinned_;
  }

  // !'}'
  private static boolean BlockElement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // BlockElementMacro | BlockElementMacroCall | ExprStmtOrLastExpr | Stmt | Item
  private static boolean BlockElement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BlockElementMacro(builder_, level_ + 1);
    if (!result_) result_ = BlockElementMacroCall(builder_, level_ + 1);
    if (!result_) result_ = ExprStmtOrLastExpr(builder_, level_ + 1);
    if (!result_) result_ = Stmt(builder_, level_ + 1);
    if (!result_) result_ = Item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AttrsAndVis Macro
  public static boolean BlockElementMacro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElementMacro")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TO_BE_UPPED, "<macro>");
    result_ = AttrsAndVis(builder_, level_ + 1);
    result_ = result_ && Macro(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<parseMacroCall 'MacroCallParsingMode.BLOCK'>>
  public static boolean BlockElementMacroCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElementMacroCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, MACRO_CALL, "<macro call>");
    result_ = parseMacroCall(builder_, level_ + 1, MacroCallParsingMode.BLOCK);
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | Item_first | Expr_first | let | ';')
  static boolean BlockElement_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElement_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !BlockElement_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | Item_first | Expr_first | let | ';'
  private static boolean BlockElement_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockElement_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = Item_first(builder_, level_ + 1);
    if (!result_) result_ = Expr_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LET);
    if (!result_) result_ = consumeTokenFast(builder_, SEMICOLON);
    return result_;
  }

  /* ********************************************************** */
  // '{' NamedFieldDecl_with_recover* '}'
  public static boolean BlockFields(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockFields")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_FIELDS, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, BlockFields_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // NamedFieldDecl_with_recover*
  private static boolean BlockFields_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockFields_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!NamedFieldDecl_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockFields_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // WhereClause? BlockFields
  static boolean BlockStructTail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockStructTail")) return false;
    if (!nextTokenIs(builder_, "", LBRACE, WHERE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BlockStructTail_0(builder_, level_ + 1);
    result_ = result_ && BlockFields(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // WhereClause?
  private static boolean BlockStructTail_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockStructTail_0")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // andand
  public static boolean BoolAndBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BoolAndBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, BINARY_OP, "<operator>");
    result_ = andand(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // oror
  public static boolean BoolOrBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BoolOrBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, BINARY_OP, "<operator>");
    result_ = oror(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Lifetime | TraitRef
  public static boolean Bound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Bound")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOUND, "<bound>");
    result_ = Lifetime(builder_, level_ + 1);
    if (!result_) result_ = TraitRef(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // &'::' TypeArgumentListImpl
  public static boolean ColonTypeArgumentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ColonTypeArgumentList")) return false;
    if (!nextTokenIs(builder_, COLONCOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ColonTypeArgumentList_0(builder_, level_ + 1);
    result_ = result_ && TypeArgumentListImpl(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_ARGUMENT_LIST, result_);
    return result_;
  }

  // &'::'
  private static boolean ColonTypeArgumentList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ColonTypeArgumentList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, COLONCOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '==' | '!='
  public static boolean CompBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompBinOp")) return false;
    if (!nextTokenIs(builder_, "<operator>", EQEQ, EXCLEQ)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, EQEQ);
    if (!result_) result_ = consumeToken(builder_, EXCLEQ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (<<any_braces CompactTT>> | <<unpairedToken>>)*
  public static boolean CompactTT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompactTT")) return false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, COMPACT_TT, "<compact tt>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!CompactTT_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CompactTT", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // <<any_braces CompactTT>> | <<unpairedToken>>
  private static boolean CompactTT_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompactTT_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = any_braces(builder_, level_ + 1, RustParser::CompactTT);
    if (!result_) result_ = unpairedToken(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces <<comma_separated_list AnyExpr>>?>>
  public static boolean ConcatMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConcatMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONCAT_MACRO_ARGUMENT, "<concat macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::ConcatMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<comma_separated_list AnyExpr>>?
  private static boolean ConcatMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConcatMacroArgument_0_0")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::AnyExpr);
    return true;
  }

  /* ********************************************************** */
  // IfLetCondition | NoStructLitExpr
  public static boolean Condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Condition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITION, "<condition>");
    result_ = IfLetCondition(builder_, level_ + 1);
    if (!result_) result_ = NoStructLitExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* const identifier TypeAscription DefaultConstParameterValue?
  public static boolean ConstParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstParameter")) return false;
    if (!nextTokenIs(builder_, "<const parameter>", CONST, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONST_PARAMETER, "<const parameter>");
    result_ = ConstParameter_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 1, CONST, IDENTIFIER);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, TypeAscription(builder_, level_ + 1));
    result_ = pinned_ && ConstParameter_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean ConstParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ConstParameter_0", pos_)) break;
    }
    return true;
  }

  // DefaultConstParameterValue?
  private static boolean ConstParameter_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstParameter_4")) return false;
    DefaultConstParameterValue(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (static mut? | const) (identifier | '_') TypeAscription? [ '=' AnyExpr ] ';'
  public static boolean Constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant")) return false;
    if (!nextTokenIs(builder_, "", CONST, STATIC)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, CONSTANT, null);
    result_ = Constant_0(builder_, level_ + 1);
    result_ = result_ && Constant_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, Constant_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Constant_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // static mut? | const
  private static boolean Constant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Constant_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static mut?
  private static boolean Constant_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STATIC);
    result_ = result_ && Constant_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // mut?
  private static boolean Constant_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_0_0_1")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  // identifier | '_'
  private static boolean Constant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, UNDERSCORE);
    return result_;
  }

  // TypeAscription?
  private static boolean Constant_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_2")) return false;
    TypeAscription(builder_, level_ + 1);
    return true;
  }

  // [ '=' AnyExpr ]
  private static boolean Constant_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_3")) return false;
    Constant_3_0(builder_, level_ + 1);
    return true;
  }

  // '=' AnyExpr
  private static boolean Constant_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Constant_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '=' RestrictedConstExpr
  static boolean DefaultConstParameterValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefaultConstParameterValue")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, EQ);
    pinned_ = result_; // pin = 1
    result_ = result_ && RestrictedConstExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '=' TypeReference
  static boolean DefaultTypeParameterType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefaultTypeParameterType")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, EQ);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // else ( IfExpr | SimpleBlock )
  public static boolean ElseBranch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseBranch")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && ElseBranch_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSE_BRANCH, result_);
    return result_;
  }

  // IfExpr | SimpleBlock
  private static boolean ElseBranch_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseBranch_1")) return false;
    boolean result_;
    result_ = IfExpr(builder_, level_ + 1);
    if (!result_) result_ = SimpleBlock(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ';'
  public static boolean EmptyStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EmptyStmt")) return false;
    if (!nextTokenIs(builder_, SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, EMPTY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' [ <<comma_separated_list EnumVariant>> ] '}'
  public static boolean EnumBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_BODY, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, EnumBody_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ <<comma_separated_list EnumVariant>> ]
  private static boolean EnumBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumBody_1")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::EnumVariant);
    return true;
  }

  /* ********************************************************** */
  // enum identifier TypeParameterList? WhereClause? EnumBody
  public static boolean EnumItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumItem")) return false;
    if (!nextTokenIs(builder_, "", ENUM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, ENUM_ITEM, null);
    result_ = consumeTokens(builder_, 1, ENUM, IDENTIFIER);
    pinned_ = result_; // pin = enum
    result_ = result_ && report_error_(builder_, EnumItem_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, EnumItem_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && EnumBody(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TypeParameterList?
  private static boolean EnumItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumItem_2")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // WhereClause?
  private static boolean EnumItem_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumItem_3")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis identifier VariantArgs?
  public static boolean EnumVariant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumVariant")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_VARIANT, "<enum variant>");
    result_ = AttrsAndVis(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    pinned_ = result_; // pin = 2
    result_ = result_ && EnumVariant_2(builder_, level_ + 1);
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // VariantArgs?
  private static boolean EnumVariant_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumVariant_2")) return false;
    VariantArgs(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<any_braces <<comma_separated_list AnyExpr>>? >>
  public static boolean EnvMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnvMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENV_MACRO_ARGUMENT, "<env macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::EnvMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<comma_separated_list AnyExpr>>?
  private static boolean EnvMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnvMacroArgument_0_0")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::AnyExpr);
    return true;
  }

  /* ********************************************************** */
  // ExplicitTraitTypeInner
  public static boolean ExplicitTraitType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExplicitTraitType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TRAIT_TYPE, "<explicit trait type>");
    result_ = ExplicitTraitTypeInner(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (impl | dyn) Polybound ('+' Polybound)*
  static boolean ExplicitTraitTypeInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExplicitTraitTypeInner")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ExplicitTraitTypeInner_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Polybound(builder_, level_ + 1));
    result_ = pinned_ && ExplicitTraitTypeInner_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // impl | dyn
  private static boolean ExplicitTraitTypeInner_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExplicitTraitTypeInner_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IMPL);
    if (!result_) result_ = dyn(builder_, level_ + 1);
    return result_;
  }

  // ('+' Polybound)*
  private static boolean ExplicitTraitTypeInner_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExplicitTraitTypeInner_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ExplicitTraitTypeInner_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExplicitTraitTypeInner_2", pos_)) break;
    }
    return true;
  }

  // '+' Polybound
  private static boolean ExplicitTraitTypeInner_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExplicitTraitTypeInner_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && Polybound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<parseMacroCall 'MacroCallParsingMode.EXPR'>>
  public static boolean ExprLikeMacroCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprLikeMacroCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, MACRO_CALL, "<macro call>");
    result_ = parseMacroCall(builder_, level_ + 1, MacroCallParsingMode.EXPR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces [ AnyExpr ','? ]>>
  public static boolean ExprMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPR_MACRO_ARGUMENT, "<expr macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::ExprMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ AnyExpr ','? ]
  private static boolean ExprMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprMacroArgument_0_0")) return false;
    ExprMacroArgument_0_0_0(builder_, level_ + 1);
    return true;
  }

  // AnyExpr ','?
  private static boolean ExprMacroArgument_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprMacroArgument_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AnyExpr(builder_, level_ + 1);
    result_ = result_ && ExprMacroArgument_0_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean ExprMacroArgument_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprMacroArgument_0_0_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // StmtModeExpr (&'}' | ExprStmtUpper)
  public static boolean ExprStmtOrLastExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmtOrLastExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr stmt or last expr>");
    result_ = StmtModeExpr(builder_, level_ + 1);
    result_ = result_ && ExprStmtOrLastExpr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &'}' | ExprStmtUpper
  private static boolean ExprStmtOrLastExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmtOrLastExpr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ExprStmtOrLastExpr_1_0(builder_, level_ + 1);
    if (!result_) result_ = ExprStmtUpper(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}'
  private static boolean ExprStmtOrLastExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmtOrLastExpr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeTokenFast(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // () (';' | <<isBlock>>)
  public static boolean ExprStmtUpper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmtUpper")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_ | _UPPER_, EXPR_STMT, "<expr stmt upper>");
    result_ = ExprStmtUpper_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ExprStmtUpper_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ()
  private static boolean ExprStmtUpper_0(PsiBuilder builder_, int level_) {
    return true;
  }

  // ';' | <<isBlock>>
  private static boolean ExprStmtUpper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmtUpper_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = isBlock(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // return | '|' | Path_first | '{' | '[' | '(' | '..' | '...' | '..=' | true | false | box | QUOTE_IDENTIFIER
  //   | '-' | '*' | '!' | '&' | static | move | AnyLitToken_first | while | if | for | continue | break  | loop | match | unsafe
  //   | yield | "async" | "try"
  static boolean Expr_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expr_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RETURN);
    if (!result_) result_ = consumeTokenFast(builder_, OR);
    if (!result_) result_ = Path_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACK);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOTEQ);
    if (!result_) result_ = consumeTokenFast(builder_, TRUE);
    if (!result_) result_ = consumeTokenFast(builder_, FALSE);
    if (!result_) result_ = consumeTokenFast(builder_, BOX);
    if (!result_) result_ = consumeTokenFast(builder_, QUOTE_IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, MINUS);
    if (!result_) result_ = consumeTokenFast(builder_, MUL);
    if (!result_) result_ = consumeTokenFast(builder_, EXCL);
    if (!result_) result_ = consumeTokenFast(builder_, AND);
    if (!result_) result_ = consumeTokenFast(builder_, STATIC);
    if (!result_) result_ = consumeTokenFast(builder_, MOVE);
    if (!result_) result_ = AnyLitToken_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, WHILE);
    if (!result_) result_ = consumeTokenFast(builder_, IF);
    if (!result_) result_ = consumeTokenFast(builder_, FOR);
    if (!result_) result_ = consumeTokenFast(builder_, CONTINUE);
    if (!result_) result_ = consumeTokenFast(builder_, BREAK);
    if (!result_) result_ = consumeTokenFast(builder_, LOOP);
    if (!result_) result_ = consumeTokenFast(builder_, MATCH);
    if (!result_) result_ = consumeTokenFast(builder_, UNSAFE);
    if (!result_) result_ = consumeTokenFast(builder_, YIELD);
    if (!result_) result_ = consumeTokenFast(builder_, "async");
    if (!result_) result_ = consumeTokenFast(builder_, "try");
    return result_;
  }

  /* ********************************************************** */
  // Expr?
  public static boolean ExpressionCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpressionCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_CODE_FRAGMENT_ELEMENT, "<expression code fragment element>");
    Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // extern LitExpr?
  public static boolean ExternAbi(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternAbi")) return false;
    if (!nextTokenIs(builder_, EXTERN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERN);
    result_ = result_ && ExternAbi_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTERN_ABI, result_);
    return result_;
  }

  // LitExpr?
  private static boolean ExternAbi_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternAbi_1")) return false;
    LitExpr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // extern crate (identifier | self) Alias? ';'
  public static boolean ExternCrateItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternCrateItem")) return false;
    if (!nextTokenIs(builder_, "", EXTERN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, EXTERN_CRATE_ITEM, null);
    result_ = consumeTokens(builder_, 0, EXTERN, CRATE);
    result_ = result_ && ExternCrateItem_2(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, ExternCrateItem_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // identifier | self
  private static boolean ExternCrateItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternCrateItem_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, SELF);
    return result_;
  }

  // Alias?
  private static boolean ExternCrateItem_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternCrateItem_3")) return false;
    Alias(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ('::' | <<checkTypeQualAllowed>> TypeQual) !('{' | '*') PathIdent
  static boolean FQPathStart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FQPathStart")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = FQPathStart_0(builder_, level_ + 1);
    result_ = result_ && FQPathStart_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && PathIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '::' | <<checkTypeQualAllowed>> TypeQual
  private static boolean FQPathStart_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FQPathStart_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLONCOLON);
    if (!result_) result_ = FQPathStart_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<checkTypeQualAllowed>> TypeQual
  private static boolean FQPathStart_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FQPathStart_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = checkTypeQualAllowed(builder_, level_ + 1);
    result_ = result_ && TypeQual(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !('{' | '*')
  private static boolean FQPathStart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FQPathStart_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !FQPathStart_1_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '{' | '*'
  private static boolean FQPathStart_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FQPathStart_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LBRACE);
    if (!result_) result_ = consumeToken(builder_, MUL);
    return result_;
  }

  /* ********************************************************** */
  // identifier | INTEGER_LITERAL
  public static boolean FieldLookup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldLookup")) return false;
    if (!nextTokenIs(builder_, "<field lookup>", IDENTIFIER, INTEGER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_LOOKUP, "<field lookup>");
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ SHEBANG_LINE ] InnerAttr* RootItems
  static boolean File(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = File_0(builder_, level_ + 1);
    result_ = result_ && File_1(builder_, level_ + 1);
    result_ = result_ && RootItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ SHEBANG_LINE ]
  private static boolean File_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_0")) return false;
    consumeToken(builder_, SHEBANG_LINE);
    return true;
  }

  // InnerAttr*
  private static boolean File_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "File_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InnerAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "File_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* [ Pat ':' ] (VariadicUpper | TypeReference)
  public static boolean FnParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER, "<fn parameter>");
    result_ = FnParameter_0(builder_, level_ + 1);
    result_ = result_ && FnParameter_1(builder_, level_ + 1);
    result_ = result_ && FnParameter_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean FnParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FnParameter_0", pos_)) break;
    }
    return true;
  }

  // [ Pat ':' ]
  private static boolean FnParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_1")) return false;
    FnParameter_1_0(builder_, level_ + 1);
    return true;
  }

  // Pat ':'
  private static boolean FnParameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Pat(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VariadicUpper | TypeReference
  private static boolean FnParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_2")) return false;
    boolean result_;
    result_ = VariadicUpper(builder_, level_ + 1);
    if (!result_) result_ = TypeReference(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !(Pat_first | OuterAttr_first | '...' | ')' | '{' | ';')
  static boolean FnParameter_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !FnParameter_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Pat_first | OuterAttr_first | '...' | ')' | '{' | ';'
  private static boolean FnParameter_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_recover_0")) return false;
    boolean result_;
    result_ = Pat_first(builder_, level_ + 1);
    if (!result_) result_ = OuterAttr_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, SEMICOLON);
    return result_;
  }

  /* ********************************************************** */
  // !(')' | '{' | ';') FnParameter (',' | &')')
  static boolean FnParameter_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = FnParameter_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, FnParameter(builder_, level_ + 1));
    result_ = pinned_ && FnParameter_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::FnParameter_recover);
    return result_ || pinned_;
  }

  // !(')' | '{' | ';')
  private static boolean FnParameter_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !FnParameter_with_recover_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ')' | '{' | ';'
  private static boolean FnParameter_with_recover_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_with_recover_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, RPAREN);
    if (!result_) result_ = consumeToken(builder_, LBRACE);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    return result_;
  }

  // ',' | &')'
  private static boolean FnParameter_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = FnParameter_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean FnParameter_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameter_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' !',' SelfParameter_with_comma?
  //                                    FnParameter_with_recover*
  //                           ')'
  public static boolean FnParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameters")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER_LIST, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, FnParameters_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, FnParameters_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, FnParameters_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !','
  private static boolean FnParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameters_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, COMMA);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SelfParameter_with_comma?
  private static boolean FnParameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameters_2")) return false;
    SelfParameter_with_comma(builder_, level_ + 1);
    return true;
  }

  // FnParameter_with_recover*
  private static boolean FnParameters_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParameters_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FnParameter_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FnParameters_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ unsafe? ExternAbi? ] fn !identifier FnTypeParameters RetType?
  public static boolean FnPointerType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_POINTER_TYPE, "<fn pointer type>");
    result_ = FnPointerType_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FN);
    result_ = result_ && FnPointerType_2(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, FnTypeParameters(builder_, level_ + 1));
    result_ = pinned_ && FnPointerType_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ unsafe? ExternAbi? ]
  private static boolean FnPointerType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_0")) return false;
    FnPointerType_0_0(builder_, level_ + 1);
    return true;
  }

  // unsafe? ExternAbi?
  private static boolean FnPointerType_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FnPointerType_0_0_0(builder_, level_ + 1);
    result_ = result_ && FnPointerType_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unsafe?
  private static boolean FnPointerType_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_0_0_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  // ExternAbi?
  private static boolean FnPointerType_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_0_0_1")) return false;
    ExternAbi(builder_, level_ + 1);
    return true;
  }

  // !identifier
  private static boolean FnPointerType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // RetType?
  private static boolean FnPointerType_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnPointerType_4")) return false;
    RetType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<variadic_params_impl AnonParameter>>
  public static boolean FnTypeParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnTypeParameters")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variadic_params_impl(builder_, level_ + 1, RustParser::AnonParameter);
    exit_section_(builder_, marker_, VALUE_PARAMETER_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // ForLifetimes (FnPointerType | TraitRef)
  public static boolean ForInType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInType")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_IN_TYPE, null);
    result_ = ForLifetimes(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ForInType_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // FnPointerType | TraitRef
  private static boolean ForInType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInType_1")) return false;
    boolean result_;
    result_ = FnPointerType(builder_, level_ + 1);
    if (!result_) result_ = TraitRef(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // for '<' LifetimesParams '>'
  public static boolean ForLifetimes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForLifetimes")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_LIFETIMES, null);
    result_ = consumeTokens(builder_, 2, FOR, LT);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, LifetimesParams(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, GT) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '...' | '::' | '..=' | '..' | '<' | '(' | '{' | '!'
  static boolean ForbiddenPatBindingLast(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForbiddenPatBindingLast")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, COLONCOLON);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOTEQ);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, LT);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, EXCL);
    return result_;
  }

  /* ********************************************************** */
  // '{' InnerAttr* Items '}'
  static boolean ForeignModBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForeignModBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ForeignModBody_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Items(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // InnerAttr*
  private static boolean ForeignModBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForeignModBody_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InnerAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ForeignModBody_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // unsafe? ExternAbi ForeignModBody
  public static boolean ForeignModItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForeignModItem")) return false;
    if (!nextTokenIs(builder_, "", EXTERN, UNSAFE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, FOREIGN_MOD_ITEM, null);
    result_ = ForeignModItem_0(builder_, level_ + 1);
    result_ = result_ && ExternAbi(builder_, level_ + 1);
    result_ = result_ && ForeignModBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // unsafe?
  private static boolean ForeignModItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForeignModItem_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  /* ********************************************************** */
  // [ identifier '=' ] AnyExpr
  public static boolean FormatMacroArg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormatMacroArg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORMAT_MACRO_ARG, "<format macro arg>");
    result_ = FormatMacroArg_0(builder_, level_ + 1);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ identifier '=' ]
  private static boolean FormatMacroArg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormatMacroArg_0")) return false;
    parseTokens(builder_, 0, IDENTIFIER, EQ);
    return true;
  }

  /* ********************************************************** */
  // <<any_braces [ <<comma_separated_list FormatMacroArg>> ] >>
  public static boolean FormatMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormatMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORMAT_MACRO_ARGUMENT, "<format macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::FormatMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ <<comma_separated_list FormatMacroArg>> ]
  private static boolean FormatMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormatMacroArgument_0_0")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::FormatMacroArg);
    return true;
  }

  /* ********************************************************** */
  // async? const? unsafe? ExternAbi?
  //                    fn identifier
  //                    TypeParameterList?
  //                    FnParameters
  //                    RetType?
  //                    WhereClause?
  //                    (';' | ShallowBlock)
  public static boolean Function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, FUNCTION, null);
    result_ = Function_0(builder_, level_ + 1);
    result_ = result_ && Function_1(builder_, level_ + 1);
    result_ = result_ && Function_2(builder_, level_ + 1);
    result_ = result_ && Function_3(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 2, FN, IDENTIFIER);
    pinned_ = result_; // pin = identifier
    result_ = result_ && report_error_(builder_, Function_6(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, FnParameters(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, Function_8(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, Function_9(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Function_10(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // async?
  private static boolean Function_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_0")) return false;
    async(builder_, level_ + 1);
    return true;
  }

  // const?
  private static boolean Function_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_1")) return false;
    consumeToken(builder_, CONST);
    return true;
  }

  // unsafe?
  private static boolean Function_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_2")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  // ExternAbi?
  private static boolean Function_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_3")) return false;
    ExternAbi(builder_, level_ + 1);
    return true;
  }

  // TypeParameterList?
  private static boolean Function_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_6")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // RetType?
  private static boolean Function_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_8")) return false;
    RetType(builder_, level_ + 1);
    return true;
  }

  // WhereClause?
  private static boolean Function_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_9")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  // ';' | ShallowBlock
  private static boolean Function_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_10")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = ShallowBlock(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // let TopPat '=' NoStructLitExpr
  static boolean IfLetCondition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfLetCondition")) return false;
    if (!nextTokenIs(builder_, LET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LET);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TopPat(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && NoStructLitExpr(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // unsafe? impl TypeParameterList? const? ( TraitImpl | InherentImpl ) WhereClause? Members
  public static boolean ImplItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem")) return false;
    if (!nextTokenIs(builder_, "", IMPL, UNSAFE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, IMPL_ITEM, null);
    result_ = ImplItem_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IMPL);
    pinned_ = result_; // pin = impl
    result_ = result_ && report_error_(builder_, ImplItem_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ImplItem_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ImplItem_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ImplItem_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Members(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // unsafe?
  private static boolean ImplItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  // TypeParameterList?
  private static boolean ImplItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem_2")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // const?
  private static boolean ImplItem_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem_3")) return false;
    consumeToken(builder_, CONST);
    return true;
  }

  // TraitImpl | InherentImpl
  private static boolean ImplItem_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem_4")) return false;
    boolean result_;
    result_ = TraitImpl(builder_, level_ + 1);
    if (!result_) result_ = InherentImpl(builder_, level_ + 1);
    return result_;
  }

  // WhereClause?
  private static boolean ImplItem_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplItem_5")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ImplicitTraitTypeInner
  public static boolean ImplicitTraitType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplicitTraitType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRAIT_TYPE, "<implicit trait type>");
    result_ = ImplicitTraitTypeInner(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Polybound ('+' Polybound)+
  static boolean ImplicitTraitTypeInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplicitTraitTypeInner")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Polybound(builder_, level_ + 1);
    result_ = result_ && ImplicitTraitTypeInner_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('+' Polybound)+
  private static boolean ImplicitTraitTypeInner_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplicitTraitTypeInner_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ImplicitTraitTypeInner_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!ImplicitTraitTypeInner_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ImplicitTraitTypeInner_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' Polybound
  private static boolean ImplicitTraitTypeInner_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplicitTraitTypeInner_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && Polybound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces (AnyExpr ','?)>>
  public static boolean IncludeMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IncludeMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INCLUDE_MACRO_ARGUMENT, "<include macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::IncludeMacroArgument_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // AnyExpr ','?
  private static boolean IncludeMacroArgument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IncludeMacroArgument_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AnyExpr(builder_, level_ + 1);
    result_ = result_ && IncludeMacroArgument_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean IncludeMacroArgument_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IncludeMacroArgument_0_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '[' Expr ']'
  static boolean IndexArg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IndexArg")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TypeReference !for
  static boolean InherentImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InherentImpl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeReference(builder_, level_ + 1);
    result_ = result_ && InherentImpl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !for
  private static boolean InherentImpl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InherentImpl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, FOR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '#' '!' '[' AttrUpper
  public static boolean InnerAttr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InnerAttr")) return false;
    if (!nextTokenIs(builder_, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SHA, EXCL, LBRACK);
    result_ = result_ && AttrUpper(builder_, level_ + 1);
    exit_section_(builder_, marker_, INNER_ATTR, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' InnerAttr* BlockElement* '}'
  public static boolean InnerAttrsAndBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InnerAttrsAndBlock")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, InnerAttrsAndBlock_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, InnerAttrsAndBlock_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // InnerAttr*
  private static boolean InnerAttrsAndBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InnerAttrsAndBlock_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InnerAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InnerAttrsAndBlock_1", pos_)) break;
    }
    return true;
  }

  // BlockElement*
  private static boolean InnerAttrsAndBlock_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InnerAttrsAndBlock_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!BlockElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InnerAttrsAndBlock_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis default_? (Constant
  //                               | TypeAlias
  //                               | Function
  //                               | TraitAlias
  //                               | TraitItem
  //                               | ImplItem
  //                               | ModItem
  //                               | ModDeclItem
  //                               | ForeignModItem
  //                               | StructItem
  //                               | EnumItem
  //                               | UseItem
  //                               | ExternCrateItem
  //                               | Macro
  //                               | Macro2
  //                               | ItemLikeMacroCall)
  public static boolean Item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TO_BE_UPPED, "<item>");
    result_ = AttrsAndVis(builder_, level_ + 1);
    result_ = result_ && Item_1(builder_, level_ + 1);
    result_ = result_ && Item_2(builder_, level_ + 1);
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // default_?
  private static boolean Item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_1")) return false;
    default_(builder_, level_ + 1);
    return true;
  }

  // Constant
  //                               | TypeAlias
  //                               | Function
  //                               | TraitAlias
  //                               | TraitItem
  //                               | ImplItem
  //                               | ModItem
  //                               | ModDeclItem
  //                               | ForeignModItem
  //                               | StructItem
  //                               | EnumItem
  //                               | UseItem
  //                               | ExternCrateItem
  //                               | Macro
  //                               | Macro2
  //                               | ItemLikeMacroCall
  private static boolean Item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_2")) return false;
    boolean result_;
    result_ = Constant(builder_, level_ + 1);
    if (!result_) result_ = TypeAlias(builder_, level_ + 1);
    if (!result_) result_ = Function(builder_, level_ + 1);
    if (!result_) result_ = TraitAlias(builder_, level_ + 1);
    if (!result_) result_ = TraitItem(builder_, level_ + 1);
    if (!result_) result_ = ImplItem(builder_, level_ + 1);
    if (!result_) result_ = ModItem(builder_, level_ + 1);
    if (!result_) result_ = ModDeclItem(builder_, level_ + 1);
    if (!result_) result_ = ForeignModItem(builder_, level_ + 1);
    if (!result_) result_ = StructItem(builder_, level_ + 1);
    if (!result_) result_ = EnumItem(builder_, level_ + 1);
    if (!result_) result_ = UseItem(builder_, level_ + 1);
    if (!result_) result_ = ExternCrateItem(builder_, level_ + 1);
    if (!result_) result_ = Macro(builder_, level_ + 1);
    if (!result_) result_ = Macro2(builder_, level_ + 1);
    if (!result_) result_ = ItemLikeMacroCall(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // <<parseMacroCall 'MacroCallParsingMode.ITEM'>>
  public static boolean ItemLikeMacroCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ItemLikeMacroCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_ | _UPPER_, MACRO_CALL, null);
    result_ = parseMacroCall(builder_, level_ + 1, MacroCallParsingMode.ITEM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '#' | pub | crate | fn | const | extern | unsafe | struct | enum | use | identifier | mod | trait
  //   | static | TYPE_KW | impl | "union" | "default" | "auto" | "dyn" | "async" | MACRO_KW | self | super | '::'
  static boolean Item_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SHA);
    if (!result_) result_ = consumeTokenFast(builder_, PUB);
    if (!result_) result_ = consumeTokenFast(builder_, CRATE);
    if (!result_) result_ = consumeTokenFast(builder_, FN);
    if (!result_) result_ = consumeTokenFast(builder_, CONST);
    if (!result_) result_ = consumeTokenFast(builder_, EXTERN);
    if (!result_) result_ = consumeTokenFast(builder_, UNSAFE);
    if (!result_) result_ = consumeTokenFast(builder_, STRUCT);
    if (!result_) result_ = consumeTokenFast(builder_, ENUM);
    if (!result_) result_ = consumeTokenFast(builder_, USE);
    if (!result_) result_ = consumeTokenFast(builder_, IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, MOD);
    if (!result_) result_ = consumeTokenFast(builder_, TRAIT);
    if (!result_) result_ = consumeTokenFast(builder_, STATIC);
    if (!result_) result_ = consumeTokenFast(builder_, TYPE_KW);
    if (!result_) result_ = consumeTokenFast(builder_, IMPL);
    if (!result_) result_ = consumeTokenFast(builder_, "union");
    if (!result_) result_ = consumeTokenFast(builder_, "default");
    if (!result_) result_ = consumeTokenFast(builder_, "auto");
    if (!result_) result_ = consumeTokenFast(builder_, "dyn");
    if (!result_) result_ = consumeTokenFast(builder_, "async");
    if (!result_) result_ = consumeTokenFast(builder_, MACRO_KW);
    if (!result_) result_ = consumeTokenFast(builder_, SELF);
    if (!result_) result_ = consumeTokenFast(builder_, SUPER);
    if (!result_) result_ = consumeTokenFast(builder_, COLONCOLON);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | Item_first )
  static boolean Item_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !Item_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | Item_first
  private static boolean Item_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = Item_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | <<eof>>) Item
  static boolean Item_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = Item_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && Item(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::Item_recover);
    return result_ || pinned_;
  }

  // !('}' | <<eof>>)
  private static boolean Item_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !Item_with_recover_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | <<eof>>
  private static boolean Item_with_recover_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item_with_recover_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RBRACE);
    if (!result_) result_ = eof(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Item_with_recover*
  static boolean Items(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Items")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Items", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER
  public static boolean Label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Label")) return false;
    if (!nextTokenIs(builder_, QUOTE_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUOTE_IDENTIFIER);
    exit_section_(builder_, marker_, LABEL, result_);
    return result_;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER ':'
  public static boolean LabelDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LabelDecl")) return false;
    if (!nextTokenIs(builder_, QUOTE_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, QUOTE_IDENTIFIER, COLON);
    exit_section_(builder_, marker_, LABEL_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* SimplePat TypeAscription?
  public static boolean LambdaParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER, "<lambda parameter>");
    result_ = LambdaParameter_0(builder_, level_ + 1);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    result_ = result_ && LambdaParameter_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean LambdaParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LambdaParameter_0", pos_)) break;
    }
    return true;
  }

  // TypeAscription?
  private static boolean LambdaParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameter_2")) return false;
    TypeAscription(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '|' !',' [ <<comma_separated_list LambdaParameter>> ] '|'
  public static boolean LambdaParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameters")) return false;
    if (!nextTokenIs(builder_, OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR);
    result_ = result_ && LambdaParameters_1(builder_, level_ + 1);
    result_ = result_ && LambdaParameters_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OR);
    exit_section_(builder_, marker_, VALUE_PARAMETER_LIST, result_);
    return result_;
  }

  // !','
  private static boolean LambdaParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameters_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, COMMA);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ <<comma_separated_list LambdaParameter>> ]
  private static boolean LambdaParameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaParameters_2")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::LambdaParameter);
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* let TopPat TypeAscription? [ '=' AnyExpr LetElseBranch? ] ';'
  public static boolean LetDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl")) return false;
    if (!nextTokenIs(builder_, "<let decl>", LET, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LET_DECL, "<let decl>");
    result_ = LetDecl_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LET);
    pinned_ = result_; // pin = let
    result_ = result_ && report_error_(builder_, TopPat(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, LetDecl_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, LetDecl_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean LetDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LetDecl_0", pos_)) break;
    }
    return true;
  }

  // TypeAscription?
  private static boolean LetDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl_3")) return false;
    TypeAscription(builder_, level_ + 1);
    return true;
  }

  // [ '=' AnyExpr LetElseBranch? ]
  private static boolean LetDecl_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl_4")) return false;
    LetDecl_4_0(builder_, level_ + 1);
    return true;
  }

  // '=' AnyExpr LetElseBranch?
  private static boolean LetDecl_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    result_ = result_ && LetDecl_4_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LetElseBranch?
  private static boolean LetDecl_4_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetDecl_4_0_2")) return false;
    LetElseBranch(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // else SimpleBlock
  public static boolean LetElseBranch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetElseBranch")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && SimpleBlock(builder_, level_ + 1);
    exit_section_(builder_, marker_, LET_ELSE_BRANCH, result_);
    return result_;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER
  public static boolean Lifetime(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Lifetime")) return false;
    if (!nextTokenIs(builder_, QUOTE_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUOTE_IDENTIFIER);
    exit_section_(builder_, marker_, LIFETIME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' Lifetime ('+' Lifetime)*
  public static boolean LifetimeParamBounds(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParamBounds")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LIFETIME_PARAM_BOUNDS, null);
    result_ = consumeToken(builder_, COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Lifetime(builder_, level_ + 1));
    result_ = pinned_ && LifetimeParamBounds_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ('+' Lifetime)*
  private static boolean LifetimeParamBounds_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParamBounds_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!LifetimeParamBounds_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LifetimeParamBounds_2", pos_)) break;
    }
    return true;
  }

  // '+' Lifetime
  private static boolean LifetimeParamBounds_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParamBounds_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && Lifetime(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* QUOTE_IDENTIFIER LifetimeParamBounds?
  public static boolean LifetimeParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParameter")) return false;
    if (!nextTokenIs(builder_, "<lifetime parameter>", QUOTE_IDENTIFIER, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LIFETIME_PARAMETER, "<lifetime parameter>");
    result_ = LifetimeParameter_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, QUOTE_IDENTIFIER);
    result_ = result_ && LifetimeParameter_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean LifetimeParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LifetimeParameter_0", pos_)) break;
    }
    return true;
  }

  // LifetimeParamBounds?
  private static boolean LifetimeParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimeParameter_2")) return false;
    LifetimeParamBounds(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<list_element LifetimeParameter>>*
  static boolean LifetimesParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LifetimesParams")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!list_element(builder_, level_ + 1, RustParser::LifetimeParameter)) break;
      if (!empty_element_parsed_guard_(builder_, "LifetimesParams", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AnyLitToken
  public static boolean LitExprWithoutAttrs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LitExprWithoutAttrs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, LIT_EXPR, "<lit expr without attrs>");
    result_ = AnyLitToken(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "macro_rules" '!' identifier ShallowMacroBody <<macroSemicolon>>
  public static boolean Macro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, MACRO, null);
    result_ = consumeToken(builder_, "macro_rules");
    result_ = result_ && consumeTokens(builder_, 1, EXCL, IDENTIFIER);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, ShallowMacroBody(builder_, level_ + 1));
    result_ = pinned_ && macroSemicolon(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // MACRO_KW identifier ( Macro2FunctionLikeBody | Macro2MatchLikeBody )
  public static boolean Macro2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2")) return false;
    if (!nextTokenIs(builder_, "", MACRO_KW)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, MACRO_2, null);
    result_ = consumeTokens(builder_, 1, MACRO_KW, IDENTIFIER);
    pinned_ = result_; // pin = 1
    result_ = result_ && Macro2_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // Macro2FunctionLikeBody | Macro2MatchLikeBody
  private static boolean Macro2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2_2")) return false;
    boolean result_;
    result_ = Macro2FunctionLikeBody(builder_, level_ + 1);
    if (!result_) result_ = Macro2MatchLikeBody(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // '(' MacroPatternContents ')' '{' MacroExpansionContents '}'
  static boolean Macro2FunctionLikeBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2FunctionLikeBody")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && MacroPatternContents(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && MacroExpansionContents(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' (MacroCase ','?)* '}'
  static boolean Macro2MatchLikeBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2MatchLikeBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && Macro2MatchLikeBody_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (MacroCase ','?)*
  private static boolean Macro2MatchLikeBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2MatchLikeBody_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Macro2MatchLikeBody_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Macro2MatchLikeBody_1", pos_)) break;
    }
    return true;
  }

  // MacroCase ','?
  private static boolean Macro2MatchLikeBody_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2MatchLikeBody_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MacroCase(builder_, level_ + 1);
    result_ = result_ && Macro2MatchLikeBody_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean Macro2MatchLikeBody_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Macro2MatchLikeBody_1_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // <<any_braces MacroArgumentTTImpl>>
  public static boolean MacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_ARGUMENT, "<macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::MacroArgumentTTImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces MacroArgumentTTImpl>>
  public static boolean MacroArgumentTT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroArgumentTT")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, MACRO_ARGUMENT_TT, "<macro argument tt>");
    result_ = any_braces(builder_, level_ + 1, RustParser::MacroArgumentTTImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (MacroArgumentTT | MacroBodyIdent | MacroBodyQuoteIdent | StringLitExpr | <<unpairedToken>>)*
  static boolean MacroArgumentTTImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroArgumentTTImpl")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MacroArgumentTTImpl_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MacroArgumentTTImpl", pos_)) break;
    }
    return true;
  }

  // MacroArgumentTT | MacroBodyIdent | MacroBodyQuoteIdent | StringLitExpr | <<unpairedToken>>
  private static boolean MacroArgumentTTImpl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroArgumentTTImpl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MacroArgumentTT(builder_, level_ + 1);
    if (!result_) result_ = MacroBodyIdent(builder_, level_ + 1);
    if (!result_) result_ = MacroBodyQuoteIdent(builder_, level_ + 1);
    if (!result_) result_ = StringLitExpr(builder_, level_ + 1);
    if (!result_) result_ = unpairedToken(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '$' MetaVarIdentifier ':' identifier
  public static boolean MacroBinding(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBinding")) return false;
    if (!nextTokenIs(builder_, DOLLAR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_BINDING, null);
    result_ = consumeToken(builder_, DOLLAR);
    result_ = result_ && MetaVarIdentifier(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeTokens(builder_, -1, COLON, IDENTIFIER));
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '$' '(' MacroPatternContents ')' MacroBindingGroupSeparator? ('*' | '+' | '?')
  public static boolean MacroBindingGroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBindingGroup")) return false;
    if (!nextTokenIs(builder_, DOLLAR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_BINDING_GROUP, null);
    result_ = consumeTokens(builder_, 2, DOLLAR, LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, MacroPatternContents(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, MacroBindingGroup_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && MacroBindingGroup_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // MacroBindingGroupSeparator?
  private static boolean MacroBindingGroup_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBindingGroup_4")) return false;
    MacroBindingGroupSeparator(builder_, level_ + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean MacroBindingGroup_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBindingGroup_5")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, Q);
    return result_;
  }

  /* ********************************************************** */
  // <<macroBindingGroupSeparatorToken>>
  public static boolean MacroBindingGroupSeparator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBindingGroupSeparator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_BINDING_GROUP_SEPARATOR, "<macro binding group separator>");
    result_ = macroBindingGroupSeparatorToken(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces (MacroCase ';'?)*>>
  public static boolean MacroBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_BODY, "<macro body>");
    result_ = any_braces(builder_, level_ + 1, RustParser::MacroBody_0_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (MacroCase ';'?)*
  private static boolean MacroBody_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBody_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MacroBody_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MacroBody_0_0", pos_)) break;
    }
    return true;
  }

  // MacroCase ';'?
  private static boolean MacroBody_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBody_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MacroCase(builder_, level_ + 1);
    result_ = result_ && MacroBody_0_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';'?
  private static boolean MacroBody_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBody_0_0_0_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean MacroBodyIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBodyIdent")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, MACRO_BODY_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER
  public static boolean MacroBodyQuoteIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroBodyQuoteIdent")) return false;
    if (!nextTokenIs(builder_, QUOTE_IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUOTE_IDENTIFIER);
    exit_section_(builder_, marker_, MACRO_BODY_QUOTE_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MacroPattern '=>' MacroExpansion
  public static boolean MacroCase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroCase")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_CASE, "<macro case>");
    result_ = MacroPattern(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, FAT_ARROW));
    result_ = pinned_ && MacroExpansion(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // <<any_braces MacroExpansionContents>>
  public static boolean MacroExpansion(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansion")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_EXPANSION, "<macro expansion>");
    result_ = any_braces(builder_, level_ + 1, RustParser::MacroExpansionContents);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (MacroExpansion | MacroReference | MacroExpansionReferenceGroup | <<unpairedToken>>)*
  public static boolean MacroExpansionContents(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionContents")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_EXPANSION_CONTENTS, "<macro expansion contents>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MacroExpansionContents_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MacroExpansionContents", pos_)) break;
    }
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // MacroExpansion | MacroReference | MacroExpansionReferenceGroup | <<unpairedToken>>
  private static boolean MacroExpansionContents_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionContents_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MacroExpansion(builder_, level_ + 1);
    if (!result_) result_ = MacroReference(builder_, level_ + 1);
    if (!result_) result_ = MacroExpansionReferenceGroup(builder_, level_ + 1);
    if (!result_) result_ = unpairedToken(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<macroBindingGroupSeparatorToken>>
  public static boolean MacroExpansionGroupSeparator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionGroupSeparator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_EXPANSION_GROUP_SEPARATOR, "<macro expansion group separator>");
    result_ = macroBindingGroupSeparatorToken(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '$' '(' MacroExpansionContents ')' MacroExpansionGroupSeparator? ('*' | '+' | '?')
  public static boolean MacroExpansionReferenceGroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionReferenceGroup")) return false;
    if (!nextTokenIs(builder_, DOLLAR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_EXPANSION_REFERENCE_GROUP, null);
    result_ = consumeTokens(builder_, 2, DOLLAR, LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, MacroExpansionContents(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, MacroExpansionReferenceGroup_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && MacroExpansionReferenceGroup_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // MacroExpansionGroupSeparator?
  private static boolean MacroExpansionReferenceGroup_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionReferenceGroup_4")) return false;
    MacroExpansionGroupSeparator(builder_, level_ + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean MacroExpansionReferenceGroup_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpansionReferenceGroup_5")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, Q);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces MacroPatternContents >>
  public static boolean MacroPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroPattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_PATTERN, "<macro pattern>");
    result_ = any_braces(builder_, level_ + 1, RustParser::MacroPatternContents);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (MacroPattern | MacroBinding | MacroBindingGroup | <<unpairedToken>>)*
  public static boolean MacroPatternContents(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroPatternContents")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_PATTERN_CONTENTS, "<macro pattern contents>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MacroPatternContents_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MacroPatternContents", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // MacroPattern | MacroBinding | MacroBindingGroup | <<unpairedToken>>
  private static boolean MacroPatternContents_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroPatternContents_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MacroPattern(builder_, level_ + 1);
    if (!result_) result_ = MacroBinding(builder_, level_ + 1);
    if (!result_) result_ = MacroBindingGroup(builder_, level_ + 1);
    if (!result_) result_ = unpairedToken(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '$' MetaVarIdentifier
  public static boolean MacroReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroReference")) return false;
    if (!nextTokenIs(builder_, DOLLAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOLLAR);
    result_ = result_ && MetaVarIdentifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_REFERENCE, result_);
    return result_;
  }

  /* ********************************************************** */
  // ExprLikeMacroCall
  public static boolean MacroType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_TYPE, "<macro type>");
    result_ = ExprLikeMacroCall(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* TopPat MatchArmGuard? '=>' StmtModeExpr (',' | (&'}' | <<isBlock>>))
  public static boolean MatchArm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MATCH_ARM, "<match arm>");
    result_ = MatchArm_0(builder_, level_ + 1);
    result_ = result_ && TopPat(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, MatchArm_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, FAT_ARROW)) && result_;
    result_ = pinned_ && report_error_(builder_, StmtModeExpr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && MatchArm_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean MatchArm_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MatchArm_0", pos_)) break;
    }
    return true;
  }

  // MatchArmGuard?
  private static boolean MatchArm_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_2")) return false;
    MatchArmGuard(builder_, level_ + 1);
    return true;
  }

  // ',' | (&'}' | <<isBlock>>)
  private static boolean MatchArm_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = MatchArm_5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}' | <<isBlock>>
  private static boolean MatchArm_5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_5_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MatchArm_5_1_0(builder_, level_ + 1);
    if (!result_) result_ = isBlock(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}'
  private static boolean MatchArm_5_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_5_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // if (AnyExpr | IfLetCondition)
  public static boolean MatchArmGuard(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArmGuard")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && MatchArmGuard_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MATCH_ARM_GUARD, result_);
    return result_;
  }

  // AnyExpr | IfLetCondition
  private static boolean MatchArmGuard_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArmGuard_1")) return false;
    boolean result_;
    result_ = AnyExpr(builder_, level_ + 1);
    if (!result_) result_ = IfLetCondition(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !(Pat_first | OuterAttr_first | '}')
  static boolean MatchArm_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !MatchArm_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Pat_first | OuterAttr_first | '}'
  private static boolean MatchArm_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_recover_0")) return false;
    boolean result_;
    result_ = Pat_first(builder_, level_ + 1);
    if (!result_) result_ = OuterAttr_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACE);
    return result_;
  }

  /* ********************************************************** */
  // !'}' MatchArm
  static boolean MatchArm_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = MatchArm_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && MatchArm(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::MatchArm_recover);
    return result_ || pinned_;
  }

  // !'}'
  private static boolean MatchArm_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchArm_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '{' MatchArm_with_recover* '}'
  public static boolean MatchBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MATCH_BODY, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, MatchBody_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // MatchArm_with_recover*
  private static boolean MatchBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchBody_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MatchArm_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MatchBody_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '{' InnerAttr* Items '}'
  public static boolean Members(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Members")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBERS, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Members_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Items(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // InnerAttr*
  private static boolean Members_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Members_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InnerAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Members_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' ( [ <<comma_separated_list (LitExprWithoutAttrs | MetaItemWithoutTT )>> ] ')' |  MetaItemWithTT ')' )
  public static boolean MetaItemArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && MetaItemArgs_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, META_ITEM_ARGS, result_);
    return result_;
  }

  // [ <<comma_separated_list (LitExprWithoutAttrs | MetaItemWithoutTT )>> ] ')' |  MetaItemWithTT ')'
  private static boolean MetaItemArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemArgs_1_0(builder_, level_ + 1);
    if (!result_) result_ = MetaItemArgs_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ <<comma_separated_list (LitExprWithoutAttrs | MetaItemWithoutTT )>> ] ')'
  private static boolean MetaItemArgs_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemArgs_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ <<comma_separated_list (LitExprWithoutAttrs | MetaItemWithoutTT )>> ]
  private static boolean MetaItemArgs_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs_1_0_0")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::MetaItemArgs_1_0_0_0_0);
    return true;
  }

  // LitExprWithoutAttrs | MetaItemWithoutTT
  private static boolean MetaItemArgs_1_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs_1_0_0_0_0")) return false;
    boolean result_;
    result_ = LitExprWithoutAttrs(builder_, level_ + 1);
    if (!result_) result_ = MetaItemWithoutTT(builder_, level_ + 1);
    return result_;
  }

  // MetaItemWithTT ')'
  private static boolean MetaItemArgs_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemArgs_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemWithTT(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CompactTT
  public static boolean MetaItemWithTT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemWithTT")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, META_ITEM, "<meta item with tt>");
    result_ = CompactTT(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PathWithoutTypeArgs [ '=' LitExprWithoutAttrs | MetaItemArgs ]
  public static boolean MetaItemWithoutTT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemWithoutTT")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, META_ITEM, "<meta item without tt>");
    result_ = PathWithoutTypeArgs(builder_, level_ + 1);
    result_ = result_ && MetaItemWithoutTT_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ '=' LitExprWithoutAttrs | MetaItemArgs ]
  private static boolean MetaItemWithoutTT_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemWithoutTT_1")) return false;
    MetaItemWithoutTT_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' LitExprWithoutAttrs | MetaItemArgs
  private static boolean MetaItemWithoutTT_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemWithoutTT_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetaItemWithoutTT_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = MetaItemArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '=' LitExprWithoutAttrs
  private static boolean MetaItemWithoutTT_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaItemWithoutTT_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && LitExprWithoutAttrs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<macroIdentifier>>
  public static boolean MetaVarIdentifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetaVarIdentifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, META_VAR_IDENTIFIER, "<meta var identifier>");
    result_ = macroIdentifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier ColonTypeArgumentList? ValueArgumentList
  public static boolean MethodCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodCall")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && MethodCall_1(builder_, level_ + 1);
    result_ = result_ && ValueArgumentList(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD_CALL, result_);
    return result_;
  }

  // ColonTypeArgumentList?
  private static boolean MethodCall_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodCall_1")) return false;
    ColonTypeArgumentList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // () (MethodCall | FieldLookup)
  static boolean MethodOrField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodOrField")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = MethodOrField_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && MethodOrField_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ()
  private static boolean MethodOrField_0(PsiBuilder builder_, int level_) {
    return true;
  }

  // MethodCall | FieldLookup
  private static boolean MethodOrField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodOrField_1")) return false;
    boolean result_;
    result_ = MethodCall(builder_, level_ + 1);
    if (!result_) result_ = FieldLookup(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // unsafe? mod identifier ';'
  public static boolean ModDeclItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModDeclItem")) return false;
    if (!nextTokenIs(builder_, "", MOD, UNSAFE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, MOD_DECL_ITEM, null);
    result_ = ModDeclItem_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 2, MOD, IDENTIFIER, SEMICOLON);
    pinned_ = result_; // pin = identifier
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // unsafe?
  private static boolean ModDeclItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModDeclItem_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  /* ********************************************************** */
  // unsafe? mod identifier '{' InnerAttr* Items '}'
  public static boolean ModItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModItem")) return false;
    if (!nextTokenIs(builder_, "", MOD, UNSAFE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, MOD_ITEM, null);
    result_ = ModItem_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 3, MOD, IDENTIFIER, LBRACE);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, ModItem_4(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Items(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // unsafe?
  private static boolean ModItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModItem_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  // InnerAttr*
  private static boolean ModItem_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModItem_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InnerAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ModItem_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '%'
  public static boolean MulBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MulBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_OP, "<operator>");
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, REM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // AttrsAndVis identifier TypeAscription
  public static boolean NamedFieldDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMED_FIELD_DECL, "<named field decl>");
    result_ = AttrsAndVis(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    pinned_ = result_; // pin = 2
    result_ = result_ && TypeAscription(builder_, level_ + 1);
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // AttrsAndVis_first | identifier
  static boolean NamedFieldDecl_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_first")) return false;
    boolean result_;
    result_ = AttrsAndVis_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | NamedFieldDecl_first)
  static boolean NamedFieldDecl_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !NamedFieldDecl_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | NamedFieldDecl_first
  private static boolean NamedFieldDecl_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = NamedFieldDecl_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !'}' NamedFieldDecl (',' | &'}')
  static boolean NamedFieldDecl_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = NamedFieldDecl_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamedFieldDecl(builder_, level_ + 1));
    result_ = pinned_ && NamedFieldDecl_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::NamedFieldDecl_recover);
    return result_ || pinned_;
  }

  // !'}'
  private static boolean NamedFieldDecl_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &'}'
  private static boolean NamedFieldDecl_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = NamedFieldDecl_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}'
  private static boolean NamedFieldDecl_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedFieldDecl_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<exprMode 'StructLiteralsMode.OFF' 'StmtMode.OFF' Expr>>
  public static boolean NoStructLitExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NoStructLitExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr>");
    result_ = exprMode(builder_, level_ + 1, StructLiteralsMode.OFF, StmtMode.OFF, Expr_parser_);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '|'? SimplePat ('|' SimplePat)*
  public static boolean OrPat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPat")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, OR_PAT, "<or pat>");
    result_ = OrPat_0(builder_, level_ + 1);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    result_ = result_ && OrPat_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '|'?
  private static boolean OrPat_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPat_0")) return false;
    consumeToken(builder_, OR);
    return true;
  }

  // ('|' SimplePat)*
  private static boolean OrPat_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPat_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OrPat_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "OrPat_2", pos_)) break;
    }
    return true;
  }

  // '|' SimplePat
  private static boolean OrPat_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPat_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('|' SimplePat)+
  public static boolean OrPatLeft(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPatLeft")) return false;
    if (!nextTokenIs(builder_, OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, OR_PAT, null);
    result_ = OrPatLeft_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!OrPatLeft_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "OrPatLeft", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '|' SimplePat
  private static boolean OrPatLeft_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrPatLeft_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '#'     '[' AttrUpper
  public static boolean OuterAttr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OuterAttr")) return false;
    if (!nextTokenIs(builder_, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SHA, LBRACK);
    result_ = result_ && AttrUpper(builder_, level_ + 1);
    exit_section_(builder_, marker_, OUTER_ATTR, result_);
    return result_;
  }

  /* ********************************************************** */
  // '#'
  static boolean OuterAttr_first(PsiBuilder builder_, int level_) {
    return consumeTokenFast(builder_, SHA);
  }

  /* ********************************************************** */
  // SimplePat OrPatLeft?
  public static boolean Pat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pat")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PAT, "<pattern>");
    result_ = SimplePat(builder_, level_ + 1);
    result_ = result_ && Pat_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OrPatLeft?
  private static boolean Pat_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pat_1")) return false;
    OrPatLeft(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // BindingMode? identifier !ForbiddenPatBindingLast
  public static boolean PatBinding(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBinding")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_BINDING, "<pat binding>");
    result_ = PatBinding_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && PatBinding_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // BindingMode?
  private static boolean PatBinding_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBinding_0")) return false;
    BindingMode(builder_, level_ + 1);
    return true;
  }

  // !ForbiddenPatBindingLast
  private static boolean PatBinding_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBinding_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !ForbiddenPatBindingLast(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // box SimplePat
  public static boolean PatBox(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBox")) return false;
    if (!nextTokenIs(builder_, BOX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BOX);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    exit_section_(builder_, marker_, PAT_BOX, result_);
    return result_;
  }

  /* ********************************************************** */
  // !(']' | Pat_first)
  static boolean PatBracketListElem_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !PatBracketListElem_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ']' | Pat_first
  private static boolean PatBracketListElem_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACK);
    if (!result_) result_ = Pat_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !']' TopPat (',' | &']')
  static boolean PatBracketListElem_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = PatBracketListElem_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TopPat(builder_, level_ + 1));
    result_ = pinned_ && PatBracketListElem_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::PatBracketListElem_recover);
    return result_ || pinned_;
  }

  // !']'
  private static boolean PatBracketListElem_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RBRACK);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &']'
  private static boolean PatBracketListElem_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = PatBracketListElem_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &']'
  private static boolean PatBracketListElem_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatBracketListElem_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACK);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PathExpr | LitExpr | &('-' LitExpr) UnaryExpr
  public static boolean PatConst(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatConst")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_CONST, "<pat const>");
    result_ = PathExpr(builder_, level_ + 1);
    if (!result_) result_ = LitExpr(builder_, level_ + 1);
    if (!result_) result_ = PatConst_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &('-' LitExpr) UnaryExpr
  private static boolean PatConst_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatConst_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PatConst_2_0(builder_, level_ + 1);
    result_ = result_ && UnaryExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &('-' LitExpr)
  private static boolean PatConst_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatConst_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = PatConst_2_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '-' LitExpr
  private static boolean PatConst_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatConst_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MINUS);
    result_ = result_ && LitExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PatFieldFull | box? PatBinding
  public static boolean PatField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_FIELD, "<pat field>");
    result_ = PatFieldFull(builder_, level_ + 1);
    if (!result_) result_ = PatField_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // box? PatBinding
  private static boolean PatField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PatField_1_0(builder_, level_ + 1);
    result_ = result_ && PatBinding(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // box?
  private static boolean PatField_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_1_0")) return false;
    consumeToken(builder_, BOX);
    return true;
  }

  /* ********************************************************** */
  // (identifier | INTEGER_LITERAL ) ':' Pat
  public static boolean PatFieldFull(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatFieldFull")) return false;
    if (!nextTokenIs(builder_, "<pat field full>", IDENTIFIER, INTEGER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_FIELD_FULL, "<pat field full>");
    result_ = PatFieldFull_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && Pat(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // identifier | INTEGER_LITERAL
  private static boolean PatFieldFull_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatFieldFull_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | '..' | ref | mut | box | identifier | INTEGER_LITERAL)
  static boolean PatField_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !PatField_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | '..' | ref | mut | box | identifier | INTEGER_LITERAL
  private static boolean PatField_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, REF);
    if (!result_) result_ = consumeTokenFast(builder_, MUT);
    if (!result_) result_ = consumeTokenFast(builder_, BOX);
    if (!result_) result_ = consumeTokenFast(builder_, IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, INTEGER_LITERAL);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | '..') PatField (',' | & '}')
  static boolean PatField_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = PatField_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, PatField(builder_, level_ + 1));
    result_ = pinned_ && PatField_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::PatField_recover);
    return result_ || pinned_;
  }

  // !('}' | '..')
  private static boolean PatField_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !PatField_with_recover_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | '..'
  private static boolean PatField_with_recover_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_with_recover_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, RBRACE);
    if (!result_) result_ = consumeToken(builder_, DOTDOT);
    return result_;
  }

  // ',' | & '}'
  private static boolean PatField_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = PatField_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & '}'
  private static boolean PatField_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatField_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PatBinding [ '@' SimplePat ]
  public static boolean PatIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_IDENT, "<pat ident>");
    result_ = PatBinding(builder_, level_ + 1);
    result_ = result_ && PatIdent_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ '@' SimplePat ]
  private static boolean PatIdent_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatIdent_1")) return false;
    PatIdent_1_0(builder_, level_ + 1);
    return true;
  }

  // '@' SimplePat
  private static boolean PatIdent_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatIdent_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AT);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ExprLikeMacroCall
  public static boolean PatMacro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatMacro")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_MACRO, "<pat macro>");
    result_ = ExprLikeMacroCall(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(')' | Pat_first)
  static boolean PatParenListElem_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !PatParenListElem_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ')' | Pat_first
  private static boolean PatParenListElem_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = Pat_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !')' TopPat (',' | &')')
  static boolean PatParenListElem_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = PatParenListElem_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TopPat(builder_, level_ + 1));
    result_ = pinned_ && PatParenListElem_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::PatParenListElem_recover);
    return result_ || pinned_;
  }

  // !')'
  private static boolean PatParenListElem_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &')'
  private static boolean PatParenListElem_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = PatParenListElem_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean PatParenListElem_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatParenListElem_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PatConst ('..' | '...' | '..=') PatConst
  public static boolean PatRange(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatRange")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PAT_RANGE, "<pat range>");
    result_ = PatConst(builder_, level_ + 1);
    result_ = result_ && PatRange_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && PatConst(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '..' | '...' | '..='
  private static boolean PatRange_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatRange_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DOTDOT);
    if (!result_) result_ = consumeToken(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeToken(builder_, DOTDOTEQ);
    return result_;
  }

  /* ********************************************************** */
  // '&' mut? SimplePat
  public static boolean PatRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatRef")) return false;
    if (!nextTokenIs(builder_, AND)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && PatRef_1(builder_, level_ + 1);
    result_ = result_ && SimplePat(builder_, level_ + 1);
    exit_section_(builder_, marker_, PAT_REF, result_);
    return result_;
  }

  // mut?
  private static boolean PatRef_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatRef_1")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  /* ********************************************************** */
  // '..'
  public static boolean PatRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatRest")) return false;
    if (!nextTokenIs(builder_, DOTDOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOTDOT);
    exit_section_(builder_, marker_, PAT_REST, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' PatBracketListElem_with_recover* ']'
  public static boolean PatSlice(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatSlice")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && PatSlice_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, PAT_SLICE, result_);
    return result_;
  }

  // PatBracketListElem_with_recover*
  private static boolean PatSlice_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatSlice_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PatBracketListElem_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PatSlice_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ValuePathGenericArgsNoTypeQual '{' PatField_with_recover* PatRest? '}'
  public static boolean PatStruct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatStruct")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_STRUCT, "<pat struct>");
    result_ = ValuePathGenericArgsNoTypeQual(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && PatStruct_2(builder_, level_ + 1);
    result_ = result_ && PatStruct_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // PatField_with_recover*
  private static boolean PatStruct_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatStruct_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PatField_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PatStruct_2", pos_)) break;
    }
    return true;
  }

  // PatRest?
  private static boolean PatStruct_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatStruct_3")) return false;
    PatRest(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' PatParenListElem_with_recover* ')'
  public static boolean PatTup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatTup")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && PatTup_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, PAT_TUP, result_);
    return result_;
  }

  // PatParenListElem_with_recover*
  private static boolean PatTup_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatTup_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PatParenListElem_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PatTup_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ValuePathGenericArgsNoTypeQual '(' PatParenListElem_with_recover* ')'
  public static boolean PatTupleStruct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatTupleStruct")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAT_TUPLE_STRUCT, "<pat tuple struct>");
    result_ = ValuePathGenericArgsNoTypeQual(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && PatTupleStruct_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // PatParenListElem_with_recover*
  private static boolean PatTupleStruct_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatTupleStruct_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PatParenListElem_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PatTupleStruct_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '_'
  public static boolean PatWild(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatWild")) return false;
    if (!nextTokenIs(builder_, UNDERSCORE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UNDERSCORE);
    exit_section_(builder_, marker_, PAT_WILD, result_);
    return result_;
  }

  /* ********************************************************** */
  // '_' | '..' | '&' | '(' | '[' | Path_first | AnyLitToken_first | box | '-' | ref | mut | '|'
  static boolean Pat_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pat_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, UNDERSCORE);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, AND);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACK);
    if (!result_) result_ = Path_first(builder_, level_ + 1);
    if (!result_) result_ = AnyLitToken_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, BOX);
    if (!result_) result_ = consumeTokenFast(builder_, MINUS);
    if (!result_) result_ = consumeTokenFast(builder_, REF);
    if (!result_) result_ = consumeTokenFast(builder_, MUT);
    if (!result_) result_ = consumeTokenFast(builder_, OR);
    return result_;
  }

  /* ********************************************************** */
  // <<parsePathIdent>>
  static boolean PathIdent(PsiBuilder builder_, int level_) {
    return parsePathIdent(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // PathStart PathSegment*
  static boolean PathImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathImpl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PathStart(builder_, level_ + 1);
    result_ = result_ && PathImpl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PathSegment*
  private static boolean PathImpl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathImpl_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PathSegment(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PathImpl_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* TypeReference !'='
  public static boolean PathParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER, "<path parameter>");
    result_ = PathParameter_0(builder_, level_ + 1);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    result_ = result_ && PathParameter_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean PathParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PathParameter_0", pos_)) break;
    }
    return true;
  }

  // !'='
  private static boolean PathParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameter_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, EQ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '::'? '(' [ <<comma_separated_list PathParameter>> ] ')'
  public static boolean PathParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameters")) return false;
    if (!nextTokenIs(builder_, "<path parameters>", COLONCOLON, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PARAMETER_LIST, "<path parameters>");
    result_ = PathParameters_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, PathParameters_2(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '::'?
  private static boolean PathParameters_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameters_0")) return false;
    consumeToken(builder_, COLONCOLON);
    return true;
  }

  // [ <<comma_separated_list PathParameter>> ]
  private static boolean PathParameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathParameters_2")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::PathParameter);
    return true;
  }

  /* ********************************************************** */
  // '::' !('{' | '*') PathIdent PathTypeArguments?
  public static boolean PathSegment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathSegment")) return false;
    if (!nextTokenIs(builder_, COLONCOLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, PATH, null);
    result_ = consumeToken(builder_, COLONCOLON);
    result_ = result_ && PathSegment_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, PathIdent(builder_, level_ + 1));
    result_ = pinned_ && PathSegment_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !('{' | '*')
  private static boolean PathSegment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathSegment_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !PathSegment_1_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '{' | '*'
  private static boolean PathSegment_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathSegment_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LBRACE);
    if (!result_) result_ = consumeToken(builder_, MUL);
    return result_;
  }

  // PathTypeArguments?
  private static boolean PathSegment_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathSegment_3")) return false;
    PathTypeArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (PathIdent | FQPathStart) PathTypeArguments?
  public static boolean PathStart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathStart")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path start>");
    result_ = PathStart_0(builder_, level_ + 1);
    result_ = result_ && PathStart_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // PathIdent | FQPathStart
  private static boolean PathStart_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathStart_0")) return false;
    boolean result_;
    result_ = PathIdent(builder_, level_ + 1);
    if (!result_) result_ = FQPathStart(builder_, level_ + 1);
    return result_;
  }

  // PathTypeArguments?
  private static boolean PathStart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathStart_1")) return false;
    PathTypeArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<isPathMode 'VALUE'>> ColonTypeArgumentList
  //                             | <<isPathMode 'TYPE'>> ( TypeArgumentList | PathParameters RetType? )
  static boolean PathTypeArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PathTypeArguments_0(builder_, level_ + 1);
    if (!result_) result_ = PathTypeArguments_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isPathMode 'VALUE'>> ColonTypeArgumentList
  private static boolean PathTypeArguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isPathMode(builder_, level_ + 1, VALUE);
    result_ = result_ && ColonTypeArgumentList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isPathMode 'TYPE'>> ( TypeArgumentList | PathParameters RetType? )
  private static boolean PathTypeArguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isPathMode(builder_, level_ + 1, TYPE);
    result_ = result_ && PathTypeArguments_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TypeArgumentList | PathParameters RetType?
  private static boolean PathTypeArguments_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeArgumentList(builder_, level_ + 1);
    if (!result_) result_ = PathTypeArguments_1_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PathParameters RetType?
  private static boolean PathTypeArguments_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments_1_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PathParameters(builder_, level_ + 1);
    result_ = result_ && PathTypeArguments_1_1_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // RetType?
  private static boolean PathTypeArguments_1_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathTypeArguments_1_1_1_1")) return false;
    RetType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<pathMode 'NO_TYPE_ARGS' 'TypeQualsMode.OFF' PathImpl>>
  public static boolean PathWithoutTypeArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathWithoutTypeArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path>");
    result_ = pathMode(builder_, level_ + 1, NO_TYPE_ARGS, TypeQualsMode.OFF, RustParser::PathImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier | self | 'Self' | super | '::' | '<' | crate
  static boolean Path_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Path_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, SELF);
    if (!result_) result_ = consumeTokenFast(builder_, CSELF);
    if (!result_) result_ = consumeTokenFast(builder_, SUPER);
    if (!result_) result_ = consumeTokenFast(builder_, COLONCOLON);
    if (!result_) result_ = consumeTokenFast(builder_, LT);
    if (!result_) result_ = consumeTokenFast(builder_, CRATE);
    return result_;
  }

  /* ********************************************************** */
  // '(' PolyboundInner ')' | PolyboundInner
  public static boolean Polybound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Polybound")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POLYBOUND, "<polybound>");
    result_ = Polybound_0(builder_, level_ + 1);
    if (!result_) result_ = PolyboundInner(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' PolyboundInner ')'
  private static boolean Polybound_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Polybound_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && PolyboundInner(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ ForLifetimes | '?' ] Bound
  static boolean PolyboundInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PolyboundInner")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PolyboundInner_0(builder_, level_ + 1);
    result_ = result_ && Bound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ForLifetimes | '?' ]
  private static boolean PolyboundInner_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PolyboundInner_0")) return false;
    PolyboundInner_0_0(builder_, level_ + 1);
    return true;
  }

  // ForLifetimes | '?'
  private static boolean PolyboundInner_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PolyboundInner_0_0")) return false;
    boolean result_;
    result_ = ForLifetimes(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, Q);
    return result_;
  }

  /* ********************************************************** */
  // '&' Lifetime? mut? | '*' [ const | mut ]
  static boolean RefLikeStart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart")) return false;
    if (!nextTokenIs(builder_, "", AND, MUL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RefLikeStart_0(builder_, level_ + 1);
    if (!result_) result_ = RefLikeStart_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' Lifetime? mut?
  private static boolean RefLikeStart_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && RefLikeStart_0_1(builder_, level_ + 1);
    result_ = result_ && RefLikeStart_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Lifetime?
  private static boolean RefLikeStart_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_0_1")) return false;
    Lifetime(builder_, level_ + 1);
    return true;
  }

  // mut?
  private static boolean RefLikeStart_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_0_2")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  // '*' [ const | mut ]
  private static boolean RefLikeStart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MUL);
    result_ = result_ && RefLikeStart_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ const | mut ]
  private static boolean RefLikeStart_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_1_1")) return false;
    RefLikeStart_1_1_0(builder_, level_ + 1);
    return true;
  }

  // const | mut
  private static boolean RefLikeStart_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeStart_1_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, CONST);
    if (!result_) result_ = consumeToken(builder_, MUT);
    return result_;
  }

  /* ********************************************************** */
  // RefLikeStart TypeReference
  public static boolean RefLikeType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeType")) return false;
    if (!nextTokenIs(builder_, "<ref like type>", AND, MUL)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, REF_LIKE_TYPE, "<ref like type>");
    result_ = RefLikeStart(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // RefLikeStart TypeReferenceNoImplicitTraitType
  public static boolean RefLikeTypeNoImplicitTrait(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefLikeTypeNoImplicitTrait")) return false;
    if (!nextTokenIs(builder_, "<ref like type no implicit trait>", AND, MUL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, REF_LIKE_TYPE, "<ref like type no implicit trait>");
    result_ = RefLikeStart(builder_, level_ + 1);
    result_ = result_ && TypeReferenceNoImplicitTraitType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // lteq | gteq | !ltlt '<' | !gtgt <<checkGtAllowed>> '>'
  public static boolean RelCompBinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, BINARY_OP, "<operator>");
    result_ = lteq(builder_, level_ + 1);
    if (!result_) result_ = gteq(builder_, level_ + 1);
    if (!result_) result_ = RelCompBinOp_2(builder_, level_ + 1);
    if (!result_) result_ = RelCompBinOp_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // !ltlt '<'
  private static boolean RelCompBinOp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinOp_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RelCompBinOp_2_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !ltlt
  private static boolean RelCompBinOp_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinOp_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !ltlt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // !gtgt <<checkGtAllowed>> '>'
  private static boolean RelCompBinOp_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinOp_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RelCompBinOp_3_0(builder_, level_ + 1);
    result_ = result_ && checkGtAllowed(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !gtgt
  private static boolean RelCompBinOp_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinOp_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !gtgt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // BlockElementMacro | BlockElementMacroCall | ReplExprStmtOrLastExpr | Stmt | Item
  static boolean ReplBlockElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplBlockElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = BlockElementMacro(builder_, level_ + 1);
    if (!result_) result_ = BlockElementMacroCall(builder_, level_ + 1);
    if (!result_) result_ = ReplExprStmtOrLastExpr(builder_, level_ + 1);
    if (!result_) result_ = Stmt(builder_, level_ + 1);
    if (!result_) result_ = Item(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, RustParser::ReplBlockElement_recover);
    return result_;
  }

  /* ********************************************************** */
  // !(Item_first | Expr_first | let | ';')
  static boolean ReplBlockElement_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplBlockElement_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !ReplBlockElement_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Item_first | Expr_first | let | ';'
  private static boolean ReplBlockElement_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplBlockElement_recover_0")) return false;
    boolean result_;
    result_ = Item_first(builder_, level_ + 1);
    if (!result_) result_ = Expr_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LET);
    if (!result_) result_ = consumeTokenFast(builder_, SEMICOLON);
    return result_;
  }

  /* ********************************************************** */
  // ReplBlockElement*
  public static boolean ReplCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REPL_CODE_FRAGMENT_ELEMENT, "<repl code fragment element>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ReplBlockElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ReplCodeFragmentElement", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // StmtModeExpr (&<<eof>> | ExprStmtUpper)
  public static boolean ReplExprStmtOrLastExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplExprStmtOrLastExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<repl expr stmt or last expr>");
    result_ = StmtModeExpr(builder_, level_ + 1);
    result_ = result_ && ReplExprStmtOrLastExpr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &<<eof>> | ExprStmtUpper
  private static boolean ReplExprStmtOrLastExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplExprStmtOrLastExpr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ReplExprStmtOrLastExpr_1_0(builder_, level_ + 1);
    if (!result_) result_ = ExprStmtUpper(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &<<eof>>
  private static boolean ReplExprStmtOrLastExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReplExprStmtOrLastExpr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = eof(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<withRestrictedConstExprMode 'RestrictedConstExprMode.ON' AnyExpr>> | never AnyExpr
  static boolean RestrictedConstExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedConstExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = withRestrictedConstExprMode(builder_, level_ + 1, RestrictedConstExprMode.ON, RustParser::AnyExpr);
    if (!result_) result_ = RestrictedConstExpr_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // never AnyExpr
  private static boolean RestrictedConstExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedConstExpr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = never(builder_, level_ + 1);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // &( [ mut | '&' '&'? ] ( identifier | '_' ) ) Pat
  static boolean RestrictedPat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RestrictedPat_0(builder_, level_ + 1);
    result_ = result_ && Pat(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &( [ mut | '&' '&'? ] ( identifier | '_' ) )
  private static boolean RestrictedPat_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = RestrictedPat_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ mut | '&' '&'? ] ( identifier | '_' )
  private static boolean RestrictedPat_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RestrictedPat_0_0_0(builder_, level_ + 1);
    result_ = result_ && RestrictedPat_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ mut | '&' '&'? ]
  private static boolean RestrictedPat_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0_0")) return false;
    RestrictedPat_0_0_0_0(builder_, level_ + 1);
    return true;
  }

  // mut | '&' '&'?
  private static boolean RestrictedPat_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MUT);
    if (!result_) result_ = RestrictedPat_0_0_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' '&'?
  private static boolean RestrictedPat_0_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && RestrictedPat_0_0_0_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'?
  private static boolean RestrictedPat_0_0_0_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0_0_0_1_1")) return false;
    consumeToken(builder_, AND);
    return true;
  }

  // identifier | '_'
  private static boolean RestrictedPat_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RestrictedPat_0_0_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, UNDERSCORE);
    return result_;
  }

  /* ********************************************************** */
  // '->' TypeReferenceNoImplicitTraitType
  public static boolean RetType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RetType")) return false;
    if (!nextTokenIs(builder_, ARROW)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RET_TYPE, null);
    result_ = consumeToken(builder_, ARROW);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeReferenceNoImplicitTraitType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // !Item_first
  static boolean RootItem_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RootItem_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !Item_first(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !<<eof>> Item
  static boolean RootItem_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RootItem_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = RootItem_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && Item(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::RootItem_recover);
    return result_ || pinned_;
  }

  // !<<eof>>
  private static boolean RootItem_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RootItem_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !eof(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // RootItem_with_recover*
  static boolean RootItems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RootItems")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!RootItem_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RootItems", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ArrayType
  //                       | RefLikeType
  //                       | FnPointerType
  //                       | TupleOrParenType
  //                       | MacroType
  //                       | BaseType
  //                       | ForInType
  public static boolean ScalarTypeReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ScalarTypeReference")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TYPE_REFERENCE, "<type>");
    result_ = ArrayType(builder_, level_ + 1);
    if (!result_) result_ = RefLikeType(builder_, level_ + 1);
    if (!result_) result_ = FnPointerType(builder_, level_ + 1);
    if (!result_) result_ = TupleOrParenType(builder_, level_ + 1);
    if (!result_) result_ = MacroType(builder_, level_ + 1);
    if (!result_) result_ = BaseType(builder_, level_ + 1);
    if (!result_) result_ = ForInType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* [ '&' Lifetime? ] mut? self TypeAscription?
  public static boolean SelfParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SELF_PARAMETER, "<self parameter>");
    result_ = SelfParameter_0(builder_, level_ + 1);
    result_ = result_ && SelfParameter_1(builder_, level_ + 1);
    result_ = result_ && SelfParameter_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SELF);
    result_ = result_ && SelfParameter_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean SelfParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SelfParameter_0", pos_)) break;
    }
    return true;
  }

  // [ '&' Lifetime? ]
  private static boolean SelfParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_1")) return false;
    SelfParameter_1_0(builder_, level_ + 1);
    return true;
  }

  // '&' Lifetime?
  private static boolean SelfParameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && SelfParameter_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Lifetime?
  private static boolean SelfParameter_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_1_0_1")) return false;
    Lifetime(builder_, level_ + 1);
    return true;
  }

  // mut?
  private static boolean SelfParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_2")) return false;
    consumeToken(builder_, MUT);
    return true;
  }

  // TypeAscription?
  private static boolean SelfParameter_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_4")) return false;
    TypeAscription(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // SelfParameter (',' | &')')
  static boolean SelfParameter_with_comma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_with_comma")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = SelfParameter(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && SelfParameter_with_comma_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ',' | &')'
  private static boolean SelfParameter_with_comma_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_with_comma_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = SelfParameter_with_comma_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean SelfParameter_with_comma_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelfParameter_with_comma_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<parseCodeBlockLazy>>
  static boolean ShallowBlock(PsiBuilder builder_, int level_) {
    return parseCodeBlockLazy(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<parseMacroBodyLazy>>
  static boolean ShallowMacroBody(PsiBuilder builder_, int level_) {
    return parseMacroBodyLazy(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '{' <<withRestrictedConstExprMode 'RestrictedConstExprMode.OFF' BlockElement*>> '}'
  public static boolean SimpleBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleBlock")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, withRestrictedConstExprMode(builder_, level_ + 1, RestrictedConstExprMode.OFF, RustParser::SimpleBlock_1_1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // BlockElement*
  private static boolean SimpleBlock_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleBlock_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!BlockElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SimpleBlock_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PatWild
  //                     | PatRest
  //                     | PatRef
  //                     | PatTup
  //                     | PatSlice
  //                     | PatIdent
  //                     | PatMacro
  //                     | PatStruct
  //                     | PatTupleStruct
  //                     | (PatConst !('..' | '...' | '..='))
  //                     | PatRange
  //                     | PatBox
  static boolean SimplePat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimplePat")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PatWild(builder_, level_ + 1);
    if (!result_) result_ = PatRest(builder_, level_ + 1);
    if (!result_) result_ = PatRef(builder_, level_ + 1);
    if (!result_) result_ = PatTup(builder_, level_ + 1);
    if (!result_) result_ = PatSlice(builder_, level_ + 1);
    if (!result_) result_ = PatIdent(builder_, level_ + 1);
    if (!result_) result_ = PatMacro(builder_, level_ + 1);
    if (!result_) result_ = PatStruct(builder_, level_ + 1);
    if (!result_) result_ = PatTupleStruct(builder_, level_ + 1);
    if (!result_) result_ = SimplePat_9(builder_, level_ + 1);
    if (!result_) result_ = PatRange(builder_, level_ + 1);
    if (!result_) result_ = PatBox(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PatConst !('..' | '...' | '..=')
  private static boolean SimplePat_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimplePat_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PatConst(builder_, level_ + 1);
    result_ = result_ && SimplePat_9_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !('..' | '...' | '..=')
  private static boolean SimplePat_9_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimplePat_9_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !SimplePat_9_1_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '..' | '...' | '..='
  private static boolean SimplePat_9_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimplePat_9_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DOTDOT);
    if (!result_) result_ = consumeToken(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeToken(builder_, DOTDOTEQ);
    return result_;
  }

  /* ********************************************************** */
  // Stmt?
  public static boolean StatementCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StatementCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT_CODE_FRAGMENT_ELEMENT, "<statement code fragment element>");
    Stmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // LetDecl | EmptyStmt | never ';'
  public static boolean Stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, STMT, "<stmt>");
    result_ = LetDecl(builder_, level_ + 1);
    if (!result_) result_ = EmptyStmt(builder_, level_ + 1);
    if (!result_) result_ = Stmt_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // never ';'
  private static boolean Stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Stmt_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = never(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<exprMode 'StructLiteralsMode.ON' 'StmtMode.ON' Expr>>
  public static boolean StmtModeExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StmtModeExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr>");
    result_ = exprMode(builder_, level_ + 1, StructLiteralsMode.ON, StmtMode.ON, Expr_parser_);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL | BYTE_STRING_LITERAL
  //             | RAW_STRING_LITERAL | RAW_BYTE_STRING_LITERAL
  public static boolean StringLitExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringLitExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LIT_EXPR, "<string lit expr>");
    result_ = consumeTokenFast(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, BYTE_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_STRING_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, RAW_BYTE_STRING_LITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (struct | union) identifier TypeParameterList?
  //                ( TupleStructTail | BlockStructTail | UnitStructTail )
  public static boolean StructItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructItem")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, STRUCT_ITEM, null);
    result_ = StructItem_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && report_error_(builder_, StructItem_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && StructItem_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // struct | union
  private static boolean StructItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructItem_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRUCT);
    if (!result_) result_ = union(builder_, level_ + 1);
    return result_;
  }

  // TypeParameterList?
  private static boolean StructItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructItem_2")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // TupleStructTail | BlockStructTail | UnitStructTail
  private static boolean StructItem_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructItem_3")) return false;
    boolean result_;
    result_ = TupleStructTail(builder_, level_ + 1);
    if (!result_) result_ = BlockStructTail(builder_, level_ + 1);
    if (!result_) result_ = UnitStructTail(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // '{' StructLiteralField_with_recover* ('..'  AnyExpr)? '}'
  public static boolean StructLiteralBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_LITERAL_BODY, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, StructLiteralBody_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, StructLiteralBody_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // StructLiteralField_with_recover*
  private static boolean StructLiteralBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralBody_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!StructLiteralField_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StructLiteralBody_1", pos_)) break;
    }
    return true;
  }

  // ('..'  AnyExpr)?
  private static boolean StructLiteralBody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralBody_2")) return false;
    StructLiteralBody_2_0(builder_, level_ + 1);
    return true;
  }

  // '..'  AnyExpr
  private static boolean StructLiteralBody_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralBody_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOTDOT);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* (identifier | INTEGER_LITERAL) StructLiteralFieldSuffix?
  public static boolean StructLiteralField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_LITERAL_FIELD, "<struct literal field>");
    result_ = StructLiteralField_0(builder_, level_ + 1);
    result_ = result_ && StructLiteralField_1(builder_, level_ + 1);
    result_ = result_ && StructLiteralField_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean StructLiteralField_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StructLiteralField_0", pos_)) break;
    }
    return true;
  }

  // identifier | INTEGER_LITERAL
  private static boolean StructLiteralField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    return result_;
  }

  // StructLiteralFieldSuffix?
  private static boolean StructLiteralField_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_2")) return false;
    StructLiteralFieldSuffix(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ':' AnyExpr
  static boolean StructLiteralFieldSuffix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralFieldSuffix")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // !(identifier | INTEGER_LITERAL | ',' | '}' | '..' | '#')
  static boolean StructLiteralField_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !StructLiteralField_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // identifier | INTEGER_LITERAL | ',' | '}' | '..' | '#'
  private static boolean StructLiteralField_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeTokenFast(builder_, COMMA);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenFast(builder_, SHA);
    return result_;
  }

  /* ********************************************************** */
  // !('..' | '}') StructLiteralField (',' | &'}')
  static boolean StructLiteralField_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = StructLiteralField_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, StructLiteralField(builder_, level_ + 1));
    result_ = pinned_ && StructLiteralField_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::StructLiteralField_recover);
    return result_ || pinned_;
  }

  // !('..' | '}')
  private static boolean StructLiteralField_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !StructLiteralField_with_recover_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '..' | '}'
  private static boolean StructLiteralField_with_recover_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_with_recover_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DOTDOT);
    if (!result_) result_ = consumeToken(builder_, RBRACE);
    return result_;
  }

  // ',' | &'}'
  private static boolean StructLiteralField_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = StructLiteralField_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}'
  private static boolean StructLiteralField_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteralField_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<any_braces TT*>> | <<unpairedToken>>
  public static boolean TT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TT")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TT, "<tt>");
    result_ = any_braces(builder_, level_ + 1, RustParser::TT_0_0);
    if (!result_) result_ = unpairedToken(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TT*
  private static boolean TT_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TT_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TT(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TT_0_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // &'|' OrPat | Pat
  static boolean TopPat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TopPat")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null, "<pattern>");
    result_ = TopPat_0(builder_, level_ + 1);
    if (!result_) result_ = Pat(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // &'|' OrPat
  private static boolean TopPat_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TopPat_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TopPat_0_0(builder_, level_ + 1);
    result_ = result_ && OrPat(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'|'
  private static boolean TopPat_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TopPat_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, OR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // trait identifier TypeParameterList? '=' TraitAliasBounds? WhereClause? ';'
  public static boolean TraitAlias(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitAlias")) return false;
    if (!nextTokenIs(builder_, "", TRAIT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, TRAIT_ALIAS, null);
    result_ = consumeTokens(builder_, 0, TRAIT, IDENTIFIER);
    result_ = result_ && TraitAlias_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, TraitAlias_4(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TraitAlias_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TypeParameterList?
  private static boolean TraitAlias_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitAlias_2")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // TraitAliasBounds?
  private static boolean TraitAlias_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitAlias_4")) return false;
    TraitAliasBounds(builder_, level_ + 1);
    return true;
  }

  // WhereClause?
  private static boolean TraitAlias_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitAlias_5")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeBounds
  public static boolean TraitAliasBounds(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitAliasBounds")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRAIT_ALIAS_BOUNDS, "<trait alias bounds>");
    result_ = TypeBounds(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '!'? TraitRef for ('..' | TypeReference)
  static boolean TraitImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitImpl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TraitImpl_0(builder_, level_ + 1);
    result_ = result_ && TraitRef(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FOR);
    pinned_ = result_; // pin = 3
    result_ = result_ && TraitImpl_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '!'?
  private static boolean TraitImpl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitImpl_0")) return false;
    consumeToken(builder_, EXCL);
    return true;
  }

  // '..' | TypeReference
  private static boolean TraitImpl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitImpl_3")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DOTDOT);
    if (!result_) result_ = TypeReference(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // unsafe? auto? trait identifier TypeParameterList? TypeParamBounds? WhereClause? Members
  public static boolean TraitItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, TRAIT_ITEM, null);
    result_ = TraitItem_0(builder_, level_ + 1);
    result_ = result_ && TraitItem_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 1, TRAIT, IDENTIFIER);
    pinned_ = result_; // pin = trait
    result_ = result_ && report_error_(builder_, TraitItem_4(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TraitItem_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, TraitItem_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Members(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // unsafe?
  private static boolean TraitItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem_0")) return false;
    consumeToken(builder_, UNSAFE);
    return true;
  }

  // auto?
  private static boolean TraitItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem_1")) return false;
    auto(builder_, level_ + 1);
    return true;
  }

  // TypeParameterList?
  private static boolean TraitItem_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem_4")) return false;
    TypeParameterList(builder_, level_ + 1);
    return true;
  }

  // TypeParamBounds?
  private static boolean TraitItem_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem_5")) return false;
    TypeParamBounds(builder_, level_ + 1);
    return true;
  }

  // WhereClause?
  private static boolean TraitItem_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitItem_6")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TypePathGenericArgsNoTypeQual
  public static boolean TraitRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitRef")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRAIT_REF, "<trait>");
    result_ = TypePathGenericArgsNoTypeQual(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ('+' Polybound)+
  static boolean TraitType_upper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitType_upper")) return false;
    if (!nextTokenIs(builder_, PLUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TraitType_upper_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!TraitType_upper_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TraitType_upper", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' Polybound
  private static boolean TraitType_upper_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TraitType_upper_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && Polybound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TrivialBaseTypeInner
  public static boolean TrivialBaseType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TrivialBaseType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASE_TYPE, "<trivial base type>");
    result_ = TrivialBaseTypeInner(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' ')' | '_' | '!'
  static boolean TrivialBaseTypeInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TrivialBaseTypeInner")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, LPAREN, RPAREN);
    if (!result_) result_ = consumeToken(builder_, UNDERSCORE);
    if (!result_) result_ = consumeToken(builder_, EXCL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ',' [ AnyExpr (',' AnyExpr)* ','? ] ')'
  public static boolean TupleExprUpper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, TUPLE_EXPR, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TupleExprUpper_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ AnyExpr (',' AnyExpr)* ','? ]
  private static boolean TupleExprUpper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper_1")) return false;
    TupleExprUpper_1_0(builder_, level_ + 1);
    return true;
  }

  // AnyExpr (',' AnyExpr)* ','?
  private static boolean TupleExprUpper_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AnyExpr(builder_, level_ + 1);
    result_ = result_ && TupleExprUpper_1_0_1(builder_, level_ + 1);
    result_ = result_ && TupleExprUpper_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' AnyExpr)*
  private static boolean TupleExprUpper_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TupleExprUpper_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TupleExprUpper_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' AnyExpr
  private static boolean TupleExprUpper_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean TupleExprUpper_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExprUpper_1_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis TypeReference
  public static boolean TupleFieldDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TUPLE_FIELD_DECL, "<tuple field decl>");
    result_ = AttrsAndVis(builder_, level_ + 1);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    register_hook_(builder_, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(')' | AttrsAndVis_first | TypeReference_first)
  static boolean TupleFieldDecl_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !TupleFieldDecl_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ')' | AttrsAndVis_first | TypeReference_first
  private static boolean TupleFieldDecl_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = AttrsAndVis_first(builder_, level_ + 1);
    if (!result_) result_ = TypeReference_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !')' TupleFieldDecl (',' | &')')
  static boolean TupleFieldDecl_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TupleFieldDecl_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TupleFieldDecl(builder_, level_ + 1));
    result_ = pinned_ && TupleFieldDecl_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::TupleFieldDecl_recover);
    return result_ || pinned_;
  }

  // !')'
  private static boolean TupleFieldDecl_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &')'
  private static boolean TupleFieldDecl_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = TupleFieldDecl_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean TupleFieldDecl_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFieldDecl_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' TupleFieldDecl_with_recover* ')'
  public static boolean TupleFields(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFields")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TUPLE_FIELDS, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TupleFields_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TupleFieldDecl_with_recover*
  private static boolean TupleFields_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleFields_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TupleFieldDecl_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TupleFields_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' !')' TypeReference (TupleType_upper | ')')
  public static boolean TupleOrParenType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenType")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAREN_TYPE, null);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && TupleOrParenType_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, TypeReference(builder_, level_ + 1));
    result_ = pinned_ && TupleOrParenType_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !')'
  private static boolean TupleOrParenType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenType_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TupleType_upper | ')'
  private static boolean TupleOrParenType_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenType_3")) return false;
    boolean result_;
    result_ = TupleType_upper(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, RPAREN);
    return result_;
  }

  /* ********************************************************** */
  // TupleFields WhereClause? ';'
  static boolean TupleStructTail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleStructTail")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TupleFields(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TupleStructTail_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // WhereClause?
  private static boolean TupleStructTail_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleStructTail_1")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ',' [ TypeReference (',' TypeReference)* ','? ] ')'
  public static boolean TupleType_upper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, TUPLE_TYPE, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TupleType_upper_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ TypeReference (',' TypeReference)* ','? ]
  private static boolean TupleType_upper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper_1")) return false;
    TupleType_upper_1_0(builder_, level_ + 1);
    return true;
  }

  // TypeReference (',' TypeReference)* ','?
  private static boolean TupleType_upper_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeReference(builder_, level_ + 1);
    result_ = result_ && TupleType_upper_1_0_1(builder_, level_ + 1);
    result_ = result_ && TupleType_upper_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' TypeReference)*
  private static boolean TupleType_upper_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TupleType_upper_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TupleType_upper_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' TypeReference
  private static boolean TupleType_upper_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean TupleType_upper_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleType_upper_1_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // TYPE_KW identifier
  //               [ TypeParameterList WhereClause? | WhereClause | TypeParamBounds ]
  //               [ '=' TypeReference ] ';'
  public static boolean TypeAlias(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias")) return false;
    if (!nextTokenIs(builder_, "", TYPE_KW)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, TYPE_ALIAS, null);
    result_ = consumeTokens(builder_, 2, TYPE_KW, IDENTIFIER);
    pinned_ = result_; // pin = identifier
    result_ = result_ && report_error_(builder_, TypeAlias_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TypeAlias_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ TypeParameterList WhereClause? | WhereClause | TypeParamBounds ]
  private static boolean TypeAlias_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_2")) return false;
    TypeAlias_2_0(builder_, level_ + 1);
    return true;
  }

  // TypeParameterList WhereClause? | WhereClause | TypeParamBounds
  private static boolean TypeAlias_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeAlias_2_0_0(builder_, level_ + 1);
    if (!result_) result_ = WhereClause(builder_, level_ + 1);
    if (!result_) result_ = TypeParamBounds(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TypeParameterList WhereClause?
  private static boolean TypeAlias_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeParameterList(builder_, level_ + 1);
    result_ = result_ && TypeAlias_2_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // WhereClause?
  private static boolean TypeAlias_2_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_2_0_0_1")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  // [ '=' TypeReference ]
  private static boolean TypeAlias_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_3")) return false;
    TypeAlias_3_0(builder_, level_ + 1);
    return true;
  }

  // '=' TypeReference
  private static boolean TypeAlias_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAlias_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TypeArgumentListImpl
  public static boolean TypeArgumentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeArgumentList")) return false;
    if (!nextTokenIs(builder_, "<type argument list>", COLONCOLON, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_ARGUMENT_LIST, "<type argument list>");
    result_ = TypeArgumentListImpl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '::'? '<' !'=' <<list_element AnyTypeArgument>>* '>'
  static boolean TypeArgumentListImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeArgumentListImpl")) return false;
    if (!nextTokenIs(builder_, "", COLONCOLON, LT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TypeArgumentListImpl_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LT);
    result_ = result_ && TypeArgumentListImpl_2(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, TypeArgumentListImpl_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, GT) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '::'?
  private static boolean TypeArgumentListImpl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeArgumentListImpl_0")) return false;
    consumeToken(builder_, COLONCOLON);
    return true;
  }

  // !'='
  private static boolean TypeArgumentListImpl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeArgumentListImpl_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, EQ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<list_element AnyTypeArgument>>*
  private static boolean TypeArgumentListImpl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeArgumentListImpl_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!list_element(builder_, level_ + 1, RustParser::AnyTypeArgument)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeArgumentListImpl_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ':' TypeReference
  static boolean TypeAscription(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAscription")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [ Polybound ('+' Polybound)* '+'? ]
  static boolean TypeBounds(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeBounds")) return false;
    TypeBounds_0(builder_, level_ + 1);
    return true;
  }

  // Polybound ('+' Polybound)* '+'?
  private static boolean TypeBounds_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeBounds_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Polybound(builder_, level_ + 1);
    result_ = result_ && TypeBounds_0_1(builder_, level_ + 1);
    result_ = result_ && TypeBounds_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('+' Polybound)*
  private static boolean TypeBounds_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeBounds_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TypeBounds_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeBounds_0_1", pos_)) break;
    }
    return true;
  }

  // '+' Polybound
  private static boolean TypeBounds_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeBounds_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && Polybound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+'?
  private static boolean TypeBounds_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeBounds_0_2")) return false;
    consumeToken(builder_, PLUS);
    return true;
  }

  /* ********************************************************** */
  // ':' TypeBounds
  public static boolean TypeParamBounds(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParamBounds")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeBounds(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_PARAM_BOUNDS, result_);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* identifier TypeParamBounds? DefaultTypeParameterType?
  public static boolean TypeParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameter")) return false;
    if (!nextTokenIs(builder_, "<type parameter>", IDENTIFIER, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_PARAMETER, "<type parameter>");
    result_ = TypeParameter_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && TypeParameter_2(builder_, level_ + 1);
    result_ = result_ && TypeParameter_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean TypeParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeParameter_0", pos_)) break;
    }
    return true;
  }

  // TypeParamBounds?
  private static boolean TypeParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameter_2")) return false;
    TypeParamBounds(builder_, level_ + 1);
    return true;
  }

  // DefaultTypeParameterType?
  private static boolean TypeParameter_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameter_3")) return false;
    DefaultTypeParameterType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '<' <<list_element (LifetimeParameter | TypeParameter | ConstParameter)>>* '>'
  public static boolean TypeParameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameterList")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeParameterList_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, TYPE_PARAMETER_LIST, result_);
    return result_;
  }

  // <<list_element (LifetimeParameter | TypeParameter | ConstParameter)>>*
  private static boolean TypeParameterList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameterList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!list_element(builder_, level_ + 1, RustParser::TypeParameterList_1_0_0)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeParameterList_1", pos_)) break;
    }
    return true;
  }

  // LifetimeParameter | TypeParameter | ConstParameter
  private static boolean TypeParameterList_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeParameterList_1_0_0")) return false;
    boolean result_;
    result_ = LifetimeParameter(builder_, level_ + 1);
    if (!result_) result_ = TypeParameter(builder_, level_ + 1);
    if (!result_) result_ = ConstParameter(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // TypePathGenericArgs?
  public static boolean TypePathCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypePathCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_PATH_CODE_FRAGMENT_ELEMENT, "<type path code fragment element>");
    TypePathGenericArgs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <<pathMode 'TYPE' 'TypeQualsMode.ON' PathImpl>>
  public static boolean TypePathGenericArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypePathGenericArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path>");
    result_ = pathMode(builder_, level_ + 1, TYPE, TypeQualsMode.ON, RustParser::PathImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<pathMode 'TYPE' 'TypeQualsMode.OFF' PathImpl>>
  public static boolean TypePathGenericArgsNoTypeQual(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypePathGenericArgsNoTypeQual")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path>");
    result_ = pathMode(builder_, level_ + 1, TYPE, TypeQualsMode.OFF, RustParser::PathImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '<' TypeReference [ as TraitRef] '>' '::'
  public static boolean TypeQual(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeQual")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    result_ = result_ && TypeQual_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, GT, COLONCOLON);
    exit_section_(builder_, marker_, TYPE_QUAL, result_);
    return result_;
  }

  // [ as TraitRef]
  private static boolean TypeQual_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeQual_2")) return false;
    TypeQual_2_0(builder_, level_ + 1);
    return true;
  }

  // as TraitRef
  private static boolean TypeQual_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeQual_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AS);
    result_ = result_ && TraitRef(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ArrayType
  //                 | RefLikeType
  //                 | FnPointerType
  //                 | TupleOrParenType
  //                 | ExplicitTraitType
  //                 | TrivialBaseType
  //                 // External rule to find the difference between `T` and `T+T`
  //                 | <<baseOrTraitType TypePathGenericArgs ImplicitTraitType TraitType_upper>>
  //                 | MacroType
  //                 | ForInType
  public static boolean TypeReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReference")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TYPE_REFERENCE, "<type>");
    result_ = ArrayType(builder_, level_ + 1);
    if (!result_) result_ = RefLikeType(builder_, level_ + 1);
    if (!result_) result_ = FnPointerType(builder_, level_ + 1);
    if (!result_) result_ = TupleOrParenType(builder_, level_ + 1);
    if (!result_) result_ = ExplicitTraitType(builder_, level_ + 1);
    if (!result_) result_ = TrivialBaseType(builder_, level_ + 1);
    if (!result_) result_ = baseOrTraitType(builder_, level_ + 1, RustParser::TypePathGenericArgs, RustParser::ImplicitTraitType, RustParser::TraitType_upper);
    if (!result_) result_ = MacroType(builder_, level_ + 1);
    if (!result_) result_ = ForInType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TypeReference?
  public static boolean TypeReferenceCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReferenceCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_REFERENCE_CODE_FRAGMENT_ELEMENT, "<type reference code fragment element>");
    TypeReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ArrayType
  //                                    | RefLikeTypeNoImplicitTrait
  //                                    | FnPointerType
  //                                    | TupleOrParenType
  //                                    | ExplicitTraitType
  //                                    | BaseType !'!'
  //                                    | MacroType
  //                                    | ForInType
  public static boolean TypeReferenceNoImplicitTraitType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReferenceNoImplicitTraitType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, TYPE_REFERENCE, "<type>");
    result_ = ArrayType(builder_, level_ + 1);
    if (!result_) result_ = RefLikeTypeNoImplicitTrait(builder_, level_ + 1);
    if (!result_) result_ = FnPointerType(builder_, level_ + 1);
    if (!result_) result_ = TupleOrParenType(builder_, level_ + 1);
    if (!result_) result_ = ExplicitTraitType(builder_, level_ + 1);
    if (!result_) result_ = TypeReferenceNoImplicitTraitType_5(builder_, level_ + 1);
    if (!result_) result_ = MacroType(builder_, level_ + 1);
    if (!result_) result_ = ForInType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // BaseType !'!'
  private static boolean TypeReferenceNoImplicitTraitType_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReferenceNoImplicitTraitType_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BaseType(builder_, level_ + 1);
    result_ = result_ && TypeReferenceNoImplicitTraitType_5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !'!'
  private static boolean TypeReferenceNoImplicitTraitType_5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReferenceNoImplicitTraitType_5_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, EXCL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '[' | '&' | '*' | unsafe | extern | fn | '(' | impl | "dyn" | '_' | '!' | for | Path_first
  static boolean TypeReference_first(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeReference_first")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, LBRACK);
    if (!result_) result_ = consumeTokenFast(builder_, AND);
    if (!result_) result_ = consumeTokenFast(builder_, MUL);
    if (!result_) result_ = consumeTokenFast(builder_, UNSAFE);
    if (!result_) result_ = consumeTokenFast(builder_, EXTERN);
    if (!result_) result_ = consumeTokenFast(builder_, FN);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, IMPL);
    if (!result_) result_ = consumeTokenFast(builder_, "dyn");
    if (!result_) result_ = consumeTokenFast(builder_, UNDERSCORE);
    if (!result_) result_ = consumeTokenFast(builder_, EXCL);
    if (!result_) result_ = consumeTokenFast(builder_, FOR);
    if (!result_) result_ = Path_first(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // WhereClause? ';'
  static boolean UnitStructTail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitStructTail")) return false;
    if (!nextTokenIs(builder_, "", SEMICOLON, WHERE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = UnitStructTail_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // WhereClause?
  private static boolean UnitStructTail_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitStructTail_0")) return false;
    WhereClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' UseSpeck_with_recover* '}'
  public static boolean UseGroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseGroup")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USE_GROUP, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, UseGroup_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // UseSpeck_with_recover*
  private static boolean UseGroup_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseGroup_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!UseSpeck_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UseGroup_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // use UseSpeck ';'
  public static boolean UseItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseItem")) return false;
    if (!nextTokenIs(builder_, "", USE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, USE_ITEM, null);
    result_ = consumeToken(builder_, USE);
    pinned_ = result_; // pin = use
    result_ = result_ && report_error_(builder_, UseSpeck(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // PathWithoutTypeArgs [ Alias | '::' UseSpeckProjection ]
  //            | '::'? UseSpeckProjection
  public static boolean UseSpeck(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USE_SPECK, "<use speck>");
    result_ = UseSpeck_0(builder_, level_ + 1);
    if (!result_) result_ = UseSpeck_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // PathWithoutTypeArgs [ Alias | '::' UseSpeckProjection ]
  private static boolean UseSpeck_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PathWithoutTypeArgs(builder_, level_ + 1);
    result_ = result_ && UseSpeck_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Alias | '::' UseSpeckProjection ]
  private static boolean UseSpeck_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_0_1")) return false;
    UseSpeck_0_1_0(builder_, level_ + 1);
    return true;
  }

  // Alias | '::' UseSpeckProjection
  private static boolean UseSpeck_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Alias(builder_, level_ + 1);
    if (!result_) result_ = UseSpeck_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::' UseSpeckProjection
  private static boolean UseSpeck_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLONCOLON);
    result_ = result_ && UseSpeckProjection(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::'? UseSpeckProjection
  private static boolean UseSpeck_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = UseSpeck_1_0(builder_, level_ + 1);
    result_ = result_ && UseSpeckProjection(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::'?
  private static boolean UseSpeck_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_1_0")) return false;
    consumeToken(builder_, COLONCOLON);
    return true;
  }

  /* ********************************************************** */
  // '*' | UseGroup
  static boolean UseSpeckProjection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeckProjection")) return false;
    if (!nextTokenIs(builder_, "", LBRACE, MUL)) return false;
    boolean result_;
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = UseGroup(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !('}' | '{' | self | super | crate | identifier | '::' | '*' )
  static boolean UseSpeck_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !UseSpeck_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '}' | '{' | self | super | crate | identifier | '::' | '*'
  private static boolean UseSpeck_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_recover_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACE);
    if (!result_) result_ = consumeTokenFast(builder_, SELF);
    if (!result_) result_ = consumeTokenFast(builder_, SUPER);
    if (!result_) result_ = consumeTokenFast(builder_, CRATE);
    if (!result_) result_ = consumeTokenFast(builder_, IDENTIFIER);
    if (!result_) result_ = consumeTokenFast(builder_, COLONCOLON);
    if (!result_) result_ = consumeTokenFast(builder_, MUL);
    return result_;
  }

  /* ********************************************************** */
  // !'}' UseSpeck (','|&'}')
  static boolean UseSpeck_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = UseSpeck_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, UseSpeck(builder_, level_ + 1));
    result_ = pinned_ && UseSpeck_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::UseSpeck_recover);
    return result_ || pinned_;
  }

  // !'}'
  private static boolean UseSpeck_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ','|&'}'
  private static boolean UseSpeck_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = UseSpeck_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'}'
  private static boolean UseSpeck_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseSpeck_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' ValueArgument_with_recover* ')'
  public static boolean ValueArgumentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgumentList")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_ARGUMENT_LIST, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ValueArgumentList_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ValueArgument_with_recover*
  private static boolean ValueArgumentList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgumentList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ValueArgument_with_recover(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ValueArgumentList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !(Expr_first | ')' | '}' | Item_first | let | ';')
  static boolean ValueArgument_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !ValueArgument_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Expr_first | ')' | '}' | Item_first | let | ';'
  private static boolean ValueArgument_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_recover_0")) return false;
    boolean result_;
    result_ = Expr_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACE);
    if (!result_) result_ = Item_first(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LET);
    if (!result_) result_ = consumeTokenFast(builder_, SEMICOLON);
    return result_;
  }

  /* ********************************************************** */
  // !')' AnyExpr (',' | &')')
  static boolean ValueArgument_with_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_with_recover")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ValueArgument_with_recover_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, AnyExpr(builder_, level_ + 1));
    result_ = pinned_ && ValueArgument_with_recover_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, RustParser::ValueArgument_recover);
    return result_ || pinned_;
  }

  // !')'
  private static boolean ValueArgument_with_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_with_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &')'
  private static boolean ValueArgument_with_recover_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_with_recover_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = ValueArgument_with_recover_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &')'
  private static boolean ValueArgument_with_recover_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValueArgument_with_recover_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ValuePathGenericArgs?
  public static boolean ValuePathCodeFragmentElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValuePathCodeFragmentElement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE_PATH_CODE_FRAGMENT_ELEMENT, "<value path code fragment element>");
    ValuePathGenericArgs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <<pathMode 'VALUE' 'TypeQualsMode.ON' PathImpl>>
  public static boolean ValuePathGenericArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValuePathGenericArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path>");
    result_ = pathMode(builder_, level_ + 1, VALUE, TypeQualsMode.ON, RustParser::PathImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<pathMode 'VALUE' 'TypeQualsMode.OFF' PathImpl>>
  public static boolean ValuePathGenericArgsNoTypeQual(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ValuePathGenericArgsNoTypeQual")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, PATH, "<path>");
    result_ = pathMode(builder_, level_ + 1, VALUE, TypeQualsMode.OFF, RustParser::PathImpl);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OuterAttr* [ Pat ':' ] '...'
  public static boolean Variadic(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Variadic")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIADIC, "<variadic>");
    result_ = Variadic_0(builder_, level_ + 1);
    result_ = result_ && Variadic_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOTDOTDOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean Variadic_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Variadic_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Variadic_0", pos_)) break;
    }
    return true;
  }

  // [ Pat ':' ]
  private static boolean Variadic_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Variadic_1")) return false;
    Variadic_1_0(builder_, level_ + 1);
    return true;
  }

  // Pat ':'
  private static boolean Variadic_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Variadic_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Pat(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '...'
  public static boolean VariadicUpper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariadicUpper")) return false;
    if (!nextTokenIs(builder_, DOTDOTDOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _UPPER_, VARIADIC, null);
    result_ = consumeToken(builder_, DOTDOTDOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [BlockFields | TupleFields] VariantDiscriminant?
  static boolean VariantArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VariantArgs_0(builder_, level_ + 1);
    result_ = result_ && VariantArgs_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [BlockFields | TupleFields]
  private static boolean VariantArgs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantArgs_0")) return false;
    VariantArgs_0_0(builder_, level_ + 1);
    return true;
  }

  // BlockFields | TupleFields
  private static boolean VariantArgs_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantArgs_0_0")) return false;
    boolean result_;
    result_ = BlockFields(builder_, level_ + 1);
    if (!result_) result_ = TupleFields(builder_, level_ + 1);
    return result_;
  }

  // VariantDiscriminant?
  private static boolean VariantArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantArgs_1")) return false;
    VariantDiscriminant(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' AnyExpr
  public static boolean VariantDiscriminant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantDiscriminant")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIANT_DISCRIMINANT, null);
    result_ = consumeToken(builder_, EQ);
    pinned_ = result_; // pin = 1
    result_ = result_ && AnyExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // <<any_braces ArrayInitializer >>
  public static boolean VecMacroArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VecMacroArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VEC_MACRO_ARGUMENT, "<vec macro argument>");
    result_ = any_braces(builder_, level_ + 1, RustParser::ArrayInitializer);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // crate !'::' | pub VisRestriction?
  public static boolean Vis(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Vis")) return false;
    if (!nextTokenIs(builder_, "<vis>", CRATE, PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VIS, "<vis>");
    result_ = Vis_0(builder_, level_ + 1);
    if (!result_) result_ = Vis_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // crate !'::'
  private static boolean Vis_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Vis_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CRATE);
    result_ = result_ && Vis_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !'::'
  private static boolean Vis_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Vis_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, COLONCOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // pub VisRestriction?
  private static boolean Vis_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Vis_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PUB);
    result_ = result_ && Vis_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VisRestriction?
  private static boolean Vis_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Vis_1_1")) return false;
    VisRestriction(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' in? PathWithoutTypeArgs ')'
  public static boolean VisRestriction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VisRestriction")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && VisRestriction_1(builder_, level_ + 1);
    result_ = result_ && PathWithoutTypeArgs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, VIS_RESTRICTION, result_);
    return result_;
  }

  // in?
  private static boolean VisRestriction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VisRestriction_1")) return false;
    consumeToken(builder_, IN);
    return true;
  }

  /* ********************************************************** */
  // where <<comma_separated_list WherePred>>?
  public static boolean WhereClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhereClause")) return false;
    if (!nextTokenIs(builder_, WHERE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WHERE);
    result_ = result_ && WhereClause_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHERE_CLAUSE, result_);
    return result_;
  }

  // <<comma_separated_list WherePred>>?
  private static boolean WhereClause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhereClause_1")) return false;
    comma_separated_list(builder_, level_ + 1, RustParser::WherePred);
    return true;
  }

  /* ********************************************************** */
  // Lifetime LifetimeParamBounds | ForLifetimes? TypeReference TypeParamBounds
  public static boolean WherePred(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WherePred")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHERE_PRED, "<where pred>");
    result_ = WherePred_0(builder_, level_ + 1);
    if (!result_) result_ = WherePred_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Lifetime LifetimeParamBounds
  private static boolean WherePred_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WherePred_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Lifetime(builder_, level_ + 1);
    result_ = result_ && LifetimeParamBounds(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ForLifetimes? TypeReference TypeParamBounds
  private static boolean WherePred_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WherePred_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = WherePred_1_0(builder_, level_ + 1);
    result_ = result_ && TypeReference(builder_, level_ + 1);
    result_ = result_ && TypeParamBounds(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ForLifetimes?
  private static boolean WherePred_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WherePred_1_0")) return false;
    ForLifetimes(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<andandImpl>>
  static boolean andand(PsiBuilder builder_, int level_) {
    return andandImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<parseAnyBraces <<param>>>> | never '(' '{' '[' ']' '}' ')' <<param>>
  static boolean any_braces(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "any_braces")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseAnyBraces(builder_, level_ + 1, param);
    if (!result_) result_ = any_braces_1(builder_, level_ + 1, param);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // never '(' '{' '[' ']' '}' ')' <<param>>
  private static boolean any_braces_1(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "any_braces_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = never(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LPAREN, LBRACE, LBRACK, RBRACK, RBRACE, RPAREN);
    result_ = result_ && param.parse(builder_, level_);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // <<asyncKeyword>>
  static boolean async(PsiBuilder builder_, int level_) {
    return asyncKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<asyncBlockKeyword>>
  static boolean asyncBlock(PsiBuilder builder_, int level_) {
    return asyncBlockKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<autoKeyword>>
  static boolean auto(PsiBuilder builder_, int level_) {
    return autoKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<param>> ( ',' <<param>> )* ','?
  static boolean comma_separated_list(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_separated_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = param.parse(builder_, level_);
    result_ = result_ && comma_separated_list_1(builder_, level_ + 1, param);
    result_ = result_ && comma_separated_list_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' <<param>> )*
  private static boolean comma_separated_list_1(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_separated_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!comma_separated_list_1_0(builder_, level_ + 1, param)) break;
      if (!empty_element_parsed_guard_(builder_, "comma_separated_list_1", pos_)) break;
    }
    return true;
  }

  // ',' <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_separated_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && param.parse(builder_, level_);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean comma_separated_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comma_separated_list_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // <<defaultKeyword>>
  static boolean default_(PsiBuilder builder_, int level_) {
    return defaultKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<dynKeyword>>
  static boolean dyn(PsiBuilder builder_, int level_) {
    return dynKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<gteqImpl>>
  static boolean gteq(PsiBuilder builder_, int level_) {
    return gteqImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<gtgtImpl>>
  static boolean gtgt(PsiBuilder builder_, int level_) {
    return gtgtImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<gtgteqImpl>>
  static boolean gtgteq(PsiBuilder builder_, int level_) {
    return gtgteqImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // !'>' <<param>> (',' | &'>')
  static boolean list_element(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "list_element")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = list_element_0(builder_, level_ + 1);
    result_ = result_ && param.parse(builder_, level_);
    pinned_ = result_; // pin = 2
    result_ = result_ && list_element_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !'>'
  private static boolean list_element_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_element_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, GT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' | &'>'
  private static boolean list_element_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_element_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = list_element_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &'>'
  private static boolean list_element_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_element_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeToken(builder_, GT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<lteqImpl>>
  static boolean lteq(PsiBuilder builder_, int level_) {
    return lteqImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<ltltImpl>>
  static boolean ltlt(PsiBuilder builder_, int level_) {
    return ltltImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<ltlteqImpl>>
  static boolean ltlteq(PsiBuilder builder_, int level_) {
    return ltlteqImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // !()
  static boolean never(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "never")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !never_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ()
  private static boolean never_0(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // <<ororImpl>>
  static boolean oror(PsiBuilder builder_, int level_) {
    return ororImpl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<rawKeyword>>
  static boolean raw(PsiBuilder builder_, int level_) {
    return rawKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<tryKeyword>>
  static boolean try_$(PsiBuilder builder_, int level_) {
    return tryKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // <<unionKeyword>>
  static boolean union(PsiBuilder builder_, int level_) {
    return unionKeyword(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '(' [ <<param>> (',' <<param>>)*  [ ',' '...'? ] ] ')'
  static boolean variadic_params_impl(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, variadic_params_impl_1(builder_, level_ + 1, param));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ <<param>> (',' <<param>>)*  [ ',' '...'? ] ]
  private static boolean variadic_params_impl_1(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1")) return false;
    variadic_params_impl_1_0(builder_, level_ + 1, param);
    return true;
  }

  // <<param>> (',' <<param>>)*  [ ',' '...'? ]
  private static boolean variadic_params_impl_1_0(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = param.parse(builder_, level_);
    result_ = result_ && variadic_params_impl_1_0_1(builder_, level_ + 1, param);
    result_ = result_ && variadic_params_impl_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' <<param>>)*
  private static boolean variadic_params_impl_1_0_1(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!variadic_params_impl_1_0_1_0(builder_, level_ + 1, param)) break;
      if (!empty_element_parsed_guard_(builder_, "variadic_params_impl_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' <<param>>
  private static boolean variadic_params_impl_1_0_1_0(PsiBuilder builder_, int level_, Parser param) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && param.parse(builder_, level_);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' '...'? ]
  private static boolean variadic_params_impl_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0_2")) return false;
    variadic_params_impl_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '...'?
  private static boolean variadic_params_impl_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && variadic_params_impl_1_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '...'?
  private static boolean variadic_params_impl_1_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variadic_params_impl_1_0_2_0_1")) return false;
    consumeToken(builder_, DOTDOTDOT);
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expr
  // Operator priority table:
  // 0: ATOM(RetExpr)
  // 1: ATOM(YieldExpr)
  // 2: PREFIX(LambdaExpr)
  // 3: BINARY(AssignBinExpr)
  // 4: ATOM(WhileExpr)
  // 5: ATOM(IfExpr)
  // 6: ATOM(ForExpr)
  // 7: ATOM(LoopExpr)
  // 8: ATOM(MatchExpr)
  // 9: ATOM(BlockExpr)
  // 10: ATOM(ContExpr)
  // 11: ATOM(BreakExpr)
  // 12: POSTFIX(FullRangeExpr)
  // 13: ATOM(OpenRangeExpr)
  // 14: BINARY(BoolOrBinExpr)
  // 15: BINARY(BoolAndBinExpr)
  // 16: BINARY(CompBinExpr)
  // 17: BINARY(RelCompBinExpr)
  // 18: BINARY(BitOrBinExpr)
  // 19: BINARY(BitXorBinExpr)
  // 20: BINARY(BitAndBinExpr)
  // 21: BINARY(BitShiftBinExpr)
  // 22: BINARY(AddBinExpr)
  // 23: BINARY(MulBinExpr)
  // 24: POSTFIX(CastExpr)
  // 25: PREFIX(UnaryExpr)
  // 26: POSTFIX(TryExpr)
  // 27: ATOM(LitExpr) ATOM(MacroExpr) ATOM(StructLiteral) POSTFIX(DotExpr)
  //    POSTFIX(IndexExpr) ATOM(PathExpr) POSTFIX(CallExpr) ATOM(ArrayExpr)
  //    ATOM(UnitExpr) ATOM(TupleOrParenExpr)
  public static boolean Expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = RetExpr(builder_, level_ + 1);
    if (!result_) result_ = YieldExpr(builder_, level_ + 1);
    if (!result_) result_ = LambdaExpr(builder_, level_ + 1);
    if (!result_) result_ = WhileExpr(builder_, level_ + 1);
    if (!result_) result_ = IfExpr(builder_, level_ + 1);
    if (!result_) result_ = ForExpr(builder_, level_ + 1);
    if (!result_) result_ = LoopExpr(builder_, level_ + 1);
    if (!result_) result_ = MatchExpr(builder_, level_ + 1);
    if (!result_) result_ = BlockExpr(builder_, level_ + 1);
    if (!result_) result_ = ContExpr(builder_, level_ + 1);
    if (!result_) result_ = BreakExpr(builder_, level_ + 1);
    if (!result_) result_ = OpenRangeExpr(builder_, level_ + 1);
    if (!result_) result_ = UnaryExpr(builder_, level_ + 1);
    if (!result_) result_ = LitExpr(builder_, level_ + 1);
    if (!result_) result_ = MacroExpr(builder_, level_ + 1);
    if (!result_) result_ = StructLiteral(builder_, level_ + 1);
    if (!result_) result_ = PathExpr(builder_, level_ + 1);
    if (!result_) result_ = ArrayExpr(builder_, level_ + 1);
    if (!result_) result_ = UnitExpr(builder_, level_ + 1);
    if (!result_) result_ = TupleOrParenExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 3 && AssignBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 2));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 12 && FullRangeExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, RANGE_EXPR, result_, true, null);
      }
      else if (priority_ < 14 && BoolOrBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 14));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 15 && BoolAndBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 15));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 16 && CompBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 16));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 17 && RelCompBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 17));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 18 && BitOrBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 18));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 19 && BitXorBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 19));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 20 && BitAndBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 20));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 21 && BitShiftBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 21));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 22 && AddBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 22));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 23 && MulBinExpr_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expr(builder_, level_, 23));
        result_ = resetFlags(builder_, level_ + 1) && result_;
        exit_section_(builder_, level_, marker_, BINARY_EXPR, result_, true, null);
      }
      else if (priority_ < 24 && CastExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, CAST_EXPR, result_, true, null);
      }
      else if (priority_ < 26 && consumeTokenSmart(builder_, Q)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, TRY_EXPR, result_, true, null);
      }
      else if (priority_ < 27 && DotExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, DOT_EXPR, result_, true, null);
      }
      else if (priority_ < 27 && IndexExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, INDEX_EXPR, result_, true, null);
      }
      else if (priority_ < 27 && CallExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, CALL_EXPR, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // OuterAttr* return AnyExpr?
  public static boolean RetExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RetExpr")) return false;
    if (!nextTokenIsSmart(builder_, RETURN, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RET_EXPR, "<ret expr>");
    result_ = RetExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RETURN);
    result_ = result_ && RetExpr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean RetExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RetExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RetExpr_0", pos_)) break;
    }
    return true;
  }

  // AnyExpr?
  private static boolean RetExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RetExpr_2")) return false;
    AnyExpr(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* yield AnyExpr?
  public static boolean YieldExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "YieldExpr")) return false;
    if (!nextTokenIsSmart(builder_, SHA, YIELD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, YIELD_EXPR, "<yield expr>");
    result_ = YieldExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YIELD);
    result_ = result_ && YieldExpr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean YieldExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "YieldExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "YieldExpr_0", pos_)) break;
    }
    return true;
  }

  // AnyExpr?
  private static boolean YieldExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "YieldExpr_2")) return false;
    AnyExpr(builder_, level_ + 1);
    return true;
  }

  public static boolean LambdaExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = LambdaExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && Expr(builder_, level_, 2);
    result_ = pinned_ && report_error_(builder_, resetFlags(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, LAMBDA_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr* [asyncBlock | static] move? LambdaParameters RetType? <<setStmtMode 'StmtMode.OFF'>>
  private static boolean LambdaExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = LambdaExpr_0_0(builder_, level_ + 1);
    result_ = result_ && LambdaExpr_0_1(builder_, level_ + 1);
    result_ = result_ && LambdaExpr_0_2(builder_, level_ + 1);
    result_ = result_ && LambdaParameters(builder_, level_ + 1);
    result_ = result_ && LambdaExpr_0_4(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr*
  private static boolean LambdaExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LambdaExpr_0_0", pos_)) break;
    }
    return true;
  }

  // [asyncBlock | static]
  private static boolean LambdaExpr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0_1")) return false;
    LambdaExpr_0_1_0(builder_, level_ + 1);
    return true;
  }

  // asyncBlock | static
  private static boolean LambdaExpr_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0_1_0")) return false;
    boolean result_;
    result_ = asyncBlock(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, STATIC);
    return result_;
  }

  // move?
  private static boolean LambdaExpr_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0_2")) return false;
    consumeTokenSmart(builder_, MOVE);
    return true;
  }

  // RetType?
  private static boolean LambdaExpr_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaExpr_0_4")) return false;
    RetType(builder_, level_ + 1);
    return true;
  }

  // AssignBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean AssignBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = AssignBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr* LabelDecl? while Condition SimpleBlock
  public static boolean WhileExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHILE_EXPR, "<while expr>");
    result_ = WhileExpr_0(builder_, level_ + 1);
    result_ = result_ && WhileExpr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WHILE);
    pinned_ = result_; // pin = while
    result_ = result_ && report_error_(builder_, Condition(builder_, level_ + 1));
    result_ = pinned_ && SimpleBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean WhileExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "WhileExpr_0", pos_)) break;
    }
    return true;
  }

  // LabelDecl?
  private static boolean WhileExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileExpr_1")) return false;
    LabelDecl(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* if Condition SimpleBlock ElseBranch?
  public static boolean IfExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfExpr")) return false;
    if (!nextTokenIsSmart(builder_, IF, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IF_EXPR, "<if expr>");
    result_ = IfExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IF);
    pinned_ = result_; // pin = if
    result_ = result_ && report_error_(builder_, Condition(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, SimpleBlock(builder_, level_ + 1)) && result_;
    result_ = pinned_ && IfExpr_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean IfExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "IfExpr_0", pos_)) break;
    }
    return true;
  }

  // ElseBranch?
  private static boolean IfExpr_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfExpr_4")) return false;
    ElseBranch(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* LabelDecl? for Pat in NoStructLitExpr SimpleBlock
  public static boolean ForExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_EXPR, "<for expr>");
    result_ = ForExpr_0(builder_, level_ + 1);
    result_ = result_ && ForExpr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FOR);
    pinned_ = result_; // pin = for
    result_ = result_ && report_error_(builder_, Pat(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, IN)) && result_;
    result_ = pinned_ && report_error_(builder_, NoStructLitExpr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && SimpleBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean ForExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ForExpr_0", pos_)) break;
    }
    return true;
  }

  // LabelDecl?
  private static boolean ForExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr_1")) return false;
    LabelDecl(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* LabelDecl? loop SimpleBlock
  public static boolean LoopExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LoopExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOOP_EXPR, "<loop expr>");
    result_ = LoopExpr_0(builder_, level_ + 1);
    result_ = result_ && LoopExpr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LOOP);
    pinned_ = result_; // pin = loop
    result_ = result_ && SimpleBlock(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean LoopExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LoopExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LoopExpr_0", pos_)) break;
    }
    return true;
  }

  // LabelDecl?
  private static boolean LoopExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LoopExpr_1")) return false;
    LabelDecl(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* match NoStructLitExpr MatchBody
  public static boolean MatchExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchExpr")) return false;
    if (!nextTokenIsSmart(builder_, MATCH, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MATCH_EXPR, "<match expr>");
    result_ = MatchExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, MATCH);
    pinned_ = result_; // pin = match
    result_ = result_ && report_error_(builder_, NoStructLitExpr(builder_, level_ + 1));
    result_ = pinned_ && MatchBody(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean MatchExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MatchExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MatchExpr_0", pos_)) break;
    }
    return true;
  }

  // OuterAttr* [ (unsafe | asyncBlock move? | try) &'{' ] LabelDecl? SimpleBlock
  public static boolean BlockExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_EXPR, "<block expr>");
    result_ = BlockExpr_0(builder_, level_ + 1);
    result_ = result_ && BlockExpr_1(builder_, level_ + 1);
    result_ = result_ && BlockExpr_2(builder_, level_ + 1);
    result_ = result_ && SimpleBlock(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean BlockExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockExpr_0", pos_)) break;
    }
    return true;
  }

  // [ (unsafe | asyncBlock move? | try) &'{' ]
  private static boolean BlockExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1")) return false;
    BlockExpr_1_0(builder_, level_ + 1);
    return true;
  }

  // (unsafe | asyncBlock move? | try) &'{'
  private static boolean BlockExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BlockExpr_1_0_0(builder_, level_ + 1);
    result_ = result_ && BlockExpr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unsafe | asyncBlock move? | try
  private static boolean BlockExpr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, UNSAFE);
    if (!result_) result_ = BlockExpr_1_0_0_1(builder_, level_ + 1);
    if (!result_) result_ = try_$(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // asyncBlock move?
  private static boolean BlockExpr_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = asyncBlock(builder_, level_ + 1);
    result_ = result_ && BlockExpr_1_0_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // move?
  private static boolean BlockExpr_1_0_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1_0_0_1_1")) return false;
    consumeTokenSmart(builder_, MOVE);
    return true;
  }

  // &'{'
  private static boolean BlockExpr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = consumeTokenSmart(builder_, LBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LabelDecl?
  private static boolean BlockExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockExpr_2")) return false;
    LabelDecl(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* continue Label?
  public static boolean ContExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContExpr")) return false;
    if (!nextTokenIsSmart(builder_, CONTINUE, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONT_EXPR, "<cont expr>");
    result_ = ContExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CONTINUE);
    result_ = result_ && ContExpr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean ContExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ContExpr_0", pos_)) break;
    }
    return true;
  }

  // Label?
  private static boolean ContExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContExpr_2")) return false;
    Label(builder_, level_ + 1);
    return true;
  }

  // OuterAttr* break Label? AnyExpr?
  public static boolean BreakExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakExpr")) return false;
    if (!nextTokenIsSmart(builder_, BREAK, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BREAK_EXPR, "<break expr>");
    result_ = BreakExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BREAK);
    result_ = result_ && BreakExpr_2(builder_, level_ + 1);
    result_ = result_ && BreakExpr_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean BreakExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BreakExpr_0", pos_)) break;
    }
    return true;
  }

  // Label?
  private static boolean BreakExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakExpr_2")) return false;
    Label(builder_, level_ + 1);
    return true;
  }

  // AnyExpr?
  private static boolean BreakExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakExpr_3")) return false;
    AnyExpr(builder_, level_ + 1);
    return true;
  }

  // <<isIncompleteBlockExpr>> ('..' | '...' | '..=') <<setStmtMode 'StmtMode.OFF'>> (<<checkBraceAllowed>> Expr)? <<resetFlags>>
  private static boolean FullRangeExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullRangeExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && FullRangeExpr_0_1(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    result_ = result_ && FullRangeExpr_0_3(builder_, level_ + 1);
    result_ = result_ && resetFlags(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '..' | '...' | '..='
  private static boolean FullRangeExpr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullRangeExpr_0_1")) return false;
    boolean result_;
    result_ = consumeTokenSmart(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenSmart(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeTokenSmart(builder_, DOTDOTEQ);
    return result_;
  }

  // (<<checkBraceAllowed>> Expr)?
  private static boolean FullRangeExpr_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullRangeExpr_0_3")) return false;
    FullRangeExpr_0_3_0(builder_, level_ + 1);
    return true;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean FullRangeExpr_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullRangeExpr_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = checkBraceAllowed(builder_, level_ + 1);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('..' | '...' | '..=') <<setStmtMode 'StmtMode.OFF'>> (<<checkBraceAllowed>> Expr)? <<resetFlags>>
  public static boolean OpenRangeExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OpenRangeExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RANGE_EXPR, "<open range expr>");
    result_ = OpenRangeExpr_0(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    result_ = result_ && OpenRangeExpr_2(builder_, level_ + 1);
    result_ = result_ && resetFlags(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '..' | '...' | '..='
  private static boolean OpenRangeExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OpenRangeExpr_0")) return false;
    boolean result_;
    result_ = consumeTokenSmart(builder_, DOTDOT);
    if (!result_) result_ = consumeTokenSmart(builder_, DOTDOTDOT);
    if (!result_) result_ = consumeTokenSmart(builder_, DOTDOTEQ);
    return result_;
  }

  // (<<checkBraceAllowed>> Expr)?
  private static boolean OpenRangeExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OpenRangeExpr_2")) return false;
    OpenRangeExpr_2_0(builder_, level_ + 1);
    return true;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean OpenRangeExpr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OpenRangeExpr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = checkBraceAllowed(builder_, level_ + 1);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> BoolOrBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BoolOrBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BoolOrBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && BoolOrBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> BoolAndBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BoolAndBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BoolAndBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && BoolAndBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> CompBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean CompBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && CompBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> RelCompBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean RelCompBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RelCompBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && RelCompBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(<<isCompleteBlockExpr>> | oror) BitOrBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BitOrBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitOrBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BitOrBinExpr_0_0(builder_, level_ + 1);
    result_ = result_ && BitOrBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(<<isCompleteBlockExpr>> | oror)
  private static boolean BitOrBinExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitOrBinExpr_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !BitOrBinExpr_0_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<isCompleteBlockExpr>> | oror
  private static boolean BitOrBinExpr_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitOrBinExpr_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isCompleteBlockExpr(builder_, level_ + 1);
    if (!result_) result_ = oror(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> BitXorBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BitXorBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitXorBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && BitXorBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(<<isCompleteBlockExpr>> | andand) BitAndBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BitAndBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitAndBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BitAndBinExpr_0_0(builder_, level_ + 1);
    result_ = result_ && BitAndBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(<<isCompleteBlockExpr>> | andand)
  private static boolean BitAndBinExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitAndBinExpr_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !BitAndBinExpr_0_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<isCompleteBlockExpr>> | andand
  private static boolean BitAndBinExpr_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitAndBinExpr_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isCompleteBlockExpr(builder_, level_ + 1);
    if (!result_) result_ = andand(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> BitShiftBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean BitShiftBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BitShiftBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && BitShiftBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> AddBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean AddBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AddBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && AddBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> MulBinOp <<setStmtMode 'StmtMode.OFF'>>
  private static boolean MulBinExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MulBinExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && MulBinOp(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> (as | ':') ScalarTypeReference
  private static boolean CastExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CastExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && CastExpr_0_1(builder_, level_ + 1);
    result_ = result_ && ScalarTypeReference(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // as | ':'
  private static boolean CastExpr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CastExpr_0_1")) return false;
    boolean result_;
    result_ = consumeTokenSmart(builder_, AS);
    if (!result_) result_ = consumeTokenSmart(builder_, COLON);
    return result_;
  }

  public static boolean UnaryExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = UnaryExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && Expr(builder_, level_, 25);
    result_ = pinned_ && report_error_(builder_, resetFlags(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, UNARY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr* (box | '-' | '*' | '!' | '&' [raw (mut | const) | mut]) <<setStmtMode 'StmtMode.OFF'>>
  private static boolean UnaryExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = UnaryExpr_0_0(builder_, level_ + 1);
    result_ = result_ && UnaryExpr_0_1(builder_, level_ + 1);
    result_ = result_ && setStmtMode(builder_, level_ + 1, StmtMode.OFF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr*
  private static boolean UnaryExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UnaryExpr_0_0", pos_)) break;
    }
    return true;
  }

  // box | '-' | '*' | '!' | '&' [raw (mut | const) | mut]
  private static boolean UnaryExpr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BOX);
    if (!result_) result_ = consumeTokenSmart(builder_, MINUS);
    if (!result_) result_ = consumeTokenSmart(builder_, MUL);
    if (!result_) result_ = consumeTokenSmart(builder_, EXCL);
    if (!result_) result_ = UnaryExpr_0_1_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' [raw (mut | const) | mut]
  private static boolean UnaryExpr_0_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, AND);
    result_ = result_ && UnaryExpr_0_1_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [raw (mut | const) | mut]
  private static boolean UnaryExpr_0_1_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1_4_1")) return false;
    UnaryExpr_0_1_4_1_0(builder_, level_ + 1);
    return true;
  }

  // raw (mut | const) | mut
  private static boolean UnaryExpr_0_1_4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1_4_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = UnaryExpr_0_1_4_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, MUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // raw (mut | const)
  private static boolean UnaryExpr_0_1_4_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1_4_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = raw(builder_, level_ + 1);
    result_ = result_ && UnaryExpr_0_1_4_1_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // mut | const
  private static boolean UnaryExpr_0_1_4_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr_0_1_4_1_0_0_1")) return false;
    boolean result_;
    result_ = consumeTokenSmart(builder_, MUT);
    if (!result_) result_ = consumeTokenSmart(builder_, CONST);
    return result_;
  }

  // OuterAttr* AnyLitToken
  public static boolean LitExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LitExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, LIT_EXPR, "<lit expr>");
    result_ = LitExpr_0(builder_, level_ + 1);
    result_ = result_ && AnyLitToken(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean LitExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LitExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LitExpr_0", pos_)) break;
    }
    return true;
  }

  // ExprLikeMacroCall
  public static boolean MacroExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MacroExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MACRO_EXPR, "<macro expr>");
    result_ = ExprLikeMacroCall(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // <<checkStructAllowed>> OuterAttr* ValuePathGenericArgsNoTypeQual StructLiteralBody
  public static boolean StructLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteral")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_LITERAL, "<struct literal>");
    result_ = checkStructAllowed(builder_, level_ + 1);
    result_ = result_ && StructLiteral_1(builder_, level_ + 1);
    result_ = result_ && ValuePathGenericArgsNoTypeQual(builder_, level_ + 1);
    result_ = result_ && StructLiteralBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean StructLiteral_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructLiteral_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StructLiteral_1", pos_)) break;
    }
    return true;
  }

  // '.' MethodOrField
  private static boolean DotExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DotExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, DOT);
    result_ = result_ && MethodOrField(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // <<isIncompleteBlockExpr>> IndexArg
  private static boolean IndexExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IndexExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && IndexArg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr* ValuePathGenericArgs
  public static boolean PathExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PATH_EXPR, "<path expr>");
    result_ = PathExpr_0(builder_, level_ + 1);
    result_ = result_ && ValuePathGenericArgs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean PathExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PathExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PathExpr_0", pos_)) break;
    }
    return true;
  }

  // <<isIncompleteBlockExpr>> ValueArgumentList
  private static boolean CallExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = isIncompleteBlockExpr(builder_, level_ + 1);
    result_ = result_ && ValueArgumentList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OuterAttr* '[' ArrayInitializer ']'
  public static boolean ArrayExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayExpr")) return false;
    if (!nextTokenIsSmart(builder_, LBRACK, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_EXPR, "<array expr>");
    result_ = ArrayExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, ArrayInitializer(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean ArrayExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArrayExpr_0", pos_)) break;
    }
    return true;
  }

  // OuterAttr* '(' ')'
  public static boolean UnitExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitExpr")) return false;
    if (!nextTokenIsSmart(builder_, LPAREN, SHA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_EXPR, "<unit expr>");
    result_ = UnitExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeTokensSmart(builder_, 0, LPAREN, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OuterAttr*
  private static boolean UnitExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UnitExpr_0", pos_)) break;
    }
    return true;
  }

  // OuterAttr* '(' AnyExpr (TupleExprUpper | ')')
  public static boolean TupleOrParenExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenExpr")) return false;
    if (!nextTokenIsSmart(builder_, LPAREN, SHA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PAREN_EXPR, "<tuple or paren expr>");
    result_ = TupleOrParenExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, AnyExpr(builder_, level_ + 1));
    result_ = pinned_ && TupleOrParenExpr_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OuterAttr*
  private static boolean TupleOrParenExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenExpr_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OuterAttr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TupleOrParenExpr_0", pos_)) break;
    }
    return true;
  }

  // TupleExprUpper | ')'
  private static boolean TupleOrParenExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleOrParenExpr_3")) return false;
    boolean result_;
    result_ = TupleExprUpper(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, RPAREN);
    return result_;
  }

  static final Parser Expr_parser_ = (builder_, level_) -> Expr(builder_, level_ + 1, -1);
}
