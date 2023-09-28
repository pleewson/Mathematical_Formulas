import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimarySchool {
    public static Map<String, Integer> formulaListPRIMARYSCHOOL = new HashMap<>();


    static {
        formulaListPRIMARYSCHOOL.put("1. Basic Triangle Area Formula", "<formula>");
        formulaListPRIMARYSCHOOL.put("Square Field", "<formula>");
        formulaListPRIMARYSCHOOL.put("Diagonal of a square", "<formula>");
    }
    private double result;

    public void triangleArea(double a, double h){
        printFormulas("Triangle Area","1/2 a * h");
        this.result = 1/2 * a * h;
       // printResult("1/2" + " " + h );
    }


    public static void printFormulas(String formulasName, String formula){
        System.out.println("Formulas - " + formulasName + '\n' + formula);
    }


    public static void printResult(String formulaData, double result){
        System.out.println(formulaData + result);
    }


    //not using. Method that increase Array by 1
   /* public void increaseArray(String[] Array, String formulaName){
        Array = Arrays.copyOf(Array, Array.length+1);
        Array[Array.length-1] = formulaName;
    }

    */
}
