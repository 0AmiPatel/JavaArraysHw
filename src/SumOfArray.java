import java.util.Arrays;

public class SumOfArray {

    public static void main(String args[]) {
        int result = 0;
        int[] num = {
                22, 75, 57, 34, 24, 43, 23, 22, 3, 12

        };



    for(int i = 0; i<num.length; i++ ){


         result = result + num[i];
        System.out.println( num[i]);
    }
        System.out.println( "Sum of these numbers is "+ result );

}
}
