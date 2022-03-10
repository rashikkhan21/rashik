package testngproject;

import org.testng.annotations.Test;

public class invocationTest {
	@Test(invocationCount = 2)
	private void amazon() {
		System.out.println("founder Jeff Bezos");
	}

	@Test(invocationCount = -1)
	private void facebook() {
		System.out.println("founder Mark Zuckerberg");
	}

	@Test(invocationCount = 2)

	private void tesla() {
		System.out.println("founder Elon Musk");
	}

	@Test(invocationCount = 4)
	private void googleCeo() {
		System.out.println("Sundar Pichai");
	}

}
