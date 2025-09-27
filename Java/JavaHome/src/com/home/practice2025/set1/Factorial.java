package com.home.practice2025.set1;

import java.util.Scanner;

public class Factorial {
	
	public static void factorialLoop(int n) {
		if(n == 0 || n == 1) {
			System.out.println("Factorial of "+n+" is 1");
		}
		else{
			int fact = 1;
			for(int i = 2 ; i <= n ; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
	}
	
	public static int factorialRecursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * factorialRecursive(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using loops
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial of it: ");
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Enter a valid positive number");
			return;
		}
		factorialLoop(n);
		
		// using recursion
		System.out.println("Factorial of "+n+" is "+factorialRecursive(n));
		sc.close();
	}
}
