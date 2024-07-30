import java.util.HashMap;
import java.util.Map;

public class Freq {

    //Function to find counts of all elements present in arr[0..n-1]. The array  elements must be range from 1 to n
    /*static void countfrequenciesEfficient(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }*/

    public static void main(String[] args) {
        int[] input = { 2,3,3,2,5,9,9,9,9,9,9,9,8,4,6,7,11,15,6,12,18};
        countfrequenciesEfficient(input,input.length);
    }

    private static void countfrequenciesEfficient(int[] array, int n) {
        for (int i=0;i<n;i++)
        {
            array[i]--;
        }
        for (int i=0;i<n;i++)
        {
            array[array[i] % n] = n + array[array[i] % n];
        }

        for (int i=0;i<n;i++)
        {
            if (array[i]/n!=0)
                System.out.println("Frequency of "+(i+1)+ " is: "+array[i]/n);
        }
    }
}

/* Try more Inputs
case 1: 
actual = countfrequenciesEfficient([1, 2, 2, 1, 1, 2, 3, 2])
expected = [[1 3],[2 4],[3  1]]

case2: 
 actual = countfrequenciesEfficient([1, 2, 2])
 expected = [[1 1],[2 2]]
 
case3: 
actual = countfrequenciesEfficient([4, 4, 4, 4}])
expected = [[4 4]]
*/