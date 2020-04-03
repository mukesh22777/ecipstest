package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenlinkTest {
	public static WebDriver driver;

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://facebook.com");
		//driver.get("https://wellsfargo.com");
		driver.findElement(By.id("email")).sendKeys("shriramtechno@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mukesh@1977");
		driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.id("pass")).sendKeys("Mukesh@1977");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		//driver.switchTo().frame("mailpanel");
		//link -- //a herf<>   // image ing heref
// 1. get list of all the liks and images

		List<WebElement>listlink = driver.findElements(By.tagName("a"));
		listlink.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of full link and image ========>" + listlink.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>(); 
//2 iterate linkList link/image dose't href attribute
		for(int i=0; i<listlink.size(); i++) {
		//System.out.println(listlink.get(i).getAttribute("herf"));
			if(listlink.get(i).getAttribute("href")!=null && (!listlink.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(listlink.get(i));
			}}
// get the size of active links list

		System.out.println("Size of Active link and image ========>" +activeLinks.size());


	for(int j=0; j<activeLinks.size(); j++) {
	HttpURLConnection connection;
	
	connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
	connection.connect();
	String responce=connection.getResponseMessage();
	connection.disconnect();
	System.out.println(activeLinks.get(j).getAttribute("href") +"=====" +responce);
	
	}}}

	//200 -ok
	//404 -not found
	//400 -bed request 
	//500 -internal error		
			
	

 
	
	


