import java.util.*;

public class Methods {

    public static void start() {
        System.out.println("Hello! Choose kind of Mathematical Formulas you looking for:" + '\n');

        ArrayList<String> mainFormulas = new ArrayList<>();
        mainFormulas.add("1. Areas");
        mainFormulas.add("2. Volumens");
        mainFormulas.add("3. Functions and equantions");
        mainFormulas.add("4. Exponents");

        for(String print : mainFormulas){
            System.out.println(print);
        }

        System.out.println("\nChoose name or hit number to select kind of formula:");

    }

    public static void chooseFormulaType() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String select = scan.next();
            if (select.equals("1") || select.equalsIgnoreCase("Areas")) {
                System.out.println("Areas - Formulas list:" + '\n');

                printFormulaList(Areas.areaList);
                Areas.selectFormulaAREA(Areas.areaList);

                break;

            } else if (select.equals("2") || select.equalsIgnoreCase("Volumens")) {
                System.out.println("Volumens - Formulas list" + '\n');

                printFormulaList(Volumens.volumensList);
                Volumens.selectFormulaVOLUEME(Volumens.volumensList);
                break;

            } else if (select.equals("3") || select.equalsIgnoreCase(("Functions and equantions"))) {
                System.out.println("Fonctions and equantions - Formulas list" + '\n');
                break;

            } else if(select.equals("4") || select.equalsIgnoreCase("Exponents")){
                System.out.println("Exponents - Formula list" + "\n");
                printFormulaList(Exponents.exponentsList);
                Exponents.selectFormulaEXPONENTS(Exponents.exponentsList);


            } else {
                System.out.println(COLOR.RED_TEXT + "Incorrect enter, try again." + COLOR.RESET);
            }
        }
    }


    public static void printFormulaList(ArrayList<String> formulaList) {
        short n = 1;

        Iterator<String> iterator = formulaList.iterator();
        while (iterator.hasNext()) {
            String print = iterator.next();
            System.out.println(n + ". " + print);
            n++;

        }
    }
}
