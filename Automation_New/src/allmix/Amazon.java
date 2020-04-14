package allmix;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {
	  private FirefoxDriver driver;


	@Test
	  public void f() throws IOException {
		
		//varify the page title 
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		
		
		DateFormat date = new SimpleDateFormat("MM dd YYYY HH mm ss");
		  Date d1 = new Date();
		  String time = date.format(d1);
		  System.out.println(time);
		  
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  
		  FileUtils.copyFile(src, new File("C:\\Users\\MUKESH\\Desktop\\Image_Testing\\screenshot1.png"));
		  
		  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src1, new File("C:\\Users\\MUKESH\\Desktop\\Image_TestingImage_101 " + time + ".png"));
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com");
	}

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	}