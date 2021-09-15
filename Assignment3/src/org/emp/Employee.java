/*
 * QUESTION 2:
------------
 Project :EmployeeDetails
 Package :org.emp
 Class :Employee 
 Methods :empId()
Description
You have to overload the method empId() based on different datatype in arguments.
 */
package org.emp;

public class Employee {
	private void empId(int aId) {
		System.out.println("Employee Id is : " +aId);
	}
	
	private void empId (long sId) 
	{
		System.out.println("Employee Id is : " +sId);
	}
	
	private void empId (byte pId) {
		System.out.println("Employee Id is : " +pId);
	}
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.empId(123);
		em.empId(123);
		em.empId(123);
	}


}
