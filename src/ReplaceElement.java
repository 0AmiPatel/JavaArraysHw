import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {

    //exercise 18 --replace perticular element in arraylist

    public static void main (String args[]){
        List<String> chocolates = new ArrayList<String>(){{

                add("Cadburys");
                add("Terrys");
                add("Ferrero");
                add("Kinder Beuno");
            }};

        // now, suppose you want to replace "Clean Coder" with
        // "Introduction to Algorithms"
        System.out.println("ArrayList before replace: " + chocolates);
        chocolates.set(1, "Kitkat");
        System.out.println("ArrayList after replace: " + chocolates);
    }


}
