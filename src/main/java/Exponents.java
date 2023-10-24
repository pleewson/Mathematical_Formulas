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


    public static void productFormula(){
        System.out.println(COLOR.YELLOW_TEXT + "a^m * a^n = a^(m+n)"  + COLOR.RESET);
        System.out.println("ex: 3^5 * 3^2 = 3^(5+2) = 3^7");

        System.out.println("\n" + COLOR.YELLOW_TEXT + "a^m * b^m = (a*b)^m" + COLOR.RESET);
        System.out.println("ex: 3^5 * 2^5 = (3*2)^5 = 6^5");

        System.out.println("\n" + COLOR.YELLOW_TEXT + "a^m / a^n = a^(m-n)" + COLOR.RESET);
        System.out.println("ex: 3^7 / 3^2 = 3^(7-2) = 3^5");
    }


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
                    default -> System.out.println(COLOR.RED_TEXT + "Invalid number" + COLOR.RESET);
                }
                break;
            }
        }
    }
}
