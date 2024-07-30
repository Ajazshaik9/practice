import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.frequency;

public class FreqOfArray {
    public static void main(String[] args) {
        int []n={1,2,3,4,5,6,7,1,2,9,1,2,1};
        frequency(n);
        freq(n);     //optimised
    }

    private static void freq(int[] n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:n) map.put(i,map.getOrDefault(i,0)+1);
        System.out.println("map2: "+map);
        for(int item: map.keySet()){
            if(map.get(item)==3) System.out.println(item+" occured 3 times");
        }
    }

    private static void frequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        System.out.println("map1: "+map);
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==3) System.out.println(entry.getKey()+" occured 3 times");
        }
    }
}
