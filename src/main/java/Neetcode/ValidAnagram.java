package Neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(validAnagram(s, t));
    }

    private static boolean validAnagram2(String s, String t) {//TC: O(n*log(n)) because of the sorting.
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        System.out.println(sc + "\t" + tc);
        System.out.println(Arrays.toString(sc) + "\t" + Arrays.toString(tc));
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.toString(sc).equals(Arrays.toString(tc));
    }

    private static boolean validAnagram1(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            Integer current = charCounts.get(s.charAt(i));
            if (current == null) current = 0;
            charCounts.put(s.charAt(i), current + 1);

            current = charCounts.get(t.charAt(i));
            if (current == null) current = 0;
            charCounts.put(t.charAt(i), current - 1);
        }
        for (Integer i : charCounts.values()) {
            if (i != 0) return false;
        }
        return true;
    }

    private static boolean validAnagram(String s, String t) {
        int c = 0;
        if (s.length() != t.length()) return false;
        /*for (int i=0;i<s.length();i++)
        {
            for (int j=0;j<t.length();j++)
            {
                if (s.charAt(i) == t.charAt(j))
                    c++;
            }
        }
        return c == s.length() * 2;*/
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        System.out.println(map1 + "\t" + map2);
        for (Character ch : map1.keySet()) {
            /*int val1 = map1.get(ch);
            int val2 = map2.getOrDefault(ch , 0);*/
            int val1 = map1.get(ch);
            int val2 = map2.get(ch);
            if (val1 != val2) return false;
        }

        return true;
    }
}
