package com.home.practice2025.set3;

import java.util.HashMap;
import java.util.Map;

public class LeetCode217 {
	
	static class Solution {
		public boolean containsDuplicate(int[] nums) {
		    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0 ; i < nums.length ; i++){
		        if(map.containsKey(nums[i])) {
	            	return true;
		        }
		        else {
	            	map.put(nums[i],1);
		        }
		    }
	        return false;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode217.Solution().containsDuplicate(new int[] {1,2,3,1}));
	}
}
