package com.home.practice2025.set2;

public class LeetCode136 {
	
	static class Solution {
		
	    public int singleNumber(int[] nums) {
	        int a = nums[0];
	        for(int i = 1 ; i < nums.length ; i++){
	            a = a ^ nums[i];
	        }
	        return a;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode136.Solution().singleNumber(new int[] {2,2,1,3,4,3,4}));
	}
}
