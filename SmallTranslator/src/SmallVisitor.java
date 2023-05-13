import org.antlr.runtime.tree.ParseTree;

public class SmallVisitor extends SmallBasicGrammarBaseVisitor<String> implements
SmallBasicGrammarVisitor<String> {
    private int ident;
    public TranslateInfo translateData;
    public boolean inFunc;

    private void addIndent(String s) {
        for(int i = 0; i < ident; ++i) {
            s += "\t";
        }
    }

    public SmallVisitor(TranslateInfo translateData) {
        super();
        ident = 0;
        inFunc = false;
        this.translateData = translateData;
    }

    @Override
    public String visitIdentifiersentences (SmallBasicGrammarParser.IdentifiersentencesContext ctx) {
        String translation = "";
        addIndent(translation);

        translation += visitIdentifier(ctx.identifier());
        translation += visitCharacteristic(ctx.characteristic());
        translation += "\n";

        if(inFunc) {
            translateData.functions += translation;
        }
        else {
            translateData.mainFlow += translation;
        }

        return translation;
    }

    @Override
    public String visitIdentifier(SmallBasicGrammarParser.IdentifierContext ctx) {
        String translation = "";
        addIndent(translation);

        translation += ctx.ID().getText();
        if(ctx.array() != null) {
            translation += ctx.array().getText();
        }

        return translation;
    }

    @Override
    public String visitCharacteristic(SmallBasicGrammarParser.CharacteristicContext ctx) {
        String translation = "";
        if(ctx.expression() != null) {
            translation += " = ";
            translation += visitExpression(ctx.expression());
        }
        else {
            translation = ctx.getText();
        }

        return translation;
    }

    @Override
    public String visitExpressionbool(SmallBasicGrammarParser.ExpressionboolContext ctx) {
        String translation = "";

        if(ctx.oplog() != null) {
            translation +=
        }
    }


}
