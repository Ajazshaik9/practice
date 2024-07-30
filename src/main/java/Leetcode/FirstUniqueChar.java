package Leetcode;

import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcodel";
        firstUniqChar(s);
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
            HashMap<Character, Integer> count = new HashMap<>();
            HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
            // build hash map : character and how often it appears
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                count.put(c, count.getOrDefault(c, 0)+1);
                System.out.println("count:"+count);
                map.put(c,i);
                System.out.println("map:"+map);
            }

            // find the index
            for (int i = 0; i < n; i++) {
                if (count.get(s.charAt(i)) == 1)
                    return i;
            }
            return -1;
        }
    }
