package selenium4Feature;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium4feature {

	// logo screen short
	@Test
	public void logoscreenshotTest() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		File file = logo.getScreenshotAs(OutputType.FILE);

		File destifile = new File("logo.png");
		FileUtils.copyFile(file, destifile);
		driver.quit();
	}
// open new tab in same window and if you need open new other window then you can use "WindowType.Window"
	@Test
	public void openNewTab() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		driver.quit();

	}

	@Test
	public void location() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		System.out.println("Hight :" +logo.getRect().getDimension().getHeight());
		System.out.println("Width :" +logo.getRect().getDimension().getWidth());
		System.out.println("X Location :" +logo.getRect().getX());
		System.out.println("Y Location :" +logo.getRect().getY());
		driver.quit();
		
	}
}
