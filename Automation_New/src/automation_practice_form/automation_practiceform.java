package automation_practice_form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class automation_practiceform {
	String Mainwindow;
	WebDriver driver;
	String childwindow;
	@Test
	
  public void fillform() throws Exception
  {
	  
	  //enter the first name 
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Mukesh");
	 //enter the last name 
	  driver.findElement(By.id("lastname")).sendKeys("Patel");
	  //select the sex
	  Thread.sleep(3000);
	  driver.findElement(By.id("sex-0")).click();
	  //select the years of experince 
	  driver.findElement(By.id("exp-4")).click();
	  //enter the current date 
	 
	  driver.findElement(By.id("datepicker")).sendKeys("04-05-2020");
	  
	  //select the automation tools
	  driver.findElement(By.id("profession-1")).click();
	  Thread.sleep(3000);
	  
	  //select the profile picture from the local system 
	  WebElement UploadElement = driver.findElement(By.id("photo"));
	  //WebElement UploadElement = driver.findElementByXPath("//*[@id='uploadfile_0']");
	    UploadElement.sendKeys("H:\\mix file\\MukeshQA.docx");
	  
	  //select the countery from drop down list
	  driver.findElement(By.xpath("//*[@id=\"continents\"]/option[7]")).click();
	  Thread.sleep(3000);
	  //select the selenium command
	  driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[4]")).click();
	  //select button "2"
	  Thread.sleep(3000);
	  driver.findElement(By.id("submit1")).click();
	  
	  }
	
@BeforeClass
  public void beforeClass() {
	  
	System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://demoqa.com/automation-practice-form/");
		
  }

}


