public class CountWordnSpaces
{

            // count the number of words and number of spaces in the sentance.


    //or your method:
    //public void method(String... strs);
    //You can call it as:
    //method(str)
    //method(str1, str2)
    //method(str1,str2,str3)
    //Any no of arugments would work. In other worlds it is a replacement for:
    // public void method(String[] str);
        public static void main(String...s)

        {
            int word=1;
            String str="count number of words and sapces";

            for(int i=0;i<str.length();++i)
            {
                if(str.charAt(i)==' ')
                    word++;
            }

            System.out.println("Number of words="+word);
            System.out.println("Number of spaces="+(word-1));
        }


}
