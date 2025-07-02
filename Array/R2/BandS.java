public class BandS {
    public static int BuynSell(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;  // Previous best buy price i.e lowest hence we initialised to max val so that it can be updated with smaller value easily
        int maxProfit=0; // Max Profit till now 
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{ 
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit can be achieved is: "+BuynSell(prices));
    }
}
