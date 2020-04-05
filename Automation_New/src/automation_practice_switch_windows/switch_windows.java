package automation_practice_switch_windows;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class switch_windows {
	WebDriver driver;	
@Test
public void TestPopUp() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();
		driver.findElement(By.id("//*[@id=\"content\"]/div[2]/button[3]")).click();
		driver.findElement(By.id("//*[@id=\"buttondemoqa\"]")).click();
		//driver.findElement(By.id("")).click();
// It will return the parent window name as a String
String parent=driver.getWindowHandle();
 
// This will return the number of windows opened by Webdriver and will return Set of St//rings
Set<String>s1=driver.getWindowHandles();
 
// Now we will iterate using Iterator
Iterator<String> I1= s1.iterator();
 
while(I1.hasNext())
{
 
   String child_window=I1.next();
 
// Here we will compare if parent window is not equal to child window then we            will close
 
if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);
 
System.out.println(driver.switchTo().window(child_window).getTitle());
 
driver.close();
}
 
}
// once all pop up closed now switch to parent window
driver.switchTo().window(parent);
 
}
}