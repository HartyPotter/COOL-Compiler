// Generated from D:/FDM Downloads/Phase1_Elharty/src/LexAnalyzer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexAnalyzerParser}.
 */
public interface LexAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexAnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LexAnalyzerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexAnalyzerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LexAnalyzerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexAnalyzerParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(LexAnalyzerParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexAnalyzerParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(LexAnalyzerParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterMethod(LexAnalyzerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitMethod(LexAnalyzerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterProperty(LexAnalyzerParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitProperty(LexAnalyzerParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexAnalyzerParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(LexAnalyzerParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexAnalyzerParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(LexAnalyzerParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(LexAnalyzerParser.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(LexAnalyzerParser.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LexAnalyzerParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LexAnalyzerParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(LexAnalyzerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(LexAnalyzerParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(LexAnalyzerParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(LexAnalyzerParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LexAnalyzerParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LexAnalyzerParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LexAnalyzerParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LexAnalyzerParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(LexAnalyzerParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(LexAnalyzerParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(LexAnalyzerParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(LexAnalyzerParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LexAnalyzerParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LexAnalyzerParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LexAnalyzerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LexAnalyzerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(LexAnalyzerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(LexAnalyzerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(LexAnalyzerParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(LexAnalyzerParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIf(LexAnalyzerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIf(LexAnalyzerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCase(LexAnalyzerParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCase(LexAnalyzerParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOwnMethodCall(LexAnalyzerParser.OwnMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOwnMethodCall(LexAnalyzerParser.OwnMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LexAnalyzerParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LexAnalyzerParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(LexAnalyzerParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(LexAnalyzerParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(LexAnalyzerParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(LexAnalyzerParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LexAnalyzerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LexAnalyzerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(LexAnalyzerParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(LexAnalyzerParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(LexAnalyzerParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(LexAnalyzerParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(LexAnalyzerParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(LexAnalyzerParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(LexAnalyzerParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(LexAnalyzerParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(LexAnalyzerParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(LexAnalyzerParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(LexAnalyzerParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(LexAnalyzerParser.MethodCallContext ctx);
}