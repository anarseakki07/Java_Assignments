/*
 * QUESTION 5:
------------
Description: Write a program to print the fibonacci series of a number 1 to 
100.
Example:
--------
Output = 0,1,1,2,3,5.....
 */
package org.test;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a = 0, b =1;
		System.out.println(+a+ " " +b);
		
		for(int i = 1; i <= 100; i++) {
			int c = a + b;
			System.out.println(" " +c);
			a = b;
			b = c;
		}
	}

}
