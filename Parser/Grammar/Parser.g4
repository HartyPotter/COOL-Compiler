grammar Parser;

import LexicalAnalyzer;

program   : classDefine+ # start
          ;
classDefine     : CLASS CLASSTYPE (INHERITS CLASSTYPE)? OPENBRACE (feature SEMICOLON)* CLOSEBRACE SEMICOLON # classDef
          ;
feature   : ID OPENPARENTHESES (parameter (COMMA parameter)*)? CLOSEPARENTHESES COLON CLASSTYPE OPENBRACE expr CLOSEBRACE # function
          | ID COLON CLASSTYPE (ASSIGN expr )? # varDef
          ;
parameter : ID COLON CLASSTYPE # param;
expr      : expr(AT CLASSTYPE)? DOT ID OPENPARENTHESES ( expr (COMMA expr)*)? CLOSEPARENTHESES # objectCall
          | ID OPENPARENTHESES ( expr (COMMA expr)*)? CLOSEPARENTHESES # staticCall
          | IF expr THEN expr ELSE expr FI # if
          | WHILE expr LOOP expr POOL # while
          | OPENBRACE (expr SEMICOLON)+ CLOSEBRACE  # block
          | LET ID COLON CLASSTYPE ( ASSIGN expr )? (COMMA ID COLON CLASSTYPE ( ASSIGN expr )?)* IN expr # let
          | CASE expr OF (ID COLON CLASSTYPE CASEASSIGN expr SEMICOLON )+ ESAC # switch
          | NEW CLASSTYPE # newObject
          | ISVOID expr # void
          | expr MUL expr # mul
          | expr DIV expr # div
          | expr ADD expr # add
          | expr SUB expr # sub
          | INTCOMP expr # invert
          | expr LT expr # lt
          | expr LTEQ expr # lteq
          | expr EQUAL expr # equal
          | NOT expr # not
          | OPENPARENTHESES expr CLOSEPARENTHESES # factExpr
          | STRING # string
          | NUM # num
          | ID # id
          | TRUE # true
          | FALSE # false
          | ID ASSIGN expr # assign
          ;
