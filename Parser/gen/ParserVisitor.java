// Generated from C:/Users/Youssef Elharty/IdeaProjects/Parser/Grammar/Parser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ParserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParserParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(ParserParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(ParserParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParserParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ParserParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ParserParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ParserParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ParserParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteq(ParserParser.LteqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ParserParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticCall(ParserParser.StaticCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(ParserParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ParserParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(ParserParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ParserParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ParserParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(ParserParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ParserParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ParserParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ParserParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(ParserParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvert(ParserParser.InvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(ParserParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ParserParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(ParserParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCall(ParserParser.ObjectCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ParserParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParserParser.AssignContext ctx);
}