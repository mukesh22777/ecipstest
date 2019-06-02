package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_createaccount {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		//Maximize the window
		driver.manage().window().maximize();

		//Enter First Name
		driver.findElement(By.id("u_0_c")).sendKeys("mukesh");
		
		// Enter Surname
		driver.findElement(By.id("u_0_e")).sendKeys("patel");
		
		//Enter Mobile Number
		driver.findElement(By.id("u_0_h")).sendKeys("9292828381");
		
		//Enter Password
		driver.findElement(By.id("u_0_o")).sendKeys("sitaram55");
		
		//Select Month
		new Select(driver.findElement(By.id("month"))).selectByValue("7");
		
		//Select Date
		new Select(driver.findElement(By.id("day"))).selectByValue("22");
		//Select year
		
		new Select(driver.findElement(By.id("year"))).selectByValue("1977");
		
		//Select Gender
		driver.findElement(By.id("u_0_a")).click();
		driver.close();
		
	}

}
