package leetcode.algorithms.medium;
/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:3:29:47 PM
 * purpose:	Best Time to Buy and Sell Stock II
 */
public class Q122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length ; i++){
        	if(prices[i] > prices[i-1]){
        		profit += prices[i] - prices[i-1];
        	}
        }
        return profit;
    }
}
