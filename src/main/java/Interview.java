import java.util.Arrays;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        String s = "-aB";
        String res = alphabetsReverse(s);
        System.out.println(res);
}
    public static String alphabetsReverse(String s)
    {
        //Amazon Interview
/*
Given a string s, reverse the strings according to these rules:

1. Only reverse English letters (lowercase or uppercase) [a-z and A-Z] should be reversed
2. Any other letters should remain in same position


Example:
Input: s = “aA-bB”
Output:  “Bb-Aa”

Input: s = “aB-”
Output: “Ba-”

input s = "-aB"
*/
        List<Character> list = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
                ,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(list.contains(c)) sb.append(c);
        }
        char [] arr = sb.reverse().toString().toCharArray();//B,a
        char []res = new char[s.length()];
        for(int i=0,c=0;i<s.length();i++)
        {
            if(arr.length>=c && list.contains(s.charAt(i)))
            {
                res[i] = arr[c];
                c++;
            }
            else res[i] = s.charAt(i);//-,B,a
        }
        return new String(res);
    }
}
