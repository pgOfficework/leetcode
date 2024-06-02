package array;
//#122
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {


        int profit=0;
        int buy=0;
        int sell;

        for (int i = 1; i < prices.length; i++) {
           if (prices[i]<prices[i-1]){
               buy=prices[i];

           }
           else if (prices[i]>prices[i-1]){
               buy=prices[i-1];

               System.out.println("--"+(prices[i]-prices[i-1]));
           }
        }

    return  profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(
                new int[]{7,1,5,3,6,4}
        ));
    }
}
