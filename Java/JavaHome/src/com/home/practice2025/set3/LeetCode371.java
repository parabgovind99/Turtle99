package com.home.practice2025.set3;

public class LeetCode371 {
	
	static class Solution {
	    public int getSum(int a, int b) {
	        int carry = 0;
	        while(b != 0){
	            carry = a & b;
	            a = a ^ b;
	            b = carry << 1;
	        }
	        return a;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode371.Solution().getSum(2, 3));
	}
}
