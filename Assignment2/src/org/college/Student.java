/*
 * QUESTION 4:
-------------
 Project :CollegeInformation
 Package :org.college
 Class :College
 Methods :collegeName(),collegeCode(),collegeRank()
 Class :Student
 Methods :studentName(),studentDept(),studentId()
 Class :Hostel
 Methods :HostelName()
 Class :dept
 Methods :deptName()
Description:
create above 4 class and call all your class methods into the Student using 
multilevel inheritance.

 */
package org.college;

public class Student extends College {
	
	private void studentName() {
		System.out.println("Student Name is - Akshay Mohan Anarse");

	}
	
	private void studentDept() {
		System.out.println("Student Department is Information Technology");

	}
	
	private void studentId() {
		System.out.println("Student ID is 12001");

	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.studentName();
		s1.studentDept();
		s1.studentId();
		
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		
		s1.studentDept();
		
		s1.hostelName();
		
		
	}

}
