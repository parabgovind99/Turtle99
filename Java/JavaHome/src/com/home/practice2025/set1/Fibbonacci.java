package com.home.practice2025.set1;

import java.util.Scanner;

public class Fibbonacci {
	
	public static void fibbo(int num) {
		
		int pre = 0;
		int next = 1;
		int cur = pre;
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.print(cur+" ");
			pre = cur;
			cur = next;
			next = next+pre;
		}
	}
	
	public static void fibboRange(int s, int e) {
		int pre = 0;
		int cur = 0;
		int next = 1;
		for(int i = 1 ; i <= e ; i++) {
			if(i>=s) {
			    System.out.print(cur+" ");
			}
			pre = cur;
			cur = next;
			next = pre + next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate fibbonacci series: ");
		int num = sc.nextInt();
		fibbo(num);
		
		System.out.println("\nEnter the starting number to generate fibbonacci series from: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending number to generate fibbonacci series upto: ");
		int e = sc.nextInt();
		fibboRange(s,e);
		sc.close();
	}
}