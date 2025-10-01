package com.home.practice2025.set3;

public class LeetCode58 {
	
	static class Solution {
		
	    public int lengthOfLastWord(String s) {
	    	
	        char arr[] = s.trim().toCharArray();
	        int count = 0;
	        for(int i = arr.length-1 ; i >= 0 ; i--){
	            if(arr[i] == ' '){
	                return count;
	            }
	            count = count + 1;
	        }
	        return count;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode58.Solution().lengthOfLastWord(" My name is Govind "));
	}
}
