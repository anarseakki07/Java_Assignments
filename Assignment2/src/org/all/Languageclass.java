/*
 * QUESTION 3:
------------
 package name: org.all
 Project name: LanguageDetails
 Class name : Languageclass
 Methods : alllanguage
 package name: org.tamil
 Project name: LanguageDetails
 Class name : Tamil
 Methods : tamillanguage
 
 package name: org.english
 Project name: LanguageDetails
 Class name : English
 Methods : englishlanguage
 package name: org.telgu
 Project name: LanguageDetails
 Class name : Telgu
 Methods : telgulanguage
Description:
create above 4 packages and call all your class methods into the 
Languageclass using multilevel inheritance.

 */
package org.all;

import org.tamil.Tamil;

public class Languageclass extends Tamil {
	private void alllanguage() {
		System.out.println("-----All Language-----");

	}
	public static void main(String[] args) {
		
		Languageclass al = new Languageclass();
		
		al.alllanguage();
		al.tamilLanguage();
		al.englishLanguage();
		al.telguLanguage();
		
		
	}

}
