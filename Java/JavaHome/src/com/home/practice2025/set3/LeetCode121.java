package com.home.practice2025.set3;

public class LeetCode121 {
	
	static class Solution {
	    public int maxProfit(int[] prices) {
	        int buy = prices[0];
	        int profit = 0;
	        for(int i = 0 ; i < prices.length ; i++){
	            if(buy > prices[i]){
	                buy = prices[i];
	            }
	            else if(profit < (prices[i]-buy)){
	                profit = prices[i]-buy;
	            }
	        }
	        return profit;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode121.Solution().maxProfit(new int[] {7,1,5,3,6,4}));
	}
}
