
import java.util.*;
public class FirstProject {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
                List<Integer> listA = new ArrayList<>();
                List<Integer> listB = new ArrayList<>();
                List<Integer> listC = new ArrayList<>();
                List<Integer> listD = new ArrayList<>();
                int t=0;
                for (int i=0;i<n;i++)
                {
                        int a= sc.nextInt();
                        int b=sc.nextInt();
                        int c= sc.nextInt();
                        int d= sc.nextInt();
                        if(a<b) t++;
                        if(a<c) t++;
                        if(a<d) t++;
                    System.out.println(t);
                    t=0;
                }
        }
}
/*

4
        2 3 4 1
        10000 0 1 2
        500 600 400 300
        0 9999 10000 9998
        o/p:
        2
        0
        1
        3*/
