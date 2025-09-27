package com.home.practice2025.set1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if number is armstrong or not: ");
		int num = sc.nextInt();
		
		//getting length
		int length = 0;//String.valueOf(num).length();
		int temp = num;
		while(temp != 0) {
			temp = temp / 10;
			length = length + 1;
		}
		
		int sum = 0;
		int org = num;
		
		while(num != 0) {
			sum = sum + (int)(Math.pow((num%10),length));
			num = num / 10;
		}
		if(sum == org) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not an Armstrong Number");
		}
		
		sc.close();
	}
}