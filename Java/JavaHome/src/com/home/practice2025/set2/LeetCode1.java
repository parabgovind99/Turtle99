package com.home.practice2025.set2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
	
	// brute force approach
	static class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        for(int i = 0 ; i < nums.length - 1 ; i++){
	            for(int j = i+1 ; j < nums.length ; j++){
	                if(nums[i]+nums[j] == target){
	                    return new int[]{i,j}; //found
	                }
	            }
	        }
	        return new int[]{}; //not found
	    }
	}
	
	// using HaspMap
	static class Solution1 {
	    public int[] twoSum(int[] nums, int target) {
	    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    	for(int i = 0 ; i < nums.length ; i++) {
	    		if(map.containsKey(nums[i])) {
	    			return new int[] {map.get(nums[i]),i};
	    		}
	    		map.put((target-nums[i]),i);
	    	}
	    	return new int[] {};
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode1.Solution s = new LeetCode1.Solution();
		System.out.println(Arrays.toString(s.twoSum(new int[]{2,7,8,11}, 9)));
		LeetCode1.Solution1 s1 = new LeetCode1.Solution1();
		System.out.println(Arrays.toString(s1.twoSum(new int[]{2,7,8,11}, 9)));
	}
}
