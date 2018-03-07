import java.util.ArrayList;
import java.util.List;

public class BuySellStockTwice {

    /*
    6.7
    */

    public static int buySellStockTwice(List<Integer> A) {
        Integer a1 = 0, b1 = 0, p1 = 0;
        Integer a2 = 0, b2 = 0, p2 = 0;
        Integer min = Integer.MAX_VALUE, minIndex = 0;
        Integer profit;
        Integer i = 0;
        for( Integer price : A) {
            if (price < min) {
                min = price;
                minIndex = i;
            }
            profit = price - min;
            if(profit > p2 && a2.equals(minIndex)) {
                b2 = i;
            } else if (profit > p2 && !a2.equals(minIndex)) {
                if (p1  < p2) {
                    a1 = a2;
                    b1 = b2;
                }
                a2 = minIndex;
                b2 = i;
            } else if (profit > p1 && !a2.equals(minIndex)) {
                a1 = minIndex;
                b1 = i;
            }


            p1 = profitBetweenPoints(a1, b1, A);
            p2 = profitBetweenPoints(a2, b2, A);
            i++;
        }
        return p1 + p2;
    }

    private static int profitBetweenPoints(int a, int b, List<Integer> A) {
        return A.get(b) - A.get(a);
    }

    // EPI 5.7 P. 49
    public static int buySellStockTwice_v2(List<Integer> prices) {
        int maxTotalProfit = 0;
        List<Integer> firstBuySellProfits = new ArrayList<>();
        int minPriceSoFar = Integer.MAX_VALUE;

        for(int i = 0; i < prices.size(); ++i){
            minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, prices.get(i) - minPriceSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        int maxPriceSoFar = Integer.MIN_VALUE;
        for(int i = prices.size()-1; i > 0; --i){
            maxPriceSoFar = Math.max(maxPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, firstBuySellProfits.get(i-1)+maxPriceSoFar-prices.get(i));
        }
        return maxTotalProfit;
    }

    // Sol from LC123, more generalized solution, can extend to buySellNtimes
    // Start from the beginning
    public static int buySellStockTwice_v3(List<Integer> prices) {
        if( prices.size() < 2 ) return 0;

        int[] profit = new int[prices.size()];
        for(int k = 0; k < 2; k++){
            int maxBuy = profit[0] - prices.get(0);
            for( int i = 1; i < prices.size(); i++){
                int tmp = profit[i];
                profit[i] = Math.max(profit[i-1], maxBuy + prices.get(i));
                maxBuy = Math.max(maxBuy, tmp - prices.get(i));
            }
        }
        return profit[prices.size()-1];

    }

    // Note that the leetcode OJ has a testcase with k = 1000000000 which can't be
    // run on my machine, causing StackOverFlow and boost my CPU to run at high rate
    public static int buySellStockKtimes(List<Integer> prices, int k) {
        if( prices.size() < k ) return 0;

        int[] profit = new int[prices.size()];
        for(int j = 0; j < 2; j++){
            int maxBuy = profit[0] - prices.get(0);
            for( int i = 1; i < prices.size(); i++){
                int tmp = profit[i];
                profit[i] = Math.max(profit[i-1], maxBuy + prices.get(i));
                maxBuy = Math.max(maxBuy, tmp - prices.get(i));
            }
        }
        return profit[prices.size()-1];

    }

}
