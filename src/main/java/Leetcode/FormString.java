package Leetcode;

public class FormString {
    public static void main(String[] args) {
        shortestWay("xyz","xzx");
    }
    public static int shortestWay(String s, String t) {
        // Map<Character,Integer> smap = new HashMap<>();
        // Map<Character,Integer> tmap = new HashMap<>();
        // for(char c:source.toCharArray())
        //     smap.put(c,smap.getOrDefault(c,0)+1);
        // for(char c:target.toCharArray())
        //     tmap.put(c,tmap.getOrDefault(c,0)+1);
        // Character[] s = smap.keySet().toArray(new Character[0]);
        // Character[] t = tmap.keySet().toArray(new Character[0]);
        // if(!Arrays.equals(s,t)) return -1;
        int c=0,j=0;
        boolean f=false;
        while(j<t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if(j<t.length()&&t.charAt(j)==s.charAt(i))
                {
                    j++;
                    f = true;
                }
            }
            if(!f) return -1;
            c++;
            f=false;
        }
        return c;
    }
}
