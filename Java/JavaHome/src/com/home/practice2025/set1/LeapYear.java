package com.home.practice2025.set1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check if it is leap year or not: ");
		int year = sc.nextInt();
		if(year <= 0) {
		    System.out.println("Enter a valid positive year");
		    return;
		}
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
		sc.close();
	}
}
