public class ReverseArray {


            // EXAMPLE 6 Reverse an Array
public static void main(String args[]) {

    int arr[]= {11,22,33,44,55,66};

    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }

    for(int i=0;i<arr.length;i++) {
        System.out.println("Reverse order :  "+ arr[i]);
    }
}

}
