public class BuySell {
    public static int calcMaxP(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<buyPrice)
            {
                buyPrice=prices[i];
            }
            else{
                int profit=prices[i]-buyPrice;
                if(profit>maxProfit)
                {
                    maxProfit=profit;
                }
            }
            // if(buyPrice<prices[i])
            // {
            //     int profit=prices[i]-buyPrice;
            //     maxProfit=Math.max(maxProfit, profit);
            // }
            // else{
            //     buyPrice=prices[i];
            // }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit is:"+calcMaxP(price));
    }
}
