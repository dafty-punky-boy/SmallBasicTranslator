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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, PROGRAM=38, 
		STACK=39, ARRAY=40, TXTWINDOW=41, ID=42, TRUE=43, FALSE=44, TKN_TEXT=45, 
		TKN_NUMBER=46, COMMENTS=47, WS=48;
	public static final int
		RULE_program = 0, RULE_sub = 1, RULE_statement = 2, RULE_identifiersentences = 3, 
		RULE_identifier = 4, RULE_array = 5, RULE_characteristic = 6, RULE_literal = 7, 
		RULE_if_statement = 8, RULE_for_loop = 9, RULE_while_loop = 10, RULE_goto = 11, 
		RULE_buildit = 12, RULE_buildit_words = 13, RULE_programb = 14, RULE_stack = 15, 
		RULE_arrayb = 16, RULE_txtwindow = 17, RULE_expression = 18, RULE_expressionbool = 19, 
		RULE_expressionrel = 20, RULE_e = 21, RULE_t = 22, RULE_oplog = 23, RULE_oprel = 24, 
		RULE_opsum = 25, RULE_opmult = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sub", "statement", "identifiersentences", "identifier", "array", 
			"characteristic", "literal", "if_statement", "for_loop", "while_loop", 
			"goto", "buildit", "buildit_words", "programb", "stack", "arrayb", "txtwindow", 
			"expression", "expressionbool", "expressionrel", "e", "t", "oplog", "oprel", 
			"opsum", "opmult"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sub'", "'EndSub'", "'['", "']'", "':'", "'('", "')'", "'='", 
			"'-'", "'If'", "'Then'", "'ElseIf'", "'Else'", "'EndIf'", "'For'", "'To'", 
			"'Step'", "'EndFor'", "'While'", "'EndWhile'", "'Goto'", "','", "'Program'", 
			"'.'", "'Stack'", "'Array'", "'TextWindow'", "'And'", "'Or'", "'>'", 
			"'<'", "'<='", "'>='", "'<>'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PROGRAM", "STACK", "ARRAY", "TXTWINDOW", "ID", "TRUE", "FALSE", 
			"TKN_TEXT", "TKN_NUMBER", "COMMENTS", "WS"
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435970L) != 0)) {
				{
				setState(56);
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
					setState(54);
					statement();
					}
					break;
				case T__0:
					{
					setState(55);
					sub();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
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
			setState(61);
			match(T__0);
			setState(62);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				if_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				while_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				for_loop();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				buildit();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				goto_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
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
			setState(79);
			identifier();
			setState(80);
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
			setState(82);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(83);
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
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(T__2);
				setState(87);
				expression();
				setState(88);
				match(T__3);
				}
				}
				setState(92); 
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__5);
				setState(96);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__7);
				setState(98);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(101);
					match(T__8);
					}
				}

				setState(104);
				match(TKN_NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(TKN_TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(106);
					match(T__8);
					}
				}

				setState(109);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(112);
					match(T__8);
					}
				}

				setState(115);
				buildit();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(116);
					match(T__8);
					}
				}

				setState(119);
				match(T__5);
				setState(120);
				expression();
				setState(121);
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
			setState(125);
			match(T__9);
			setState(126);
			match(T__5);
			setState(127);
			expression();
			setState(128);
			match(T__6);
			setState(129);
			match(T__10);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(136);
				match(T__11);
				setState(137);
				match(T__5);
				setState(138);
				expression();
				setState(139);
				match(T__6);
				setState(140);
				match(T__10);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
					{
					{
					setState(141);
					statement();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(152);
				match(T__12);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
					{
					{
					setState(153);
					statement();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
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
			setState(163);
			match(T__14);
			setState(164);
			identifiersentences();
			setState(165);
			match(T__15);
			setState(166);
			expression();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(167);
				match(T__16);
				setState(168);
				e();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
				{
				{
				setState(171);
				statement();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(179);
			match(T__18);
			setState(180);
			match(T__5);
			setState(181);
			expression();
			setState(182);
			match(T__6);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398292435968L) != 0)) {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
			setState(191);
			match(T__20);
			setState(192);
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
			setState(194);
			buildit_words();
			setState(195);
			match(T__5);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339685114432L) != 0)) {
				{
				setState(196);
				expression();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(199);
				match(T__21);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339685114432L) != 0)) {
					{
					setState(200);
					expression();
					}
				}

				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
		public ProgrambContext programb() {
			return getRuleContext(ProgrambContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public ArraybContext arrayb() {
			return getRuleContext(ArraybContext.class,0);
		}
		public TxtwindowContext txtwindow() {
			return getRuleContext(TxtwindowContext.class,0);
		}
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				programb();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				stack();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				arrayb();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				txtwindow();
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
	public static class ProgrambContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SmallBasicGrammarParser.PROGRAM, 0); }
		public ProgrambContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterProgramb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitProgramb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitProgramb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrambContext programb() throws RecognitionException {
		ProgrambContext _localctx = new ProgrambContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_programb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__22);
			setState(217);
			match(T__23);
			setState(218);
			match(PROGRAM);
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
	public static class StackContext extends ParserRuleContext {
		public TerminalNode STACK() { return getToken(SmallBasicGrammarParser.STACK, 0); }
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__24);
			setState(221);
			match(T__23);
			setState(222);
			match(STACK);
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
	public static class ArraybContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SmallBasicGrammarParser.ARRAY, 0); }
		public ArraybContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterArrayb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitArrayb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitArrayb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraybContext arrayb() throws RecognitionException {
		ArraybContext _localctx = new ArraybContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__25);
			setState(225);
			match(T__23);
			setState(226);
			match(ARRAY);
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
	public static class TxtwindowContext extends ParserRuleContext {
		public TerminalNode TXTWINDOW() { return getToken(SmallBasicGrammarParser.TXTWINDOW, 0); }
		public TxtwindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtwindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterTxtwindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitTxtwindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitTxtwindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtwindowContext txtwindow() throws RecognitionException {
		TxtwindowContext _localctx = new TxtwindowContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_txtwindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__26);
			setState(229);
			match(T__23);
			setState(230);
			match(TXTWINDOW);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public List<OplogContext> oplog() {
			return getRuleContexts(OplogContext.class);
		}
		public OplogContext oplog(int i) {
			return getRuleContext(OplogContext.class,i);
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
		enterRule(_localctx, 38, RULE_expressionbool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expressionrel();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					oplog();
					setState(236);
					expressionbool();
					}
					} 
				}
				setState(242);
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
		enterRule(_localctx, 40, RULE_expressionrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			e();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996800L) != 0)) {
				{
				setState(244);
				oprel();
				setState(245);
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
		public List<OpsumContext> opsum() {
			return getRuleContexts(OpsumContext.class);
		}
		public OpsumContext opsum(int i) {
			return getRuleContext(OpsumContext.class,i);
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
		enterRule(_localctx, 42, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			t();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__34) {
				{
				{
				setState(250);
				opsum();
				setState(251);
				t();
				}
				}
				setState(257);
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
		enterRule(_localctx, 44, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			literal();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(259);
				opmult();
				setState(260);
				literal();
				}
				}
				setState(266);
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
	public static class OplogContext extends ParserRuleContext {
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
		enterRule(_localctx, 48, RULE_oprel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
	public static class OpsumContext extends ParserRuleContext {
		public OpsumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opsum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).enterOpsum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallBasicGrammarListener ) ((SmallBasicGrammarListener)listener).exitOpsum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallBasicGrammarVisitor ) return ((SmallBasicGrammarVisitor<? extends T>)visitor).visitOpsum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsumContext opsum() throws RecognitionException {
		OpsumContext _localctx = new OpsumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opsum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__34) ) {
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
		enterRule(_localctx, 52, RULE_opmult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		"\u0004\u00010\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005\\\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006d\b"+
		"\u0006\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007v\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b"+
		"\f\b\u0087\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u008f\b\b\n\b\f\b\u0092\t\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001"+
		"\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0003\b\u00a0\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00aa"+
		"\b\t\u0001\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b9\b\n\n\n\f\n\u00bc\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00c6\b\f\u0001\f\u0001\f\u0003\f\u00ca\b\f\u0005\f\u00cc\b"+
		"\f\n\f\f\f\u00cf\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00ef\b\u0013\n\u0013\f\u0013\u00f2\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00f8\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00fe\b\u0015\n\u0015\f\u0015\u0101\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0107\b\u0016"+
		"\n\u0016\f\u0016\u010a\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0004\u0001\u0000\u001c\u001d"+
		"\u0002\u0000\b\b\u001e\"\u0002\u0000\t\t##\u0001\u0000$%\u0120\u0000:"+
		"\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004M\u0001\u0000"+
		"\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000"+
		"\nZ\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000e{\u0001\u0000"+
		"\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000"+
		"\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00bf\u0001\u0000\u0000"+
		"\u0000\u0018\u00c2\u0001\u0000\u0000\u0000\u001a\u00d6\u0001\u0000\u0000"+
		"\u0000\u001c\u00d8\u0001\u0000\u0000\u0000\u001e\u00dc\u0001\u0000\u0000"+
		"\u0000 \u00e0\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000"+
		"$\u00e8\u0001\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00f3"+
		"\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000\u0000\u0000,\u0102\u0001\u0000"+
		"\u0000\u0000.\u010b\u0001\u0000\u0000\u00000\u010d\u0001\u0000\u0000\u0000"+
		"2\u010f\u0001\u0000\u0000\u00004\u0111\u0001\u0000\u0000\u000069\u0003"+
		"\u0004\u0002\u000079\u0003\u0002\u0001\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u0001\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000>B\u0005*\u0000\u0000?A\u0003"+
		"\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0002\u0000\u0000F\u0003\u0001"+
		"\u0000\u0000\u0000GN\u0003\u0010\b\u0000HN\u0003\u0014\n\u0000IN\u0003"+
		"\u0012\t\u0000JN\u0003\u0018\f\u0000KN\u0003\u0016\u000b\u0000LN\u0003"+
		"\u0006\u0003\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0003"+
		"\b\u0004\u0000PQ\u0003\f\u0006\u0000Q\u0007\u0001\u0000\u0000\u0000RT"+
		"\u0005*\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000TU"+
		"\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0003\u0000"+
		"\u0000WX\u0003$\u0012\u0000XY\u0005\u0004\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZV\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000"+
		"^d\u0005\u0005\u0000\u0000_`\u0005\u0006\u0000\u0000`d\u0005\u0007\u0000"+
		"\u0000ab\u0005\b\u0000\u0000bd\u0003$\u0012\u0000c^\u0001\u0000\u0000"+
		"\u0000c_\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d\r\u0001\u0000"+
		"\u0000\u0000eg\u0005\t\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h|\u0005.\u0000\u0000i|\u0005-\u0000"+
		"\u0000jl\u0005\t\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m|\u0003\b\u0004\u0000n|\u0005+\u0000"+
		"\u0000o|\u0005,\u0000\u0000pr\u0005\t\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s|\u0003\u0018"+
		"\f\u0000tv\u0005\t\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u0003"+
		"$\u0012\u0000yz\u0005\u0007\u0000\u0000z|\u0001\u0000\u0000\u0000{f\u0001"+
		"\u0000\u0000\u0000{i\u0001\u0000\u0000\u0000{k\u0001\u0000\u0000\u0000"+
		"{n\u0001\u0000\u0000\u0000{o\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000"+
		"\u0000{u\u0001\u0000\u0000\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005"+
		"\n\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0080\u0003$\u0012"+
		"\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0085\u0005\u000b\u0000"+
		"\u0000\u0082\u0084\u0003\u0004\u0002\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0095\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\f\u0000\u0000"+
		"\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008b\u0003$\u0012\u0000\u008b"+
		"\u008c\u0005\u0007\u0000\u0000\u008c\u0090\u0005\u000b\u0000\u0000\u008d"+
		"\u008f\u0003\u0004\u0002\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u009f\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u009c\u0005\r\u0000\u0000\u0099\u009b"+
		"\u0003\u0004\u0002\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005\u000e\u0000\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u000f\u0000\u0000\u00a4\u00a5\u0003\u0006\u0003\u0000\u00a5\u00a6"+
		"\u0005\u0010\u0000\u0000\u00a6\u00a9\u0003$\u0012\u0000\u00a7\u00a8\u0005"+
		"\u0011\u0000\u0000\u00a8\u00aa\u0003*\u0015\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0012"+
		"\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0013"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6\u0003$\u0012"+
		"\u0000\u00b6\u00ba\u0005\u0007\u0000\u0000\u00b7\u00b9\u0003\u0004\u0002"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u0014\u0000\u0000\u00be\u0015\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0015\u0000\u0000\u00c0\u00c1\u0005*\u0000\u0000"+
		"\u00c1\u0017\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u001a\r\u0000\u00c3"+
		"\u00c5\u0005\u0006\u0000\u0000\u00c4\u00c6\u0003$\u0012\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cd"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u0016\u0000\u0000\u00c8\u00ca"+
		"\u0003$\u0012\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0007\u0000\u0000\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u00d7\u0003"+
		"\u001c\u000e\u0000\u00d3\u00d7\u0003\u001e\u000f\u0000\u00d4\u00d7\u0003"+
		" \u0010\u0000\u00d5\u00d7\u0003\"\u0011\u0000\u00d6\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u001b\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0017\u0000\u0000\u00d9\u00da\u0005\u0018"+
		"\u0000\u0000\u00da\u00db\u0005&\u0000\u0000\u00db\u001d\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00de\u0005\u0018\u0000"+
		"\u0000\u00de\u00df\u0005\'\u0000\u0000\u00df\u001f\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u001a\u0000\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000"+
		"\u00e2\u00e3\u0005(\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u001b\u0000\u0000\u00e5\u00e6\u0005\u0018\u0000\u0000\u00e6\u00e7"+
		"\u0005)\u0000\u0000\u00e7#\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003&"+
		"\u0013\u0000\u00e9%\u0001\u0000\u0000\u0000\u00ea\u00f0\u0003(\u0014\u0000"+
		"\u00eb\u00ec\u0003.\u0017\u0000\u00ec\u00ed\u0003&\u0013\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f7\u0003*\u0015\u0000\u00f4\u00f5\u00030\u0018"+
		"\u0000\u00f5\u00f6\u0003*\u0015\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8)\u0001\u0000\u0000\u0000\u00f9\u00ff\u0003,\u0016\u0000\u00fa\u00fb"+
		"\u00032\u0019\u0000\u00fb\u00fc\u0003,\u0016\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100+\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0108\u0003\u000e\u0007\u0000\u0103\u0104\u00034\u001a\u0000"+
		"\u0104\u0105\u0003\u000e\u0007\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0103\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109-\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0007\u0000\u0000\u0000\u010c/\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0007\u0001\u0000\u0000\u010e1\u0001\u0000\u0000\u0000\u010f\u0110\u0007"+
		"\u0002\u0000\u0000\u01103\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0003"+
		"\u0000\u0000\u01125\u0001\u0000\u0000\u0000\u001c8:BMT\\cfkqu{\u0085\u0090"+
		"\u0095\u009c\u009f\u00a9\u00ae\u00ba\u00c5\u00c9\u00cd\u00d6\u00f0\u00f7"+
		"\u00ff\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}