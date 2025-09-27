package com.home.practice2025.set1;
import java.util.Scanner;

public class ReverseNumber {
	
	public static void reverseNumber(int a) {
		int rev = 0;
		while(a != 0) {
			rev = ((rev*10)+(a%10));
			a = a/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int a = sc.nextInt();
		reverseNumber(a);
		sc.close();
	}
}