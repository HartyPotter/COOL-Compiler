// Generated from C:/Users/Youssef Elharty/IdeaProjects/Parser/Grammar/Parser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterStart(ParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start}
	 * labeled alternative in {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitStart(ParserParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParserParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(ParserParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link ParserParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(ParserParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(ParserParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef}
	 * labeled alternative in {@link ParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(ParserParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParam(ParserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link ParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParam(ParserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(ParserParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(ParserParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(ParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(ParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(ParserParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(ParserParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLteq(ParserParser.LteqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteq}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLteq(ParserParser.LteqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(ParserParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(ParserParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStaticCall(ParserParser.StaticCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStaticCall(ParserParser.StaticCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(ParserParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(ParserParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ParserParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ParserParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(ParserParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(ParserParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ParserParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ParserParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(ParserParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(ParserParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(ParserParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(ParserParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(ParserParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(ParserParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(ParserParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(ParserParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ParserParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ParserParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVoid(ParserParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVoid(ParserParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvert(ParserParser.InvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvert(ParserParser.InvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(ParserParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(ParserParser.FactExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ParserParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ParserParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(ParserParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(ParserParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectCall(ParserParser.ObjectCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectCall(ParserParser.ObjectCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ParserParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ParserParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ParserParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ParserParser.AssignContext ctx);
}