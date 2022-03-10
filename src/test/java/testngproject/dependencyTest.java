package testngproject;

import org.testng.annotations.Test;

public class dependencyTest {
	@Test 
	private void college() {
		System.out.println("sairam");
	}

	@Test
	private void school() {
		System.out.println("Laurel");
	}

	@Test
	private void cbsc() {
		System.out.println("+2");

	}

	@Test(dependsOnMethods = "college")
	private void diploma() {
		System.out.println("D.ct");
		
}
}
