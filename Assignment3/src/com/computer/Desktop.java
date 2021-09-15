/*
 * QUESTION 6:
-------------
 Project :Computer
 Interface :HardWare
 Methods :hardwareResources()
 Interface :Software
 Methods :softwareResources()
 Class :Desktop
 Methods :desktopModel()
Description:
create 2 Interface and achieve multiple inheritance.
 */
package com.computer;
//Multiple Inheritance is Achieved.
public class Desktop implements Hardware, Software 
{
	void desktopModel() 
	{
		System.out.println("Desktop Model is HP Povalion");
	}
	
	@Override
	public void hardwareResources()
	{
		System.out.println("This is Hardware.");
	}
	
	@Override
	public void softwareResources() 
	{
		System.out.println("This is Software Resources.");
		
	}
	
	public static void main(String[] args) {
		
			Desktop d = new Desktop();
			d.desktopModel();
			d.hardwareResources();
			d.softwareResources();
			
			
	}
}
