import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.LinkedList;

public class SmallIdentifier extends SmallBasicGrammarBaseListener {
    SmallBasicGrammarParser parser;
    String outFuncTrans;
    String funcTrans;
    boolean func;
    int ident;

    public SmallIdentifier(SmallBasicGrammarParser parser) {
        this.parser = parser;
        func = false;
        ident = 0;

        outFuncTrans = "";
        funcTrans = "";
    }

    @Override
    public void enterIdentifiersentences(SmallBasicGrammarParser.IdentifiersentencesContext ctx) {

    }


}
