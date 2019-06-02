package Upload;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Upload {

	private static RemoteWebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\New folder\\driver\\chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    
	    driver.get("http://demo.guru99.com/test/upload/");
	    
	    WebElement UploadElement = driver.findElementByXPath("//*[@id='uploadfile_0']");
	    UploadElement.sendKeys("G:\\VST Manual\\SCRUM");
	    
	}

}
