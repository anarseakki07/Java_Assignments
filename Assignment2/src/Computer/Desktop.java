/*
 * QUESTION 5:
-----------
 Project :COmputer
 Class :Computer
 Methods :computerModel()
 Class :Desktop
 Methods :desktopSize()
Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.

 */
package Computer;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop Size is 256 bytes");

	}
	
	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		
		dk.desktopSize();
		
		dk.computerModel();
	}

}
