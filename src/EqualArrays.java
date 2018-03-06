import java.util.Arrays;

public class EqualArrays {


    public static void main(String args[]){


            int arr1[] = {1, 2, 3,4,5};
            int arr2[] = {1, 2, 3,4,5};

            if (Arrays.equals(arr1, arr2)) {  //used inbuilt method equals to compare two arrays
                System.out.println("Same");
            }else {
                System.out.println("Not same");
            }

        }

}
