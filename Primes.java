import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        primes(l,h);
    }

    private static void primes(int n,int m) {
        for(int i=n;i<=m;i++)
        {
            if(isPrimes(i)) System.out.println(i+" ");
        }
    }

    private static boolean isPrimes(int n) {
        for (int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
}


