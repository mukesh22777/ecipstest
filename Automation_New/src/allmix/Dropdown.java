package allmix;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	    
		FirefoxDriver driver = new FirefoxDriver();
		
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(2000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(1000);
		if (fruits.isMultiple())
		{
		fruits.selectByVisibleText("Banana");
		Thread.sleep(1000);
		fruits.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Banana and Index 1 values are selected");
		Thread.sleep(3000);
		fruits.deselectAll();
		}
		else 
		{
			System.out.println("This is not a multiple select drop down");
		}
		
	}

}

