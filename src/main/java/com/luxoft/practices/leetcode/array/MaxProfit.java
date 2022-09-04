package com.luxoft.practices.leetcode.array;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};

        print(prices);
        System.out.println(maxProfit(prices));

    }

    private static void print(int[] prices) {
        for (int price: prices ) {
            System.out.print(price + ", ");
        }
    }

    private static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            System.out.println("step  " + i);
            if (prices[i] > prices[i - 1]) {
                System.out.println(prices[i] + " -  " + prices[i - 1] + " = " + (prices[i] - prices[i - 1]));
                maxprofit += prices[i] - prices[i - 1];
                System.out.println("maxprofit =" + maxprofit);
            }
        }
        return maxprofit;
    }
}
