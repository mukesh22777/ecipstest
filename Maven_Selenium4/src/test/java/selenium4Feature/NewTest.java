package selenium4Feature;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test (description="Test Book 5 is left of book 6 & below book 1")
  public void Test1() {
	 
		WebElement book5 = driver.findElement(RelativeLocator.withTagName("li").toLeftOf(By.id("pid6_thumb")).below(By.id("pid1_thumb")));
		
		String id=book5.getAttribute("id");
		System.out.println(id);
		
		Assert.assertEquals("pid5_thumb", id);
		}
  
  @BeforeClass
  public void setUp() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
