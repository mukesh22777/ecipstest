package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Slider {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 
		 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/slider/");
	  }
 

	 
	 @Test
  public void slider() throws InterruptedException {
		 
		 	WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	        Actions move = new Actions(driver);
	        Action action = (Action) move.dragAndDropBy(slider, 80, 0).build();
	        action.perform();
	        Thread.sleep(5000);
  }
 

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
