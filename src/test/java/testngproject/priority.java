package testngproject;

import org.testng.annotations.Test;

public class priority {
@Test(priority = 2)

	private void searchtv() {
		System.out.println("samsung");
		

	}
@Test(priority = 1)
private void searchLaptop() {
	System.out.println("Hp");

}
@Test
private void searchMobile() {
	System.out.println("Xiomi");
	
}
@Test(priority = -1)
private void searchWatch() {
	System.out.println("Rolex");
	
}
}