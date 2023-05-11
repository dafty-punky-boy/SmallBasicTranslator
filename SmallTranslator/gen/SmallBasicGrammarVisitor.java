// Generated from D:/USER/Desktop/Documentos u/Septimo Semestre/Lenguajes/translator/SmallTranslator/grammar\SmallBasicGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmallBasicGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmallBasicGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SmallBasicGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(SmallBasicGrammarParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#subbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubbody(SmallBasicGrammarParser.SubbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SmallBasicGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#identifiersentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SmallBasicGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SmallBasicGrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#characteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SmallBasicGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SmallBasicGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(SmallBasicGrammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(SmallBasicGrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SmallBasicGrammarParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(SmallBasicGrammarParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#buildit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildit(SmallBasicGrammarParser.BuilditContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#buildit_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildit_words(SmallBasicGrammarParser.Buildit_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#argument_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_body(SmallBasicGrammarParser.Argument_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SmallBasicGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#expression_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_prima(SmallBasicGrammarParser.Expression_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#expressionbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionbool(SmallBasicGrammarParser.ExpressionboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#bool_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_prima(SmallBasicGrammarParser.Bool_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#expressionrel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionrel(SmallBasicGrammarParser.ExpressionrelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#relprima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelprima(SmallBasicGrammarParser.RelprimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(SmallBasicGrammarParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#e_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_prima(SmallBasicGrammarParser.E_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(SmallBasicGrammarParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#t_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_prima(SmallBasicGrammarParser.T_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#oprel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprel(SmallBasicGrammarParser.OprelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#opsuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpsuma(SmallBasicGrammarParser.OpsumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicGrammarParser#opmult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpmult(SmallBasicGrammarParser.OpmultContext ctx);
}