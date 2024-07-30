package Neetcode;

public class BuySellStock {
    public static void main(String[] args) {
        int prices[] = {7,6,5,4,3,2,1,9,19,1000};
        maxProfit(prices);
    }

    private static void maxProfit(int[] prices) {
        int l=0,r=0,maxAmount=0,t=0;
        for (int i=0;i<prices.length;i++)
        {
            if(prices[l]<prices[r])
            {
                if (t<prices[r]-prices[l])
                {
                    maxAmount = prices[r]-prices[l];
                    t=maxAmount;
                }
            }
            else
            {
                l=r;
            }
            r++;
        }
        System.out.println(t);
    }
}
