import java.util.Arrays;

public class PrimarySchool {


    private String[] formulaList = new String[0];





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

    protected void increaseArray(String formulaName){
        this.formulaList = Arrays.copyOf(formulaList, formulaList.length+1);
        this.formulaList[formulaList.length-1] = formulaName;
    }
}
