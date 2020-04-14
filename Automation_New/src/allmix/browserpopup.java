package allmix;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserpopup {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.dezlearn.com/testingpage/");
		
		driver.findElement(By.xpath("//a[@id=\"popup\"]")).click();
		Thread.sleep(3000);
String windows1=driver.getWindowHandle();

Set<String> windows = driver.getWindowHandles();

for (String x: windows) {
	if(x.contentEquals(windows1)== false) {
	driver.switchTo().window(x);
	
	break;
	
}
	}
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

//Navigate to original windows
Thread.sleep(4000);
driver.switchTo().window(windows1);
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());


driver.quit();
	}}
  