package allmix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class muliti_handle_windows {
	WebDriver driver;
	String actualTitle;

	@Test
	public void multiwindowshandle() {
		//store current windows id
		String homeWinID=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/ul[1]/li[2]/a/div")).click();
		//store all windows id
		Set <String> allWindows = driver.getWindowHandles();
		
		Iterator<String> windowIterator = allWindows.iterator();
		 
		while(windowIterator.hasNext())
		{
		 
		   String recruiterWinID = windowIterator.next();
		if(!homeWinID.equals(recruiterWinID));
	}
		driver.switchTo().window(actualTitle);
		//please see video = https://www.youtube.com/watch?v=KkvLkjmILro&t=1681s
	}
	
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void trarmDown() {

	if (driver != null)
		driver.quit();
	}}
	


