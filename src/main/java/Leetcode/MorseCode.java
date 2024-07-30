package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public static void main(String[] args) {
        String []words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }


    public static int uniqueMorseRepresentations(String[] words) {
        String []morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words)
        {
            StringBuilder sb = new StringBuilder();
            for(char c: word.toCharArray()) sb.append(morse[c-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
