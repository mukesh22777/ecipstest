package ST_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Mouseover {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  WebElement ele = driver.findElement(By.linkText("Gmail"));
	  
	  Thread.sleep(4000);
	  
	  Actions action = new Actions(driver);
	  
	  action.moveToElement(ele).build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}