package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assserts {
	
	String actual ="sashik";
	String expected ="Rashik";
	
	
	
//	@Test
//	private void test1() {
//		
//	SoftAssert sa = new SoftAssert();
//	System.out.println("Test1 started");
//	sa.assertEquals(actual, expected);
//	sa.assertAll();
//	}

	//Hard assert ->Validation
	
	@Test
	private void test2() {
		System.out.println("Test2 Started");
		Assert.assertEquals(actual,expected);
		System.out.println("Test completed");
		
	}
}
