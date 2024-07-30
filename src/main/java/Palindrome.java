import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {

        String s="ABCAB";
        List<Character> list = new ArrayList<>();
        int j=s.length()-1;
        for (int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                list.add(s.charAt(i));
            }
            j--;
        }
        System.out.println(list);
    }
}








