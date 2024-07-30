package Neetcode;

import java.util.Arrays;

public class PalindromeSentense {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        //" " True
        validPalindrome(s);

        String str ="pqrstuvwxyzabcdefghijklmno";
        String word ="leetcode";
        int n =word.length(),i=0,t=0,ans=0;
        while(n>0)
        {
            int indexOf = str.indexOf(word.charAt(i));
            ans = t - ans;
            t= indexOf;
            i++;
            n--;
            System.out.println(indexOf +"   *******************************");
        }
        System.out.println(ans+"#####################");
    }

    private static void validPalindrome(String s) {
        //remove special characters , : from string and concat

        String x = "   -42  ab c A";
        String y = (x.replaceAll("[a-zA-Z^]*",""));
        y.replaceAll("\\s", "");
        y.trim();
        //int n = Integer.parseInt(y);
        System.out.println(y);

        String t = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        System.out.println(t);
        StringBuilder sb = new StringBuilder(t);
        sb.reverse();
        if (t.equalsIgnoreCase(String.valueOf(sb)))
            System.out.println("PALINDROME SENTENCE");
        else
            System.out.println("NOT A VALID PALINDROME");

        //-------- 3 techniques ------
        String string= "[This#string%contains^special*characters&.]";
        String input = "[XYZ,ABC,123,A700,1700,model,manual]";
        input = input.replaceAll("[^a-zA-Z0-9,]","");
        System.out.println(input.replaceAll(",","||"));
        String []strings = input.split(",");
        System.out.println(Arrays.toString(strings));
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(string);

        String str1 = "Hello.+-^Java.+ -Programmer.^ ^^-- ^^^ +!";
        str1 = str1.replaceAll("[-+^]*", "][");
//str=str.replaceAll("\\W", " ")  [+^a-zA-Z]*  //we can also use this regular expression
        System.out.println(str1);

        //declare a string having special characters
        String str="Pr!ogr#am%m*in&g Lan?#guag(e";
        String resultStr="";
//loop execute till the length of the string
        for (int i=0;i<str.length();i++)
        {
//comparing alphabets with their corresponding ASCII value
            if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true
            {
//adding characters into empty string
                resultStr=resultStr + str.charAt(i);
            }
        }
        System.out.println(resultStr);
    }
}
