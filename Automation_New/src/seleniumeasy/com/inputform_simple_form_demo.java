package seleniumeasy.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class inputform_simple_form_demo {
	WebDriver driver;
	String actualTitle;

	@Test
	public void simple_form_demo() throws InterruptedException {
		// click on Input Form option
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();
		// click on simple form demo
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();

		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);

		// enter the message
		// driver.findElement(By.id("user-message")).sendKeys("Hello i am Mukesh");

		WebElement fName = driver.findElement(By.id("user-message"));
		fName.sendKeys("Hello i am Mukesh");
		System.out.println(fName.getText());
		// click on shoe message
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		
//navigate to the other frame
	
		//driver.switchTo().frame("gettotal");
		
		
		// Enter the "a" value
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("7");

		// Enter the "b" value
		driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("2");
		// click on get Total
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
		Thread.sleep(5000);
	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
