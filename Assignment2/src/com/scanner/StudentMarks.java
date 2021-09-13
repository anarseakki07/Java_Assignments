/*
 * QUESTION 2:
-------------
Description: Using Scanner class get the below details
studentId
studentName
Mark1
Mark2
Mark3
Mark4
Mark5
:Find the total and average of marks

 */
package com.scanner;

import java.util.Scanner;

public class StudentMarks {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		// Obtain Student Id
		
		System.out.println("Enter Student Id : ");
		int sId = sc.nextInt(10);
		
		
		// obtain Student Name
		
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		

		// Obtaining Marks 1
		System.out.println("Enter Marks 1 : ");
		float m1 = sc.nextFloat();
		
		
		// Obtaining Marks 1
		System.out.println("Enter Marks 2 : ");
		float m2 = sc.nextFloat();
		
		
		// Obtaining Marks 1
		System.out.println("Enter Marks 3 : ");
		float m3 = sc.nextFloat();
		
		
		// Obtaining Marks 1
		System.out.println("Enter Marks 4 : ");
		float m4 = sc.nextFloat();
		
		
		// Obtaining Marks 1
		System.out.println("Enter Marks 5 : ");
		int m5 = sc.nextInt();
		
		float total;
		float avg;
		
		total = m1 + m2 + m3 + m4 + m5 ;
		avg = (float)(total / 5.0);
		
		System.out.println("--------------Student Details--------------");
		System.out.println("Student Id is : " +sId);
		System.out.println("Student Name is : " +name);
		System.out.println("Total Of All Marks is : " +total);
		System.out.println("Average Of All Marks : " +avg);
	} 

}
