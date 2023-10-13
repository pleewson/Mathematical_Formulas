import java.util.*;

public class Methods {

    public static void start() {
        System.out.println("Hello! Choose kind of Mathematical Formulas you looking for:" + '\n');

        System.out.println("1. Primary School");
        System.out.println("2. High School");
        System.out.println("3. University" + '\n');

        System.out.println("Choose name or hit number to select level of school:");

    }

    public static void chooseLevelSchool() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String select = scan.next();
            if (select.equals("1") || select.equalsIgnoreCase("Primary School")) {
                System.out.println("Primary School - Formulas list:" + '\n');

                printFormulaList(PrimarySchool.formulaListPRIMARYSCHOOL);

                //  select = scan.next();
                // Methods.chooseFormula(select, PrimarySchool.formulaListPRIMARYSCHOOL);
                break;

            } else if (select.equals("2") || select.equalsIgnoreCase("High School")) {
                System.out.println("High School - Formulas list" + '\n');
                break;

            } else if (select.equals("3") || select.equalsIgnoreCase(("University"))) {
                System.out.println("University - Formulas list" + '\n');
                break;

            } else {
                System.out.println("Incorrect enter, try again.");
            }
        }
    }


    public static void printFormulaList(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);

        Iterator<String> iterator = PrimarySchool.formulaListPRIMARYSCHOOL.iterator();
        while (iterator.hasNext()) {
            String print = iterator.next();
            System.out.println(print);
        }

        System.out.println("\n Select formula:");

        while (true) {
            int numberOfFormnula = scan.nextInt();

            if (numberOfFormnula > formulaList.size() || numberOfFormnula < 1) {
                System.out.println("Invalid number, try again.");
            } else {

                switch(numberOfFormnula) {
                    case 1:
                        PrimarySchool.triangleArea();
                        break;
                    case 2:
                        PrimarySchool.squareField();
                        break;
                    case 3:
                        PrimarySchool.diagonalSquare();
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
