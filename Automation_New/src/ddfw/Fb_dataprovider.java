package ddfw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb_dataprovider {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");	
	}
	@DataProvider
	public void getTestData() {
		 
	}
	@Test
	public void fblogintest(String UserName, String Password) {
		
		driver.findElement(By.id("email")).sendKeys(UserName);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("u_0_2")).click();
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void  tearDown() {
		driver.quit();
	}
	
	
	
	
	
	

}
