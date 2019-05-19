package steap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTest {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//@SuppressWarnings("unused")
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "H:\\New folder\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		}
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable{
		
		driver.findElement(By.id("email")).sendKeys("shriramtechno@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sitaram55");
	}

	@When("^i Enter valid username and password$")
public void i_Enter_valid_username_and_password() throws Throwable{

}

	@Then("^User shouls be able  to login successfully$")
public void User_shouls_be_able_to_login_successfully() throws Throwable{

driver.findElement(By.id("loginbutton")).click();		
}}