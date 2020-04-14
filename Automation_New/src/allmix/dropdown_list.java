package allmix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdown_list {
	
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 
		 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/selectmenu/");
	  }


	 
	 @Test
 public void dropdownlist () throws InterruptedException {
		 //select the speed
		 driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]")).click();
		 //select the file
		 //select the number
		 //select he title
		 	
	        Thread.sleep(2000);
 }


 @AfterMethod
 public void afterMethod() {
	  driver.quit();
 }
}
