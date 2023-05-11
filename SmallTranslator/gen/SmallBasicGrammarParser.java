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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, OPLOG=29, OPREL=30, OPSUM=31, 
		OPMULT=32, PROGRAM=33, STACK=34, ARRAY=35, TXTWINDOW=36, ID=37, TRUE=38, 
		FALSE=39, TKN_TEXT=40, TKN_NUMBER=41, T=42, R=43, U=44, E=45, F=46, A=47, 
		L=48, S=49, COMMENTS=50, WS=51;
	public static final int
		RULE_program = 0, RULE_sub = 1, RULE_statement = 2, RULE_identifiersentences = 3, 
		RULE_identifier = 4, RULE_array = 5, RULE_characteristic = 6, RULE_literal = 7, 
		RULE_if_statement = 8, RULE_for_loop = 9, RULE_while_loop = 10, RULE_goto = 11, 
		RULE_buildit = 12, RULE_buildit_words = 13, RULE_expression = 14, RULE_expressionbool = 15, 
		RULE_expressionrel = 16, RULE_e = 17, RULE_t = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sub", "statement", "identifiersentences", "identifier", "array", 
			"characteristic", "literal", "if_statement", "for_loop", "while_loop", 
			"goto", "buildit", "buildit_words", "expression", "expressionbool", "expressionrel", 
			"e", "t"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sub'", "'EndSub'", "'['", "']'", "':'", "'('", "')'", "'='", 
			"'-'", "'If'", "'Then'", "'ElseIf'", "'Else'", "'EndIf'", "'For'", "'To'", 
			"'Step'", "'EndFor'", "'While'", "'EndWhile'", "'Goto'", "','", "'Program'", 
			"'.'", "'Stack'", "'Array'", "'TextWindow'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "OPLOG", "OPREL", "OPSUM", "OPMULT", "PROGRAM", 
			"STACK", "ARRAY", "TXTWINDOW", "ID", "TRUE", "FALSE", "TKN_TEXT", "TKN_NUMBER", 
			"T", "R", "U", "E", "F", "A", "L", "S", "COMMENTS", "WS"
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878338L) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
				case T__14:
				case T__18:
				case T__20:
				case T__22:
				case T__24:
				case T__25:
				case T__26:
				case ID:
					{
					setState(38);
					statement();
					}
					break;
				case T__0:
					{
					setState(39);
					sub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				if_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				while_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				for_loop();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				buildit();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				goto_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
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
		enterRule(_localctx, 6, RULE_identifiersentences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			identifier();
			setState(64);
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
		enterRule(_localctx, 8, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(67);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 10, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				match(T__2);
				setState(71);
				expression();
				setState(72);
				match(T__3);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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
		enterRule(_localctx, 12, RULE_characteristic);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__5);
				setState(80);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__7);
				setState(82);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_literal);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(85);
					match(T__8);
					}
				}

				setState(88);
				match(TKN_NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(TKN_TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(90);
					match(T__8);
					}
				}

				setState(93);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(96);
					match(T__8);
					}
				}

				setState(99);
				buildit();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(100);
					match(T__8);
					}
				}

				setState(103);
				match(T__5);
				setState(104);
				expression();
				setState(105);
				match(T__6);
				}
				break;
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__9);
			setState(110);
			match(T__5);
			setState(111);
			expression();
			setState(112);
			match(T__6);
			setState(113);
			match(T__10);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
				{
				{
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(120);
				match(T__11);
				setState(121);
				match(T__5);
				setState(122);
				expression();
				setState(123);
				match(T__6);
				setState(124);
				match(T__10);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
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
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(136);
				match(T__12);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
					{
					{
					setState(137);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
			match(T__13);
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
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
		enterRule(_localctx, 18, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__14);
			setState(148);
			identifiersentences();
			setState(149);
			match(T__15);
			setState(150);
			expression();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(151);
				match(T__16);
				setState(152);
				e();
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(T__17);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__18);
			setState(164);
			match(T__5);
			setState(165);
			expression();
			setState(166);
			match(T__6);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137684878336L) != 0)) {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__19);
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
		enterRule(_localctx, 22, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__20);
			setState(176);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 24, RULE_buildit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			buildit_words();
			setState(179);
			match(T__5);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260850827840L) != 0)) {
				{
				setState(180);
				expression();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(183);
				match(T__21);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260850827840L) != 0)) {
					{
					setState(184);
					expression();
					}
				}

				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__6);
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
		public TerminalNode PROGRAM() { return getToken(SmallBasicGrammarParser.PROGRAM, 0); }
		public TerminalNode STACK() { return getToken(SmallBasicGrammarParser.STACK, 0); }
		public TerminalNode ARRAY() { return getToken(SmallBasicGrammarParser.ARRAY, 0); }
		public TerminalNode TXTWINDOW() { return getToken(SmallBasicGrammarParser.TXTWINDOW, 0); }
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
		enterRule(_localctx, 26, RULE_buildit_words);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__22);
				setState(195);
				match(T__23);
				setState(196);
				match(PROGRAM);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__24);
				setState(198);
				match(T__23);
				setState(199);
				match(STACK);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__25);
				setState(201);
				match(T__23);
				setState(202);
				match(ARRAY);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(T__26);
				setState(204);
				match(T__23);
				setState(205);
				match(TXTWINDOW);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionboolContext expressionbool() {
			return getRuleContext(ExpressionboolContext.class,0);
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		public List<TerminalNode> OPLOG() { return getTokens(SmallBasicGrammarParser.OPLOG); }
		public TerminalNode OPLOG(int i) {
			return getToken(SmallBasicGrammarParser.OPLOG, i);
		}
		public List<ExpressionboolContext> expressionbool() {
			return getRuleContexts(ExpressionboolContext.class);
		}
		public ExpressionboolContext expressionbool(int i) {
			return getRuleContext(ExpressionboolContext.class,i);
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
		enterRule(_localctx, 30, RULE_expressionbool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expressionrel();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					match(OPLOG);
					setState(212);
					expressionbool();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(SmallBasicGrammarParser.OPREL, 0); }
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
		enterRule(_localctx, 32, RULE_expressionrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			e();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPREL) {
				{
				setState(219);
				match(OPREL);
				setState(220);
				e();
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
	public static class EContext extends ParserRuleContext {
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
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
		enterRule(_localctx, 34, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			t();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__27) {
				{
				{
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				t();
				}
				}
				setState(230);
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
	public static class TContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> OPMULT() { return getTokens(SmallBasicGrammarParser.OPMULT); }
		public TerminalNode OPMULT(int i) {
			return getToken(SmallBasicGrammarParser.OPMULT, i);
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
		enterRule(_localctx, 36, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			literal();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMULT) {
				{
				{
				setState(232);
				match(OPMULT);
				setState(233);
				literal();
				}
				}
				setState(238);
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

	public static final String _serializedATN =
		"\u0004\u00013\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u0001"+
		"4\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004E\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005K\b\u0005"+
		"\u000b\u0005\f\u0005L\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0003\u0007W\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u007f\b\b\n\b\f\b\u0082\t\b\u0005\b\u0084\b\b\n\b\f\b\u0087"+
		"\t\b\u0001\b\u0001\b\u0005\b\u008b\b\b\n\b\f\b\u008e\t\b\u0003\b\u0090"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009a\b\t\u0001\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a9\b\n\n\n\f\n\u00ac"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b6\b\f\u0001\f\u0001\f\u0003\f\u00ba\b\f\u0005\f"+
		"\u00bc\b\f\n\f\f\f\u00bf\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00cf\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00d6\b\u000f\n\u000f\f\u000f\u00d9\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00de\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00e3\b\u0011\n\u0011\f\u0011\u00e6\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00eb\b\u0012\n\u0012\f\u0012\u00ee"+
		"\t\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0002"+
		"\u0000\t\t\u001c\u001c\u0104\u0000*\u0001\u0000\u0000\u0000\u0002-\u0001"+
		"\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000"+
		"\u0000\bB\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fS\u0001"+
		"\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000"+
		"\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000\u0000"+
		"\u0000\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000"+
		"\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000"+
		"\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00da\u0001\u0000\u0000\u0000"+
		"\"\u00df\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&)\u0003"+
		"\u0004\u0002\u0000\')\u0003\u0002\u0001\u0000(&\u0001\u0000\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+\u0001\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000.2\u0005%\u0000\u0000/1\u0003"+
		"\u0004\u0002\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u00006\u0003\u0001"+
		"\u0000\u0000\u00007>\u0003\u0010\b\u00008>\u0003\u0014\n\u00009>\u0003"+
		"\u0012\t\u0000:>\u0003\u0018\f\u0000;>\u0003\u0016\u000b\u0000<>\u0003"+
		"\u0006\u0003\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0003"+
		"\b\u0004\u0000@A\u0003\f\u0006\u0000A\u0007\u0001\u0000\u0000\u0000BD"+
		"\u0005%\u0000\u0000CE\u0003\n\u0005\u0000DC\u0001\u0000\u0000\u0000DE"+
		"\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0003\u001c\u000e\u0000HI\u0005\u0004\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000"+
		"\u0000NT\u0005\u0005\u0000\u0000OP\u0005\u0006\u0000\u0000PT\u0005\u0007"+
		"\u0000\u0000QR\u0005\b\u0000\u0000RT\u0003\u001c\u000e\u0000SN\u0001\u0000"+
		"\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000T\r\u0001"+
		"\u0000\u0000\u0000UW\u0005\t\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000Xl\u0005)\u0000\u0000Yl\u0005"+
		"(\u0000\u0000Z\\\u0005\t\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]l\u0003\b\u0004\u0000^l"+
		"\u0005&\u0000\u0000_l\u0005\'\u0000\u0000`b\u0005\t\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cl\u0003\u0018\f\u0000df\u0005\t\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0006\u0000"+
		"\u0000hi\u0003\u001c\u000e\u0000ij\u0005\u0007\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000kV\u0001\u0000\u0000\u0000kY\u0001\u0000\u0000\u0000k[\u0001"+
		"\u0000\u0000\u0000k^\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000"+
		"ka\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000l\u000f\u0001\u0000"+
		"\u0000\u0000mn\u0005\n\u0000\u0000no\u0005\u0006\u0000\u0000op\u0003\u001c"+
		"\u000e\u0000pq\u0005\u0007\u0000\u0000qu\u0005\u000b\u0000\u0000rt\u0003"+
		"\u0004\u0002\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0085\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\f\u0000\u0000yz\u0005\u0006"+
		"\u0000\u0000z{\u0003\u001c\u000e\u0000{|\u0005\u0007\u0000\u0000|\u0080"+
		"\u0005\u000b\u0000\u0000}\u007f\u0003\u0004\u0002\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083x\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u008f\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0005\r\u0000\u0000\u0089"+
		"\u008b\u0003\u0004\u0002\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u000e\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u000f\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095"+
		"\u0096\u0005\u0010\u0000\u0000\u0096\u0099\u0003\u001c\u000e\u0000\u0097"+
		"\u0098\u0005\u0011\u0000\u0000\u0098\u009a\u0003\"\u0011\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009e"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0004\u0002\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0012\u0000\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0013\u0000\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a6"+
		"\u0003\u001c\u000e\u0000\u00a6\u00aa\u0005\u0007\u0000\u0000\u00a7\u00a9"+
		"\u0003\u0004\u0002\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0014\u0000\u0000\u00ae\u0015"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0015\u0000\u0000\u00b0\u00b1"+
		"\u0005%\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\u001a\r\u0000\u00b3\u00b5\u0005\u0006\u0000\u0000\u00b4\u00b6\u0003\u001c"+
		"\u000e\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00bd\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0016"+
		"\u0000\u0000\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u0019\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0017\u0000\u0000\u00c3\u00c4\u0005\u0018"+
		"\u0000\u0000\u00c4\u00cf\u0005!\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7\u00cf\u0005\"\u0000\u0000"+
		"\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ca\u0005\u0018\u0000\u0000"+
		"\u00ca\u00cf\u0005#\u0000\u0000\u00cb\u00cc\u0005\u001b\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0018\u0000\u0000\u00cd\u00cf\u0005$\u0000\u0000\u00ce\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00ce\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00cf\u001b"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u001e\u000f\u0000\u00d1\u001d"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d7\u0003 \u0010\u0000\u00d3\u00d4\u0005"+
		"\u001d\u0000\u0000\u00d4\u00d6\u0003\u001e\u000f\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001f\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0003"+
		"\"\u0011\u0000\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u00de\u0003\""+
		"\u0011\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de!\u0001\u0000\u0000\u0000\u00df\u00e4\u0003$\u0012\u0000"+
		"\u00e0\u00e1\u0007\u0000\u0000\u0000\u00e1\u00e3\u0003$\u0012\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"#\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ec"+
		"\u0003\u000e\u0007\u0000\u00e8\u00e9\u0005 \u0000\u0000\u00e9\u00eb\u0003"+
		"\u000e\u0007\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u001c(*2=DLSV[aeku\u0080\u0085\u008c\u008f\u0099\u009e\u00aa"+
		"\u00b5\u00b9\u00bd\u00ce\u00d7\u00dd\u00e4\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}