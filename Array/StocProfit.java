public class StocProfit {
    public static int CalMaxP(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int mprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                mprofit=Math.max(profit, mprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return mprofit;
    }

    public static void main(String[] args) {
        int Sprice[] = { 7, 1, 5, 3, 6, 9 };
        System.out.println("Maximum Profit is ::"+CalMaxP(Sprice));
    }
}
