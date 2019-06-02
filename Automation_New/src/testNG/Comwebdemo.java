package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Comwebdemo {
	ChromeDriver driver;
	
  /*@Test (priority=0)
  public void method1() throws Exception {
	  Thread.sleep(1000);
	  
	  // create account
	  //click on sign in button
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  //Enter the Email Address in text box
 	  driver.findElement(By.id("email_create")).sendKeys("mukesh22777@gmail.com"); 
 	  //click on create account button
 	  driver.findElement(By.id("SubmitCreate")).click();
 	  Thread.sleep(5000);
 	  //select Title 
 	
 	 driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
	
 	 //Enter the first name
 	driver.findElement(By.id("customer_firstname")).sendKeys("Mukesh");
 	//Last Name
 	driver.findElement(By.id("customer_lastname")).sendKeys("Patel");
 	//Email
 	//driver.findElement(By.id("email")).sendKeys("shriramtechno@gmail.com");
 	//password
 	driver.findElement(By.id("passwd")).sendKeys("riyasavan123");
 	//Date of Birth
 	//Select day
 			new Select(driver.findElement(By.id("days"))).selectByValue("22");
 			//select month
 			new Select(driver.findElement(By.id("months"))).selectByValue("7");
 			//select years
 			new Select(driver.findElement(By.id("years"))).selectByValue("1977");
 			
 			driver.findElement(By.id("newsletter")).click();
 	
 	//Your Address
 	//First Name
 			driver.findElement(By.id("firstname")).sendKeys("Mukesh");	
 	//last name
 			driver.findElement(By.id("lastname")).sendKeys("patel");
 	//Company
 			driver.findElement(By.id("company")).sendKeys("testing");
 	//address
 			driver.findElement(By.id("address1")).sendKeys("44cottage st");
 	//city 
 			driver.findElement(By.id("city")).sendKeys("New Jersey");
 	//State
 			driver.findElement(By.id("id_state")).sendKeys("New Jersey");
 	//Zip/postal code
 			driver.findElement(By.id("postcode")).sendKeys("07306");
 	//Country
 			//driver.findElement(By.id("id_country")).sendKeys("Mukesh");
 	//Additional Information
 			driver.findElement(By.id("other")).sendKeys("testing");
 	//Home Phone
 			driver.findElement(By.id("phone")).sendKeys("9292828381");
 	//Mobile Phone
 			//driver.findElement(By.id("firstname")).sendKeys("Mukesh");
 	//Assign in address alias for future reference
 			driver.findElement(By.id("alias")).sendKeys("44 cottage st.");
 	//click on register Button
 			driver.findElement(By.id("submitAccount")).click();
 	
 			
 			DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
 			  Date d1 = new Date();
 			  String time = date.format(d1);
 			  System.out.println(time);
 			  
 			  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 			  
 			  
 			  FileUtils.copyFile(src, new File("H:\\New folder\\workspace\\Mukesh_Automation\\screenshot1.png"));
 			  
 			  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 			  FileUtils.copyFile(src1, new File("H:\\New folder\\workspace\\Mukesh_Automation\\screenshot @ " + time + ".png"));
 	
  }
  
  */
 	@Test (priority=1)
 	public void method2() throws Exception
 	
 	{
 		  Thread.sleep(5000);
 		  
 		
 		  //open the woman menu 
 		
 		 driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).click();
 		
 		 //click on Tops 		
 		 driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a")).click();
 		 
 		 
 		 
 		DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
 		  Date d1 = new Date();
 		  Object time = date.format(d1);
 		  System.out.println(time);
 		  
 		  
 		  
 		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		  
 		  
 		  FileUtils.copyFile(src, new File("H:\\New folder\\workspace\\Automation Training\\screenshot1.png"));
 		  
 		  
 		  
 		  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		  FileUtils.copyFile(src1, new File("H:\\New folder\\workspace\\Automation Training\\screenshot @ " + time + ".png"));
		
 		
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "H:\\New folder\\driver\\chrome\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "H:\\New folder\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//Maximize the window
				driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.close();
  }

}





