package array;


public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int buy=prices[0];
        int profit=0;

        for (int i = 1; i < prices.length; i++) {

                if(buy>prices[i]){
                    buy=prices[i];
                }
                profit=Math.max(profit,prices[i]-buy);

        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(
                new int[]{7,6,4,3,1}
        ));
    }
}
