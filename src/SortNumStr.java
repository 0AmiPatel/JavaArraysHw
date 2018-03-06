import java.util.Arrays;

public class SortNumStr {

    //  SORT NUMBER AND STRINGS

        public static void main (String args[]){

            int[] num = {
                222, 675, 567,234,324,433,423,422,342,123

            };
            String str[]= {

                    "Id", "Class","Name","Css Selector", "Xpath", "Link"
            };

            System.out.println( "Original Array" + Arrays.toString(num));
            Arrays.sort(num);
            System.out.println( "sorted array of Numbers"+ Arrays.toString(num));

            System.out.println( "Original Array " + Arrays.toString(str));
            Arrays.sort(str);
            System.out.println("sorted Array of strings" + Arrays.toString(str));


        }


}
