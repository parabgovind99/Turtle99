package com.home.practice2025.set3;

public class LeetCode125 {
	
	static class Solution {
		
	    public boolean isPalindrome(String s) {
	        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	        char arr[] = s.toCharArray();
	        for(int i = 0, j = arr.length-1 ; i < arr.length/2 ; i++, j--){
	            if(arr[i] != arr[j]){
	                return false;
	            }
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode125.Solution().isPalindrome("nayan nayan"));
	}
}
