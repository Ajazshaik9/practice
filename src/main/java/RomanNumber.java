import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<10)
        romanNumber(n);

        }
    private static void romanNumber(int n) {
        String m = String.valueOf(n);
        for (int i=0;i<m.length();i++)
        {
            char s = 0;
            if (n%4==0) s='V';
            else if (n%9==0)s='X';
            if(n>=5 && n<9)
            {
                System.out.print("V");
                n=n-5;
            }
            if (n<4)
            {
                while (n>0)
                {
                    System.out.print("I");
                    n--;
                }
            }

            else System.out.print("I"+s);
        }

    }
}
