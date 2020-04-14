package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
	  }
	  
  @Test
  public void keybord_event() throws InterruptedException {
	  //navigate to the keybord_enent 
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[6]/a")).click();
	  //click on browser button
	  //WebElement UploadElement = driver.findElement(By.id("//*[@id='uploadfile_0']")).click();
	 WebElement UploadElement = driver.findElement(By.id("browseFile"));
	    UploadElement.sendKeys("H:\\mix file\\MukeshQA.docx");
	    Thread.sleep(5000);
	    //click on upload button
	    driver.findElement(By.id("uploadButton")).click();
	    Thread.sleep(5000);
	    //Handling Alert
		  String alttxt=driver.switchTo().alert().getText();
		  System.out.println("Text on Alert is:" +alttxt);
		  driver.switchTo().alert().accept();
		  Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
