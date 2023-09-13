import java.util.Arrays;
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



    public static void printFormulaArray(String[] formulaArray){
        for(int i = 0; i < formulaArray.length; i++){
            System.out.println(i+1 + ". " + formulaArray[i]);
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




    public static void ifPrimarySchool() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String select = scan.next();
            if (select.equals("1") || select.equalsIgnoreCase("Primary School")) {
                System.out.println("Primary School - Formulas list:" + '\n');

                Methods.printFormulaArray(PrimarySchool.formulaListPRIMARYSCHOOL);

                select = scan.next();
                Methods.chooseFormula(select, PrimarySchool.formulaListPRIMARYSCHOOL);
                break;


            } else {
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
