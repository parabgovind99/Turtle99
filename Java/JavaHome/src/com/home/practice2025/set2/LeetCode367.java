package com.home.practice2025.set2;

public class LeetCode367 {
	
	//binary search approach
	static class Solution1 {
	    public boolean isPerfectSquare(int num) {
	        int s = 1;
	        int e = num;
	        while(s <= e){
	            int m = s+((e-s)/2);
	            if((long) m*m == num){
	                return true;
	            }
	            else if((long) m*m > num){
	                e = m-1;
	            }
	            else{
	                s = m+1;
	            }
	        }
	        return false;
	    }
	}
	
	static class Solution {
	    public boolean isPerfectSquare(int num) {
	        for(int i = 1 ; i <= (num/2)+1 ; i++){
	            if(i*i == num){
	                return true;
	            }
	            if(i*i > num){
	                return false;
	            }
	        }
	        return false;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode367.Solution().isPerfectSquare(808201));
		System.out.println(new LeetCode367.Solution1().isPerfectSquare(808201));
	}

}
