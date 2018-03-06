public class ChkContainsVal {

    //example 7 : Write a Java program to find the duplicate values of an array of integer values.

        //Created a method named 'contains' with 2 parameters : array and int

            public static boolean contains(int[] arr, int item) {
                //initialized new int n
                for (int i : arr) {
                    if (item == i) {  // compares value of item and variable i
                        return true;// if item and n is same , returns true.
                      //  System.out.println(" it contains value");
                    }
                }
                return false;
            }


            public static void main(String[] args) {
                int[] my_array = { 89, 20, 99, 45, 13,58, 458, 12, 72, 145, 245};

                System.out.println(contains(my_array, 20)); //using contains method
                System.out.println(contains(my_array, 15));
            }



    }
