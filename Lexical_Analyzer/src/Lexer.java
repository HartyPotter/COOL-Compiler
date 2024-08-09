import java.io.*;
import org.antlr.v4.runtime.*;

public class Lexer {

    public static void main(String[] args) throws IOException {
        String inputFile = "Main.cl";

        // reads the input source file (Main.cl) using a FileInputStream.
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            ANTLRInputStream input = new ANTLRInputStream(inputStream);

            // Create lexer
            LexAnalyzerLexer lexicalAnalyzer = new LexAnalyzerLexer(input); //  instantiates the lexer
//            lexicalAnalyzer.removeErrorListeners();

            // The Vocabulary interface in ANTLR provides access to information about the tokens recognized by the lexer,
            // including their type indices and symbolic names.
            Vocabulary vocabulary = lexicalAnalyzer.getVocabulary();

            // writes token details to an output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile + "-output"))) {
                for (Token token = lexicalAnalyzer.nextToken(); token.getType() != Token.EOF; token = lexicalAnalyzer.nextToken()) {
                    writeTokenDetails(writer, token, vocabulary);
                }
            }
        }
    }

    private static void writeTokenDetails(BufferedWriter writer, Token token, Vocabulary vocabulary) throws IOException {
        writer.write("Line: " + token.getLine());
        writer.newLine();
        if (vocabulary.getSymbolicName(token.getType()) == null )
        {
            writer.write("TokenType: " + vocabulary.getDisplayName(token.getType()));
        }
        else{
            writer.write("TokenType: " + vocabulary.getSymbolicName(token.getType()));
        }
        writer.newLine();
        writer.write("Token: " + token.getText());
        writer.newLine();
        writer.newLine();
    }

}
