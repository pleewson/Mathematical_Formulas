import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        Methods.start();

      //  String userType = scan.nextLine();

        while(scan.hasNextLine()) {
            if (scan.nextLine().equals("1") || scan.nextLine().equals("Primary School")) {
                System.out.println("Primary School - Formulas list");
                break;
            } else {
                System.out.println("Incorrect enter, try again.");
            }
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
