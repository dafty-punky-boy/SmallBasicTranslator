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

expression : ('-')? expressionbool ;
expressionbool : expressionrel | ('Or' | 'And')  expressionbool ;
expressionrel : e (oprel e)?;
e : t (opsuma t)*;
t : literal (opmult literal)* ;

oprel : '>' | '<' | '<=' | '>=' | '=' | '<>' ;
opsuma : '+' | '-' ;
opmult : '*' | '/' ;

// REGLAS LEXICAS Y TOKENS
ID : [a-zA-Z\u00C0-\u017F][a-zA-Z0-9_\u00C0-\u017F]* ;
TRUE : '"'T R U E'"'; // Si a alguien se le ocurre el regex para minus y mayus, que lo ponga
FALSE : '"False"' ;
TKN_TEXT : '"' ( '\\' . | ~('\\'|'"') )* '"';
TKN_NUMBER : [0-9]+('.'[0-9]*)? ;

T : ('T' | 't') ;
R : ('R' | 'r');
U : ('U' | 'u') ;
E : ('E' | 'e') ;

COMMENTS: '\'' .*? '\n' -> skip ;
WS : [ \t\r\n]+ -> skip ;

