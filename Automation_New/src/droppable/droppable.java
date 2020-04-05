package droppable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class droppable {
	
	WebDriver driver;			

    @Test		
    public void DragnDrop()					
    {		
    	System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();				
         driver.get("https://demoqa.com/droppable/");					
         
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	}		
	

}
