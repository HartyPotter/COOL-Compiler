    import java.io.BufferedWriter;
    import java.io.FileInputStream;
    import java.io.FileWriter;
    import java.io.IOException;
    import org.antlr.v4.runtime.*;

    public class Lexer {

        public static void main(String[] args) throws Exception {

            String inputFile = "hello.cl";
            FileInputStream inputStream = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(inputStream);

            LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(input);
            lexicalAnalyzer.removeErrorListeners();
            lexicalAnalyzer.addErrorListener(new ThrowingErrorListener());
            Vocabulary vocabulary = lexicalAnalyzer.getVocabulary();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("LexerOut.txt"))) {
                for (Token token = lexicalAnalyzer.nextToken(); token.getType() != Token.EOF; token = lexicalAnalyzer.nextToken()) {
                    writeTokenDetails(writer, token, vocabulary);
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

    class ThrowingErrorListener extends BaseErrorListener {

        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws Error {
            try {
                throw new Exception("line " + line + ":" + charPositionInLine + " " + msg);
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }