import java.util.*;

public class PrimarySchool {
    public static ArrayList <String> formulaListPRIMARYSCHOOL = new ArrayList<>();

    static {
        formulaListPRIMARYSCHOOL.add("1. Basic Triangle Area Formula");
        formulaListPRIMARYSCHOOL.add("2. Square Field");
        formulaListPRIMARYSCHOOL.add("3. Diagonal of a square");  //przekatna kwadratu
    }


    public static void triangleArea(){
        System.out.println("Basic Triangle Area Formula = \n 1/2 b * h");
    }

    public static void squareField(){
        System.out.println("Square Field = \n a^2");
    }

    public static void diagonalSquare(){
        System.out.println("Diagonal of a square = \n a√2");
    }
}
