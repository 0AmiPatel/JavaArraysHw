import java.util.Scanner;

public class CountAinString {

        public static void main(String Args[]){

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the word: ");
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
