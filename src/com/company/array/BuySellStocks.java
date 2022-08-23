package com.company.array;

public class BuySellStocks {
    static int maxProfit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int result=0;
        for(int i=0; i<prices.length; i++){
            buyPrice = Math.min(prices[i], buyPrice);
            int profit = prices[i] - buyPrice;
            result = Math.max(result, profit);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Maximum profit: "+maxProfit(Data.numbers)); //51
    }
}
