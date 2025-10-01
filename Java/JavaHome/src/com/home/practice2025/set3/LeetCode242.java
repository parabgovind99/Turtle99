package com.home.practice2025.set3;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {

	static class Solution {
	    public boolean isAnagram(String s, String t) {
	        if(s.length() != t.length()){
	            return false;
	        }
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        char arr[] = s.toCharArray();
	        for(int i = 0 ; i < arr.length ; i++) {
	        	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	        }
	        char arr1[] = t.toCharArray();
	        for(int i = 0 ; i < arr1.length ; i++) {
	        	map.put(arr1[i], map.getOrDefault(arr1[i], 0)-1);
	        }
	        for(Map.Entry<Character, Integer> m : map.entrySet()) {
	        	if(m.getValue() != 0) {
	        		return false;
	        	}
	        }
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode242.Solution().isAnagram("govind", "indgov"));
	}
}
