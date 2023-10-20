import java.util.ArrayList;
import java.util.Scanner;

public class Volumens extends Areas {
    public static ArrayList<String> volumensList = new ArrayList<>();

    static{
        volumensList.add("Cube");
        volumensList.add("Parallelepiped");
        volumensList.add("Regular prism");
        volumensList.add("Cylinder");
        volumensList.add("Cone (or pyramid)");
        volumensList.add("Sphere");
    }

    public static void volumeCube(){
        System.out.println("s - side");
        System.out.println(COLOR.YELLOW_TEXT + "V = s^3" + COLOR.RESET);
    }

    public static void volumeParallelepiped(){
        System.out.println("l - length");
        System.out.println("w - width");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "V = l * w * h" + COLOR.RESET);
    }

    public static void volumeRegularPrism(){
        System.out.println("b - base");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "V = b * h" + COLOR.RESET);
    }

    public static void volumeCylinder(){
        System.out.println("r - radius");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "V = πr * h" + COLOR.RESET);
    }

    public static void volumeConeOrPyramid(){
        System.out.println("b - base");
        System.out.println("h - height");
        System.out.println(COLOR.YELLOW_TEXT + "V = 1/3b * h" + COLOR.RESET);
    }

    public static void volumeSphere(){
        System.out.println("r - radius");
        System.out.println(COLOR.YELLOW_TEXT + "V = 4/3πr^3" + COLOR.RESET);
    }


    public static void selectFormulaVOLUEME(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Select formula:");

        while (true) {
            int numberOfFormnula = scan.nextInt();

            if (numberOfFormnula > formulaList.size() || numberOfFormnula < 1) {
                System.out.println(COLOR.RED_TEXT + "Invalid number, try again." + COLOR.RESET);
            } else {
                switch(numberOfFormnula){
                    case 1 -> volumeCube();
                    case 2 -> volumeParallelepiped();
                    case 3 -> volumeRegularPrism();
                    case 4 -> volumeCylinder();
                    case 5 -> volumeConeOrPyramid();
                    case 6 -> volumeSphere();
                    default -> System.out.println(COLOR.RED_TEXT + "Invalid number" + COLOR.RESET);
                }
                break;
            }
        }
    }
}

       // System.out.println(COLOR.YELLOW_TEXT + " " + COLOR.RESET);

