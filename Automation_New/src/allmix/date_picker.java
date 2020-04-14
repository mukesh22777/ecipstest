package allmix;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class date_picker {
	
	WebDriver driver;
	  @Test
	  public void dialogbox() throws InterruptedException {
		  
		  Date date = new Date();
		 // SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		  String formattedDate = sdf.format(date);
		  System.out.println(formattedDate);
		  
		  driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys(formattedDate);
		  Thread.sleep(8000);
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		  
		  driver.get("https://demoqa.com/datepicker/");
		  System.out.println(driver.getTitle());
		  
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

	}



