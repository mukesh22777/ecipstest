package prectice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pagesource {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://demoqa.com");
		String pagesource=driver.getPageSource();
		System.out.println(driver.getTitle());
		System.out.println(pagesource);
	}

	@Test
	public void f1() {
		System.out.println(" this is a my real test1");
	}

	@AfterMethod
	public void afterMethod() {
				driver.quit();
	}

}



