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

public class priority {
		
	public ChromeDriver driver;
  @Test (priority=0)
//click on hello sign button for login
  // Method 1: Open Browser and login
  public void method1() {
	    driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("mmpatel_64804@yahoo.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("riyasavan123");
		driver.findElement(By.id("signInSubmit")).click();
  }
  
   @Test (priority=1)
   
// Method 2: search item in search box and add to cart
   public void method2() {
	   
  //find the item in search box
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
  
  //click on search button
  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
  
  //click on your choice item
  driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
 
  //click on add to cart button
  driver.findElement(By.id("add-to-cart-button")).click();
   }
  @Test (priority=2)
  public void method3() throws Exception {
  //Method 3  Open the card Windows
	  driver.findElement(By.id("nav-cart-icon nav-sprite")).click();
	//driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[5]/span[3]")).click();
	  //driver.findElement(By.xpath(".//*[@id='nav-cart-count']")).click();
	  
	  //popup windows
	  driver.findElement(By.id("siNoCoverage-announce")).click();
	//delete the item
	  driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
	  //take screen short
	 DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
	  Date d1 = new Date();
	  String time = date.format(d1);
	  System.out.println(time);
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  FileUtils.copyFile(src, new File("H:\\New folder\\workspace\\Mukesh_Automation\\screenshot2.png"));
	  
	  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src1, new File("H:\\New folder\\workspace\\Mukesh_Automation\\screenshot @ " + time + ".png"));
	  
  }
  @BeforeTest
public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "H:\\New folder\\driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		//Maximize the window
				driver.manage().window().maximize();

  }
  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }
  

	}

