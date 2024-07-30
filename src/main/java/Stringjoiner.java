import java.util.StringJoiner;

public class Stringjoiner {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        String str = new String("10,11,12");
        StringJoiner res = new StringJoiner(",","[","]");
        String []value = str.split(",");
        for(String v:value)
        {
            res.add(v);
        }
        System.out.println(res);
        sj.add("A").add("B").add("C");
        System.out.println(sj);
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("P").add("Q");
        System.out.println(sj2);
        sj.merge(sj2);
        System.out.println(sj);
    }
}
