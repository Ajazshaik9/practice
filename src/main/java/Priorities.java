import java.util.*;

public class Priorities {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,9,3,2,3);
        System.out.println(reassignedPriorities(list));
        List<?extends Object> l = new ArrayList<String>();
        //List<Object> ll = new ArrayList<String>(); viceversa also gives error
    }

    public static List<Integer> reassignedPriorities(List<Integer> priorities) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> res = new ArrayList<>();
        int i=1,k=0;
        int []arr = new int[priorities.size()];
        for(int n:priorities)
        {
            arr[k++]=n;
        }
        Collections.sort(priorities);
        for(int n:priorities)
        {
            if(!map.containsKey(n))
            map.put(n, i++);
        }
        for (int n:arr)
        {
            res.add(map.get(n));
        }
        return res;

    }

}
