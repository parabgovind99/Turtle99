package com.home.practice2025.set2;

public class LeetCode7 {
	
	static class Solution1 {
		public int reverse(int x) {
			boolean neg = (x<0?true:false);
			x = Math.abs(x);
			String a = String.valueOf(x);
			StringBuilder s = new StringBuilder(a).reverse();
			int n = 0;
			try{
				n = Integer.parseInt(s.toString());
			}
			catch(Exception e) {return 0;};
			return (neg)?-n:n;
	    }
	}

	static class Solution {
	    public int reverse(int x) {
	        long rev = 0;
	        while(x != 0){
	            rev = rev * 10 + (x%10);
	            x = x/10;
	        }
	        if (rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
	            return 0;
	        }
	        return (int) rev;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode7.Solution s = new LeetCode7.Solution();
		System.out.println(s.reverse(2356));
		LeetCode7.Solution1 s1 = new LeetCode7.Solution1();
		System.out.println(s1.reverse(2356));
				
	}

}
