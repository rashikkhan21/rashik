package testngproject;
import org.testng.annotations.Test;
public class DataProvider {
	@Test(dataProvider ="testdata" )
	
	private void credentials(String empName, int empId) {
		System.out.println("Employee name is : " + empName);
		System.out.println("Employee Id is : " + empId);
	}
	@org.testng.annotations.DataProvider
	private Object[][] testdata() {
		return new Object [][] {{"Rashik" , 12561},
			                     {"Aravind",1232163},
			                     {"Rajavel",12133},
		};

	}

}
