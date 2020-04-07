package controlgroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class control_group {
	
	WebDriver driver;
	  @Test
	  public void dialogbox() throws InterruptedException {
		  //click on drop down vhical  
		  
		  driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[1]")).click();
		  Thread.sleep(5000);
		  //select the sub option SUV
		 // driver.findElement(By.xpath("//*[@id=\"ui-id-13\"]")).click();
		  //Thread.sleep(5000);
		 //select the automated button
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/fieldset[1]/div/label[2]/span[1]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"ui-id-8-button\"]/span[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]")).click();
		  Thread.sleep(5000);
	  }
	 
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		  
		  driver.get("https://demoqa.com/controlgroup/");
		  System.out.println(driver.getTitle());
		  
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

	}



