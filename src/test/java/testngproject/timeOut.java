package testngproject;

import org.testng.annotations.Test;

public class timeOut {
	@Test(timeOut = 3000)
	
	private void searchCars() throws InterruptedException {
		Thread.sleep(1000);
		
System.out.println("mahindra");
	}

}
