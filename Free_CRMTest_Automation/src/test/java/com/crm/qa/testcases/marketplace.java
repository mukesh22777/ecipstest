package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class marketplace extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	marketplace marketplace;

	public marketplace() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		marketplace = new marketplace();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(8000);
	}

	@Test(priority = 1)
	public void clickonmarketplaceBtn() {

		marketplace.clickonmarketplaceBtn();
	}
	@Test(priority = 2)
	public void verifyElectronicsLable() {

		marketplace.verifyElectronicsLable();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
