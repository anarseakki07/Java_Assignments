package org.fourwheeler;

public class FourWheeler {
	
	public void car() {
		System.out.println("Car");

	}
	
	public void bus() {
		System.out.println("Bus");

	}
	
	public void lorry() {
		System.out.println("Lorry");

	}
	
	public static void main(String[] args) {
		
		FourWheeler fw = new FourWheeler();
		
		fw.car();
		fw.bus();
		fw.lorry();
	}

}
