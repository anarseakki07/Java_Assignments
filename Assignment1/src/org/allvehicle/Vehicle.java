/*
 * QUESTION 5:
-----------------------------------------
Project :VehicleInformation 
Package :org.allvehicle 
Class :Vehicle
Methods :VehicleNecessery() 

Package :org.twowheeler 
Class :TwoWheller
Methods :bike(),cycle()

Package :org.threewheeler 
Class :ThreeWheeler 
Methods :Auto() 

Package :org.fourwheeler
Class :FourWheeler
Methods :car(),bus(),lorry() 

Description: Create an object for all 4 classes inside the Vehicle class and call all classes methods also follow the all coding standards.

 */
package org.allvehicle;

import org.twowheeler.*;
import org.threewheeler.*;
import org.fourwheeler.*;

public class Vehicle {
	
	private void VehicleNecessery() {
		System.out.println("VehicleNecessery");

	}
	
	public static void main(String[] args) {
		
		Vehicle vn = new Vehicle();
		
		vn.VehicleNecessery();
		
		TwoWheller tw = new TwoWheller();
		
		tw.bike();
		
		ThreeWheeler tW = new ThreeWheeler();
		
		tW.auto();
		
		FourWheeler fw = new FourWheeler();
		
		fw.car();
		fw.bus();
		fw.lorry();
	}

}
