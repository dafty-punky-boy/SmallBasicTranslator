import java.util.HashMap;
import java.util.LinkedList;

public class TranslateInfo {
    public HashMap<String, String> symbolTab;
    public LinkedList<String> funcTrans;
    public HashMap<String, LinkedList<String>> mapTypes;

    public TranslateInfo() {
        this.symbolTab = new HashMap<String, String>();
        this.funcTrans = new LinkedList<String>();
        this.mapTypes = new HashMap<String, LinkedList<String>>();
    }
}
