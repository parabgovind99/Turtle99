package com.home.practice2025.set2;

public class LeetCode28 {
	
	static class Solution {
	    public int strStr(String haystack, String needle) {
	        if(haystack.length() < needle.length()){
	            return -1;
	        }
	        else{
	            for(int i = 0 , j = needle.length() ; j <= haystack.length() ; i++, j++){
	                if(haystack.substring(i,j).equals(needle)){
	                    return i;
	                }
	            }
	        }
	        return -1;
	    }
	}
	
	static class Solution1 {
	    public int strStr(String haystack, String needle) {
	        return haystack.indexOf(needle);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode28.Solution().strStr("Kite is flying", "ly"));
		System.out.println(new LeetCode28.Solution1().strStr("Kite is flying", "ly"));
	}

}
