import java.util.Arrays;
import java.util.Scanner;

public  class Javaex4
{
    public  static boolean isAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
           return  false;
        else
        {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return  Arrays.equals(str1Array,str2Array);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string 1 : ");
        String str1 = in.nextLine();
        System.out.println("Please enter the string 2 : ");
        String str2 = in.nextLine();

        str1 = str1.replace("\\s","").toLowerCase();
        str2 = str2.replace("\\s","").toLowerCase();

        if (isAnagram(str1,str2))
            System.out.println("String : " + str1 + " and " + str2 +" are Anagrams");
        else
            System.out.println("String : " + str1 + " and " + str2 +" are not Anagrams");

    }
}