// Generated from D:/USER/Desktop/Documentos u/Septimo Semestre/Lenguajes/translator/SmallTranslator/grammar\SmallBasicGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SmallBasicGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ELSE=20, ID=21, TRUE=22, FALSE=23, TKN_TEXT=24, TKN_NUMBER=25, 
		TKN_PERIOD=26, TKN_GEQ=27, TKN_LEQ=28, TKN_EQUALS=29, TKN_COMMA=30, TKN_COLON=31, 
		TKN_LEFT_BRAC=32, TKN_RIGHT_BRAC=33, TKN_LEFT_PAREN=34, TKN_RIGHT_PAREN=35, 
		TKN_PLUS=36, TKN_MINUS=37, TKN_TIMES=38, TKN_DIV=39, TKN_DIFF=40, TKN_LESS=41, 
		TKN_GREATER=42, COMILL=43, WS=44;
	public static final int
		RULE_program = 0, RULE_sub = 1, RULE_subbody = 2, RULE_statement = 3, 
		RULE_identifiersentences = 4, RULE_identifier = 5, RULE_array = 6, RULE_characteristic = 7, 
		RULE_literal = 8, RULE_if_statement = 9, RULE_for_loop = 10, RULE_while_loop = 11, 
		RULE_step = 12, RULE_goto = 13, RULE_buildit = 14, RULE_buildit_words = 15, 
		RULE_argument_body = 16, RULE_expression = 17, RULE_expression_prima = 18, 
		RULE_expressionbool = 19, RULE_bool_prima = 20, RULE_expressionrel = 21, 
		RULE_relprima = 22, RULE_e = 23, RULE_e_prima = 24, RULE_t = 25, RULE_t_prima = 26, 
		RULE_oprel = 27, RULE_opsuma = 28, RULE_opmult = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sub", "subbody", "statement", "identifiersentences", "identifier", 
			"array", "characteristic", "literal", "if_statement", "for_loop", "while_loop", 
			"step", "goto", "buildit", "buildit_words", "argument_body", "expression", 
			"expression_prima", "expressionbool", "bool_prima", "expressionrel", 
			"relprima", "e", "e_prima", "t", "t_prima", "oprel", "opsuma", "opmult"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sub'", "'EndSub'", "'If'", "'Then'", "'ElseIf'", "'EndIf'", "'For'", 
			"'To'", "'EndFor'", "'While'", "'EndWhile'", "'Step'", "'Goto'", "'Program'", 
			"'Stack'", "'Array'", "'TextWindow'", "'Or'", "'And'", "'Else'", null, 
			"'\"True\"'", "'\"False\"'", null, null, "'.'", "'>='", "'<='", "'='", 
			"','", "':'", "'['", "']'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'<>'", "'<'", "'>'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ELSE", "ID", "TRUE", 
			"FALSE", "TKN_TEXT", "TKN_NUMBER", "TKN_PERIOD", "TKN_GEQ", "TKN_LEQ", 
			"TKN_EQUALS", "TKN_COMMA", "TKN_COLON", "TKN_LEFT_BRAC", "TKN_RIGHT_BRAC", 
			"TKN_LEFT_PAREN", "TKN_RIGHT_PAREN", "TKN_PLUS", "TKN_MINUS", "TKN_TIMES", 
			"TKN_DIV", "TKN_DIFF", "TKN_LESS", "TKN_GREATER", "COMILL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SmallBasicGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmallBasicGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352266L) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__6:
				case T__9:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case ID:
					{
					setState(60);
					statement();
					}
					break;
				case T__0:
					{
					setState(61);
					sub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicGrammarParser.ID, 0); }
		public SubbodyContext subbody() {
			return getRuleContext(SubbodyContext.class,0);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(68);
			match(ID);
			setState(69);
			subbody();
			setState(70);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SubbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterSubbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitSubbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitSubbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubbodyContext subbody() throws RecognitionException {
		SubbodyContext _localctx = new SubbodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public BuilditContext buildit() {
			return getRuleContext(BuilditContext.class,0);
		}
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public IdentifiersentencesContext identifiersentences() {
			return getRuleContext(IdentifiersentencesContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				while_loop();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				for_loop();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				buildit();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				goto_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				identifiersentences();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiersentencesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CharacteristicContext characteristic() {
			return getRuleContext(CharacteristicContext.class,0);
		}
		public IdentifiersentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiersentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterIdentifiersentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitIdentifiersentences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitIdentifiersentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersentencesContext identifiersentences() throws RecognitionException {
		IdentifiersentencesContext _localctx = new IdentifiersentencesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifiersentences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			identifier();
			setState(87);
			characteristic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicGrammarParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_LEFT_BRAC) {
				{
				setState(90);
				array();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> TKN_LEFT_BRAC() { return getTokens(SmallBasicGrammarParser.TKN_LEFT_BRAC); }
		public TerminalNode TKN_LEFT_BRAC(int i) {
			return getToken(SmallBasicGrammarParser.TKN_LEFT_BRAC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TKN_RIGHT_BRAC() { return getTokens(SmallBasicGrammarParser.TKN_RIGHT_BRAC); }
		public TerminalNode TKN_RIGHT_BRAC(int i) {
			return getToken(SmallBasicGrammarParser.TKN_RIGHT_BRAC, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(TKN_LEFT_BRAC);
				setState(94);
				expression();
				setState(95);
				match(TKN_RIGHT_BRAC);
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TKN_LEFT_BRAC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacteristicContext extends ParserRuleContext {
		public TerminalNode TKN_COLON() { return getToken(SmallBasicGrammarParser.TKN_COLON, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_LEFT_PAREN, 0); }
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_RIGHT_PAREN, 0); }
		public TerminalNode TKN_EQUALS() { return getToken(SmallBasicGrammarParser.TKN_EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacteristicContext characteristic() throws RecognitionException {
		CharacteristicContext _localctx = new CharacteristicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characteristic);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(TKN_COLON);
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(TKN_LEFT_PAREN);
				setState(103);
				match(TKN_RIGHT_PAREN);
				}
				break;
			case TKN_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(TKN_EQUALS);
				setState(105);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TKN_NUMBER() { return getToken(SmallBasicGrammarParser.TKN_NUMBER, 0); }
		public TerminalNode TKN_TEXT() { return getToken(SmallBasicGrammarParser.TKN_TEXT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(SmallBasicGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SmallBasicGrammarParser.FALSE, 0); }
		public BuilditContext buildit() {
			return getRuleContext(BuilditContext.class,0);
		}
		public TerminalNode TKN_LEFT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_RIGHT_PAREN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(TKN_NUMBER);
				}
				break;
			case TKN_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(TKN_TEXT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				identifier();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(FALSE);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				buildit();
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				match(TKN_LEFT_PAREN);
				setState(115);
				expression();
				setState(116);
				match(TKN_RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> TKN_LEFT_PAREN() { return getTokens(SmallBasicGrammarParser.TKN_LEFT_PAREN); }
		public TerminalNode TKN_LEFT_PAREN(int i) {
			return getToken(SmallBasicGrammarParser.TKN_LEFT_PAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TKN_RIGHT_PAREN() { return getTokens(SmallBasicGrammarParser.TKN_RIGHT_PAREN); }
		public TerminalNode TKN_RIGHT_PAREN(int i) {
			return getToken(SmallBasicGrammarParser.TKN_RIGHT_PAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SmallBasicGrammarParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__2);
			setState(121);
			match(TKN_LEFT_PAREN);
			setState(122);
			expression();
			setState(123);
			match(TKN_RIGHT_PAREN);
			setState(124);
			match(T__3);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(131);
				match(T__4);
				setState(132);
				match(TKN_LEFT_PAREN);
				setState(133);
				expression();
				setState(134);
				match(TKN_RIGHT_PAREN);
				setState(135);
				match(T__3);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
					{
					{
					setState(136);
					statement();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(147);
				match(ELSE);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
					{
					{
					setState(148);
					statement();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(156);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public IdentifiersentencesContext identifiersentences() {
			return getRuleContext(IdentifiersentencesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__6);
			setState(159);
			identifiersentences();
			setState(160);
			match(T__7);
			setState(161);
			expression();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(162);
				step();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_RIGHT_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__9);
			setState(174);
			match(TKN_LEFT_PAREN);
			setState(175);
			expression();
			setState(176);
			match(TKN_RIGHT_PAREN);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352264L) != 0)) {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__11);
			setState(186);
			e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallBasicGrammarParser.ID, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__12);
			setState(189);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuilditContext extends ParserRuleContext {
		public Buildit_wordsContext buildit_words() {
			return getRuleContext(Buildit_wordsContext.class,0);
		}
		public TerminalNode TKN_PERIOD() { return getToken(SmallBasicGrammarParser.TKN_PERIOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TKN_LEFT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_LEFT_PAREN, 0); }
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(SmallBasicGrammarParser.TKN_RIGHT_PAREN, 0); }
		public List<Argument_bodyContext> argument_body() {
			return getRuleContexts(Argument_bodyContext.class);
		}
		public Argument_bodyContext argument_body(int i) {
			return getRuleContext(Argument_bodyContext.class,i);
		}
		public List<TerminalNode> TKN_COMMA() { return getTokens(SmallBasicGrammarParser.TKN_COMMA); }
		public TerminalNode TKN_COMMA(int i) {
			return getToken(SmallBasicGrammarParser.TKN_COMMA, i);
		}
		public BuilditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterBuildit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitBuildit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitBuildit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuilditContext buildit() throws RecognitionException {
		BuilditContext _localctx = new BuilditContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_buildit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			buildit_words();
			setState(192);
			match(TKN_PERIOD);
			setState(193);
			identifier();
			setState(194);
			match(TKN_LEFT_PAREN);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(195);
				argument_body();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_COMMA) {
					{
					{
					setState(196);
					match(TKN_COMMA);
					setState(197);
					argument_body();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(205);
			match(TKN_RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Buildit_wordsContext extends ParserRuleContext {
		public Buildit_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildit_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterBuildit_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitBuildit_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitBuildit_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Buildit_wordsContext buildit_words() throws RecognitionException {
		Buildit_wordsContext _localctx = new Buildit_wordsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_buildit_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterArgument_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitArgument_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitArgument_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_bodyContext argument_body() throws RecognitionException {
		Argument_bodyContext _localctx = new Argument_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 154684080128L) != 0)) {
				{
				setState(209);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionboolContext expressionbool() {
			return getRuleContext(ExpressionboolContext.class,0);
		}
		public Expression_primaContext expression_prima() {
			return getRuleContext(Expression_primaContext.class,0);
		}
		public TerminalNode TKN_MINUS() { return getToken(SmallBasicGrammarParser.TKN_MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case ID:
			case TRUE:
			case FALSE:
			case TKN_TEXT:
			case TKN_NUMBER:
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				expressionbool();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(213);
					expression_prima();
					}
				}

				}
				break;
			case TKN_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(TKN_MINUS);
				setState(217);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_primaContext extends ParserRuleContext {
		public ExpressionboolContext expressionbool() {
			return getRuleContext(ExpressionboolContext.class,0);
		}
		public Expression_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterExpression_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitExpression_prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitExpression_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_primaContext expression_prima() throws RecognitionException {
		Expression_primaContext _localctx = new Expression_primaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression_prima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__17);
			setState(221);
			expressionbool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionboolContext extends ParserRuleContext {
		public ExpressionrelContext expressionrel() {
			return getRuleContext(ExpressionrelContext.class,0);
		}
		public Bool_primaContext bool_prima() {
			return getRuleContext(Bool_primaContext.class,0);
		}
		public ExpressionboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterExpressionbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitExpressionbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitExpressionbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionboolContext expressionbool() throws RecognitionException {
		ExpressionboolContext _localctx = new ExpressionboolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionbool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expressionrel();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(224);
				bool_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_primaContext extends ParserRuleContext {
		public ExpressionrelContext expressionrel() {
			return getRuleContext(ExpressionrelContext.class,0);
		}
		public Bool_primaContext bool_prima() {
			return getRuleContext(Bool_primaContext.class,0);
		}
		public Bool_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterBool_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitBool_prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitBool_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_primaContext bool_prima() throws RecognitionException {
		Bool_primaContext _localctx = new Bool_primaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool_prima);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__18);
			setState(228);
			expressionrel();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(229);
				bool_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionrelContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public RelprimaContext relprima() {
			return getRuleContext(RelprimaContext.class,0);
		}
		public ExpressionrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionrel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterExpressionrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitExpressionrel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitExpressionrel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionrelContext expressionrel() throws RecognitionException {
		ExpressionrelContext _localctx = new ExpressionrelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionrel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			e();
			setState(233);
			relprima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelprimaContext extends ParserRuleContext {
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public RelprimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relprima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterRelprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitRelprima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitRelprima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelprimaContext relprima() throws RecognitionException {
		RelprimaContext _localctx = new RelprimaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relprima);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_GEQ:
			case TKN_LEQ:
			case TKN_EQUALS:
			case TKN_DIFF:
			case TKN_LESS:
			case TKN_GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				oprel();
				setState(236);
				e();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case ELSE:
			case ID:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E_primaContext e_prima() {
			return getRuleContext(E_primaContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			t();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				setState(242);
				e_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E_primaContext extends ParserRuleContext {
		public OpsumaContext opsuma() {
			return getRuleContext(OpsumaContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E_primaContext e_prima() {
			return getRuleContext(E_primaContext.class,0);
		}
		public E_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterE_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitE_prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitE_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_primaContext e_prima() throws RecognitionException {
		E_primaContext _localctx = new E_primaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_e_prima);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			opsuma();
			setState(246);
			t();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				setState(247);
				e_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public T_primaContext t_prima() {
			return getRuleContext(T_primaContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			literal();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_TIMES || _la==TKN_DIV) {
				{
				setState(251);
				t_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class T_primaContext extends ParserRuleContext {
		public OpmultContext opmult() {
			return getRuleContext(OpmultContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public T_primaContext t_prima() {
			return getRuleContext(T_primaContext.class,0);
		}
		public T_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterT_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitT_prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitT_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_primaContext t_prima() throws RecognitionException {
		T_primaContext _localctx = new T_primaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_t_prima);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			opmult();
			setState(255);
			literal();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_TIMES || _la==TKN_DIV) {
				{
				setState(256);
				t_prima();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OprelContext extends ParserRuleContext {
		public TerminalNode TKN_GREATER() { return getToken(SmallBasicGrammarParser.TKN_GREATER, 0); }
		public TerminalNode TKN_LESS() { return getToken(SmallBasicGrammarParser.TKN_LESS, 0); }
		public TerminalNode TKN_LEQ() { return getToken(SmallBasicGrammarParser.TKN_LEQ, 0); }
		public TerminalNode TKN_GEQ() { return getToken(SmallBasicGrammarParser.TKN_GEQ, 0); }
		public TerminalNode TKN_EQUALS() { return getToken(SmallBasicGrammarParser.TKN_EQUALS, 0); }
		public TerminalNode TKN_DIFF() { return getToken(SmallBasicGrammarParser.TKN_DIFF, 0); }
		public OprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterOprel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitOprel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitOprel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelContext oprel() throws RecognitionException {
		OprelContext _localctx = new OprelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oprel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7697520918528L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpsumaContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(SmallBasicGrammarParser.TKN_PLUS, 0); }
		public TerminalNode TKN_MINUS() { return getToken(SmallBasicGrammarParser.TKN_MINUS, 0); }
		public OpsumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opsuma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterOpsuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitOpsuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitOpsuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsumaContext opsuma() throws RecognitionException {
		OpsumaContext _localctx = new OpsumaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opsuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==TKN_PLUS || _la==TKN_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpmultContext extends ParserRuleContext {
		public TerminalNode TKN_TIMES() { return getToken(SmallBasicGrammarParser.TKN_TIMES, 0); }
		public TerminalNode TKN_DIV() { return getToken(SmallBasicGrammarParser.TKN_DIV, 0); }
		public OpmultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opmult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterOpmult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitOpmult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitOpmult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpmultContext opmult() throws RecognitionException {
		OpmultContext _localctx = new OpmultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opmult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==TKN_TIMES || _la==TKN_DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002J\b\u0002"+
		"\n\u0002\f\u0002M\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006b\b\u0006\u000b\u0006"+
		"\f\u0006c\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007k\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u007f\b\t\n\t\f\t\u0082\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t"+
		"\u0005\t\u008f\b\t\n\t\f\t\u0092\t\t\u0001\t\u0001\t\u0005\t\u0096\b\t"+
		"\n\t\f\t\u0099\t\t\u0003\t\u009b\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00a4\b\n\u0001\n\u0005\n\u00a7\b\n\n\n\f\n"+
		"\u00aa\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00c7\b\u000e\n\u000e\f\u000e\u00ca\t\u000e\u0003\u000e"+
		"\u00cc\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0003\u0010\u00d3\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d7\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00db\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00e2\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e7\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00f0\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00f4\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00f9\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u00fd\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0102\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:\u0000\u0004\u0001\u0000\u000e\u0011\u0002\u0000\u001b\u001d"+
		"(*\u0001\u0000$%\u0001\u0000&\'\u0111\u0000@\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006T\u0001"+
		"\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000"+
		"\fa\u0001\u0000\u0000\u0000\u000ej\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000"+
		"\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000"+
		"\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000"+
		"\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000"+
		"\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00dc\u0001\u0000\u0000\u0000"+
		"&\u00df\u0001\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000\u0000*\u00e8"+
		"\u0001\u0000\u0000\u0000,\u00ef\u0001\u0000\u0000\u0000.\u00f1\u0001\u0000"+
		"\u0000\u00000\u00f5\u0001\u0000\u0000\u00002\u00fa\u0001\u0000\u0000\u0000"+
		"4\u00fe\u0001\u0000\u0000\u00006\u0103\u0001\u0000\u0000\u00008\u0105"+
		"\u0001\u0000\u0000\u0000:\u0107\u0001\u0000\u0000\u0000<?\u0003\u0006"+
		"\u0003\u0000=?\u0003\u0002\u0001\u0000><\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u0001\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0005\u0015\u0000\u0000EF\u0003"+
		"\u0004\u0002\u0000FG\u0005\u0002\u0000\u0000G\u0003\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0006\u0003\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0005"+
		"\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NU\u0003\u0012\t\u0000"+
		"OU\u0003\u0016\u000b\u0000PU\u0003\u0014\n\u0000QU\u0003\u001c\u000e\u0000"+
		"RU\u0003\u001a\r\u0000SU\u0003\b\u0004\u0000TN\u0001\u0000\u0000\u0000"+
		"TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0007\u0001"+
		"\u0000\u0000\u0000VW\u0003\n\u0005\u0000WX\u0003\u000e\u0007\u0000X\t"+
		"\u0001\u0000\u0000\u0000Y[\u0005\u0015\u0000\u0000Z\\\u0003\f\u0006\u0000"+
		"[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000b\u0001\u0000"+
		"\u0000\u0000]^\u0005 \u0000\u0000^_\u0003\"\u0011\u0000_`\u0005!\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\r\u0001"+
		"\u0000\u0000\u0000ek\u0005\u001f\u0000\u0000fg\u0005\"\u0000\u0000gk\u0005"+
		"#\u0000\u0000hi\u0005\u001d\u0000\u0000ik\u0003\"\u0011\u0000je\u0001"+
		"\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"k\u000f\u0001\u0000\u0000\u0000lw\u0005\u0019\u0000\u0000mw\u0005\u0018"+
		"\u0000\u0000nw\u0003\n\u0005\u0000ow\u0005\u0016\u0000\u0000pw\u0005\u0017"+
		"\u0000\u0000qw\u0003\u001c\u000e\u0000rs\u0005\"\u0000\u0000st\u0003\""+
		"\u0011\u0000tu\u0005#\u0000\u0000uw\u0001\u0000\u0000\u0000vl\u0001\u0000"+
		"\u0000\u0000vm\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vo\u0001"+
		"\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000"+
		"vr\u0001\u0000\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xy\u0005\u0003"+
		"\u0000\u0000yz\u0005\"\u0000\u0000z{\u0003\"\u0011\u0000{|\u0005#\u0000"+
		"\u0000|\u0080\u0005\u0004\u0000\u0000}\u007f\u0003\u0006\u0003\u0000~"+
		"}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0090\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\u0005\u0000\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085\u0086\u0003\""+
		"\u0011\u0000\u0086\u0087\u0005#\u0000\u0000\u0087\u008b\u0005\u0004\u0000"+
		"\u0000\u0088\u008a\u0003\u0006\u0003\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0083\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u009a\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0097\u0005\u0014\u0000"+
		"\u0000\u0094\u0096\u0003\u0006\u0003\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u0013\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a0\u0003\b\u0004\u0000"+
		"\u00a0\u00a1\u0005\b\u0000\u0000\u00a1\u00a3\u0003\"\u0011\u0000\u00a2"+
		"\u00a4\u0003\u0018\f\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0003\u0006\u0003\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u0015\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005\n\u0000\u0000\u00ae\u00af\u0005\""+
		"\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000\u00b0\u00b4\u0005#\u0000"+
		"\u0000\u00b1\u00b3\u0003\u0006\u0003\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000b\u0000"+
		"\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\f\u0000\u0000"+
		"\u00ba\u00bb\u0003.\u0017\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\r\u0000\u0000\u00bd\u00be\u0005\u0015\u0000\u0000\u00be\u001b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u001e\u000f\u0000\u00c0\u00c1"+
		"\u0005\u001a\u0000\u0000\u00c1\u00c2\u0003\n\u0005\u0000\u00c2\u00cb\u0005"+
		"\"\u0000\u0000\u00c3\u00c8\u0003 \u0010\u0000\u00c4\u00c5\u0005\u001e"+
		"\u0000\u0000\u00c5\u00c7\u0003 \u0010\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005#\u0000\u0000\u00ce\u001d\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0007\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0003\"\u0011\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0003&\u0013\u0000\u00d5\u00d7\u0003$\u0012\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00db\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005%\u0000\u0000\u00d9\u00db\u0003\"\u0011"+
		"\u0000\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0012\u0000\u0000"+
		"\u00dd\u00de\u0003&\u0013\u0000\u00de%\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0003*\u0015\u0000\u00e0\u00e2\u0003(\u0014\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\'\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0013\u0000\u0000\u00e4\u00e6\u0003*\u0015\u0000"+
		"\u00e5\u00e7\u0003(\u0014\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7)\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0003.\u0017\u0000\u00e9\u00ea\u0003,\u0016\u0000\u00ea+\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u00036\u001b\u0000\u00ec\u00ed\u0003.\u0017\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0-\u0001\u0000\u0000\u0000\u00f1\u00f3\u00032\u0019\u0000\u00f2\u00f4"+
		"\u00030\u0018\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4/\u0001\u0000\u0000\u0000\u00f5\u00f6\u00038\u001c"+
		"\u0000\u00f6\u00f8\u00032\u0019\u0000\u00f7\u00f9\u00030\u0018\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"1\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0010\b\u0000\u00fb\u00fd"+
		"\u00034\u001a\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd3\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003:\u001d"+
		"\u0000\u00ff\u0101\u0003\u0010\b\u0000\u0100\u0102\u00034\u001a\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u01025\u0001\u0000\u0000\u0000\u0103\u0104\u0007\u0001\u0000\u0000\u0104"+
		"7\u0001\u0000\u0000\u0000\u0105\u0106\u0007\u0002\u0000\u0000\u01069\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0007\u0003\u0000\u0000\u0108;\u0001\u0000"+
		"\u0000\u0000\u001c>@KT[cjv\u0080\u008b\u0090\u0097\u009a\u00a3\u00a8\u00b4"+
		"\u00c8\u00cb\u00d2\u00d6\u00da\u00e1\u00e6\u00ef\u00f3\u00f8\u00fc\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}