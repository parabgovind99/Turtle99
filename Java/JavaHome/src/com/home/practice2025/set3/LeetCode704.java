package com.home.practice2025.set3;

public class LeetCode704 {

	static class Solution {
	    public int search(int[] nums, int target) {
	        int l = 0;
	        int r = nums.length-1;
	        while(l <= r){
	            int mid = l + ((r-l)/2);
	            if(nums[mid] > target){
	                r = mid-1;
	            }
	            else if(nums[mid] < target){
	                l = mid+1;
	            }
	            else{
	                return mid;
	            }
	        }
	        return -1;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode704.Solution().search(new int[] {1,2,3,4,5,6,7,8,9,10,20}, 5));
	}
}
