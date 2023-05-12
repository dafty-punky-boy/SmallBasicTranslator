import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.LinkedList;

public class SmallIdentifier extends SmallBasicGrammarBaseListener {
    SmallBasicGrammarParser parser;
    TranslateInfo infoT;
    int ident;

    public SmallIdentifier(SmallBasicGrammarParser parser, TranslateInfo infoT) {
        this.parser = parser;
        this.infoT = infoT;
        this.ident = 0;
    }

    @Override
    public void enterIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx) {
        if(infoT.symbolTab.containsKey(ctx.identifier().ID().getText()) ||
            ctx.characteristic().expression() == null) return;

        String id = ctx.identifier().ID().getText();

        if(ctx.identifier().array() != null) {
            LinkedList<String> mapTypes = new LinkedList<String>();
            for(SmallBasicGrammarParser.ExpressionContext context : ctx.identifier().array().expression()) {
                mapTypes.add(identifyType(context));
            }

            infoT.symbolTab.put(id, "map");
            infoT.mapTypes.put(id, mapTypes);
        }
        else {
            infoT.symbolTab.put(id, identifyType(ctx.characteristic().expression()));
        }
    }


}
