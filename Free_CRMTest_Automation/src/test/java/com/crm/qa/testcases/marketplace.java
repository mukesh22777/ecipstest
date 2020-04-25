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
	

		private static final boolean True = false;
		LoginPage loginPage;
		HomePage homePage;
		//TestUtil testUtil;
		marketplace marketplace;
		//String sheetName = "contacts";
		
		public marketplace(){
				super();
				
		}
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			
			initialization();
			//testUtil = new TestUtil();
			marketplace = new marketplace();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
		}
		
		@Test(priority=1)
		public boolean verifymarketplace(){
			Assert.assertTrue(marketplace.verifymarketplace(), "contacts label is missing on the page");
			return True;
			
		}
		
		@Test(priority=2)
		public void verifyEletronics(){
			Electronics.
		}
		
		

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		

}
