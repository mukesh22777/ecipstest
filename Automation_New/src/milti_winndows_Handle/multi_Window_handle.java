package milti_winndows_Handle;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class multi_Window_handle {
	WebDriver driver;

	@Test
	public void multi_windows_handle() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// driver.get("https://www.edureka.co/community");
		String mainweb = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='qa-logo-link edureka']")).sendKeys(Keys.SHIFT, Keys.ENTER);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,400)");
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			js.executeScript("window.scrollBy(0,400)");
			String child = itr.next();
			if (!mainweb.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				Thread.sleep(4000);
				// driver.close();
			}
		}
		driver.switchTo().window(mainweb);

	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.edureka.co/community");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
