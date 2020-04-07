package dialogbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dilog_box {
	WebDriver driver;
  @Test
  public void dialogbox() throws InterruptedException {
	  //navigate to the dialog box 
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[17]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[6]/div[1]/button/span[1]")).click();
	  
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	  
	  driver.get("https://demoqa.com/");
	  System.out.println(driver.getTitle());
	  
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
