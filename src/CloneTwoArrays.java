import java.util.ArrayList;
import java.util.Iterator;


//incomplete programme
public class CloneTwoArrays {


    public static void main(String args[]) {
        ArrayList<String> firstArrayList = new ArrayList<>();
        firstArrayList.add("One");
        firstArrayList.add("Two");
        firstArrayList.add("Three");
        firstArrayList.add("Four");
        firstArrayList.add("Five");
        firstArrayList.add("Six");
        //copy array list content into another array list
        ArrayList<String> secondArrayList = new ArrayList<>();
        secondArrayList.addAll(firstArrayList);
        //print all the content of array list
        Iterator itr = secondArrayList.iterator();
         while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
