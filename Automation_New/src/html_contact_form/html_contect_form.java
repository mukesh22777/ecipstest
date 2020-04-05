package html_contact_form;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class html_contect_form {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/html-contact-form/");
	  }

  @Test
  public void html_contect_form1 () throws InterruptedException {
	  driver.findElement(By.className("firstname")).sendKeys("Mukesh");
	  driver.findElement(By.id("lname")).sendKeys("Patel");
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[3]")).sendKeys("USA");
	  driver.findElement(By.id("subject")).sendKeys("Hello My name is Mukesh patel i am trying to some prectice");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[4]")).click();
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
