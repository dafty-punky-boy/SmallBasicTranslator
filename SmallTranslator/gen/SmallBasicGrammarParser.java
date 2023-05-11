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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, TRUE=39, 
		FALSE=40, TKN_TEXT=41, TKN_NUMBER=42, WS=43;
	public static final int
		RULE_program = 0, RULE_sub = 1, RULE_subbody = 2, RULE_statement = 3, 
		RULE_identifiersentences = 4, RULE_identifier = 5, RULE_array = 6, RULE_characteristic = 7, 
		RULE_literal = 8, RULE_if_statement = 9, RULE_for_loop = 10, RULE_while_loop = 11, 
		RULE_goto = 12, RULE_buildit = 13, RULE_buildit_words = 14, RULE_expression = 15, 
		RULE_expressionbool = 16, RULE_expressionrel = 17, RULE_e = 18, RULE_t = 19, 
		RULE_oprel = 20, RULE_opsuma = 21, RULE_opmult = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sub", "subbody", "statement", "identifiersentences", "identifier", 
			"array", "characteristic", "literal", "if_statement", "for_loop", "while_loop", 
			"goto", "buildit", "buildit_words", "expression", "expressionbool", "expressionrel", 
			"e", "t", "oprel", "opsuma", "opmult"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sub'", "'EndSub'", "'['", "']'", "':'", "'('", "')'", "'='", 
			"'If'", "'Then'", "'ElseIf'", "'Else'", "'EndIf'", "'For'", "'To'", "'Step'", 
			"'EndFor'", "'While'", "'EndWhile'", "'Goto'", "'.'", "','", "'Program'", 
			"'Stack'", "'Array'", "'TextWindow'", "'-'", "'Or'", "'And'", "'>'", 
			"'<'", "'<='", "'>='", "'<>'", "'+'", "'*'", "'/'", null, "'\"True\"'", 
			"'\"False\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "TRUE", "FALSE", "TKN_TEXT", "TKN_NUMBER", "WS"
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063682L) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__13:
				case T__17:
				case T__19:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case ID:
					{
					setState(46);
					statement();
					}
					break;
				case T__0:
					{
					setState(47);
					sub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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
			setState(53);
			match(T__0);
			setState(54);
			match(ID);
			setState(55);
			subbody();
			setState(56);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				if_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				while_loop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				for_loop();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				buildit();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				goto_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
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
			setState(72);
			identifier();
			setState(73);
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
			setState(75);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(76);
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
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				match(T__2);
				setState(80);
				expression();
				setState(81);
				match(T__3);
				}
				}
				setState(85); 
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
		enterRule(_localctx, 14, RULE_characteristic);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__5);
				setState(89);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__7);
				setState(91);
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
		enterRule(_localctx, 16, RULE_literal);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(TKN_NUMBER);
				}
				break;
			case TKN_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(TKN_TEXT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				identifier();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(FALSE);
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				buildit();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(T__5);
				setState(101);
				expression();
				setState(102);
				match(T__6);
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
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(107);
			match(T__5);
			setState(108);
			expression();
			setState(109);
			match(T__6);
			setState(110);
			match(T__9);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(117);
				match(T__10);
				setState(118);
				match(T__5);
				setState(119);
				expression();
				setState(120);
				match(T__6);
				setState(121);
				match(T__9);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
					{
					{
					setState(122);
					statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(133);
				match(T__11);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(T__12);
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
		enterRule(_localctx, 20, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__13);
			setState(145);
			identifiersentences();
			setState(146);
			match(T__14);
			setState(147);
			expression();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(148);
				match(T__15);
				setState(149);
				e();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		enterRule(_localctx, 22, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__17);
			setState(161);
			match(T__5);
			setState(162);
			expression();
			setState(163);
			match(T__6);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275005063680L) != 0)) {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__18);
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
		enterRule(_localctx, 24, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__19);
			setState(173);
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
		enterRule(_localctx, 26, RULE_buildit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			buildit_words();
			setState(176);
			match(T__20);
			setState(177);
			identifier();
			setState(178);
			match(T__5);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8522280468544L) != 0)) {
				{
				setState(179);
				expression();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(182);
				match(T__21);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8522280468544L) != 0)) {
					{
					setState(183);
					expression();
					}
				}

				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		enterRule(_localctx, 28, RULE_buildit_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(195);
				match(T__26);
				}
			}

			setState(198);
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
		public ExpressionboolContext expressionbool() {
			return getRuleContext(ExpressionboolContext.class,0);
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
		enterRule(_localctx, 32, RULE_expressionbool);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case ID:
			case TRUE:
			case FALSE:
			case TKN_TEXT:
			case TKN_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				expressionrel();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				expressionbool();
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
		enterRule(_localctx, 34, RULE_expressionrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			e();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996800L) != 0)) {
				{
				setState(206);
				oprel();
				setState(207);
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
		public List<OpsumaContext> opsuma() {
			return getRuleContexts(OpsumaContext.class);
		}
		public OpsumaContext opsuma(int i) {
			return getRuleContext(OpsumaContext.class,i);
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
		enterRule(_localctx, 36, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			t();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__34) {
				{
				{
				setState(212);
				opsuma();
				setState(213);
				t();
				}
				}
				setState(219);
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
		public List<OpmultContext> opmult() {
			return getRuleContexts(OpmultContext.class);
		}
		public OpmultContext opmult(int i) {
			return getRuleContext(OpmultContext.class,i);
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
		enterRule(_localctx, 38, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			literal();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(221);
				opmult();
				setState(222);
				literal();
				}
				}
				setState(228);
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
		enterRule(_localctx, 40, RULE_oprel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996800L) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_opsuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__34) ) {
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
		enterRule(_localctx, 44, RULE_opmult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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
		"\u0004\u0001+\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006T\b\u0006\u000b\u0006\f\u0006U\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007]\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bi\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tq\b\t\n\t\f\tt\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t|\b\t\n\t\f\t\u007f\t\t\u0005\t\u0081\b\t\n\t\f\t\u0084\t\t\u0001\t"+
		"\u0001\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0003\t\u008d\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0097"+
		"\b\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a6"+
		"\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b5"+
		"\b\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0005\r\u00bb\b\r\n\r\f\r\u00be"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u00c5"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00cc\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00d2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00d8\b\u0012\n\u0012\f\u0012\u00db\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00e1\b\u0013\n\u0013\f\u0013\u00e4"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0005\u0001"+
		"\u0000\u0017\u001a\u0001\u0000\u001c\u001d\u0002\u0000\b\b\u001e\"\u0002"+
		"\u0000\u001b\u001b##\u0001\u0000$%\u00f6\u00002\u0001\u0000\u0000\u0000"+
		"\u00025\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006F"+
		"\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000"+
		"\u0000\fS\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010"+
		"h\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014\u0090\u0001"+
		"\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00ac\u0001"+
		"\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00c1\u0001"+
		"\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00cb\u0001\u0000"+
		"\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000\u0000"+
		"\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*"+
		"\u00e7\u0001\u0000\u0000\u0000,\u00e9\u0001\u0000\u0000\u0000.1\u0003"+
		"\u0006\u0003\u0000/1\u0003\u0002\u0001\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000056\u0005\u0001\u0000\u000067\u0005&\u0000\u000078\u0003"+
		"\u0004\u0002\u000089\u0005\u0002\u0000\u00009\u0003\u0001\u0000\u0000"+
		"\u0000:<\u0003\u0006\u0003\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005"+
		"\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@G\u0003\u0012\t\u0000"+
		"AG\u0003\u0016\u000b\u0000BG\u0003\u0014\n\u0000CG\u0003\u001a\r\u0000"+
		"DG\u0003\u0018\f\u0000EG\u0003\b\u0004\u0000F@\u0001\u0000\u0000\u0000"+
		"FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0003\n\u0005\u0000IJ\u0003\u000e\u0007\u0000J\t"+
		"\u0001\u0000\u0000\u0000KM\u0005&\u0000\u0000LN\u0003\f\u0006\u0000ML"+
		"\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000b\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0003\u001e\u000f\u0000QR\u0005"+
		"\u0004\u0000\u0000RT\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V\r\u0001\u0000\u0000\u0000W]\u0005\u0005\u0000\u0000XY\u0005\u0006"+
		"\u0000\u0000Y]\u0005\u0007\u0000\u0000Z[\u0005\b\u0000\u0000[]\u0003\u001e"+
		"\u000f\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^i\u0005*\u0000"+
		"\u0000_i\u0005)\u0000\u0000`i\u0003\n\u0005\u0000ai\u0005\'\u0000\u0000"+
		"bi\u0005(\u0000\u0000ci\u0003\u001a\r\u0000de\u0005\u0006\u0000\u0000"+
		"ef\u0003\u001e\u000f\u0000fg\u0005\u0007\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000h^\u0001\u0000\u0000\u0000h_\u0001\u0000\u0000\u0000h`\u0001\u0000"+
		"\u0000\u0000ha\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000hc\u0001"+
		"\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000i\u0011\u0001\u0000\u0000"+
		"\u0000jk\u0005\t\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u0003\u001e\u000f"+
		"\u0000mn\u0005\u0007\u0000\u0000nr\u0005\n\u0000\u0000oq\u0003\u0006\u0003"+
		"\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0082\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uv\u0005\u000b\u0000\u0000vw\u0005\u0006\u0000"+
		"\u0000wx\u0003\u001e\u000f\u0000xy\u0005\u0007\u0000\u0000y}\u0005\n\u0000"+
		"\u0000z|\u0003\u0006\u0003\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080u"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008c"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0089"+
		"\u0005\f\u0000\u0000\u0086\u0088\u0003\u0006\u0003\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0085\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\r\u0000\u0000\u008f\u0013\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0092\u0003\b\u0004"+
		"\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0096\u0003\u001e\u000f"+
		"\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0097\u0003$\u0012\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009b\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0006\u0003\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000"+
		"\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a7\u0005\u0007\u0000\u0000"+
		"\u00a4\u00a6\u0003\u0006\u0003\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0013\u0000\u0000"+
		"\u00ab\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000"+
		"\u00ad\u00ae\u0005&\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1"+
		"\u00b2\u0003\n\u0005\u0000\u00b2\u00b4\u0005\u0006\u0000\u0000\u00b3\u00b5"+
		"\u0003\u001e\u000f\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0005\u0016\u0000\u0000\u00b7\u00b9\u0003\u001e\u000f\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u001b"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007\u0000\u0000\u0000\u00c2\u001d"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u001b\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003 \u0010\u0000\u00c7\u001f\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cc\u0003\"\u0011\u0000\u00c9\u00ca\u0007\u0001"+
		"\u0000\u0000\u00ca\u00cc\u0003 \u0010\u0000\u00cb\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d1\u0003$\u0012\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u00d0"+
		"\u0003$\u0012\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2#\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d9\u0003&\u0013\u0000\u00d4\u00d5\u0003*\u0015\u0000"+
		"\u00d5\u00d6\u0003&\u0013\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"%\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e2"+
		"\u0003\u0010\b\u0000\u00dd\u00de\u0003,\u0016\u0000\u00de\u00df\u0003"+
		"\u0010\b\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\'\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0002\u0000"+
		"\u0000\u00e6)\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0003\u0000\u0000"+
		"\u00e8+\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0004\u0000\u0000\u00ea"+
		"-\u0001\u0000\u0000\u0000\u001802=FMU\\hr}\u0082\u0089\u008c\u0096\u009b"+
		"\u00a7\u00b4\u00b8\u00bc\u00c4\u00cb\u00d1\u00d9\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}