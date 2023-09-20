package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short INT = 2;
		static public final short VOID = 3;
		static public final short BOOLEAN = 4;
		static public final short RPAREN = 5;
		static public final short RCURLY = 6;
		static public final short SEMICOLON = 7;
		static public final short STRING_LITERAL = 8;
		static public final short LBRACKET = 9;
		static public final short LCURLY = 10;
		static public final short EQL = 11;
		static public final short MODULE = 12;
		static public final short PUBLIC = 13;
		static public final short TYPE = 14;
		static public final short IMPORT = 15;
		static public final short COMMA = 16;
		static public final short RBRACKET = 17;
		static public final short LPAREN = 18;
		static public final short IF = 19;
		static public final short ELSE = 20;
		static public final short WHILE = 21;
		static public final short RETURN = 22;
		static public final short BREAK = 23;
		static public final short TRUE = 24;
		static public final short FALSE = 25;
		static public final short INT_LITERAL = 26;
		static public final short PLUS = 27;
		static public final short MINUS = 28;
		static public final short TIMES = 29;
		static public final short DIV = 30;
		static public final short MOD = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LEQ = 34;
		static public final short GEQ = 35;
		static public final short LT = 36;
		static public final short GT = 37;
	}
	static public class AltGoals {
		static public final short Dummy = 38;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9p5b6bFKq4KXjzgQQqBL1G4QKlPsr9geIrbtpTHn9N4BJ7wmSHVuT$qimjkY3lYTdpcqei" +
		"DniGln4cUMUwyP#QScNj6qWDDQbPpEgjbbJMl9IreKHaDQimVsGiLjAAYfykhNmExkXtR2P" +
		"tH0HsqnohPIyteifbg5BIVcb8OGXhN8HrHHCTqN8TLhnCwgfEgLPrQrQUe6jIkHdkYDfrIf" +
		"thLfMxbx8VIwj2GcjIZPcLrMbVKefHY6hQdYcj42OrgMacTqtbTq4MjwfAkwXhw5BOPzimg" +
		"u7nJa1thYSCVrR1BRKMt4vC$uzk6YBYRSmYW3U2vMA547K4LGHibYaQY2E9N0$45yBqMNHC" +
		"HvF2t3hiMJnzZhG1nXpaduLEKcJWdaU1RAxeadhNH3t4AVKGSOgwB5SDOkNDpRHZBjOTKPf" +
		"ohy4$O2hsyLREGX3ReW0HqmW3aeHjI48T#68OS520DlL045#4Wb648Hc0KN2HZC0uJC0apC" +
		"0LpC0qBC0lpi0JBpb$A8iHWnOrzA3NGHJpRtjcAMnHtAEvFkbxHj4DpfTy3gzLh$0tA3RXL" +
		"wT#3ct0RxbHfxiDTVumVcvLswr$s#9zGwY6Eh#jxv$YsKTL$L6MJtwFRzpWfQzgdOjziozx" +
		"JVhLj#$B7x6UlVkxLh#oPlREtjcblRCDUsxhtzTEkzgDzyDhlSl#fo$X1yhj87kR8RfSbxd" +
		"txZSke25aK8hj2P4x0ovuUMfzK5MdU2$SAkGmjq7TlK8PrNEQMoFFoBzAhjtK=");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN37 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 37];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = Module
			RETURN2,	// [1] $goal = $Dummy Dummy; returns 'Dummy' although none is marked
			RETURN6,	// [2] Module = MODULE ID LCURLY Import Decl RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [3] Import = Import IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.NONE,  	// [4] Import = 
			RETURN2,	// [5] Decl = Decl FnDecl; returns 'FnDecl' although none is marked
			RETURN2,	// [6] Decl = Decl FieldDecl; returns 'FieldDecl' although none is marked
			RETURN2,	// [7] Decl = Decl TypeDecl; returns 'TypeDecl' although none is marked
			Action.NONE,  	// [8] Decl = 
			RETURN9,	// [9] FnDecl = Accessibility TypeName ID LPAREN ParamList RPAREN LCURLY Stmt RCURLY; returns 'RCURLY' although none is marked
			RETURN6,	// [10] FieldDecl = Accessibility TypeName ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [11] TypeDecl = Accessibility TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [12] Accessibility = PUBLIC
			Action.NONE,  	// [13] Accessibility = 
			Action.RETURN,	// [14] TypeName = PrimitiveType
			Action.RETURN,	// [15] TypeName = ArrayType
			Action.RETURN,	// [16] TypeName = ID
			Action.RETURN,	// [17] PrimitiveType = VOID
			Action.RETURN,	// [18] PrimitiveType = BOOLEAN
			Action.RETURN,	// [19] PrimitiveType = INT
			RETURN3,	// [20] ArrayType = TypeName LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [21] ParamList = NonEmptyParamList
			Action.NONE,  	// [22] ParamList = 
			new Action() {	// [23] NonEmptyParamList = NonEmptyParamList COMMA Param
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [24] NonEmptyParamList = Param
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN2,	// [25] Param = TypeName ID; returns 'ID' although none is marked
			Action.NONE,  	// [26] Stmt = 
			RETURN37	// [27] Dummy = MODULE INT VOID IF ELSE WHILE RETURN BREAK BOOLEAN PUBLIC TRUE FALSE INT_LITERAL STRING_LITERAL ID TYPE IMPORT PLUS MINUS TIMES DIV MOD EQEQ NEQ LEQ GEQ LT GT LBRACKET RPAREN COMMA RCURLY LCURLY SEMICOLON RBRACKET LPAREN EQL; returns 'EQL' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}