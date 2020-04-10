package selectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class selectable {
	
		WebDriver driver;
		
		@BeforeClass
		  public void beforeClass() {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.demoqa.com");
		  
		}
		
	  @Test void Selectable() throws InterruptedException {
		  
		//Select the Manu "Selectable" option 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[1]/ul/li[2]/a")).click();	
		Thread.sleep(3000);
		//Select the "Iteam2" From the List		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
		//Select the "Iteam5" From the List		
				driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
				
		Thread.sleep(3000);
	  }
	  
		 
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	}

