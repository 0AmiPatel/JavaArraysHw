public class CountWordsSpacesNum {
            //exercise 13 - count words and spaces

    // Mmethod count
    public static void count(String x) {
        char[] ch = x.toCharArray();                         //  charactors of string x are stored as an array elements in array ch
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {                    //array elements will be checked if its letter
                letter++;
      //      } else if (Character.isDigit(ch[i])) {              //array elements will be checked if its digit
      //          num++;
            } else if (Character.isSpaceChar(ch[i])) {          //array elements will be checked if its space
                space++;
            } else {
                other++;
            }
        }


        System.out.println("hey Ram, What is your contact number? Isn't it 7499709204?");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);

    }

            //main method
    public static void main(String[] args) {
        String test = "hey Ram, What is your contact number? Isn't it 7499709204?";
       count(test);             //method count is called with parameter string -test

    }

}