package Leetcode;

public class P1961 {
    public static void main(String[] args) {
        String s="a";
        String []words = {"aa","aaaa","banana"};
        isPrefixString(s,words);
    }
    public static boolean isPrefixString(String s, String[] words) {
        int i=0;
        for(String word : words){
            if(s.startsWith(word,i)){
                i+=word.length();
            }else{
                return false;
            }
            if(i==s.length()) return true;
        }
        return i==s.length();
    }
}
