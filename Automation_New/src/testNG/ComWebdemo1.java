package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class ComWebdemo1 {
	public WebDriver driver;
	public String str;
	
	@Test (priority=2)
 	public void method2() throws Exception {
 	{
 		  Thread.sleep(4000);
 		  
 		  //open the woman menu 
 		 driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).click();
 		 //click on Tops 		
 		 driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a")).click();
 		 
 		DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
 		  Date d1 = new Date();
 		  Object time = date.format(d1);
 		  System.out.println(time);
 		  
 		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		  FileUtils.copyFile(src, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot1.png"));
 		  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		  FileUtils.copyFile(src1, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot @ " + time + ".png"));
 		  		  
 		//To Check Password page is Displayed and Enter the Password:-
			
			Thread.sleep(1000);
			
			  
			boolean categoriesPage1 = ((RemoteWebDriver) driver).findElement(By.cssSelector("#layered_category_5")).isEnabled();
			
			  if(categoriesPage1 == true) {
			
			
			//boolean buttonPresence = driver.findElement (By.cssSelector("#layered_category_5")).isDisplayed();
			
			//if (buttonPresence == true) {
				   Thread.sleep(1000);
			
					
					System.out.println("Button page is Displayed");
				}
			else{System.out.println("Categories Page is Not-Displayed");}
			  
			  //To check Visible & Enable:
			  	  Thread.sleep(5000);
				  if( driver.findElement(By.cssSelector("#layered_category_5")).isEnabled()){
					
					//boolean buttonPresence = driver.findElement(By.id("")).isDisplayed();  
				  System.out.println("Categories page is Displayed & Enable");
				  }else{
				  System.out.println("Categories page is not Displayed & not Enable");
				  
				  
				  DateFormat date1 = new SimpleDateFormat("MM dd YYYY HH mm ss");
		 		  Date d2 = new Date();
		 		  Object time1 = date1.format(d2);
		 		  System.out.println(time1);
		 		  
		 		  File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 		  FileUtils.copyFile(src3, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot2.png"));
		 		  File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 		  FileUtils.copyFile(src2, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot @ " + time1 + ".png"));
			  }
				  }
 	
  }
	@Test (priority=3)
 	public void method3() throws Exception {
 	{
 		//open the short by price
 		Thread.sleep(5000);
 		//driver.findElement(By.cssSelector("#selectProductSort")).click();
 		//driver.findElement(By.xpath("//*[@id='selectProductSort']")).click();
 		driver.findElement(By.id("selectProductSort")).click();
 		driver.findElement(By.xpath("//*[@id='selectProductSort']/option[2]")).click();
 			
 		
 		//click to choice product for buy it
 		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")).click();
 		driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
 		
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("//*[@id='layer_cart']")).click();
 		
 		
			  }}
	
	@Test (priority=1)
 	public void method1() throws Exception {
		
		  //click on sign in button
		  
		  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		  //Enter the Email
		  Thread.sleep(5000);
	 	  driver.findElement(By.id("email")).sendKeys("mukesh22777@gmail.com"); 
	 	  //click on Password
	 	 driver.findElement(By.id("passwd")).sendKeys("riyasavan123"); 
	 	//SubmitLogin
	 		driver.findElement(By.id("SubmitLogin")).click();
	 		DateFormat date1 = new SimpleDateFormat("MM dd YYYY HH mm ss");
			  Date d2 = new Date();
			  Object time1 = date1.format(d2);
			  System.out.println(time1);
			  
			  File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src3, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot4.png"));
			  File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src2, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot @ " + time1 + ".png"));
	 	 
	}
 	

	@Test (priority=4)
 	public void method4() throws Exception {
		//Customer Service
		//click on contect us
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();
		
		//subject Heading
		//driver.findElement(By.id("id_contact")).click();
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();
		driver.findElement(By.xpath("//*[@id='id_contact']/option[2]")).click();
		//Enter Email Address
		//driver.findElement(By.id("email")).sendKeys("mukesh22777@gmail.com");
		//Attach File
		WebElement UploadElement = ((RemoteWebDriver) driver).findElement(By.id("fileUpload"));
	    UploadElement.sendKeys("H:\\Resume$scan doc\\Mukesh Resume.pdf");
	    //Add To tax
	    
	    driver.findElement(By.id("message")).sendKeys("Hello My Test");
	    //Click Send Button
	    
	    driver.findElement(By.id("submitMessage")).click();
	    
	    
	    
 		DateFormat date1 = new SimpleDateFormat("MM dd YYYY HH mm ss");
		  Date d2 = new Date();
		  Object time1 = date1.format(d2);
		  System.out.println(time1);
		  
		  File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src3, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot5.png"));
		  File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src2, new File("H:\\New folder\\workspace\\Automation_Tranning\\screenshot @ " + time1 + ".png"));
	   	
	}
	
	@Test (priority=5)
 	public void method5() throws Exception {
	
		//Click on Sign out Button
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	
	}
	
	
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://automationpractice.com/index.php");
	//Maximize the window
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	 driver.close(); 
	    
  }

}
