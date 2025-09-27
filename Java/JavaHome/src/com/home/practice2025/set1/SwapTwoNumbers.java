package com.home.practice2025.set1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using third variable
		int a = 10;
		int b = 20;
		int c = b;
		System.out.println("Before Swapping: \na = "+a+"\nb = "+b);
		b = a;
		a = c;
		System.out.println("After Swapping: \na = "+a+"\nb = "+b);
		
		// without using third variable
		System.out.println("Before Swapping: \na = "+a+"\nb = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping: \na = "+a+"\nb = "+b);
		
		//with xor to handle overflow cases
		System.out.println("Before Swapping: \na = "+a+"\nb = "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: \na = "+a+"\nb = "+b);
	}
}
