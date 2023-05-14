import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) throws Exception{
        SmallBasicGrammarLexer lexer;

        if (args.length>0){
            lexer = new SmallBasicGrammarLexer(CharStreams.fromFileName(args[0]));
        } else {
            lexer = new SmallBasicGrammarLexer(CharStreams.fromStream(System.in));
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmallBasicGrammarParser parser = new SmallBasicGrammarParser(tokens);
        SmallBasicGrammarParser.ProgramContext initContext = parser.program();

        SmallVisitor translator = new SmallVisitor(new TranslateInfo());

        translator.visit(initContext);
        translator.translateData.printTranslation();
    }
}