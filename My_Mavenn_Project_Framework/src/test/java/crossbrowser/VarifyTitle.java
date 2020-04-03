package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VarifyTitle {
WebDriver driver;
@Test
@Parameters("Browser")

	public void verifypageTitle(String browserName)
{
	
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Lib\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
}