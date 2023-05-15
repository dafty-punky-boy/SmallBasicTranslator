
public class SmallVisitor extends SmallBasicGrammarBaseVisitor<Integer> implements
SmallBasicGrammarVisitor<Integer> {
    private int ident;
    public TranslateInfo translateData;
    public boolean inFunc;
    public boolean dec;

    private String addIndent() {
        String s = "";
        for(int i = 0; i < ident; ++i) {
            s += "    ";
        }

        return s;
    }

    public SmallVisitor(TranslateInfo translateData) {
        super();
        ident = 0;
        inFunc = false;
        dec = false;
        this.translateData = translateData;
    }

    @Override
    public Integer visitIdentifiersentences (SmallBasicGrammarParser.IdentifiersentencesContext ctx) {
        dec = true;

        if(inFunc) {
            translateData.functions += addIndent();

            if(ctx.identifier().array() == null) {
                if (ctx.characteristic().expression()!=null){
                    if(!translateData.id.contains(ctx.identifier().ID().getText())) {
                        translateData.functions += "global " + ctx.identifier().ID().getText() + "\n";
                        translateData.functions += addIndent();
                        translateData.id.add(ctx.identifier().ID().getText());
                    }
                  }
                }

            if (ctx.characteristic().getText().charAt(0) != ':'){

                visitIdentifier(ctx.identifier());
                visitCharacteristic(ctx.characteristic());
                translateData.functions += "\n";

            }

        }
        else {
            translateData.mainFlow += addIndent();

            if (ctx.characteristic().getText().charAt(0) != ':'){

                visitIdentifier(ctx.identifier());
                visitCharacteristic(ctx.characteristic());
                translateData.mainFlow += "\n";

            }

        }

        dec = false;

        return 1;
    }

    @Override
    public Integer visitIdentifier(SmallBasicGrammarParser.IdentifierContext ctx) {
        if(inFunc) {
            translateData.functions += ctx.ID().getText();
            if(ctx.array() != null) {
                translateData.functions += ctx.array().getText();
            }
        }
        else {
            translateData.mainFlow += ctx.ID().getText();
            if(ctx.array() != null) {
                translateData.mainFlow += ctx.array().getText();
            }
        }

        return 1;
    }

    @Override
    public Integer visitCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx) {
        if(inFunc) {
            if(ctx.expression() != null) {
                translateData.functions += " = ";
                visitExpression(ctx.expression());
                translateData.functions += "\n";
            }
            else {
                translateData.functions += ctx.getText() + "\n";
            }
        }
        else {
            if(ctx.expression() != null) {
                translateData.mainFlow += " = ";
                visitExpression(ctx.expression());
            }
            else {
                translateData.mainFlow += ctx.getText() + "\n";
            }
        }

        return 1;
    }

    @Override
    public Integer visitOplog(SmallBasicGrammarParser.OplogContext ctx) {
        if(inFunc) {
            translateData.functions += " " + ctx.getText() + " ";
        }
        else {
            translateData.mainFlow += " " + ctx.getText() + " ";
        }

        return 1;
    }

    @Override
    public Integer visitOprel(SmallBasicGrammarParser.OprelContext ctx) {

        if(inFunc) {
            if (ctx.getText().equals("=")){

                translateData.functions += " " + "==" + " ";

            }
            else
                if (ctx.getText().equals("<>")){
                    translateData.functions += " " + "!=" + " ";
                }
                else translateData.functions += " " + ctx.getText() + " ";

        }
        else {
            if (ctx.getText().equals("=")){

                translateData.mainFlow += " " + "==" + " ";

            }
            else
            if (ctx.getText().equals("<>")){
                translateData.mainFlow += " " + "!=" + " ";
            }
            else translateData.mainFlow += " " + ctx.getText() + " ";
        }

        return 1;
    }

    @Override
    public Integer visitOpsum(SmallBasicGrammarParser.OpsumContext ctx) {
        if(inFunc) {
            translateData.functions += " " + ctx.getText() + " ";
        }
        else {
            translateData.mainFlow += " " + ctx.getText() + " ";
        }

        return 1;
    }

    @Override
    public Integer visitOpmult(SmallBasicGrammarParser.OpmultContext ctx) {
        if(inFunc) {
            translateData.functions += ctx.getText();
        }
        else {
            translateData.mainFlow += ctx.getText();
        }

        return 1;
    }

    @Override
    public Integer visitLiteral(SmallBasicGrammarParser.LiteralContext ctx) {
        if(inFunc) {
            if(ctx.TRUE() != null) translateData.functions += "True";
            else if (ctx.FALSE() != null) translateData.functions +=  "False";
            else if (ctx.expression() != null) {
                if (ctx.minus() != null) {
                    translateData.functions += "-(";
                }
                else {
                    translateData.functions += "(";
                }
                visitExpression(ctx.expression());
                translateData.functions += ")";
            }
            else if (ctx.buildit() != null) {
                if (ctx.minus() != null) {
                    translateData.functions += "-";
                }
                visitBuildit(ctx.buildit());
            }
            else if (ctx.identifier() != null) {
                if (ctx.minus() != null) {
                    translateData.functions += "-";
                }
                visitIdentifier(ctx.identifier());
            }
            else translateData.functions += ctx.getText();
        }
        else {
            if(ctx.TRUE() != null) translateData.mainFlow += "True";
            else if (ctx.FALSE() != null) translateData.mainFlow +=  "False";
            else if (ctx.expression() != null) {
                if (ctx.minus() != null) {
                    translateData.mainFlow += "-(";
                }
                else {
                    translateData.mainFlow += "(";
                }
                visitExpression(ctx.expression());
                translateData.mainFlow += ")";
            }
            else if (ctx.buildit() != null) {
                if (ctx.minus() != null) {
                    translateData.mainFlow += "-";
                }
                visitBuildit(ctx.buildit());
            }
            else if (ctx.identifier() != null) {
                if (ctx.minus() != null) {
                    translateData.mainFlow += "-";
                }
                visitIdentifier(ctx.identifier());
            }
            else translateData.mainFlow += ctx.getText();
        }

        return 1;
    }
    @Override
    public Integer visitBuildit(SmallBasicGrammarParser.BuilditContext ctx) {
        if(inFunc) {
            if(!dec) translateData.functions += addIndent();

            if(ctx.buildit_words().txtwindow() != null) {
                if(ctx.buildit_words().txtwindow().TXTWINDOW().getText().equals("Read")) {
                    translateData.functions += "input()";
                }
                else {
                    translateData.functions += "print(";
                    visitExpression(ctx.expression(0));

                    if(ctx.buildit_words().txtwindow().TXTWINDOW().getText().equals("WriteLine")) {
                        translateData.functions += ")";
                    }
                    else {
                        translateData.functions+= ", end=\"\")";
                    }
                }
            }

            if(!dec) translateData.functions += "\n";
        }
        else {
            if(!dec) translateData.mainFlow += addIndent();

            if(ctx.buildit_words().txtwindow() != null) {
                if(ctx.buildit_words().txtwindow().TXTWINDOW().getText().equals("Read")) {
                    translateData.mainFlow += "input()";
                }
                else {
                    translateData.mainFlow += "print(";
                    visitExpression(ctx.expression(0));
                    if(ctx.buildit_words().txtwindow().TXTWINDOW().getText().equals("WriteLine")) {
                        translateData.mainFlow += ")";
                    }
                    else {
                        translateData.mainFlow += ", end=\"\")";
                    }
                }
            }

            if(!dec) translateData.mainFlow += "\n";
        }

        return 1;
    }

    @Override
    public Integer visitSub(SmallBasicGrammarParser.SubContext ctx) {
        inFunc = true;
        ++ident;

        translateData.functions += "def " + ctx.ID().getText() + "():\n";
        visitChildren(ctx);
        translateData.functions += "\n";

        --ident;
        inFunc = false;

        return 1;
    }

    @Override
    public Integer visitWhile_loop(SmallBasicGrammarParser.While_loopContext ctx) {
        if(inFunc) {
            translateData.functions += "\n" + addIndent() + "while ";
            visitExpression(ctx.expression());
            translateData.functions += ":\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }
        else {
            translateData.mainFlow += "\n" + addIndent() + "while ";
            visitExpression(ctx.expression());
            translateData.mainFlow += ":\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }

        return 1;
    }

    @Override
    public Integer visitFor_loop(SmallBasicGrammarParser.For_loopContext ctx) {
        if(inFunc) {
            translateData.functions += "\n" + addIndent() + "for " +
                    ctx.identifiersentences().identifier().ID().getText() +
                    " in range(" + ctx.identifiersentences().characteristic().expression().getText() +
                    ", ";
            visitExpression(ctx.expression());
            translateData.functions += " + 1";
            if(ctx.e() != null) {
                translateData.functions += ", ";
                visitE(ctx.e());
            }
            translateData.functions += "):\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }
        else {
            translateData.mainFlow += "\n" + addIndent() + "for " +
                    ctx.identifiersentences().identifier().ID().getText() +
                    " in range(" + ctx.identifiersentences().characteristic().expression().getText() +
                    ", ";
            visitExpression(ctx.expression());
            translateData.mainFlow += " + 1";
            if(ctx.e() != null) {
                translateData.mainFlow += ", ";
                visitE(ctx.e());
            }
            translateData.mainFlow += "):\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;

        }
        return 1;
    }

    @Override
    public Integer visitIf_statement(SmallBasicGrammarParser.If_statementContext ctx) {
        if(inFunc) {
            translateData.functions += "\n" + addIndent() + "if ";
            visitExpression(ctx.expression());
            translateData.functions += ":\n";

        }
        else {
            translateData.mainFlow += "\n" + addIndent() + "if ";
            visitExpression(ctx.expression());
            translateData.mainFlow += ":\n";
        }
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
            if(ctx.elseif() != null) {
                i = 0;

                while(ctx.elseif(i) != null) {
                    visitElseif(ctx.elseif(i));
                    ++i;
                }
            }

            if(ctx.else_() != null) visitElse(ctx.else_());
        if(inFunc) {
            translateData.functions += "\n";
        }
        else {
            translateData.mainFlow += "\n";
        }

        return 1;
    }

    @Override
    public Integer visitElseif(SmallBasicGrammarParser.ElseifContext ctx) {
        if(inFunc) {
            translateData.functions += "\n" + addIndent() + "elif ";
            visitExpression(ctx.expression());
            translateData.functions += ":\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }
        else {
            translateData.mainFlow += "\n" + addIndent() + "elif ";
            visitExpression(ctx.expression());
            translateData.mainFlow += ":\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }

        return 1;
    }

    @Override
    public Integer visitElse(SmallBasicGrammarParser.ElseContext ctx) {
        if(inFunc) {
            translateData.functions += "\n" + addIndent() + "else:\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }
        else {
            translateData.mainFlow += "\n" + addIndent() + "else:\n";
            ++ident;
            int i = 0;

            while(ctx.statement(i) != null) {
                visitChildren(ctx.statement(i));
                ++i;
            }

            --ident;
        }

        return 1;
    }

}

