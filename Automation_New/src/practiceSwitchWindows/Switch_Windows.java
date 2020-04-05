package practiceSwitchWindows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Switch_Windows {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	driver.get("https://demoqa.com/");
	  }

  @Test
  public void switch_windows() throws InterruptedException {
	  //navigate to the automation-practice-switch-windows
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[7]/a")).click();
	  //click on new browser windows 
	  driver.findElement(By.id("button1")).click();
	  System.out.println("********We are switch to Browser Windows*******");
	  Thread.sleep(5000);
	  //click on new message windows
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();
	  System.out.println("********We are switch to message windows*******");
	  Thread.sleep(5000);
	  //click on new browser tab
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/button[3]")).click();
	  System.out.println("********We are switch to new browser tab*******");
	  Thread.sleep(5000);
	  
	//click on new demoqa windows
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/button[4]")).click();
	  System.out.println("********We are switch to demoqa windows*******");
	  Thread.sleep(5000);
	  
	// It will return the parent window name as a String
	  String parent=driver.getWindowHandle();
	   
	  // This will return the number of windows opened by Webdriver and will return Set of St//rings
	  Set<String>s1=driver.getWindowHandles();
	   
	  // Now we will iterate using Iterator
	  Iterator<String> I1= s1.iterator();
	   
	  while(I1.hasNext())
	  {
	   
	     String child_window=I1.next();
	   
	  // Here we will compare if parent window is not equal to child window then we will close
	   
	  if(!parent.equals(child_window))
	  {
	  driver.switchTo().window(child_window);
	   
	  System.out.println(driver.switchTo().window(child_window).getTitle());
	 
	  }
	  }
	  // once all pop up closed now switch to parent window
	  driver.switchTo().window(parent);
	   
	  }
	  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
