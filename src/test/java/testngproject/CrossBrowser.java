package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Test
	private void amazonTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\selenium\\TestNGProject\\Driver\\chromedriver01.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

	@Test
	private void flipKartTest() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\selenium\\TestNGProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipKart.com");

	}
}
