import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int n = scanner.nextInt();
        int m;
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            m = scanner.nextInt();
            list.add(m);
        }
        coinSum(sum,list);

    }

    private static void coinSum(int sum, List<Integer> list) {
        //System.out.println(list); 4 ,1 2 3 4, {1111,112,22,13,4}
        for (int i=0;i<list.size();i++)
        {

        }

    }
}
