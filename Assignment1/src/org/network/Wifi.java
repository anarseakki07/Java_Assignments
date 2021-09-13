/*
 * QUESTION 4:
 --------------------------------------
Project :NetworkInformation 

Package :org.network
Class :Wifi 
Methods :wifiName() 

Class :MobileData
Methods :dataName()

Class :Lan 
Methods :lanName() 

Class :Wireless 
Methods :modamName() 

Description: Create an object for all 4 classes inside the Wifi class and call all classes methods also follow the all coding standards

*/

package org.network;

public class Wifi {
	
	private void wifiName() {
		System.out.println("MH 46 OFFICIAL");

	}
	
	public static void main(String[] args) {
		
		Wifi wi = new Wifi();
		
		wi.wifiName();
		
		MobileData md = new MobileData();
		
		md.dataName();
		
		Lan ln = new Lan();
		
		ln.lanName();
		
		Wireless wr = new Wireless();
		
		wr.modemName();
	}

}
