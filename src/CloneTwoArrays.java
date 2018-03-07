import java.util.ArrayList;
import java.util.Iterator;


//      Exercise 14 clone an array list to another array list
public class CloneTwoArrays {



        public static void main(String a[]){
            ArrayList<String> al = new ArrayList<String>()  //added elements in arraylist
            {{
                add("Sardar Patel");
                add("Shahid Bagatsinh");
                add("Subhashchandra Boze");
                add("Lala Lajpatrai");

            }};

            System.out.println("Original ArrayList: "+al);

            ArrayList<String> al2 = (ArrayList<String>)al.clone(); // using clone method


            System.out.println("Cloned ArrayList:"+al2);
        }

}
