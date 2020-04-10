package Upload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class uploadtestNG {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	
	  WebElement UploadElement=driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
	    UploadElement.sendKeys("H:\\mix file\\MukeshQA.docx");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("submitbutton")).click();
	  Thread.sleep(4000);
  	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	    
	    driver.get("http://demo.guru99.com/test/upload/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
