grammar LexAnalyzer;
// It states that a valid COOL program consists of one or more class definitions,
// each terminated by a semicolon, and the end of the file (EOF) is reached
// after parsing all class definitions.
program: (classDefine ';')+ EOF;

// defines the structure of a class definition
classDefine: CLASS TYPEID (INHERITS TYPEID)? '{' (feature ';')* '}';

// Defines features (could be methods or properties)
// including their names, parameters (for methods), return types, and optional initialization values (for properties)
feature: OBJECTID '(' (formal (',' formal)*)? ')' ':' TYPEID '{' expression '}' # method
    | OBJECTID ':' TYPEID (ASSIGNMENT expression)?                           # property;

formal: OBJECTID ':' TYPEID;

// method argument
// this defines the rules of expressions in the COOL language
// covering method calls, conditionals, loops, blocks, let-in expressions, case expressions, and other basic operations.
expression
    : expression ('@' TYPEID)? '.' OBJECTID '(' (expression (',' expression)*)? ')' # methodCall
    | OBJECTID '(' (expression (',' expression)*)? ')'                              # ownMethodCall
    | IF expression THEN expression ELSE expression FI                              # if
    | WHILE expression LOOP expression POOL                                         # while
    | '{' (expression ';')+ '}'                                                     # block
    | LET OBJECTID ':' TYPEID (ASSIGNMENT expression)? (
        ',' OBJECTID ':' TYPEID (ASSIGNMENT expression)?
    )* IN expression                                                           # letIn
    | CASE expression OF (OBJECTID ':' TYPEID CASE_ARROW expression ';')+ ESAC # case
    | NEW TYPEID                                                               # new
    | INTEGER_NEGATIVE expression                                              # negative
    | ISVOID expression                                                        # isvoid
    | expression MULTIPLY expression                                           # multiply
    | expression DIVISION expression                                           # division
    | expression ADD expression                                                # add
    | expression MINUS expression                                              # minus
    | expression LESS_THAN expression                                          # lessThan
    | expression LESS_EQUAL expression                                         # lessEqual
    | expression EQUAL expression                                              # equal
    | NOT expression                                                           # boolNot
    | '(' expression ')'                                                       # parentheses
    | OBJECTID                                                                 # id
    | INT                                                                      # int
    | STRING                                                                   # string
    | TRUE                                                                     # true
    | FALSE                                                                    # false
    | OBJECTID ASSIGNMENT expression                                           # assignment
    ;
WHITESPACE      : [ \t\r\n\f]+ -> skip;
// keywords
// specify how certain sequences of characters in the input source code are interpreted
// used by the lexer to tokenize the input source code, recognizing keywords as distinct tokens
CLASS       : C L A S S;
ELSE        : E L S E;
FALSE       : 'f' A L S E;
FI          : F I;
IF          : I F;
IN          : I N;
INHERITS    : I N H E R I T S;
ISVOID      : I S V O I D;
LET         : L E T;
LOOP        : L O O P;
POOL        : P O O L;
THEN        : T H E N;
WHILE       : W H I L E;
CASE        : C A S E;
ESAC        : E S A C;
NEW         : N E W;
OF          : O F;
NOT         : N O T;
TRUE        : 't' R U E;

// primitives
// Defines datatypes and symbols
STRING      : '"' (ESC | ~ ["\\])* '"';
INT         : [0-9]+;
TYPEID      : [A-Z] [_0-9A-Za-z]*;
OBJECTID    : [a-z] [_0-9A-Za-z]*;
ASSIGNMENT  : '<-';
CASE_ARROW  : '=>';
ADD         : '+';
MINUS       : '-';
MULTIPLY    : '*';
DIVISION    : '/';
LESS_THAN   : '<';
LESS_EQUAL  : '<=';
EQUAL       : '=';
INTEGER_NEGATIVE : '~';

// resuable components that the lexer can use to build more complex tokens
fragment A   : [aA];
fragment C   : [cC];
fragment D   : [dD];
fragment E   : [eE];
fragment F   : [fF];
fragment H   : [hH];
fragment I   : [iI];
fragment L   : [lL];
fragment N   : [nN];
fragment O   : [oO];
fragment P   : [pP];
fragment R   : [rR];
fragment S   : [sS];
fragment T   : [tT];
fragment U   : [uU];
fragment V   : [vV];
fragment W   : [wW];
fragment ESC : '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE : 'u' HEX HEX HEX HEX;
fragment HEX : [0-9a-fA-F];

// comments
// handling comments and whitespace
OPEN_COMMENT    : '(*';
CLOSE_COMMENT   : '*)';
COMMENT         : OPEN_COMMENT (COMMENT | .)*? CLOSE_COMMENT -> skip;
ONE_LINE_COMMENT: '--' (~ '\n')* '\n'? -> skip;

