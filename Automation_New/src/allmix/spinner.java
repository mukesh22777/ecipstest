package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class spinner {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	driver.get("https://demoqa.com/spinner/");
		
	  }

	@Test
  public void f () throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/p[1]/span/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/p[1]/span/a[1]")).click();
	  
	  Thread.sleep(4000);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
