package allmix;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class milti_winndows_Handle1 {public static void main(String[] args) throws Exception{
				WebDriver driver;
		{ 
					System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();

		driver.get("https://www.edureka.co/"); 
		String title = driver.getTitle(); System.out.println(title); 
		 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.findElement(By.cssSelector("#search-inp")).sendKeys("Selenium Certification Course"); 
		js.executeScript("window.scrollBy(0,40)"); 
		driver.findElement(By.xpath("//span[@class='typeahead__button']")).click(); 
		WebElement link = driver.findElement(By.xpath("//li[@class='ga-allcourses']//a[@class='giTrackElementHeader'][contains(text(),'Courses')]")); 
		Actions newwin = new Actions(driver); 
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform(); 
		Thread.sleep(2000); 
		//js.executeScript("window.scrollBy(0,400)"); 
		Thread.sleep(3000); 
		Set<String> windows = driver.getWindowHandles(); 
		System.out.println(windows); 
		System.out.println("a1"); 
		for (String window : windows) 
		{ 
		driver.switchTo().window(window); 
		if (driver.getTitle().contains("Best Training & Certification Courses for Professionals | Edureka")) 
		{ 
		System.out.println("a2"); 
		js.executeScript("window.scrollBy(0,1000)"); 
		System.out.println("b1"); 
		driver.findElement(By.xpath("//*[@id=\"allc_catlist\"]/li[3]/a")).click(); 
		driver.manage().window().setPosition(new Point(-2000, 0)); 
		} 
		} 
		Thread.sleep(3000); 
		Set<String> windows1 = driver.getWindowHandles(); 
		System.out.println(windows1); 
		System.out.println("a3"); 
		for (String window : windows1) 
		{ 
		driver.switchTo().window(window); 
		System.out.println("a4"); 
		js.executeScript("window.scrollBy(0,400)"); 
		} 
		} 
		}}