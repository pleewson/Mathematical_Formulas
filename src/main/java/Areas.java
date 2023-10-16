import java.util.*;

public class Areas {
    public static ArrayList<String> areaList = new ArrayList<>();

    static {
        areaList.add("Square");
        areaList.add("Rectangle");
        areaList.add("Triangle");
    }


    public static void squareArea() {
        System.out.println("l - length of side");
        System.out.println("A = l^2");
    }

    public static void rectangleArea() {
        System.out.println("w - width");
        System.out.println("h - height");
        System.out.println("A = w * h");
    }

    public static void triangleArea() {
        System.out.println("b - base");
        System.out.println("h - height");
        System.out.println("A = (b*h)/2");
    }


    public static void selectFormulaAREA(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Select formula:");

        while (true) {
            int numberOfFormnula = scan.nextInt();

            if (numberOfFormnula > formulaList.size() || numberOfFormnula < 1) {
                System.out.println("Invalid number, try again.");
            } else {

                switch (numberOfFormnula) {
                    case 1:
                        Areas.squareArea();
                        break;
                    case 2:
                        Areas.rectangleArea();
                        break;
                    case 3:
                        Areas.triangleArea();
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;
                }

                break;
            }
        }
    }
}
