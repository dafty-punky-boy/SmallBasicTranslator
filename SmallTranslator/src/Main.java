import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) throws Exception{
        SmallBasicGrammarLexer lexer = new
                SmallBasicGrammarLexer(CharStreams.fromFileName("SmallTranslator/input/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmallBasicGrammarParser parser = new SmallBasicGrammarParser(tokens);
        SmallBasicGrammarParser.ProgramContext initContext = parser.program();

        SmallVisitor translator = new SmallVisitor(new TranslateInfo());

        translator.visit(initContext);
        translator.translateData.printTranslation();
    }
}