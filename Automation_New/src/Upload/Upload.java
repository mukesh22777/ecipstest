package Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Upload {

	private static RemoteWebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	    
	    driver.get("http://demo.guru99.com/test/upload/");
	    
	    WebElement UploadElement = driver.findElementByXPath("//*[@id='uploadfile_0']");
	    UploadElement.sendKeys("H:\\mix file\\MukeshQA.docx");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("submitbutton")).click();
	    driver.close();
	    
	}

}
