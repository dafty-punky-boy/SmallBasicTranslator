import java.util.Arrays;
import java.util.ArrayList;
public class TranslateInfo {
    public String mainFlow;
    public String functions;

    public ArrayList<String> id = new ArrayList<String>();

    public TranslateInfo() {
        mainFlow = "";
        functions = "";
    }

    public void printTranslation() {
        System.out.print(functions);
        System.out.print(mainFlow);
    }
}
