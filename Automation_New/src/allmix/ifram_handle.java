package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ifram_handle {
	WebDriver driver;
	@BeforeClass
	
	  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/iframe-practice-page//");
	  }
	
	
	@Test
  public void iframe1() throws InterruptedException {
	//navigate to the iframe
		driver.switchTo().frame("iframe1");
		System.out.println("********We are switch to the iframe1*******");
		//select the software testing tools 
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		
		Thread.sleep(9000);
	driver.switchTo().defaultContent();
 }
  
	@Test
	  public void iframe2() throws InterruptedException {
		//navigate to the iframe
			driver.switchTo().frame("iframe2");
			System.out.println("********We are switch to the iframe2*******");
			//select the software testing tools 
			//driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
			
			Thread.sleep(9000);
	  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
