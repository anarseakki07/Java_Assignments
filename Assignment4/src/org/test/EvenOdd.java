/*
 * QUESTION 2:
------------------------
Description: Write a program to find even or odd number
Example:
---------
Input = 10
Output = Even
 */
package org.test;

import java.util.Scanner;

public class EvenOdd {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(" The Number Is Even..");
		}
		else {
			System.out.println("The Number Is Odd...");
		}
	}

}
