/*
* QUESTION 1:
------------
Description: Using Scanner class get the below details
empId
empName
empEmail
empPhoneno
empSalary
empGender
empCity
 */

package com.scanner;

import java.util.Scanner;

public class Scanner1 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		// emp Id
		System.out.println("Enter Your Emp Id : ");
		String empId = sc.nextLine();
		
		
		// Employee Name
		
		System.out.println("Enter Emp Name : ");
		String en = sc.nextLine();
		
		
		
		//Emp Email
		
		System.out.println("Enter Your Email Address : " );
		String empMail = sc.nextLine();
		
		
		//Emp Phn No
		
		System.out.println("Enter Your Phone Number : ");
		long phNo = sc.nextLong();
		
		
		
		// Emp Salary
		
		System.out.println("Enter Your Salary: ");
		double sal = sc.nextDouble();
		
		
		// Emp Gendar
		
		System.out.println("Enter Your Gender :");
		char gen = sc.next().charAt(0);
		
		
		//Emp City
		
		System.out.println("Enter Your City : ");
		String ci = sc.next();
		
		
		
		System.out.println("--------------------Your Details Here----------------------");
		System.out.println("Your Emp Id is : "  + empId);
		System.out.println("Your Name is: "  + en);
		System.out.println("Your Email Address is :  "  + empMail);
		System.out.println("Your Phone Number is :" +phNo);
		System.out.println("Your Salary is : " +sal);
		System.out.println("Your Gender is : " +gen);
		System.out.println("Your City is : " +ci);
		
		
		
		
		
	}

}
