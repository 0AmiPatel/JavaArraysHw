import java.util.ArrayList;
import java.util.Scanner;

public class GetPosition{

    // exercise 17 - Get the position of perticular element in arraylist


        public static void main(String[] args) {
            ArrayList<String> a1 = new ArrayList<String>();
            a1.add("A");
            a1.add("B");
            a1.add("C");
            a1.add("D");
            a1.add("E");
            a1.add("F");
            a1.add("G");
            a1.add("H");
            a1.add("I");

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the element IN CAPITAL you want to find out Position of");
            String element = sc.next();


            System.out.println("Index of "+ element + " "+a1.indexOf(element));

        }

}
