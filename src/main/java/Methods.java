
public class Methods {

    public static void start(){
        System.out.println("Hello! Choose kind of Mathematical Formulas you looking for:" +'\n');
        printListOfSchools();
        System.out.println("Choose name or hit number to select formula:");

    }



    public static void printListOfSchools(){
        System.out.println("1. Primary School");
        System.out.println("2. High School");
        System.out.println("3. University" + '\n');
    }



    public static void printFormulaArray(String[] formulaArray){
        for(String formulas : formulaArray){
            System.out.println(formulas);
        }
    }




}
