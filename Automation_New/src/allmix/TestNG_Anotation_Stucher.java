package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Anotation_Stucher {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://demoqa.com");
		System.out.println(driver.getTitle());
	
	}

	@BeforeClass
	public void beforeClass() {

	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@Test
	public void f1() {
		System.out.println(" this is a my real test1");
	}

	@Test
	public void f2() {
		System.out.println(" this is a my real test2");
	}

	@Test
	public void f3() {
		System.out.println(" this is a my real test3");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" this is a AfterMethod");
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" this is a AfterClass");
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" this is a AfterTest");
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" this is a AfterSuite");
		driver.quit();
	}

}
