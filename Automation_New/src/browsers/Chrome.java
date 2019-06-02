package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
