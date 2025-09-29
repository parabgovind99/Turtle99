package com.home.practice2025.set2;

public class LeetCode392 {
	
	static class Solution {
	    public boolean isSubsequence(String s, String t) {
	        char half[] = s.toCharArray();
	        char full[] = t.toCharArray();
	        int i = 0;
	        for(int j : full){
	            if(i < half.length && half[i] == j){
	                i++;
	            }
	        }
	        return i == half.length;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode392.Solution().isSubsequence("gh", "going to home in holiday"));
	}
}
