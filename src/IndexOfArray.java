public class IndexOfArray {

            // ex 4 - index of an array element

    int  findArrayIndex(int arr[], int val){   // created method with 2 parameters -which returns integer

        for (int i=0;i<arr.length ; i++){
            if(arr[i]==val){                //array values are compared with the specific value
                return i;                //if both values are same it will return index number
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int arr[] = {11,22,44,33,55};

        IndexOfArray index = new IndexOfArray();            //object created
        int number = index.findArrayIndex(arr , 33);    // parameters are passed in the method and return value is stored in number
        System.out.println( "Index of 33 is " + number);
    }
}
