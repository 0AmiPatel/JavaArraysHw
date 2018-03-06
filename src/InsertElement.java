import java.util.Scanner;

public class InsertElement {

    // EXERCISE - 5 :INSERT AN ELEMENT INTO AN ARRAY - SPECIFIC POSITION


    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int arr[]=new int[10+1];                            //array - 11 elements
        System.out.println("Enter 10 values : ");               //insert 10 values into array
        for (int i=0; i<10;i++){                            //using for loop

            arr[i] = sc.nextInt();

        }


        System.out.println( "enter the positon where you want to insert an element");
        int position = sc.nextInt();

        System.out.println("Enter the element you want to insert");
        int e = sc.nextInt();

        for(int i=9; i>=(position-1);i--){         //if i is less than position-1, loop will stop

            arr[i+1]= arr[i];                       //arr[i] value will be moved to the next position.

        }
        arr[position -1] = e;       //value e will be inserted on the position-1

        System.out.println("After inserting an element");
        for(int i=0; i<10;i++){

            System.out.println(arr[i] + " ");
        }
        System.out.println( arr[10]);

    }

}
