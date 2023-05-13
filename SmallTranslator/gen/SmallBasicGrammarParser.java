// Generated from C:/Users/dq1005la/IdeaProjects/SmallBasicTranslator/SmallTranslator/grammar\SmallBasicGrammar.g4 by ANTLR 4.12.0
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
		T__17=18, T__18=19, T__19=20, T__20=21, BUILDIT=22, OPLOG=23, TKN_LESS=24, 
		TKN_GRE=25, TKN_EQGRE=26, TKN_EQLESS=27, TKN_EQ=28, TKN_DIFF=29, OPSUM=30, 
		OPMULT=31, TKN_Else=32, TKN_ElseIf=33, ID=34, TRUE=35, FALSE=36, TKN_TEXT=37, 
		TKN_NUMBER=38, T=39, R=40, U=41, E=42, F=43, A=44, L=45, S=46, COMMENTS=47, 
		WS=48;
	public static final int
		RULE_program = 0, RULE_sub = 1, RULE_statement = 2, RULE_identifiersentences = 3, 
		RULE_identifier = 4, RULE_array = 5, RULE_characteristic = 6, RULE_literal = 7, 
		RULE_if_statement = 8, RULE_for_loop = 9, RULE_while_loop = 10, RULE_goto = 11, 
		RULE_buildit = 12, RULE_buildit_words = 13, RULE_expression = 14, RULE_expressionbool = 15, 
		RULE_expressionrel = 16, RULE_e = 17, RULE_t = 18, RULE_oprel = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sub", "statement", "identifiersentences", "identifier", "array", 
			"characteristic", "literal", "if_statement", "for_loop", "while_loop", 
			"goto", "buildit", "buildit_words", "expression", "expressionbool", "expressionrel", 
			"e", "t", "oprel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sub'", "'EndSub'", "'['", "']'", "':'", "'('", "')'", "'-'", 
			"'If'", "'Then'", "'EndIf'", "'For'", "'To'", "'Step'", "'EndFor'", "'While'", 
			"'EndWhile'", "'Goto'", "'.'", "','", "'+'", null, null, "'>'", "'<'", 
			"'<='", "'>='", "'='", "'<>'", null, null, "'Else'", "'ElseIf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BUILDIT", 
			"OPLOG", "TKN_LESS", "TKN_GRE", "TKN_EQGRE", "TKN_EQLESS", "TKN_EQ", 
			"TKN_DIFF", "OPSUM", "OPMULT", "TKN_Else", "TKN_ElseIf", "ID", "TRUE", 
			"FALSE", "TKN_TEXT", "TKN_NUMBER", "T", "R", "U", "E", "F", "A", "L", 
			"S", "COMMENTS", "WS"
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395778L) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
				case T__15:
				case T__17:
				case BUILDIT:
				case ID:
					{
					setState(40);
					statement();
					}
					break;
				case T__0:
					{
					setState(41);
					sub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
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
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				if_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				while_loop();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				for_loop();
				}
				break;
			case BUILDIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				buildit();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				goto_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
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
			setState(65);
			identifier();
			setState(66);
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
			setState(68);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(69);
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
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__2);
				setState(73);
				expression();
				setState(74);
				match(T__3);
				}
				}
				setState(78); 
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
		public TerminalNode TKN_EQ() { return getToken(SmallBasicGrammarParser.TKN_EQ, 0); }
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__5);
				setState(82);
				match(T__6);
				}
				break;
			case TKN_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(TKN_EQ);
				setState(84);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(87);
					match(T__7);
					}
				}

				setState(90);
				match(TKN_NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(TKN_TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(92);
					match(T__7);
					}
				}

				setState(95);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(98);
					match(T__7);
					}
				}

				setState(101);
				buildit();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(102);
					match(T__7);
					}
				}

				setState(105);
				match(T__5);
				setState(106);
				expression();
				setState(107);
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
		public List<TerminalNode> TKN_ElseIf() { return getTokens(SmallBasicGrammarParser.TKN_ElseIf); }
		public TerminalNode TKN_ElseIf(int i) {
			return getToken(SmallBasicGrammarParser.TKN_ElseIf, i);
		}
		public TerminalNode TKN_Else() { return getToken(SmallBasicGrammarParser.TKN_Else, 0); }
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
			setState(111);
			match(T__8);
			setState(112);
			match(T__5);
			setState(113);
			expression();
			setState(114);
			match(T__6);
			setState(115);
			match(T__9);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_ElseIf) {
				{
				{
				setState(122);
				match(TKN_ElseIf);
				setState(123);
				match(T__5);
				setState(124);
				expression();
				setState(125);
				match(T__6);
				setState(126);
				match(T__9);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
					{
					{
					setState(127);
					statement();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_Else) {
				{
				setState(138);
				match(TKN_Else);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
					{
					{
					setState(139);
					statement();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(147);
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
			setState(149);
			match(T__11);
			setState(150);
			identifiersentences();
			setState(151);
			match(T__12);
			setState(152);
			expression();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(153);
				match(T__13);
				setState(154);
				e();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__14);
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
			setState(165);
			match(T__15);
			setState(166);
			match(T__5);
			setState(167);
			expression();
			setState(168);
			match(T__6);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17184395776L) != 0)) {
				{
				{
				setState(169);
				statement();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__16);
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
			setState(177);
			match(T__17);
			setState(178);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(180);
			buildit_words();
			setState(181);
			match(T__18);
			setState(182);
			identifier();
			setState(183);
			match(T__5);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532580139328L) != 0)) {
				{
				setState(184);
				expression();
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(187);
				match(T__19);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532580139328L) != 0)) {
					{
					setState(188);
					expression();
					}
				}

				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
		public TerminalNode BUILDIT() { return getToken(SmallBasicGrammarParser.BUILDIT, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BUILDIT);
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
			setState(200);
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
			setState(202);
			expressionrel();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(OPLOG);
					setState(204);
					expressionbool();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
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
		enterRule(_localctx, 32, RULE_expressionrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			e();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				setState(211);
				oprel();
				setState(212);
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
			setState(216);
			t();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__20) {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				t();
				}
				}
				setState(223);
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
			setState(224);
			literal();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMULT) {
				{
				{
				setState(225);
				match(OPMULT);
				setState(226);
				literal();
				}
				}
				setState(231);
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
	public static class OprelContext extends ParserRuleContext {
		public TerminalNode TKN_LESS() { return getToken(SmallBasicGrammarParser.TKN_LESS, 0); }
		public TerminalNode TKN_GRE() { return getToken(SmallBasicGrammarParser.TKN_GRE, 0); }
		public TerminalNode TKN_EQGRE() { return getToken(SmallBasicGrammarParser.TKN_EQGRE, 0); }
		public TerminalNode TKN_EQLESS() { return getToken(SmallBasicGrammarParser.TKN_EQLESS, 0); }
		public TerminalNode TKN_EQ() { return getToken(SmallBasicGrammarParser.TKN_EQ, 0); }
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
		enterRule(_localctx, 38, RULE_oprel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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
		"\u0004\u00010\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"3\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005M\b\u0005\u000b\u0005\f\u0005N\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0007\u0003"+
		"\u0007Y\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\bv\b\b\n\b\f\by\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0081\b\b\n\b\f\b\u0084\t\b\u0005\b"+
		"\u0086\b\b\n\b\f\b\u0089\t\b\u0001\b\u0001\b\u0005\b\u008d\b\b\n\b\f\b"+
		"\u0090\t\b\u0003\b\u0092\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u009c\b\t\u0001\t\u0005\t\u009f\b\t\n\t\f\t"+
		"\u00a2\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00ab\b\n\n\n\f\n\u00ae\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ba\b\f"+
		"\u0001\f\u0001\f\u0003\f\u00be\b\f\u0005\f\u00c0\b\f\n\f\f\f\u00c3\t\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00ce\b\u000f\n\u000f\f\u000f\u00d1\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d7\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00dc\b\u0011\n\u0011"+
		"\f\u0011\u00df\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00e4\b\u0012\n\u0012\f\u0012\u00e7\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0002\u0002\u0000\b\b"+
		"\u0015\u0015\u0001\u0000\u0018\u001d\u00fb\u0000,\u0001\u0000\u0000\u0000"+
		"\u0002/\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006A"+
		"\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fU\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010"+
		"o\u0001\u0000\u0000\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u00a5"+
		"\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000\u0018\u00b4"+
		"\u0001\u0000\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000\u001c\u00c8"+
		"\u0001\u0000\u0000\u0000\u001e\u00ca\u0001\u0000\u0000\u0000 \u00d2\u0001"+
		"\u0000\u0000\u0000\"\u00d8\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000"+
		"\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(+\u0003\u0004\u0002\u0000"+
		")+\u0003\u0002\u0001\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-\u0001\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0001\u0000\u000004\u0005\"\u0000\u000013\u0003\u0004\u0002\u0000"+
		"21\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000078\u0005\u0002\u0000\u00008\u0003\u0001\u0000\u0000\u0000"+
		"9@\u0003\u0010\b\u0000:@\u0003\u0014\n\u0000;@\u0003\u0012\t\u0000<@\u0003"+
		"\u0018\f\u0000=@\u0003\u0016\u000b\u0000>@\u0003\u0006\u0003\u0000?9\u0001"+
		"\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000"+
		"?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0003\b\u0004\u0000BC\u0003\f"+
		"\u0006\u0000C\u0007\u0001\u0000\u0000\u0000DF\u0005\"\u0000\u0000EG\u0003"+
		"\n\u0005\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\t"+
		"\u0001\u0000\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0003\u001c\u000e"+
		"\u0000JK\u0005\u0004\u0000\u0000KM\u0001\u0000\u0000\u0000LH\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PV\u0005\u0005\u0000"+
		"\u0000QR\u0005\u0006\u0000\u0000RV\u0005\u0007\u0000\u0000ST\u0005\u001c"+
		"\u0000\u0000TV\u0003\u001c\u000e\u0000UP\u0001\u0000\u0000\u0000UQ\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000"+
		"WY\u0005\b\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Zn\u0005&\u0000\u0000[n\u0005%\u0000\u0000\\"+
		"^\u0005\b\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_n\u0003\b\u0004\u0000`n\u0005#\u0000\u0000"+
		"an\u0005$\u0000\u0000bd\u0005\b\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000en\u0003\u0018\f\u0000"+
		"fh\u0005\b\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0005\u0006\u0000\u0000jk\u0003\u001c\u000e"+
		"\u0000kl\u0005\u0007\u0000\u0000ln\u0001\u0000\u0000\u0000mX\u0001\u0000"+
		"\u0000\u0000m[\u0001\u0000\u0000\u0000m]\u0001\u0000\u0000\u0000m`\u0001"+
		"\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000mc\u0001\u0000\u0000\u0000"+
		"mg\u0001\u0000\u0000\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005\t\u0000"+
		"\u0000pq\u0005\u0006\u0000\u0000qr\u0003\u001c\u000e\u0000rs\u0005\u0007"+
		"\u0000\u0000sw\u0005\n\u0000\u0000tv\u0003\u0004\u0002\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u0087\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0005!\u0000\u0000{|\u0005\u0006\u0000\u0000|}\u0003\u001c\u000e"+
		"\u0000}~\u0005\u0007\u0000\u0000~\u0082\u0005\n\u0000\u0000\u007f\u0081"+
		"\u0003\u0004\u0002\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085z\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0091\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008e\u0005 \u0000\u0000\u008b\u008d\u0003\u0004"+
		"\u0002\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u000b"+
		"\u0000\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095\u0096\u0005\f\u0000"+
		"\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u0098\u0005\r\u0000\u0000"+
		"\u0098\u009b\u0003\u001c\u000e\u0000\u0099\u009a\u0005\u000e\u0000\u0000"+
		"\u009a\u009c\u0003\"\u0011\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\u0003\u0004\u0002\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000f\u0000\u0000\u00a4"+
		"\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8"+
		"\u00ac\u0005\u0007\u0000\u0000\u00a9\u00ab\u0003\u0004\u0002\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\u0011\u0000\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0012\u0000\u0000\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\u0017"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5\u00b6\u0005"+
		"\u0013\u0000\u0000\u00b6\u00b7\u0003\b\u0004\u0000\u00b7\u00b9\u0005\u0006"+
		"\u0000\u0000\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bd\u0005\u0014\u0000\u0000\u00bc\u00be\u0003\u001c"+
		"\u000e\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0007"+
		"\u0000\u0000\u00c5\u0019\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0016"+
		"\u0000\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u001e"+
		"\u000f\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00cf\u0003 \u0010"+
		"\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00ce\u0003\u001e\u000f"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d6\u0003\"\u0011\u0000\u00d3\u00d4\u0003&\u0013\u0000"+
		"\u00d4\u00d5\u0003\"\u0011\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"!\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003$\u0012\u0000\u00d9\u00da\u0007"+
		"\u0000\u0000\u0000\u00da\u00dc\u0003$\u0012\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de#\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003\u000e\u0007"+
		"\u0000\u00e1\u00e2\u0005\u001f\u0000\u0000\u00e2\u00e4\u0003\u000e\u0007"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6%\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0007\u0001\u0000\u0000\u00e9\'\u0001\u0000\u0000\u0000\u001b"+
		"*,4?FNUX]cgmw\u0082\u0087\u008e\u0091\u009b\u00a0\u00ac\u00b9\u00bd\u00c1"+
		"\u00cf\u00d6\u00dd\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}