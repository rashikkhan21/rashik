package testngproject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {
	@Test
	@Parameters({ "empName", "empId" })

	private void credentials(String empName, int empId) {
		System.out.println("Employee name is : " + empName);
		System.out.println("Employee Id is : " + empId);
	}

}
