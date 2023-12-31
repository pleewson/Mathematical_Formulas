import java.util.ArrayList;
import java.util.Scanner;

public class Exponents {

    public static ArrayList<String> exponentsList = new ArrayList<>();

    static{
        exponentsList.add("Product");
        exponentsList.add("Quotient");
        exponentsList.add("Power of Power");
        exponentsList.add("Zero Exponents");
        exponentsList.add("Negative Exponents");
        exponentsList.add("Fractional Exponents");
    }
    
    //enls


    //case -> 1
    public static void productFormula(){
        System.out.println(COLOR.YELLOW_TEXT + "a^m * a^n = a^(m+n)"  + COLOR.RESET);
        System.out.println("ex: 3^5 * 3^2 = 3^(5+2) = 3^7");

        System.out.println("\n" + COLOR.YELLOW_TEXT + "a^m * b^m = (a*b)^m" + COLOR.RESET);
        System.out.println("ex: 3^5 * 2^5 = (3*2)^5 = 6^5");

        System.out.println("\n" + COLOR.YELLOW_TEXT + "a^m / a^n = a^(m-n)" + COLOR.RESET);
        System.out.println("ex: 3^7 / 3^2 = 3^(7-2) = 3^5");
    }


    //case -> 2
    public static void quotientFormula(){
        System.out.println(COLOR.YELLOW_TEXT + "a^m / a^n = a^(m-n)" + COLOR.RESET);
        System.out.println("ex: 3^7 / 3^2 = 3^(7-2) = 3^5");
        System.out.println("\n" + COLOR.YELLOW_TEXT + "a^m / b^m = (a/b)^m" + COLOR.RESET);
        System.out.println("ex: 6^5 / 2^5 = (6/2)^5 = 3^5");
        System.out.println("ex: 5^3 / 2^3 = (5/2)^3");
    }


    //case ->3
    //public static void




    public static void selectFormulaEXPONENTS(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Select formula:");

        while (true) {
            int numberOfFormnula = scan.nextInt();

            if (numberOfFormnula > formulaList.size() || numberOfFormnula < 1) {
                System.out.println(COLOR.RED_TEXT + "Invalid number, try again." + COLOR.RESET);
            } else {
                switch(numberOfFormnula){
                    case 1 -> productFormula();
                    case 2 -> quotientFormula();
                    default -> System.out.println(COLOR.RED_TEXT + "Invalid number" + COLOR.RESET);
                }
                break;
            }
        }
    }
}
