package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class manage_tab {
	 WebDriver driver;
  @BeforeClass
 
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	driver.get("https://demoqa.com/tabs/");
  }
  @Test
  public void tab() {
	  //click on Nunc Tab
	  driver.findElement(By.id("ui-id-1")).click();
	  driver.findElement(By.id("ui-id-2")).click(); 
	  driver.findElement(By.id("ui-id-3")).click();
	  
  }
 
  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
