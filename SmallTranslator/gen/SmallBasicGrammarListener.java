// Generated from D:/USER/Desktop/Documentos u/Septimo Semestre/Lenguajes/translator/SmallTranslator/grammar\SmallBasicGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallBasicGrammarParser}.
 */
public interface SmallBasicGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmallBasicGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmallBasicGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(SmallBasicGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(SmallBasicGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#subbody}.
	 * @param ctx the parse tree
	 */
	void enterSubbody(SmallBasicGrammarParser.SubbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#subbody}.
	 * @param ctx the parse tree
	 */
	void exitSubbody(SmallBasicGrammarParser.SubbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmallBasicGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmallBasicGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#identifiersentences}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#identifiersentences}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SmallBasicGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SmallBasicGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SmallBasicGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SmallBasicGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#characteristic}.
	 * @param ctx the parse tree
	 */
	void enterCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#characteristic}.
	 * @param ctx the parse tree
	 */
	void exitCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SmallBasicGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SmallBasicGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SmallBasicGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SmallBasicGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(SmallBasicGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(SmallBasicGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(SmallBasicGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(SmallBasicGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(SmallBasicGrammarParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(SmallBasicGrammarParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(SmallBasicGrammarParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(SmallBasicGrammarParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#buildit}.
	 * @param ctx the parse tree
	 */
	void enterBuildit(SmallBasicGrammarParser.BuilditContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#buildit}.
	 * @param ctx the parse tree
	 */
	void exitBuildit(SmallBasicGrammarParser.BuilditContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#buildit_words}.
	 * @param ctx the parse tree
	 */
	void enterBuildit_words(SmallBasicGrammarParser.Buildit_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#buildit_words}.
	 * @param ctx the parse tree
	 */
	void exitBuildit_words(SmallBasicGrammarParser.Buildit_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#argument_body}.
	 * @param ctx the parse tree
	 */
	void enterArgument_body(SmallBasicGrammarParser.Argument_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#argument_body}.
	 * @param ctx the parse tree
	 */
	void exitArgument_body(SmallBasicGrammarParser.Argument_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SmallBasicGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SmallBasicGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#expression_prima}.
	 * @param ctx the parse tree
	 */
	void enterExpression_prima(SmallBasicGrammarParser.Expression_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#expression_prima}.
	 * @param ctx the parse tree
	 */
	void exitExpression_prima(SmallBasicGrammarParser.Expression_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#expressionbool}.
	 * @param ctx the parse tree
	 */
	void enterExpressionbool(SmallBasicGrammarParser.ExpressionboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#expressionbool}.
	 * @param ctx the parse tree
	 */
	void exitExpressionbool(SmallBasicGrammarParser.ExpressionboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#bool_prima}.
	 * @param ctx the parse tree
	 */
	void enterBool_prima(SmallBasicGrammarParser.Bool_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#bool_prima}.
	 * @param ctx the parse tree
	 */
	void exitBool_prima(SmallBasicGrammarParser.Bool_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#expressionrel}.
	 * @param ctx the parse tree
	 */
	void enterExpressionrel(SmallBasicGrammarParser.ExpressionrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#expressionrel}.
	 * @param ctx the parse tree
	 */
	void exitExpressionrel(SmallBasicGrammarParser.ExpressionrelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#relprima}.
	 * @param ctx the parse tree
	 */
	void enterRelprima(SmallBasicGrammarParser.RelprimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#relprima}.
	 * @param ctx the parse tree
	 */
	void exitRelprima(SmallBasicGrammarParser.RelprimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(SmallBasicGrammarParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(SmallBasicGrammarParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#e_prima}.
	 * @param ctx the parse tree
	 */
	void enterE_prima(SmallBasicGrammarParser.E_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#e_prima}.
	 * @param ctx the parse tree
	 */
	void exitE_prima(SmallBasicGrammarParser.E_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(SmallBasicGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(SmallBasicGrammarParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#t_prima}.
	 * @param ctx the parse tree
	 */
	void enterT_prima(SmallBasicGrammarParser.T_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#t_prima}.
	 * @param ctx the parse tree
	 */
	void exitT_prima(SmallBasicGrammarParser.T_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#oprel}.
	 * @param ctx the parse tree
	 */
	void enterOprel(SmallBasicGrammarParser.OprelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#oprel}.
	 * @param ctx the parse tree
	 */
	void exitOprel(SmallBasicGrammarParser.OprelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void enterOpsuma(SmallBasicGrammarParser.OpsumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void exitOpsuma(SmallBasicGrammarParser.OpsumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#opmult}.
	 * @param ctx the parse tree
	 */
	void enterOpmult(SmallBasicGrammarParser.OpmultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#opmult}.
	 * @param ctx the parse tree
	 */
	void exitOpmult(SmallBasicGrammarParser.OpmultContext ctx);
}