public class TranslateInfo {
    public String mainFlow;
    public String functions;

    public TranslateInfo() {
        mainFlow = "";
        functions = "";
    }

    public void printTranslation() {
        System.out.println(functions);
        System.out.print(mainFlow);
    }
}
