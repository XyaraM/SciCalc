package Actions;

public class Calculacion {
    public static int result;
    public static String resultStr;
    public static boolean fracverify;

    public void displayResult(){
        if (fracverify){
            textr(resultStr);
        }else{
            textr(String.valueOf(result));
        }
    }
    static void textr(String resultString) {
        System.out.println("El resultado es: " + resultString);
        System.out.println("--------------------------");
    }
}
