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
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#programb}.
	 * @param ctx the parse tree
	 */
	void enterProgramb(SmallBasicGrammarParser.ProgrambContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#programb}.
	 * @param ctx the parse tree
	 */
	void exitProgramb(SmallBasicGrammarParser.ProgrambContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(SmallBasicGrammarParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(SmallBasicGrammarParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#arrayb}.
	 * @param ctx the parse tree
	 */
	void enterArrayb(SmallBasicGrammarParser.ArraybContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#arrayb}.
	 * @param ctx the parse tree
	 */
	void exitArrayb(SmallBasicGrammarParser.ArraybContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#txtwindow}.
	 * @param ctx the parse tree
	 */
	void enterTxtwindow(SmallBasicGrammarParser.TxtwindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#txtwindow}.
	 * @param ctx the parse tree
	 */
	void exitTxtwindow(SmallBasicGrammarParser.TxtwindowContext ctx);
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
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(SmallBasicGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(SmallBasicGrammarParser.TContext ctx);
}