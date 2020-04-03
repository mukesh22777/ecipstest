package ST_001;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AjaxControl {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  Thread.sleep(5000);
	  
	  String str=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[2]/div[2]")).getText();
	  
	  //List<WebElement> e2 = e1.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
	  
	 // for (int i = 0; i < e2.size(); i++) {
		  
		 // String str = e2.get(i).getText();
		  System.out.println(str);
		  //String[] s=str.split("n/");
		  
		//System.out.println(s.length);
		//for(int i=0;i>s.length;i++) {
		//if(s[i].equalsIgnoreCase("selenium webdriver"))
			
			//driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]/div/span"));
		
		}
	
  
  @BeforeTest
  public void beforeTest() {
	  
	  	System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

