/*
 * QUESTION 3: 
---------------------------------------
Project :EmployeeInformation 
Package :org.emp 
Class :Employee Methods :empName()

Package :org.company 
Class :Company 
Methods :companyName()

Package :org.client
 Class :Client 
Methods :clientName()

Package :org.project 
Class :Project 
Methods :projectName() 

Description: Create an object for all 4 classes inside the Employee class and call all classes methods also follow the all coding standards.

 */
package org.emp1;

import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
	
	private void empName() {
		System.out.println("Akshay");

	}
	public static void main(String[] args) {
		
		Employee em = new Employee();

		em.empName();
		
		Company cm = new Company();
		
		cm.companyName();
		
		Client cl = new Client();
		
		cl.clientName();
		
		Project pr = new Project();
		
		pr.projectName();
		
		
		
		
		
		
		
	}

}
