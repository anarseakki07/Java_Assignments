/*
 * QUESTION 6:
-----------
Description: Find prime number or not.
Example:
--------
Input = 11	
Output = prime number
 */
package org.test;

import java.util.Scanner;

public class PrimeNumber {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int scan = sc.nextInt();
		
		int temp = 0;
		
		for (int i = 2; i <= scan -1; i++) {
			
			if(scan%i==0) {
				temp = temp + 1;
			}
		}
		if (temp>0) {
			System.out.println( +scan + " is Not Prime Number.");
		}
		else {
			System.out.println( +scan + " is Prime Number.");
		}
	}

}
