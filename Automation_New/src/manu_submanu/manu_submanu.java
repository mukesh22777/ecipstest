package manu_submanu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class manu_submanu {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 
		 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		driver.get("https://demoqa.com/menu/");
		Thread.sleep(3000);
	 }
	 
	 @Test
 public void slider() throws InterruptedException {
		
		
		Actions builder = new Actions(driver); 
        WebElement mainmenu1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[6]/div"));
        builder.moveToElement(mainmenu1 ).build().perform();
        Thread.sleep(500); //add a wait
        WebElement submenu1=  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[6]/ul/li[1]/div")); //Find the submenu
        builder.moveToElement(submenu1).click().build().perform();
        Thread.sleep(500);
        WebElement chieldsubmenu1=  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/div")); //Find the chieldsubmenu
        builder.moveToElement(chieldsubmenu1).click().build().perform();
        Thread.sleep(500);
		
		
		 	
 }


 @AfterMethod
 public void afterMethod() {
	  driver.quit();
 }

}
