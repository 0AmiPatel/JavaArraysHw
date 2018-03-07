import java.util.Scanner;
    //exercise 10 -- 2d matrix transpose rows into columns
public class TransposedMetrix {


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix of rows .");

        int r,c;
        r= sc.nextInt();
        System.out.println("Enter the matrix of columns .");
        c=sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements...please use space between two values in the same row");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++) {

                System.out.println( "Transposed Matrix: ");
                System.out.print( matrix[j][i] + " ");
                }
            System.out.print("\n");
        }

     }



}