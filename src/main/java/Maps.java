import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        //290. Word Pattern
        if(wordPattern("deadbeef","d e a d b e e f")) System.out.println("True");
        else System.out.println("False");

    }

    private static Boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map_index.containsKey(c))
                map_index.put(c, i);

            if (!map_index.containsKey(w))
                map_index.put(w, i);

            if (map_index.get(c) != map_index.get(w))
                return false;
        }

        return true;
    }
}
