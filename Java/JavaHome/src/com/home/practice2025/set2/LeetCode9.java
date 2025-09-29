package com.home.practice2025.set2;

public class LeetCode9 {
	
	static class Solution {
	    public boolean isPalindrome(int x) {
	        if(x < 0){
	            return false;
	        }
	        int org = x;
	        int rev = 0;
	        while(x != 0){
	            rev = (rev * 10) + (x%10);
	            x = x / 10;
	        }
	        if(rev == org){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	}
	

	static class Solution1 {
		public boolean isPalindrome(int x) {
	        String s = String.valueOf(x);
	        StringBuilder rev = new StringBuilder(s);
	        return rev.reverse().toString().equals(s);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode9.Solution s = new LeetCode9.Solution();
		System.out.println(s.isPalindrome(121));
		LeetCode9.Solution1 s1 = new LeetCode9.Solution1();
		System.out.println(s1.isPalindrome(121));
	}

}
