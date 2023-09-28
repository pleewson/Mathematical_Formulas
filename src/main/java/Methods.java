import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static void start(){
        System.out.println("Hello! Choose kind of Mathematical Formulas you looking for:" +'\n');
        printListOfSchools();
        System.out.println("Choose name or hit number to select level of school:");

    }


    public static void printListOfSchools(){
        System.out.println("1. Primary School");
        System.out.println("2. High School");
        System.out.println("3. University" + '\n');
    }


    public static void printFormulaList(List<String> formulaList){
        Iterator <String> iterator = PrimarySchool.formulaListPRIMARYSCHOOL.iterator();
        while (iterator.hasNext()){
            String result = iterator.next();
            System.out.println(result);
        }
    }


    public static void chooseFormula(String select, String[] formulaArray){
        for(int i = 0; i < formulaArray.length; i++){
            if(Integer.parseInt(select)-1 == i) {
                System.out.println(formulaArray[i]);
                break;
            }
        }
    }


    public static void chooseLevelSchool() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String select = scan.next();
            if (select.equals("1") || select.equalsIgnoreCase("Primary School")) {
                System.out.println("Primary School - Formulas list:" + '\n');

                printFormulaList(PrimarySchool.formulaListPRIMARYSCHOOL);

                select = scan.next();
                Methods.chooseFormula(select, PrimarySchool.formulaListPRIMARYSCHOOL);
                break;

            } else if (select.equals("2") || select.equalsIgnoreCase("High School")) {
                System.out.println("High School - Formulas list" + '\n');
                break;

            } else if (select.equals("3") || select.equalsIgnoreCase(("University"))) {
                System.out.println("University - Formulas list" + '\n');
                break;

            }else{
                System.out.println("Incorrect enter, try again.");
            }
        }
    }


    /* public static void icreaseArray(String[] arrayToIncrease, String text){
        arrayToIncrease = Arrays.copyOf(arrayToIncrease,arrayToIncrease.length+1);
        arrayToIncrease[arrayToIncrease.length-1] = text;

    }
    */
}
