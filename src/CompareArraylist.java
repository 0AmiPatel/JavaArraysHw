import java.util.ArrayList;
public class CompareArraylist {


    //compare two arraylist - exercise 15

    public static void main (String args[]){

        ArrayList<String> a1 = new ArrayList<String>(){{

            add(" Pink");
            add("Purple");
            add("White");
            add("Blue");

        }};
        ArrayList<String> s1= new ArrayList<String>(){{
            add("orange");
           add("Golden");
           add("Black");
           add("White");


        }};

        for (String x : a1){            //for each loop to compare with all a1 elements
          String c = (s1.contains(x) ? "Yes" : "No");
        System.out.println(c);
        }


    }
}
