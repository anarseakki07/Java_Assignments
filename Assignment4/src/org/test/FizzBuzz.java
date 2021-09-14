package org.test;

import java.util.Scanner;

public class FizzBuzz {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter The Value : ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i ++) {
			
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0) {
				System.out.println("Fizz");
			}
			else if (i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
	}
	}
}
