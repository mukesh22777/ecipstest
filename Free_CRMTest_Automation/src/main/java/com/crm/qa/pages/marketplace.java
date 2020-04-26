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
	
	
	// Initializing the Page Objects:
	public marketplace() {
		PageFactory.initElements(driver, this);
	}
	
	public marketplace clickOnmarketlink(){
		marketplace.click();
		return new marketplace();
	}
	
	public boolean verifyElectronicsLable(){
		return ElectronicsLabel.isDisplayed();
	}
	
	}

 