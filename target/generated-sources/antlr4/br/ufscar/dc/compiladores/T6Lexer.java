// Generated from br\u005Cufscar\dc\compiladores\T6.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T6Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Tipo=13, Nivel=14, Skill=15, Class=16, IDENT=17, 
		COMENTARIO=18, CADEIA=19, WS=20, ERROR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "Tipo", "Nivel", "Skill", "Class", "IDENT", 
			"COMENTARIO", "CADEIA", "ESC_SEQ", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'name'", "':'", "'damage type'", "'armor'", "'magic resist'", 
			"'skill'", "'ally'", "'enemy'", "'use'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Tipo", "Nivel", "Skill", "Class", "IDENT", "COMENTARIO", "CADEIA", 
			"WS", "ERROR"
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


	public T6Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "T6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16~\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008d\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00af\n\21\3\22\6\22\u00b2\n\22\r\22\16\22\u00b3\3\23"+
		"\3\23\7\23\u00b8\n\23\f\23\16\23\u00bb\13\23\3\23\5\23\u00be\n\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00c6\n\24\f\24\16\24\u00c9\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26\3\27\3\27\3\u00c7"+
		"\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\26-\27\3\2\6\4\2C\\c|\5\2\f\f\17\17\177"+
		"\177\3\2\f\f\5\2\13\f\17\17\"\"\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+"+
		"\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\tB\3\2\2\2\13"+
		"H\3\2\2\2\rU\3\2\2\2\17[\3\2\2\2\21`\3\2\2\2\23f\3\2\2\2\25j\3\2\2\2\27"+
		"l\3\2\2\2\31n\3\2\2\2\33}\3\2\2\2\35\u008c\3\2\2\2\37\u009b\3\2\2\2!\u00ae"+
		"\3\2\2\2#\u00b1\3\2\2\2%\u00b5\3\2\2\2\'\u00c2\3\2\2\2)\u00d0\3\2\2\2"+
		"+\u00d2\3\2\2\2-\u00d5\3\2\2\2/\60\7p\2\2\60\61\7c\2\2\61\62\7o\2\2\62"+
		"\63\7g\2\2\63\4\3\2\2\2\64\65\7<\2\2\65\6\3\2\2\2\66\67\7f\2\2\678\7c"+
		"\2\289\7o\2\29:\7c\2\2:;\7i\2\2;<\7g\2\2<=\7\"\2\2=>\7v\2\2>?\7{\2\2?"+
		"@\7r\2\2@A\7g\2\2A\b\3\2\2\2BC\7c\2\2CD\7t\2\2DE\7o\2\2EF\7q\2\2FG\7t"+
		"\2\2G\n\3\2\2\2HI\7o\2\2IJ\7c\2\2JK\7i\2\2KL\7k\2\2LM\7e\2\2MN\7\"\2\2"+
		"NO\7t\2\2OP\7g\2\2PQ\7u\2\2QR\7k\2\2RS\7u\2\2ST\7v\2\2T\f\3\2\2\2UV\7"+
		"u\2\2VW\7m\2\2WX\7k\2\2XY\7n\2\2YZ\7n\2\2Z\16\3\2\2\2[\\\7c\2\2\\]\7n"+
		"\2\2]^\7n\2\2^_\7{\2\2_\20\3\2\2\2`a\7g\2\2ab\7p\2\2bc\7g\2\2cd\7o\2\2"+
		"de\7{\2\2e\22\3\2\2\2fg\7w\2\2gh\7u\2\2hi\7g\2\2i\24\3\2\2\2jk\7*\2\2"+
		"k\26\3\2\2\2lm\7.\2\2m\30\3\2\2\2no\7+\2\2o\32\3\2\2\2pq\7r\2\2qr\7j\2"+
		"\2rs\7{\2\2st\7u\2\2tu\7k\2\2uv\7e\2\2vw\7c\2\2w~\7n\2\2xy\7o\2\2yz\7"+
		"c\2\2z{\7i\2\2{|\7k\2\2|~\7e\2\2}p\3\2\2\2}x\3\2\2\2~\34\3\2\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7q\2\2\u0081\u008d\7y\2\2\u0082\u0083\7o\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7f\2\2\u0085\u0086\7k\2\2\u0086\u0087\7w\2\2"+
		"\u0087\u008d\7o\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7i\2\2\u008b\u008d\7j\2\2\u008c\177\3\2\2\2\u008c\u0082\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008d\36\3\2\2\2\u008e\u008f\7r\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\u0093\7e\2\2\u0093\u009c"+
		"\7g\2\2\u0094\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7o\2\2\u0097"+
		"\u0098\7r\2\2\u0098\u0099\7q\2\2\u0099\u009a\7u\2\2\u009a\u009c\7g\2\2"+
		"\u009b\u008e\3\2\2\2\u009b\u0094\3\2\2\2\u009c \3\2\2\2\u009d\u009e\7"+
		"o\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7i\2\2\u00a0\u00af\7g\2\2\u00a1\u00a2"+
		"\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00af\7t\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7c\2\2"+
		"\u00a9\u00aa\7t\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00af\7t\2\2\u00ae\u009d\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae"+
		"\u00a7\3\2\2\2\u00af\"\3\2\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4$\3"+
		"\2\2\2\u00b5\u00b9\7}\2\2\u00b6\u00b8\n\3\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\7\17\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0\u00c1\b"+
		"\23\2\2\u00c1&\3\2\2\2\u00c2\u00c7\7$\2\2\u00c3\u00c6\5)\25\2\u00c4\u00c6"+
		"\n\4\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7$\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7^\2\2\u00cd\u00d1"+
		"\7)\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d1\7$\2\2\u00d0\u00cc\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1*\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3\u00d4\b\26\3\2"+
		"\u00d4,\3\2\2\2\u00d5\u00d6\13\2\2\2\u00d6.\3\2\2\2\r\2}\u008c\u009b\u00ae"+
		"\u00b3\u00b9\u00bd\u00c5\u00c7\u00d0\4\3\23\2\3\26\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}