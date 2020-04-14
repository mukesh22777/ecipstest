package allmix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {
	
	
	
	WebDriver driver;
	public void setUP()
	{
		
		
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://demoqa.com/resizable//");
		  
		
		
		
		
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://jqueryui.com/resizable/");
	//}
	}
	public void resizeWidget()
	{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement widget = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions act = new Actions(driver);
		// Code for resize 
		act.clickAndHold(widget).moveByOffset(80, 80).release().build().perform();
	}
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resize obj = new resize();
		obj.setUP();
		obj.resizeWidget();

	}

}


