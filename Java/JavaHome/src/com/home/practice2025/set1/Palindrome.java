package com.home.practice2025.set1;

import java.util.Scanner;

public class Palindrome {
	
	public static void stringPalindrome(String text) {
		char arr[] = text.toCharArray();
		for(int i = 0, j =  arr.length-1; i <= arr.length/2 ; i++,j--) {
			if(arr[i] != arr[j]) {
				System.out.println("String is not palindrome");
				return;
			}
		}
		System.out.println("String is palindrome");
	}
	
	public static void numberPalindrome(int num) {
		int org = num;
		int rev = 0;
		while(num != 0) {
			rev = (rev*10) + (num%10);
			num = num / 10;
		}
		if(org == rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//string
		System.out.println("Enter the string to check if it is palindrome or not : ");
		String text = sc.nextLine();
		stringPalindrome(text);
		
		//number
		System.out.println("Enter the number to check if it is palindrome or not : ");
		int num = sc.nextInt();
		numberPalindrome(num);
		sc.close();
	}
}
