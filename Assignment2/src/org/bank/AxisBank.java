/*
 * QUESTION 6:
------------
 Project :BankDetails
 Package :org.bank
 Class :BankInfo
 Methods :saving(),fixed()
 Class :AxisBank
 Methods :deposit()
Description:
create above 2 class and call all your class methods into the BankInfo using single inheritance.

 */
package org.bank;

public class AxisBank extends BankInfo {
	
	private void deposit() {
		System.out.println("This is Deposit Account");

	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.deposit();
		
		ab.saving();
		ab.fixed();
	}

}
