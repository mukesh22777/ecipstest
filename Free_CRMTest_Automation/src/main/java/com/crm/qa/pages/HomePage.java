package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

		@FindBy(xpath = "//*[@id=\"navItem_100002933588452\"]/a/div")
		@CacheLookup
		WebElement userNameLabel;

		@FindBy(xpath = "//*[@id=\"navItem_217974574879787\"]/a/div")
		WebElement Messenger;
		
		@FindBy(xpath = "//*[@id=\"navItem_2392950137\"]/a/div")
		WebElement watchpage;
		

		@FindBy(xpath = "//*[@id=\"navItem_1606854132932955\"]/a/div")
		WebElement marketplace;

		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean verifyCorrectUserName(){
			return userNameLabel.isDisplayed();
		}
		
		public MessengerPage clickOnMessengerlink(){
			Messenger.click();
			return new MessengerPage();
		}
		
		public marketplace clickOnmarketlink(){
			marketplace.click();
			return new marketplace();
		}
		
		public watchpage clickOnwatchlink(){
			watchpage.click();
			return new watchpage();
		}
		
		public void clickOnNewMessengerLink(){
			Actions action = new Actions(driver);
			action.moveToElement(Messenger).build().perform();
			Messenger.click();
		}
}
