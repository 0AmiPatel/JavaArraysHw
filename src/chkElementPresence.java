import java.util.ArrayList;
import java.util.Scanner;
        //exercise 16 - to check if element is present in arraylist or not?
public class chkElementPresence {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("pen");
        al.add("pencil");
        al.add("ink");
        al.add("notebook");


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element you want to cheack if its present in list");
        String s = sc.next();


        System.out.println("ArrayList contains " + s + " is: "
                + al.contains(s));


    }

    }


