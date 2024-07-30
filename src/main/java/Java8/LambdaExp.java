package Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LambdaExp {
    public static void main(String[] args) {
        //Lambda expression is an anonymous function ( without name, return type and access modifier
        // and having one lambda ( -> ) symbol)
        add(10,5);
        BiConsumer<Integer,Integer> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept(9,18);
        Comparator<String> s = (s1,s2)-> {
            return s1.compareTo(s2);
        };

    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }
}
