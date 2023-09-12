import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        Methods.start();

        String select = scan.nextLine();

            if (select.equals("1") || select.equalsIgnoreCase("Primary School")) {
                System.out.println("Primary School - Formulas list:" +'\n');

                Methods.printFormulaArray(PrimarySchool.formulaListPRIMARYSCHOOL);


            } else {
                System.out.println("Incorrect enter, try again.");

                //go back to beginning
            }






        //primary school
        //high school
        //university

        //if.. e.g. primary  ->  Methods.start();  -- > list of formulas that type.

        //choosen formula shows: name formula + formula    -> calculate and show equantion

        //some space '\n' and ask if you want some more formulas to calculate


        
        //if you type "RESET" it will move you to 1st stage.


    }
}
