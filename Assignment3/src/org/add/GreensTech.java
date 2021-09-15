/*
 * QUESTION 5:
-----------
 Project :GreensAddress
 Package :org.add
 Class :GreensTech
 Methods :greensOmr()
Description
You have to overload the method greensOmr() based on order,type,number.
 */
package org.add;

public class GreensTech {
	// By Order
	private void greensOmr(int roomNo, String buildingName)
	{
		System.out.println("Room No:" +roomNo + " , " + "Building Name: " +buildingName);
	}
	// By Order
	private void greensOmr(String nplotNo, int psector) 
	{
		System.out.println("Plot No : " +nplotNo + " , " + "Sector : " +psector);
	}
	// By Type
	private void greensOmr(long dpinCode, boolean hresidentialType) 
	{
		System.out.println("Pin Code : " +dpinCode + " , " + "Is it Residential Type : " +hresidentialType);
	}
	
	// By Number
	private void greensOmr(String pState, String pStatecode) 
	{
		System.out.println("State : " +pState + " , " + "State Code : " +pStatecode);
	}
	
	// By Number
	private void greensOmr(String jCountry, String lTaluka, String tStreet) 
	{
		System.out.println("Country : " +jCountry + " , " + "Taluka : " +lTaluka + " , " + "Street : " +tStreet);
	}
	
	public static void main(String[] args) {
		
		GreensTech gt = new GreensTech();
		System.out.println("-------------------------Address------------------------");
		gt.greensOmr(101, "Greens Tech CHS");
		gt.greensOmr("17A", 20);
		gt.greensOmr(410210, true);
		gt.greensOmr("Maharashtra", "MH");
		gt.greensOmr("India", "Panvel", "Kharghar");
	}


}
