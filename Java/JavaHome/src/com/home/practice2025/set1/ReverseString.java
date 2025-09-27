package com.home.practice2025.set1;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(String text) {
		char arr[] = text.toCharArray();
		for(int i = 0, j = arr.length-1; i < arr.length/2 ; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println("Reversed String is : "+new String(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse it: ");
		String text = sc.nextLine();
		reverseString(text);
		sc.close();
	}
}
