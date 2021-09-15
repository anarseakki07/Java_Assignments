/*
 * QUESTION 3:
------------
 Project :CompanyDetails
 Package :org.company
 Class :CompanyInfo
 Methods :companyName()
Description
You have to overload the method companyName() based on different Number of arguments.
 */
package org.company;

public class CompanyInfo {
	
	private void companyName(String cName) {
		System.out.println("Company Name is: " +cName);

	}
	
	private void companyName(String cName, int cId) {
		System.out.println("Company Name is: " +cName+ " " + "Company Id is : " +cId);

	}
	
	private void companyName(String cName, int cId, String cDept) {
		System.out.println("Company Name is: " +cName+ " " + "Company Id is : " +cId+ " " + "Company Department is : " +cDept);

	}
	
	private void companyName(double cPackage) {
		System.out.println("Company Package is: " +cPackage);

	}
	
	public static void main(String[] args) {
		
		CompanyInfo cf = new CompanyInfo();
		cf.companyName("Zensar Company");
		cf.companyName("Zensar Company", 2551);
		cf.companyName("Zensar Company", 2551, "Automation Testing");
		cf.companyName(310000);
		
		
	}
	
	


}
