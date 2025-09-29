package com.home.practice2025.set2;

public class LeetCode69 {

	static class Solution {
	    public int mySqrt(int x) {
	        int s = 0;
	        int e = x;
	        int m = 0;
	        if (x < 2) return x;
	        while(s <= e){
	            m = s + ((e-s)/2);
	            long sq = (long) m * m;

	            if (sq == x) {
	                return m;
	            } else if (sq > x) {
	                e = m - 1;
	            } else {
	                s = m + 1;
	            }
	        }
	        return e;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode69.Solution().mySqrt(63));
	}

}
