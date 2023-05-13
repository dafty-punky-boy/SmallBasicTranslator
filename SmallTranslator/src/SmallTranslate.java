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
        class MyVisitor extends SmallBasicGrammarBaseVisitor <String> {


            @Override
            public String visitIf_statement (SmallBasicGrammarParser.If_statementContext ctx){
                ident += 1;
                outFuncTrans += "if ";
                outFuncTrans += ctx.expression(0).getText();
                outFuncTrans += ":" + "\n";
                int numchild = ctx.getChildCount() - 1;
                int stats = 0;
                for (int i =5; i < numchild; i++) {
                    ParseTree child = ctx.getChild(i);
                    if (child.getText().equals("ElseIf")){
                        outFuncTrans += "elif ";
                        outFuncTrans += ctx.expression(1).getText();
                        outFuncTrans += ":" + "\n";
                        i +=4;
                    }
                    else if (child == ctx.TKN_Else()) {
                        outFuncTrans += "else:" + "\n";
                    }
                    else {
                        visitStatement(ctx.statement(stats));
                        stats +=1;
                    }
                }

                ident -= 1;
                return outFuncTrans;
            }

            @Override
            public String visitFor_loop (SmallBasicGrammarParser.For_loopContext ctx){
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
                for (SmallBasicGrammarParser.StatementContext statement : ctx.statement()) {
                    visit(statement);
                }
                return visitChildren(ctx);
            }


            @Override
            public String visitWhile_loop (SmallBasicGrammarParser.While_loopContext ctx){
                ident += 1;
                outFuncTrans += "while ";
                String expr = ctx.expression().getText();
                outFuncTrans += expr;
                outFuncTrans += ":" + "\n";
                for (SmallBasicGrammarParser.StatementContext statement : ctx.statement()) {
                    visit(statement);
                }
                ident -= 1;
                return outFuncTrans;
            }

            @Override
            public String visitStatement (SmallBasicGrammarParser.StatementContext ctx){
                for (int i = 0; i < ident; i++) {
                    outFuncTrans += "\t";
                }
                //outFuncTrans += ctx.getText() + "\n";
                return visitChildren(ctx);
            }
            @Override public String visitIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx) {
                outFuncTrans += ctx.getText() + "\n";
                return visitChildren(ctx);
            }
            @Override public String visitBuildit(SmallBasicGrammarParser.BuilditContext ctx) {
                outFuncTrans += ctx.getText() + "\n";
                return outFuncTrans;
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
