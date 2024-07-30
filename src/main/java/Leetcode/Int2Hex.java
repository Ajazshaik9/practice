package Leetcode;


public class Int2Hex {
    public static void main(String[] args) {
        int num = -1;
        System.out.println(int2Hex(num));
    }

    private static String int2Hex(int num) {
        int r=0;
        String s = "";
        StringBuilder sb = new StringBuilder();
        while(num!=0)
        {
            if(num<0)
            {
                num = Integer.MAX_VALUE + num;
            }
            r=num%16;
            if(r>9)
            {
                if(r==10) s="a";
                else if(r==11) s="b";
                else if(r==12) s="c";
                else if(r==13) s="d";
                else if(r==14) s="e";
                else s="f";
                sb.append(s);
            }
            else sb.append(r);

            num /= 16;
        }
        return sb.reverse().toString();
        //return Integer.toHexString(num);
    }
}

