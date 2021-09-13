/*QUESTION 2:
------------------------------------------------------
Project : LanguageDetails
Package : org.lang
Class : LanguageInfo 
Methods : tamilLanguage(),englishLanguage(),hindiLanguage() 
Class : StateDetails 
Methods : southIndia(),northIndia() 
Description: Create an object for LanguageInfo and StateDetails inside the StateDetails class and call both classes methods also follow the all coding standards.
*/


package org.lang;

public class LanguageInfo {
	
	public void tamilLanguage() {
		System.out.println("Tamil");

	}
	
	public void englishLanguage() {
		System.out.println("English");

	}
	
	public void hindiLanguage() {
		System.out.println("Hindi");

	}
	
	public static void main(String[] args) {
		
		
		LanguageInfo ln = new LanguageInfo();
		ln.tamilLanguage();
		ln.englishLanguage();
		ln.hindiLanguage();
	}

}
