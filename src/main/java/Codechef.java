/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            char []res = new char[s.length()*2];
            int i=0;
            for (char c:s.toCharArray())
            {
                res[i++]=c;
                res[i++]=c;
            }
            System.out.println(String.valueOf(res));
        }
    }
    public static boolean check(int n, int m, int k, int x)
    {
        int low=(k-1)*n, high=k*n+m;
        for(int i=1;i<x;i++)
        {
            //if((x-1)>=(k*i-1)*n+1 && (x-1)<=(k*i*n+m)) return true;
            if((x-1)>low && (x-1)<=high) return true;
            low =high+(k-1)*n;
            high = low + m + n;
        }
        return false;
    }
}
