package keybord_event;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class keyboed_evwnt_sample_form {
  WebDriver driver;
	@Test
  public void Keybord_Action() throws InterruptedException {
		
		//navigate to the keyboard-events-sample-form
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[2]/ul/li[8]/a")).click();
		System.out.println("we are navidgate to the keyboard-events-sample-form ");
		
		//enter the namae
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Mukesh");
		
		//enter the current address
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("44A cottahe st, Jersey City, NJ-07306");
		Thread.sleep(3000);
		//enter the permanentAddress
		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("same as current address");
		
		Thread.sleep(5000);
		// click on submit button 
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		
  }
  @BeforeClass
  public void beforeClass() {
	  
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
