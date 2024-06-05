package array;
//#122
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {


        int profit=0;

        for (int i = 0; i+1 < prices.length; i++) {

            if (prices[i]<prices[i+1]){
                profit=profit+(prices[i+1]-prices[i]);
            }
        }

    return  profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(
                new int[]{7,6,4,3,1}
        ));
    }
}
