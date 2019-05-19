package LoginstepDefinination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginstepDefinination {
	WebDriver driver = null;
	@Given("^User opens Yahoo login page$")
	public void User_opens_Yahoo_login_page() {
		driver = new FirefoxDriver();
		driver.get("http://login.yahoo.com");
	}
	
	@Then("^User Enter Login Password$")
	public void User_Enter_Login_Password() {
	driver.findElement(By.id("username")).sendKeys("mmpatel_64804@yahoo.com");

}
	@Then("^User Enter Login id$")
	public void User_Enter_Login_id() {
	
	driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("riyassavan123");{
		
	}}
	@And("^User Click on Signin button$")
	public void User_Click_on_Signin_button() {
	
	driver.findElement(By.xpath("//*[@id='login-signin']")).click();  }
	
		@And("^Close the browser$")
		public void Close_the_browser() {
		
		driver.quit();  {
	
}}}
	