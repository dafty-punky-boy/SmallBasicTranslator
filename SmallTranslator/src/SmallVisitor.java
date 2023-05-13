public class SmallVisitor extends SmallBasicGrammarBaseVisitor<String> implements
SmallBasicGrammarVisitor<String> {
    private int ident = 0;

    private void addIdent(String s) {
        for(int i = 0; i < ident; ++i) {
            s += "\t";
        }
    }

    @Override
    public String visitIdentifiersentences (SmallBasicGrammarParser.IdentifiersentencesContext ctx) {
        String translation = "";
        addIdent(translation);

        translation += visitIdentifier(ctx.identifier());
        translation += visitCharacteristic(ctx.characteristic());
        translation += "\n";

        return translation;
    }

    @Override
    public String visitIdentifier(SmallBasicGrammarParser.IdentifierContext ctx) {
        String translation = "";
        addIdent(translation);

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
            translation += ctx.expression().getText();
        }
        else {
            translation = ctx.getText();
        }

        return translation;
    }
}
