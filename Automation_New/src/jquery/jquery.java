package jquery;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class jquery {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.switchTo().frame(0);
	  WebElement SourceElement= driver.findElement(By.id("draggable"));
	  WebElement TargetElement= driver.findElement(By.id("droppable"));
	  Actions action = new Actions(driver);
	  Thread.sleep(3000);
	  action.dragAndDrop(SourceElement, TargetElement).build().perform();
	  //action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	 
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://jqueryui.com/droppable/");
			driver.manage().window().maximize();
		  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
