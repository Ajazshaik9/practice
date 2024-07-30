import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedCheck {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime,endTime,elapsedTime;

        for (int i=0;i<100000;i++)
        {
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime = System.nanoTime();
        arrayList.get(99999);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("ArrayList get:"+elapsedTime+" ns");

        startTime = System.nanoTime();
        linkedList.get(99999);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("LinkedListget:"+elapsedTime+" ns");

        startTime = System.nanoTime();
        arrayList.add(75000,9);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("ArrayList insert in between :"+elapsedTime+" ns");

        startTime = System.nanoTime();
        linkedList.add(75000,9);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("LinkedList insert in between:"+elapsedTime+" ns");

        startTime = System.nanoTime();
        arrayList.remove(81000);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("ArrayList delete in between :"+elapsedTime+" ns");

        startTime = System.nanoTime();
        linkedList.remove(81000);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("LinkedList delete in between:"+elapsedTime+" ns");
    }
}
