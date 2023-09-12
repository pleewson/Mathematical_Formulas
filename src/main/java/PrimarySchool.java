import java.util.Arrays;

public class PrimarySchool {
    public static String[] formulaListPRIMARYSCHOOL = new String[3];


    static {
        formulaListPRIMARYSCHOOL[0] = "Basic Triangle Area Formula";
        formulaListPRIMARYSCHOOL[1] = "Square Field";
        formulaListPRIMARYSCHOOL[2] = "Diagonal of a square"; //przekatna kwadratu
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
