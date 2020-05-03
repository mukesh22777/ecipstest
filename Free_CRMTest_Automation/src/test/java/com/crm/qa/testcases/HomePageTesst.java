package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MessengerPage;
import com.crm.qa.pages.marketplace;
import com.crm.qa.pages.watchpage;
import com.crm.qa.util.TestUtil;

public class HomePageTesst<marketplacepage> extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	//TestUtil testUtil;
	MessengerPage MessengerPage;
	marketplace marketplacepage;
	watchpage watchpage;
	
	public HomePageTesst() {
			super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void setUp() {
		initialization();
		//testUtil = new TestUtil();
		//MessengerPage = new MessengerPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1) 
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Facebook - Log In or Sign Up", "Home page title is not match");
	}

	@Test(priority = 2)
	public void verifyUserNameTest() {
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}

	@Test(priority = 3)
	public void verifyMessengerLinkTest() {
		//testUtil.switchToFrame();
		MessengerPage = homePage.clickOnMessengerlink();
	}

	@Test(priority = 4)
	public void verifymarketplaceLinkTest() {
		//testUtil.switchToFrame();
		
		marketplacepage = homePage.clickOnmarketlink();
	}
	
	@Test(priority = 5)
	public void verifywatchLinkTest() {
		//testUtil.switchToFrame();
		
		watchpage = homePage.clickOnwatchlink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
