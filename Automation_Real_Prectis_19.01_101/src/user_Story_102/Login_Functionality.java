package user_Story_102;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


public class Login_Functionality {

	WebDriver driver;
@Test
public void f() throws IOException, JXLException {
	  
	  FileInputStream fi = new FileInputStream("F:\\Selenium\\Workspace\\Automation_Real_Prectis_19.01_101\\src\\user_Story_102\\TestData1.xls");
	  Workbook wb = Workbook.getWorkbook(fi);
	  Sheet s = wb.getSheet("Sheet1");
	  
	  for (int i = 1; i < s.getRows(); i++) {
		  
		  
		  
		  // enter username
		  driver.findElement(By.id("email")).sendKeys(s.getCell(0,i).getContents());
		  
		  // enter password
		  driver.findElement(By.id("pass")).sendKeys(s.getCell(1,i).getContents());
		  
		  // click login button
		  driver.findElement(By.id("loginbutton")).click();
		  
		  driver.get("https://www.fb.com/");
		
	}
	  
	  
}
@BeforeTest
public void beforeTest() {
	 System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.fb.com/");
}

@AfterTest
public void afterTest() {
	driver.close();
}

}




