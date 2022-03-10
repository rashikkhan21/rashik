package testngproject;

import org.testng.annotations.Test;

public class groupTest {
@Test(groups ="CompanyDetails")

	private void employeeId() {
System.out.println("321351651");
	}
@Test(groups = "CompanyDetails")
private void employeeName() {
System.out.println("rashik");
}
@Test(groups = "PersonalDetails")
private void personalAdd() {
System.out.println("Chennai, Adyaar");

}
@Test(groups = "PersonalDetails")
private void personalNo() {
System.out.println("5165132165");
}
}