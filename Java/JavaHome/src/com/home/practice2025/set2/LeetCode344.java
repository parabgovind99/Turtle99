package com.home.practice2025.set2;

public class LeetCode344 {

	static class Solution {
		public char[] reverseString(char[] s) {
	        for(int i = 0 , j = s.length-1 ; i < s.length/2 ; i++ , j--){
	            char h = s[i];
	            s[i] = s[j];
	            s[j] = h;
	        }
			return s;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode344.Solution().reverseString(new char[] {'h','e','l','l','o'}));
	}
}
