import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<String> test = new ArrayList<>();
        test.add("aaa");
        test.add("bbb");
        test.add("ccc");

       // System.out.println(test.get(1));


        while(true){
            int numberOfFormnula = scan.nextInt();

            if(numberOfFormnula > test.size() || numberOfFormnula < 1){
                System.out.println("Incorrect number, try again.");
            }else {
                System.out.println(test.get(numberOfFormnula-1));
                break; //continue
            }


        }



    }
}