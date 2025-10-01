package com.home.practice2025.set3;

public class LeetCode507 {

	static class Solution {
		
	    public boolean checkPerfectNumber(int num) {
	        if(num == 1){
	            return false;
	        }
	        int sum = 1;
	        for(int i = 2; i*i <= num ; i++){
	            if(num%i == 0){
	                sum = sum + i;
	                if(num != i*i){
	                    sum = sum +(num/i);
	                }
	            }
	        }
	        if(sum == num){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode507.Solution().checkPerfectNumber(28));
	}
}
