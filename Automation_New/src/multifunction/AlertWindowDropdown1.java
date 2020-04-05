package multifunction;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AlertWindowDropdown1 {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
	    
		FirefoxDriver driver = new FirefoxDriver();
        
    //Opening an url
      driver.manage().window().maximize();
      driver.get("https://www.orangehrm.com/try-it-for-free.php");
    
      boolean trialpagedisplayed = driver.findElementByClassName("marginBottom25").isDisplayed();
       if(trialpagedisplayed==true){
    	   driver.findElementByXPath("//*[@id='orangeUrl']").sendKeys("Orange123");
    	   
    	   boolean CAdisplayed = driver.findElementByXPath(".//*[@id='checkAvailability']").isDisplayed();
    	   boolean CAenabled = driver.findElementByXPath(".//*[@id='checkAvailability']").isEnabled();
    	   
    	   if(CAdisplayed==true && CAenabled==true){
    		   System.out.println("Check availability button is available");
    	   driver.findElementByXPath(".//*[@id='checkAvailability']").click();
    	   }
    	   else{
    		   System.out.println("Check availability not available to click");
    	   }
       }
        
     
       boolean DummydataPresence = driver.findElementByXPath(".//*[@id='dummyData']").isDisplayed();
    boolean DummydataEnabled = driver.findElementByXPath(".//*[@id='dummyData']").isEnabled();
    boolean DummydataSelected = driver.findElementByXPath(".//*[@id='dummyData']").isSelected();
     
    if(DummydataPresence==true && DummydataEnabled==true && DummydataSelected==false) {
    	 driver.findElementByXPath(".//*[@id='dummyData']").click();
      }
   
      WebElement mySelectElement = driver.findElement(By.name("country"));
      Select dropdown= new Select(mySelectElement);
      dropdown.selectByVisibleText("Italy");
    
      
      driver.switchTo().alert().accept();
      driver.switchTo().alert().dismiss();
      
      driver.switchTo().alert().getText();
      
      
      driver.getWindowHandle();
      driver.getWindowHandles();
      
      
      

	}

}
