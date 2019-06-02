package browsers;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		WebDriver driver;
		
		//Initialize browser
		
		System.setProperty("webdriver.gecko.driver", "H:\\New folder\\driver\\geckodriver.exe");
		
	
		driver = new FirefoxDriver();
		
		
		//open URL
		
		driver.get("https:/www.amazon.com");
		//d1.get("https:/www.guru99.com");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
				
				
	}

}
