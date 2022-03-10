package testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simpleAnnotation {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\selenium\\TestNGProject\\Driver\\chromedriver01.exe");
	
	}
	@BeforeTest
public void browserLaunch() {
driver = new ChromeDriver();	
}
	@BeforeClass
	public void url() {
driver.get("https://www.facebook.com");
	}
	@BeforeMethod
	public void login() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		element.sendKeys("8681858571");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("04371234376");
		driver.findElement(By.xpath("//*[@id=\"u_0_d_Mu\"]")).click();
	}
	@Test
	
	public void nexturl() {

		driver.navigate().to("https://www.amazon.com");
		driver.findElement()
		
	}
	
}
