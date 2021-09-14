/*
 * QUESTION 1:
---------------------------------------------------------------------------
Description: Write Java program to allow the user to input his/her age. 
Then the program will show if the person is eligible to vote.
A person who is eligible to vote must be older than or equal 1 
to 18 years old.
Example:
--------
Input = 10
Output = print not eligible.
 */
package org.test;

import java.util.Scanner;

public class Voter {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int n = sc.nextInt();
		
		if( n > 18 ){
			System.out.println("You Are Eligible For Vote");
		}else{
			System.out.println("You Are Not Eligible For Vote ..Sorry !!");
		}

	}

}