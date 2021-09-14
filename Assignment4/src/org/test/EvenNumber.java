/*
 * QUESTION 3:
------------
Description: Write a program to print even number from 1 to 100 
Example:
---------
Output = 2,4,....100
 */
package org.test;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i ++) {
			
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
