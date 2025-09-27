package com.home.practice2025.set1;

import java.util.Scanner;

public class PrimeNumbers {
	
    public static void inefficient(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Inefficient: Number is not a prime number");
                return;
            }
        }
        System.out.println("Inefficient: Number is a prime number");
    }
	
    public static void efficient(int num) {
        if (num == 2) {
            System.out.println("Efficient: Number is a prime number");
            return;
        }
        if (num % 2 == 0) {
            System.out.println("Efficient: Number is not a prime number");
            return;
        }

        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                System.out.println("Efficient: Number is not a prime number");
                return;
            }
        }
        System.out.println("Efficient: Number is a prime number");
    }
    
    public static void primeRange(int s, int e) {
        if (s > e) {
            System.out.println("Invalid range.");
            return;
        }
        System.out.println("List of Prime Numbers Between " + s + " and " + e + ":");

        for (int i = Math.max(s, 2); i <= e; i++) {
            int limit = (int) Math.sqrt(i);
            boolean isPrime = true;
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime number or not: ");
        int num = sc.nextInt();
        
        if (num <= 1) {
            System.out.println("Number is not a Prime Number");
        } else {
            inefficient(num);
            efficient(num);
        }
        System.out.println("Enter the starting number of range: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending number of range: ");
		int e = sc.nextInt();
		primeRange(s,e);
        sc.close();
    }
}