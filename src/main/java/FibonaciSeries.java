public class FibonaciSeries {
    public static void main(String[] args) {
        int a=0,b=1,s=0,n=7;
        while(n>0)
        {
            s=a+b;
            a=b;
            b=s;
            n--;
            System.out.println(s);
        }
    }
}
