package org.test;

import java.util.Scanner;

public class CountLength {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		long no = sc.nextLong();
		
		long t1 = no;
		long leng = 0;
		while (t1 != 0)
		{
			t1 = t1/10;
			leng = leng + 1;
		}
		System.out.println("The Length of Digit is " +leng );
	}
}