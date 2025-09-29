package com.home.practice2025.set2;

public class LeetCode1486 {
	
	static class Solution {
	    public int xorOperation(int n, int start) {
	        int nums[] = new int[n];
	        int res = 0;
	        for(int i = 0 ; i < n ; i++){
	            nums[i] = start + (2*i);
	            res = res ^ nums[i];
	        }
	        return res;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode1486.Solution s = new LeetCode1486.Solution();
		System.out.println(s.xorOperation(5, 0));
	}
}