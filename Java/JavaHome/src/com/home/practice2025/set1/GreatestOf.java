package com.home.practice2025.set1;

public class GreatestOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12000;
		int b = 2200;
		int c = 4000;
		int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(greatest + " is largest");	
	}
}
