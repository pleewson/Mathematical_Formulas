import java.util.*;

public class Areas {
    public static ArrayList<String> areaList = new ArrayList<>();

    static {
        areaList.add("Square");
        areaList.add("Rectangle");
        areaList.add("Triangle");
        areaList.add("Rhombus");
        areaList.add("Trapezoid");
        areaList.add("Regular polygon");
        areaList.add("Circle");
        areaList.add("Cone (lateral surface)");
        areaList.add("Sphere (surface area)");
    }


          //formulas
    public static void squareArea() {
        System.out.println("l - length of side");
        System.out.println(COLOR.YELLOW_TEXT + "A = l^2" + COLOR.RESET);
    }

    public static void rectangleArea() {
        System.out.println("w - width");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "A = w * h" + COLOR.RESET);
    }

    public static void triangleArea() {
        System.out.println("b - base");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "A = (b*h)/2" + COLOR.RESET);
    }

    public static void rhombusArea() {
        System.out.println("D - large digitional");
        System.out.println("d - small digitional");
        System.out.println(COLOR.YELLOW_TEXT + "A = (D * d)/2" + COLOR.RESET);
    }

    public static void trapezoidArea(){
        System.out.println("B - large side");
        System.out.println("b - small side");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "A = (B + b)/2 * h" + COLOR.RESET);
    }

    public static void regularPolygonArea(){
        System.out.println("P - perimeter");
        System.out.println("a - apothem");
        System.out.println(COLOR.YELLOW_TEXT + "A = (P/2) * a" + COLOR.RESET);
    }

    public static void circleArea(){
        System.out.println("r - radius");
        System.out.println("P - perimeter");
        System.out.println("A = πr^2");
        System.out.println(COLOR.YELLOW_TEXT + "P = 2πr" + COLOR.RESET);
    }

    public static void coneArea(){
        System.out.println("r - radius");
        System.out.println("s - slant height");
        System.out.println(COLOR.YELLOW_TEXT + "A = πr * s" + COLOR.RESET);
    }

    public static void sphereArea(){
        System.out.println("r - radius");
        System.out.println(COLOR.YELLOW_TEXT + "A = 4πr^2" + COLOR.RESET);
    }


//printer
    public static void selectFormulaAREA(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Select formula:");

        while (true) {
            int numberOfFormnula = scan.nextInt();

            if (numberOfFormnula > formulaList.size() || numberOfFormnula < 1) {
                System.out.println(COLOR.RED_TEXT + "Invalid number, try again." + COLOR.RESET);
            } else {

                switch (numberOfFormnula) {
                    case 1 -> squareArea();
                    case 2 -> rectangleArea();
                    case 3 -> triangleArea();
                    case 4 -> rhombusArea();
                    case 5 -> trapezoidArea();
                    case 6 -> regularPolygonArea();
                    case 7 -> circleArea();
                    case 8 -> coneArea();
                    case 9 -> sphereArea();
                    default -> System.out.println("Invalid number");

                }
                break;
            }
        }
    }
}
