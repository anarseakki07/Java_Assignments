/*
 * QUESTION 4:
------------
 Project :MyPhone
 Package :org.phone
 Class: Phone
 Methods :phoneInfo()
Description
You have to overload the method phoneInfo() based on different datatype order in arguments.
 */
package org.phone;

public class Phone {
	
	private void phoneInfo(String pRam) {
		
		System.out.println("Phone Ram is : " +pRam);

	}
	
	private void phoneInfo(String pColor, String pStorage) {
		
		System.out.println("Phone Color is : " + pColor + " , " + "Phone Storage is " +pStorage);

	}
	
	private void phoneInfo(double pPrice) {
		
		System.out.println("Phone Price is : " +pPrice);
	}
	
	private void phoneInfo(long pImei) {
		
		System.out.println("Phone IMEI No. : " +pImei);

	}
	
	private void phoneInfo(boolean pEarphones)
	{
		System.out.println("Earphones Are Included : " +pEarphones);
	}
	
	public static void main(String[] args) {
		
		Phone ph = new Phone();
		
		ph.phoneInfo("8GB");
		ph.phoneInfo("Black" , "1TB");
		ph.phoneInfo(35000.0);
		ph.phoneInfo(74545124512l);
		ph.phoneInfo(true);
		
	}
	
	
	
	
	
	
	
	
	
	

}
