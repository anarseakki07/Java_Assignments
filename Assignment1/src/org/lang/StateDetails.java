package org.lang;

public class StateDetails extends LanguageInfo {

	private void southIndia() {
		System.out.println("South India");

	}
	
	private void northIndia() {
		System.out.println("North India");

	}
	
	public static void main(String[] args) {
		
		StateDetails st = new StateDetails();
		
		st.northIndia();
		st.southIndia();
		
		st.englishLanguage();
		st.hindiLanguage();
		st.tamilLanguage();
		
	}

}
