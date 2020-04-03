package ST_001;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class titleverify {
	private FirefoxDriver driver;

	@Test
	public void homepage() throws IOException {
		// verify home page
		String my_title = driver.getTitle();

		System.out.println("Home page Title is " + my_title);
		String Expected_title = "American Airlines - Airline tickets and cheap flights at AA.com";
		Assert.assertEquals(my_title, Expected_title);

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.aa.com");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
