package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class double_click_and_right_click {
  
	WebDriver driver;
	@Test
  public void double_click() throws InterruptedException {
		//Navigate to the tooltip_double_click 
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[9]/a")).click();
		System.out.println("We are navigate to the tooltip_double_click ");
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = "Tooltip and Double click – ToolsQA – Demo Website to Practice Automation";
		assertEquals(expectedTitle,actualTitle);
		
		//double click 
		
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("doubleClickBtn"));
	
		actions.doubleClick(elementLocator).perform();
		Thread.sleep(4000);
		

  }    
  
  @Test
  public void right_click() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[9]/a")).click();
		System.out.println("We are navigate to the tooltip_right_click ");
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = driver.findElement(By.id("rightClickBtn"));
	  Thread.sleep(4000);
	  actions.contextClick(elementLocator).perform();
	  Thread.sleep(5000);
	 
	  //select the option "copy me"
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]")).click();

	  	Thread.sleep(4000);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
