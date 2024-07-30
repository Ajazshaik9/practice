import java.io.*;
import java.util.*;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[n];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            { 
                A[i_A] = Long.parseLong(arr_A[i_A]);
            }
            long k = Long.parseLong(br.readLine().trim());

            long out_ = find_maximum_remainder(n, A, k);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static long find_maximum_remainder(int n, long[] A, long k){
        // Write your code here
        int max=0;
        for(int i=0;i<A.length;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<A.length;j+=2)
                {
                    if(i!=j) max = (int) Math.max((A[i]+A[j])%k,max);
                }
            }
            else
            {
                for(int j=0;j<A.length;j+=2)
                {
                    if(i!=j) max = (int) Math.max((A[i]+A[j])%k,max);
                }
            }

        }
        return max;

    }



}