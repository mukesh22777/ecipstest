package ST_001;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class PageScroll {
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  //Vertical scroll
	 
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy (0, 100)");	
	  Thread.sleep(3000);
	//Horizontal scroll
	  
	  //((JavascriptExecutor)driver).executeScript("window.scrollBy (150, 0)");
  }
  @BeforeTest
  public void beforeTest()  {
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
