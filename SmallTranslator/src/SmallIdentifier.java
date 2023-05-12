import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.LinkedList;

public class SmallIdentifier extends SmallBasicGrammarBaseListener {
    SmallBasicGrammarParser parser;
    boolean func;
    int ident;

    public SmallIdentifier(SmallBasicGrammarParser parser) {
        this.parser = parser;
        this.func = false;
        this.ident = 0;
    }

    @Override
    public void enterIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx) {

    }


}
