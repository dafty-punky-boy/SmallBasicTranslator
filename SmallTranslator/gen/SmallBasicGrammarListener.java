
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallBasicGrammarParser}.
 */
public interface SmallBasicGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallBasicGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(SmallBasicGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(SmallBasicGrammarParser.InicioContext ctx);
}