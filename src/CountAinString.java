import java.util.Scanner;
//exercise 12  count letter a in the String
public class CountAinString {

        public static void main(String Args[]){

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter only single WORD: ");
            String someString = sc.next();
            char myChar = 'a';
            int count = 0;

            for (int i = 0; i < someString.length(); i++) {
                    if (someString.charAt(i) == myChar) {  //compares the string charactor index with a
                        count++;
                    }

                }
            System.out.println( count);
            }
}
