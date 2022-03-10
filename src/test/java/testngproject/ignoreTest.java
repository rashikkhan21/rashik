package testngproject;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoreTest {

	@Ignore
	@Test
	private void college() {
		System.out.println("sairam");
	}

	@Test(enabled = false)
	private void school() {
		System.out.println("Laurel");
	}

	@Test
	private void cbsc() {
		System.out.println("+2");

	}

	@Test
	private void diploma() {
		System.out.println("D.ct");
	}

}
