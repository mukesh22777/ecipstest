package practiceSwitchWindows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Switch_Windows {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
	}

	@Test
	public void switch_windows_newbrowser_window() throws InterruptedException {
		// navigate to the automation-practice-switch-windows// Store and Print the name
		// of the First window on the console

		String handle = driver.getWindowHandle();

		System.out.println(handle);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[7]/a")).click();
		// click on new browser windows
		driver.findElement(By.id("button1")).click();
		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);

		// Pass a window handle to the other window

		for (String handle1 : driver.getWindowHandles()) {

			System.out.println(handle1);

			driver.switchTo().window(handle1);

		}

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"the7-micro-widget-search\"]")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/div/div/form/div/a/i")).click();
		// Thread.sleep(2000);

		System.out.println("********We are switch to Browser Windows*******");

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will return
		// Set of St//rings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child window then we
			// will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

			}
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);

	}

	@Test
	public void New_message_windows() throws InterruptedException {
		// click on new message windows navigate to the new windows
		driver.navigate().to("https://demoqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();
		System.out.println("********We are switch to message windows*******");
		Thread.sleep(5000);

	}

	@Test
	public void New_Browsertab() throws InterruptedException {
		// click on new browser tab
		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/button[3]")).click();
		System.out.println("********We are switch to new browser tab*******");
		Thread.sleep(5000);

		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
