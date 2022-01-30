package FirstRstAPI;

import org.testng.annotations.Test;

public class tst {

	
		

			@Test(priority=(int) 2.0)
			public void printMethod() {
				System.out.println("Print method");
			}
			
			
			@Test(priority='a')
			public void showMethod() {
				System.out.println("Show method");
			}
			
			
			@Test(priority='z')
			public void amroodMethod() {
				System.out.println("Amrrod method");
			}
	

}
