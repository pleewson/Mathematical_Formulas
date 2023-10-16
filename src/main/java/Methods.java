import java.util.*;

public class Methods {

    public static void start() {
        System.out.println("Hello! Choose kind of Mathematical Formulas you looking for:" + '\n');

        System.out.println("1. Areas");
        System.out.println("2. Volumens");
        System.out.println("3. Functions and equantions" + '\n');

        System.out.println("Choose name or hit number to select kind of formula:");

    }

    public static void chooseLevelSchool() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String select = scan.next();
            if (select.equals("1") || select.equalsIgnoreCase("Areas")) {
                System.out.println("Areas - Formulas list:" + '\n');

                printFormulaList(Areas.areaList);
                Areas.selectFormulaAREA(Areas.areaList);

                //  select = scan.next();
                // Methods.chooseFormula(select, PrimarySchool.areaList);
                break;

            } else if (select.equals("2") || select.equalsIgnoreCase("Volumens")) {
                System.out.println("Volumens - Formulas list" + '\n');
                break;

            } else if (select.equals("3") || select.equalsIgnoreCase(("Functions and equantions"))) {
                System.out.println("Fonctions and equantions - Formulas list" + '\n');
                break;

            } else {
                System.out.println("Incorrect enter, try again.");
            }
        }
    }


    public static void printFormulaList(ArrayList<String> formulaList) {
        Scanner scan = new Scanner(System.in);
        short n = 1;

        Iterator<String> iterator = formulaList.iterator();
        while (iterator.hasNext()) {
            String print = iterator.next();
            System.out.println(n + ". " + print);
            n++;
        }
    }
}
