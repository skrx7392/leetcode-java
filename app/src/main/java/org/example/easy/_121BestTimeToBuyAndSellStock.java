package org.example.easy;

public class _121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            maxProfit = Math.max(maxProfit, price - lowestPrice);
        }
        return maxProfit;
    }
}