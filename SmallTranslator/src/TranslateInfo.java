import java.util.HashMap;
import java.util.LinkedList;

public class TranslateInfo {
    public HashMap<String, String> symbolTab;
    public LinkedList<String> funcTrans;

    public TranslateInfo() {
        this.symbolTab = new HashMap<String, String>();
        this.funcTrans = new LinkedList<String>();
    }
}
