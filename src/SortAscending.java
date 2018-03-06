import java.util.Arrays;
import java.util.Scanner;

public class SortAscending {

    //SORT NUMERICA VALUE IN ASCENDING ORDER


    public static void main (String args[]) {

        int arr[] =new int[10];

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Numbers in different order");

        for (int i=0; i<10;i++){                            //using for loop

              arr[i] = sc.nextInt();

        }


       System.out.println("Original Array" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted array of Numbers" + Arrays.toString(arr));
    }
}
