import java.util.Arrays;

public class PrimarySchool {
    public static void main(String[] args) {
        String[] formulaList = new String[10];
        formulaList[0] = "Basic Triangle Area Formula";
        formulaList[1] = "Square Field";
        formulaList[2] = "Diagonal of a square"; //przekatna kwadratu

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

   /* public void increaseArray(String[] Array, String formulaName){
        Array = Arrays.copyOf(Array, Array.length+1);
        Array[Array.length-1] = formulaName;
    }

    */
}
