package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class marketplace extends TestBase {

	@FindBy(xpath = "//*[@id=\"js_g\"]/div/div/div[5]/div/a[1]/div/h2")
	WebElement ElectronicsLabel;
	
	@FindBy(xpath="//*[@id=\"js_e\"]/div[1]/div/div[5]/div[1]/nav/div/a[2]")
	WebElement Electronics;
	
	
	
	//@FindBy(id="surname")
	//WebElement lastName;
	
	//@FindBy(name="client_lookup")
	//WebElement company;
	
	//@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	//WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public marketplace() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifymarketplace(){
		return Electronics.isDisplayed();
	}
	
	
	//public void selectContactsByName(String name){
	//	driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
		//		+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	//}
	
	//public void createNewContact(String title, String ftName, String ltName, String comp){
	//	Select select = new Select(driver.findElement(By.name("title")));
	//	select.selectByVisibleText(title);
	//	
	//	firstName.sendKeys(ftName);
	//	lastName.sendKeys(ltName);
	//	company.sendKeys(comp);
	//	saveBtn.click();	
	}

