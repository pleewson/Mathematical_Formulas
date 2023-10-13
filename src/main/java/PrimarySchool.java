import java.util.*;

public class PrimarySchool {
    public static ArrayList <String> formulaListPRIMARYSCHOOL = new ArrayList<>();


    static {
        formulaListPRIMARYSCHOOL.add("1. Basic Triangle Area Formula");
        formulaListPRIMARYSCHOOL.add("2. Square Field");
        formulaListPRIMARYSCHOOL.add("3. Diagonal of a square");
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
