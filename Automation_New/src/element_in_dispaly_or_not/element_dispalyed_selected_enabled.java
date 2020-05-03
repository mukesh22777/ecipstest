package element_in_dispaly_or_not;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class element_dispalyed_selected_enabled {
	WebDriver driver;

	@Test
	public void element_Visibilty() {
		// is Displayed method use application for all elements it will be retuen value
		// true or false
		// we check submit button visible or not
		boolean b1 = driver.findElement(By.id("id of submit button")).isDisplayed(); // for submit button
		System.out.println(b1); // return true

		// is Enabled method use elements Enabled or not - it will be retuen value
		// true or false
		// we check submit button Enabled or not
		boolean b2 = driver.findElement(By.id("id of submit button")).isEnabled(); // for submit button
		System.out.println(b2); // return fales

		// select i agree and check
		driver.findElement(By.id("od of element")).click();
		boolean b3 = driver.findElement(By.id("id of submit button")).isEnabled(); // for submit button
		System.out.println(b3); // return true

		// is Displayed method use redio button, dropdown and checkbob

		// we check submit button Dispayed or not
		boolean b4 = driver.findElement(By.id("id of submit button")).isSelected(); // for submit button
		System.out.println(b4); // return true

	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

	}

	@AfterClass
	public void afterClass() {

	}

}
