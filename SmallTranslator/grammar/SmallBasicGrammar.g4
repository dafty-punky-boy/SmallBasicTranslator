grammar SmallBasicGrammar;

// REGLAS SINTACTICAS
program : (statement | sub)*;

sub : 'Sub' ID subbody 'EndSub' ;
subbody : (statement)*;

statement : if_statement | while_loop | for_loop | buildit | goto | identifiersentences ;

identifiersentences : identifier characteristic ;
identifier : ID (array)? ;
array : ('[' expression ']')+ ;

characteristic : ':' | '(' ')' | '=' expression ;

literal : TKN_NUMBER | TKN_TEXT | identifier | TRUE | FALSE | buildit | '(' expression ')' ;

if_statement : 'If' '(' expression ')' 'Then' statement*
                ('ElseIf' '(' expression ')' 'Then' statement*)* ('Else' statement*)? 'EndIf' ;

for_loop : 'For' identifiersentences 'To' expression ('Step'  e)? statement* 'EndFor' ;

while_loop : 'While' '(' expression ')' statement* 'EndWhile' ;


goto : 'Goto' ID ;

buildit : buildit_words '.' identifier '(' (expression)? (',' (expression)?)* ')' ;
buildit_words : 'Program' | 'Stack' | 'Array' | 'TextWindow';

expression : expressionbool expression_prima? | '-' expression ;
expression_prima : 'Or' expressionbool ;
expressionbool : expressionrel bool_prima? ;
bool_prima : 'And' expressionrel bool_prima? ;
expressionrel : e relprima ;
relprima : oprel e | ;
e : t e_prima? ;
e_prima : opsuma t e_prima? ;
t : literal t_prima? ;
t_prima : opmult literal t_prima? ;

oprel : '>' | '<' | '<=' | '>=' | '=' | '<>' ;
opsuma : '+' | '-' ;
opmult : '*' | '/' ;

// REGLAS LEXICAS Y TOKENS
ID : [a-zA-Z\u00C0-\u017F][a-zA-Z0-9_\u00C0-\u017F]* ;
TRUE : '"True"' ; // Si a alguien se le ocurre el regex para minus y mayus, que lo ponga
FALSE : '"False"' ;
TKN_TEXT : '"'([^"]*)'"' ;
TKN_NUMBER : [0-9]+('.'[0-9]*)? ;

/*TKN_PERIOD : '.' ;
TKN_GEQ : '>=' ;
TKN_LEQ : '<=' ;
TKN_EQUALS : '=' ;
TKN_COMMA : ',' ;
TKN_COLON : ':' ;
TKN_LEFT_BRAC : '[' ;
TKN_RIGHT_BRAC : ']' ;
TKN_LEFT_PAREN : '(' ;
TKN_RIGHT_PAREN : ')' ;
TKN_PLUS : '+' ;
TKN_MINUS : '-' ;
TKN_TIMES : '*' ;
TKN_DIV : '/' ;
TKN_DIFF : '<>' ;
TKN_LESS : '<' ;
TKN_GREATER : '>' ;
COMILL : '"';*/

WS : [ \t\r\n]+ -> skip ;

