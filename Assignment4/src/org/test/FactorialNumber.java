/*
 * QUESTION 4:
------------------
Description: Write a program to find the factorial of a number.
Example:
--------
Input = 5	
Output = 120

 */
package org.test;

import java.util.Scanner;

class FactorialNumber{  
 private static Scanner sc;

public static void main(String args[]){ 
	 sc = new Scanner(System.in);
	 System.out.println("Enter Number: ");
	 int num = sc.nextInt();
	 
  int i,fact=1;  
  for(i=1;i<=num;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  