package allmix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class checkbox_radio {
	WebDriver driver;
	  @Test
	  public void checkbox() throws InterruptedException {
		//select the location 
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[1]")).click();
		//select the hotel reating
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[4]")).click();
		//select the bed type
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[3]/label[1]")).click();
		  Thread.sleep(3000);
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		  
		  driver.get("https://demoqa.com/checkboxradio/");
		  System.out.println(driver.getTitle());
		  
		  Thread.sleep(3000);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

	
}
