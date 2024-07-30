import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaxiCabNumbers {
    public static void main(String[] args) {
        //Ramanujan-Hardly Numbers
        double n = 1, m = 1999999999;
        int x= 1729;
        //taxiCabNumbers(n);
        //taxiCabNumbers(n,m);
        //taxiCabNumberOrNot(x);

        if (tc(x))
        {
            System.out.println(x+": is Ramanujan Number");
        }
        else System.out.println(x+": is not a Ramanujan Number");


        int L = 1000;
        HashMap<Integer, ArrayList<Integer>> r_dict
                = ramanujan_On2(L);

        // Print all the generated numbers
        for (Map.Entry<Integer, ArrayList<Integer> > e :
                (Iterable<Map.Entry<Integer, ArrayList<Integer> > >)
                        r_dict.entrySet().stream().sorted(Map.Entry.comparingByKey())::iterator) {

            System.out.print(e.getKey() + ": (");

            for (int i = 0; i <= e.getValue().size() - 1;
                 i++) {
                if (i == e.getValue().size() - 1)
                    System.out.print(e.getValue().get(i)
                            + ")");
                else
                    System.out.print(e.getValue().get(i)
                            + ", ");
            }
            System.out.println();
        }
    }

    public static boolean tc(int x)
    { // method for checking taxicab number
        int f = 0,k=0;
        int[] a = new int[20]; /*this array will store the numbers that are a part of cube couple that form the taxicab number on addition */
        for(int i=1;i<x;i++)
        {
            middle:for(int j=1;j<x;j++)
            {
                for(int z=0;z<20;z++)
                {// this loop avoids repetition of cube pair
                    if(a[z] == j) continue middle;
                }
                if((i*i*i) + (j*j*j) == x)
                { /* to print the cube pair if they exist and set the flag as one*/
                    a[k++] = i;
                    f = 1;
                    System.out.println(i+"^3 + "+j+"^3");
                }
            }
        }
        return f == 1;

    }

    private static void taxiCabNumberOrNot(int x) {
        int orgNum = x;
        int sum = findSum(orgNum);
        int reverseSum = reverseSum(sum);
//compares the original number (entered by the user) with the product of sum and its reverse
        if( (sum * reverseSum) == orgNum)
//prints the following statement if the above statement returns true
            System.out.println(orgNum +" is a Ramanujan Number.");
//prints the following statement, if the condition returns false
        else
            System.out.println(orgNum+" is not a Ramanujan Number.");
    }


    private static void taxiCabNumbers(double n) {

        System.out.println("display set of RH Numbers\n");

        for(int i=1;i<=n;i++)
        {//loop 1
            System.out.println("loop1");
            for (int j=1;j<=n;j++)
            {//loop 2
                System.out.println("loop2");
                for (int k=1;k<=n;k++)
                {//loop 3
                    //System.out.println("loop3");
                    for(int s=1;s<=n;s++)
                    {//loop 4
                        //System.out.println("loop4");
                        if ((i!=j && i!=k && i!=s && j!=k && j!=s && s!=k))
                        {
                            if(((Math.pow(i,3)+Math.pow(j,3))==(Math.pow(k,3)+Math.pow(s,3))))
                            {
                                System.out.println((Math.pow(i,3)+Math.pow(j,3))+" : "+i+"^3+"+j+"^3 = "+k+"^3+"+s+"^3");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }


    private static void taxiCabNumbers(double n, double m) {

        int i=1000;
        System.out.println("Ramanujan Number between 1000 to 1000000:");
        while (i <= 1000000)
        {
            int sum = findSum(i);
            int reverseSum = reverseSum(sum);
//compares the original number (entered by the user) with the product of sum and its reverse
            if ((sum * reverseSum) == i)
                System.out.println(i);
//increments the variable i by 1
            i++;
        }
    }
    //user-defined function that finds the sum
    public static int findSum(int number)
    {
//the variable stores the sum of each digit
        int sum = 0;
        while (number > 0)
        {
//determines the remainder and add the resultant in the variable sum
            sum = sum + number % 10;
//removes the last digit from the number
            number = number / 10;
        }
        return sum;
    }
    //user-defined function that reverse the sum returned by the findSum() function
    public static int reverseSum(int number)
    {
//the variable stores the reverse of the variable sum
        int reverse = 0;
//executes until the condition becomes false
        while (number > 0)
        {
//detrmines the remainder
            int digit = number % 10;
//reverse the sum
            reverse = reverse * 10 + digit;
//removes the last digit from the number
            number = number / 10;
        }
        return reverse;
    }


    // Function to find Ramanujan numbers
    static HashMap<Integer, ArrayList<Integer> > ramanujan_On2(int limit)
    {
        // Stores the cubes from 1 to L
        int[] cubes = new int[limit + 1];
        for (int i = 0; i <= limit; i++) {
            cubes[i] = i * i * i;
        }

        // Stores the sum of pairs of cubes
        HashMap<Integer, ArrayList<Integer> > dict_sum_pairs = new HashMap<>();

        // Stores the Ramanujan Numbers
        HashMap<Integer, ArrayList<Integer> > dict_ramnujan_nums = new HashMap<>();

        // Generate all pairs (a, b)
        // from the range [0, L]
        for (int a = 0; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                int a3 = cubes[a];
                int b3 = cubes[b];

                // Find the sum of pairs
                int sum_pairs = a3 + b3;

                // Add to Map
                if (dict_sum_pairs.containsKey(sum_pairs))
                {

                    // If the current sum_pair is already in
                    // the sum_pair Map, then store store
                    // all numbers in ramnujan_no map
                    int c = dict_sum_pairs.get(sum_pairs).get(0);
                    int d = dict_sum_pairs.get(sum_pairs).get(1);
                    dict_ramnujan_nums.put(sum_pairs, new ArrayList<>(Arrays.asList(a, b, c, d)));
                }
                else
                {
                    // otherwise add in sum_pair map
                    dict_sum_pairs.put(sum_pairs, new ArrayList<>(Arrays.asList(a, b)));
                }
            }
        }
        // Return possible ramanujan numbers
        return dict_ramnujan_nums;
    }


}
