import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class SmallTranslate {
    public static String outFuncTrans = "";
    public static String funcTrans = "";
    public static int ident = 0;
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input / file
// create a lexer that feeds off of input CharStrea
        class MyVisitor<T> extends SmallBasicGrammarBaseVisitor<T> {


            @Override
            public T visitIf_statement (SmallBasicGrammarParser.If_statementContext ctx){
                ident += 1;
                outFuncTrans += "if ";
                outFuncTrans += ctx.expression(0).getText();
                outFuncTrans += ":" + "\n";
                if (ctx.TKN_Else() != null) {
                    outFuncTrans += "else:" + "\n";
                }
                //String statement = ctx.statement(0).getText();
                //System.out.print(statement + "\n");
                //System.out.print(ctx.TKN_Else().getText());
                //if(ctx.statement(1) != null) {
                //System.out.print("else:" + "\n");
                //String statement1 = ctx.statement(1).getText();
                //System.out.print(statement1 + "\n");

                return visitChildren(ctx);
            }

            @Override
            public T visitFor_loop (SmallBasicGrammarParser.For_loopContext ctx){
                ident += 1;
                outFuncTrans += "for ";
                String id = ctx.identifiersentences().identifier().getText();
                outFuncTrans += id + " in range (";
                String num = ctx.identifiersentences().characteristic().expression().getText();
                outFuncTrans += num + ",";
                int num2 = Integer.valueOf(ctx.expression().getText());
                num2 += 1;
                outFuncTrans += num2;
                if (ctx.e() != null) {
                    String num3 = ctx.e().getText();
                    outFuncTrans += "," + num3;
                }
                outFuncTrans += ")";
                outFuncTrans += ":" + "\n";
                return visitChildren(ctx);
            }


            @Override
            public T visitWhile_loop (SmallBasicGrammarParser.While_loopContext ctx){
                ident += 1;
                outFuncTrans += "while ";
                String expr = ctx.expression().getText();
                outFuncTrans += expr;
                outFuncTrans += ":" + "\n";
                return visitChildren(ctx);
            }

            @Override
            public T visitStatement (SmallBasicGrammarParser.StatementContext ctx){
                for (int i = 0; i < ident; i++) {
                    outFuncTrans += "\t";
                }

                outFuncTrans += ctx.getText() + "\n";
                return visitChildren(ctx);
            }
        }
    SmallBasicGrammarLexer lexer;
    if (args.length>0)
        lexer = new SmallBasicGrammarLexer(CharStreams.fromFileName(args[0]));
    else
        lexer = new SmallBasicGrammarLexer(CharStreams.fromStream(System.in));
    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    SmallBasicGrammarParser parser = new SmallBasicGrammarParser(tokens);
    ParseTree tree = parser.program(); // begin parsing at init rule
    MyVisitor loader = new MyVisitor();
    loader.visit(tree);
    System.out.println(outFuncTrans); // print a \n after translation
}
}

