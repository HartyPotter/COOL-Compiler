// Generated from D:/FDM Downloads/Phase1_Elharty/src/LexAnalyzer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexAnalyzerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexAnalyzerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexAnalyzerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LexAnalyzerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexAnalyzerParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(LexAnalyzerParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(LexAnalyzerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link LexAnalyzerParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(LexAnalyzerParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexAnalyzerParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(LexAnalyzerParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(LexAnalyzerParser.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LexAnalyzerParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LexAnalyzerParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(LexAnalyzerParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LexAnalyzerParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LexAnalyzerParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(LexAnalyzerParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(LexAnalyzerParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LexAnalyzerParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LexAnalyzerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LexAnalyzerParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(LexAnalyzerParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LexAnalyzerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(LexAnalyzerParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnMethodCall(LexAnalyzerParser.OwnMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LexAnalyzerParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(LexAnalyzerParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(LexAnalyzerParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LexAnalyzerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LexAnalyzerParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LexAnalyzerParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(LexAnalyzerParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LexAnalyzerParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(LexAnalyzerParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link LexAnalyzerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(LexAnalyzerParser.MethodCallContext ctx);
}