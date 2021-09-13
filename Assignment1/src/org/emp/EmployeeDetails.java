/*QUESTION 1:
 ------------
Project : EmployeeDetails 
Package : org.emp 
Class : Employee
Methods : empId(),empName(),empDob(),empPhone(),empEmail(),empAddress() 
Description: Create an object for employee class and call above methods also follow the all coding standards.
*/

package org.emp;

public class EmployeeDetails {
	
	
	private void empID() {
		System.out.println("656");

	}
	
	private void empName() {
		System.out.println("Akshay");

	}
	
	private void empDob() {
		System.out.println("08/11/1996");

	}
	
	private void empPhone() {
		System.out.println("8767481884");

	}
	
	private void empEmail() {
		System.out.println("anarseakki@gmail.com");

	}
	
	private void empAddress() {
		System.out.println("Kharghar");

	}
	
	public static void main(String[] args) {
		
		EmployeeDetails em = new EmployeeDetails();
		
		em.empID();
		em.empName();
		em.empPhone();
		em.empDob();
		em.empEmail();
		em.empAddress();
	}

}
