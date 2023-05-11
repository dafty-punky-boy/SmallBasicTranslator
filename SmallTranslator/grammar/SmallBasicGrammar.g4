grammar SmallBasicGrammar;

// REGLAS SINTACTICAS
program : (statement | sub)*;

sub : 'Sub' ID (statement)* 'EndSub' ;

statement : if_statement | while_loop | for_loop | buildit | goto | identifiersentences ;

identifiersentences : identifier characteristic ;
identifier : ID (array)? ;
array : ('[' expression ']')+ ;

characteristic : ':' | '(' ')' | '=' expression ;

literal : ('-')? TKN_NUMBER | TKN_TEXT | ('-')? identifier | TRUE | FALSE | ('-')? buildit | ('-')? '(' expression ')' ;

if_statement : 'If' '(' expression ')' 'Then' statement*
                ('ElseIf' '(' expression ')' 'Then' statement*)* ('Else' statement*)? 'EndIf' ;

for_loop : 'For' identifiersentences 'To' expression ('Step'  e)? statement* 'EndFor' ;

while_loop : 'While' '(' expression ')' statement* 'EndWhile' ;

goto : 'Goto' ID ;

buildit : buildit_words '(' (expression)? (',' (expression)?)* ')' ;
buildit_words : programb
              | stack
              | arrayb
              | txtwindow;

programb : 'Program' '.' PROGRAM ;
stack : 'Stack' '.' STACK ;
arrayb : 'Array' '.' ARRAY ;
txtwindow : 'TextWindow' '.' TXTWINDOW ;

expression : expressionbool ;
expressionbool : expressionrel (OPLOG expressionbool)* ;
expressionrel : e (OPREL e)? ;
e : t (('+' | '-') t)* ; // No funciona con el token. Ni puta idea de por qué.
t : literal (OPMULT literal)* ;

// REGLAS LEXICAS Y TOKENS
OPLOG : 'And' | 'Or' ;
OPREL : '>' | '<' | '<=' | '>=' | '=' | '<>' ;
OPSUM : '+' | '-' ;
OPMULT : '*' | '/' ;

// POSIBILIDADES BUILT-IN
PROGRAM : 'delay' | 'End' ;
STACK : 'PushValue' | 'PopValue' | 'GetCount' ;
ARRAY : 'ContainsIndex' | 'ContainsValue' | 'GetAllIndices' | 'GetItemCount' | 'IsArray' | 'RemoveValue' ;
TXTWINDOW : 'WriteLine' | 'Write' | 'Read';

ID : [a-zA-Z\u00C0-\u017F][a-zA-Z0-9_\u00C0-\u017F]* ;
TRUE : '"'T R U E'"';
FALSE : '"'F A L S E'"' ;
TKN_TEXT : '"' ( '\\' . | ~('\\'|'"') )* '"';
TKN_NUMBER : [0-9]+('.'[0-9]*)? ;

T : ('T' | 't') ;
R : ('R' | 'r');
U : ('U' | 'u') ;
E : ('E' | 'e') ;

F : ('F' | 'f') ;
A : ('A' | 'a') ;
L : ('L' | 'l') ;
S : ('S' | 's') ;

COMMENTS: '\'' .*? '\n' -> skip ;
WS : [ \t\r\n]+ -> skip ;

