package ddfw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class inputOutput {
	
	WebDriver driver;
	public String str;
	
  @Test
  public void outputstream() throws IOException, JXLException  {
	  
	  FileInputStream fi = new FileInputStream("H:\\New folder\\workspace\\Automation Training\\Test\\Test_Data1.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  Sheet s = w.getSheet("Sheet1");
	  
	  FileOutputStream fo = new FileOutputStream("H:\\New folder\\workspace\\Automation Training\\Test\\output.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet ws = wb.createSheet("Results", 0);
	  
	  for (int i = 1; i < s.getRows(); i++) {
		  
		  driver.findElement(By.id("email")).sendKeys(s.getCell(0,i).getContents());
		  driver.findElement(By.id("pass")).sendKeys(s.getCell(1,i).getContents());
		  driver.findElement(By.id("loginbutton")).click();	
		  
		  if (driver.findElement(By.id("loginbutton")).isDisplayed()) {
			  
			  str = "Invalid Credentials";
			  System.out.println(str);
			
		} else {
			
			  str = "Valid Credentials";
			  System.out.println(str);

		}
		  
		  driver.get("https://www.fb.com");
		  
		  
		  
		  for (int j = 0; j < s.getColumns(); j++) {
			  
			  Label lab = new Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(lab);
			  
			  Label res = new Label(2, i, str);
			  ws.addCell(res);			
		}
	
	  }
		  
		  Label un = new Label(0, 0,"UserName");
		  Label pw = new Label(1, 0,"Password");
		  Label rs = new Label(2, 0,"Results");
		  
		  ws.addCell(un);
		  ws.addCell(pw);
		  ws.addCell(rs);
		  
		  wb.write();
		  wb.close();
	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.fb.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

