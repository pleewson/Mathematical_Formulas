public class PrimarySchool {

   /* private int a;
    private int b;
    private int c;
    private int h;

    private double a;
    private double b;
    private double c;
    private double h;

    */

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
}
