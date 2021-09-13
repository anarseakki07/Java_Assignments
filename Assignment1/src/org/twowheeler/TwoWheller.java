package org.twowheeler;

public class TwoWheller {
	
	public void bike() {
		System.out.println("Bike");

	}
	
	private void cycle() {
		System.out.println("Cycle");

	}
	
	public static void main(String[] args) {
		
		
		TwoWheller tw = new TwoWheller();
		
		tw.bike();
		tw.cycle();
	}

}
