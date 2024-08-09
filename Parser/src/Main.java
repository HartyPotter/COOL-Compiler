import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.antlr.v4.gui.Trees;

public class Main {

    public static void main(String[] args) throws Exception {

        String inputFile = "hello.cl";
        FileInputStream inputStream = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        LexicalAnalyzer lexer = new LexicalAnalyzer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserParser parser = new ParserParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());
        ParseTree tree = parser.program();
        BufferedWriter writer = new BufferedWriter(new FileWriter("ParserOut.txt"));
        writer.write(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
        writer.close();
    }
}
