import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class SmallTranslate {
    public static String outFuncTrans = "";
    public static String outExpression = "";
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
                outFuncTrans += visitExpression(ctx.expression(0));
                outFuncTrans += ":" + "\n";
                int numchild = ctx.getChildCount() - 1;
                int stats = 0;
                for (int i =5; i < numchild; i++) {
                    ParseTree child = ctx.getChild(i);
                    if (child.getText().equals("ElseIf")){
                        outFuncTrans += "elif ";
                        outFuncTrans += visitExpression(ctx.expression(1));
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
                int num2 = Integer.valueOf(visitExpression(ctx.expression()));
                num2 += 1;
                outFuncTrans += num2;
                if (ctx.e() != null) {
                    String num3 = ctx.e().getText();
                    outFuncTrans += "," + num3;
                }
                outFuncTrans += "):\n";


                for (SmallBasicGrammarParser.StatementContext statement : ctx.statement()) {
                    visit(statement);
                }
                ident -= 1;

                return outFuncTrans;
            }


            @Override
            public String visitWhile_loop (SmallBasicGrammarParser.While_loopContext ctx){
                ident += 1;
                outFuncTrans += "while ";
                String expr = visitExpression(ctx.expression());
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


                outFuncTrans += ctx.identifier().getText();
                outFuncTrans += visitCharacteristic(ctx.characteristic())+ "\n";

                return outFuncTrans;
            }

            @Override public String visitBuildit(SmallBasicGrammarParser.BuilditContext ctx) {
                outFuncTrans += ctx.getText() + "\n";
                return outFuncTrans;
            }

            @Override
            public String visitOprel(SmallBasicGrammarParser.OprelContext ctx) {

                String value = "";



                return super.visitOprel(ctx);
            }

            @Override
            public String visitCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx) {


                String character = ctx.getText();
                String result = "";


                if (character.charAt(0) == '='){
                    result += "=";
                    result += visitExpression(ctx.expression());
                }
                else
                    if (character.charAt(0) == ':'){
                        return null;
                    }

                    else result += character;

                return result;
            }

            @Override
            public String visitExpression (SmallBasicGrammarParser.ExpressionContext ctx){


                String valor = ctx.getText();
                String valueExpression = "";
                boolean Check = false;
                String temp = "";



                char[] values = new char[valor.length()];



                for (int i = 0; i < valor.length(); i++) {
                    values[i] = valor.charAt(i);
                }



                for (int i = 0; i < valor.length(); i++) {

                    if (values[i] == '<'){
                        if (i+1 < valor.length()){
                            temp = "" + values[i] + values[i+1];

                        }
                    }
                    else temp = "" + values[i];


                    if ( ((temp.equals("=") && (values[i-1] != '<' && values[i-1]!= '>') ) || temp.equals("<>")) ){

                        if ( temp.equals("=") ){


                            valueExpression+= "==";
                        }
                        else {
                            valueExpression+= "!=";
                            Check = true;
                        }
                    }
                    else
                        if (Check == true){
                            Check = false;
                            continue;
                        }
                        else valueExpression += values[i];
                }



                return valueExpression;

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

