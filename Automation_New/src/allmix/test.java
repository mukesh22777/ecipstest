package allmix;

import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    //Providing path to chromedriver.exe and initiating the browser launch
		System.setProperty("webdriver.gecko.driver","H:\\New folder\\driver\\geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	 
		
				driver.get("https://www.google.com/gmail/about/#");
				
		// To Check the access Page Displayed is Gmail or not:-
				
						boolean TrialPage = driver.findElementByXPath("./html/body/nav/a/div").isDisplayed();						
						// Check Gmail Page is Displayed

						if(TrialPage == true) {							
							driver.findElementByCssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in").click();
							
							System.out.println("Gmail Page is Displayed");
						}
						else {System.out.println("Gmail Page is Not-Displayed");}
						
		// To Check Sign-In page is Displayed and Enter the Gmail Id:-
						
						boolean LoginPage = driver.findElementById("headingText").isDisplayed();
						
						if(LoginPage == true) {
									
							// Enter Correct Email Id
						        driver.findElementByName("identifier").sendKeys("seleniumqa365@gmail.com");
				        			        
					       // Enter In-Correct Email Id
						        
						        driver.findElementByXPath(".//*[@id=\'identifierNext\']/content/span").click();
						        
						        System.out.println("Login Page is Displayed and Email Id is Entered");
						}
						else{ System.out.println("Login Page is Not-Displayed");}
										
		//To Check Password page is Displayed and Enter the Password:-
						
						Thread.sleep(1000);
						
						  boolean PasswordPage = driver.findElementById("headingText").isDisplayed();
			  
						  
						  if(PasswordPage == true) {
						
							   Thread.sleep(1000);
						
								driver.findElementByXPath(".//*[@id=\'password\']/div[1]/div/div[1]/input").sendKeys("selenium1");	
	
							              
							    driver.findElementByXPath(".//*[@id='passwordNext']/content/span").click();
						
								System.out.println("Password Page is Displayed & Password is Enterred");
							}
						else{System.out.println("Password Page is Not-Displayed");}
						  
		// To Check Email Page is Displayed:-
						  
						  Thread.sleep(5000);
						  
					 boolean Gmail_Image_Displayed = driver.findElementByXPath(".//*[@id=\':i\']/span").isDisplayed();			
					 // To check Email Page is Displayed
					 if(Gmail_Image_Displayed == true) {
							  
						  System.out.println("Gmail Email Page is Displayed");					  						  
						  }
						  else {System.out.println("Gmail Email Page is Not-Displayed");}
				
						  
		// To Compose Email:-
					
						  Thread.sleep(5000);
						  
						 boolean Compose_Displayed = driver.findElementByXPath("//*[@id=':84']/div/div").isDisplayed();
						
						  boolean Compose_Enabled = driver.findElementByXPath("//*[@id=':84']/div/div").isEnabled();
						 // boolean Compose_Enabled = driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).isEnabled();
						  
						  if(Compose_Displayed == true && Compose_Enabled == true) {
							  
							  System.out.println("Gmail Compose Button is Displayed & Enabled to compose Email");
							  
							 driver.findElementByXPath("//*[@id=':84']/div/div").click();
							  
							  					  
						  }
						  else {System.out.println("Gmail Compose Button is Displayed & Not-Enabled to compose Email");}

		// To:-
						  Thread.sleep(2000);
						  boolean To_Displayed = driver.findElementByName("to").isDisplayed();
						  boolean Subject_Displayed = driver.findElementByName("subjectbox").isDisplayed();
						  
						  if(To_Displayed == true && Subject_Displayed == true) {
							  
							  driver.findElementByName("to").click();												// Enter Email Id in "To" Box
							  driver.findElementByName("to").sendKeys("deepika.dms@gmail.com ");
							  
//							  
		// Subject:-
							  					  					  
						  driver.findElementByName("subjectbox").click();										// Enter Subject into "Subject" Box
						  driver.findElementByName("subjectbox").sendKeys("Test-Email");
							  
							
		
							  
					   driver.findElementByXPath(".//*[@id=':dx']").click();												// Enter the Body Message 
				  Thread.sleep(1000);
						driver.findElementByXPath(".//*[@id=':dx']").sendKeys("Hello good Morning");
						  
						
		// Send Button:-

							  Thread.sleep(1000);
							 
						//	  driver.findElementById(":92").click();													// Click the "Send" Button					  
				  driver.findElementByXPath("//*[@id=':cc']").click();
							 
							  
						  }
						  			  				  
		// To Check Sent Email is Displayed & Enabled:-
						  
					Thread.sleep(1000);	  
						  
					boolean Sent_Email_Displayed = driver.findElementByXPath(".//*[@id=\':4u\']/div/div[2]").isDisplayed();			// To check Sent Email Page is Displayed
					boolean Sent_Email_Enabled = driver.findElementByXPath(".//*[@id=\':4u\']/div/div[2]").isEnabled();
					
					if(Sent_Email_Displayed == true && Sent_Email_Enabled == true) {
						
						System.out.println("Sent Email Button is Displayed & Enabled to check Sent Mail's");
						
						driver.findElementByXPath(".//*[@id=\':4u\']/div/div[2]").click();											// To check Sent Email Button is clicked
//						driver.findElementByCssSelector("#\\3a 4u > div > div.aio.UKr6le").click();
						
					}
					else {System.out.println("Sent Email Button is Displayed & Not-Enabled to check Sent Mail's");}
														
		// To Check Sign-Out page is Displayed & Sign-Out can be done:-
						
						  Thread.sleep(3000);
						  
						boolean SignOut = driver.findElementByXPath(".//*[@id=\'gb\']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span").isDisplayed();
//						boolean SignOut = driver.findElementByCssSelector("#gb > div.gb_pf.gb_og > div.gb_hb.gb_og.gb_R.gb_ng.gb_T > div.gb_uc.gb_og.gb_R > div.gb_eb.gb_Zc.gb_og.gb_R > div.gb_Fc.gb_gb.gb_og.gb_R > a > span").isDisplayed();
						if(SignOut == true) {
						
								driver.findElementByXPath(".//*[@id=\'gb\']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span").click();
								Thread.sleep(3000);
								driver.findElementByXPath(".//*[@id=\'gb_71\']").click();
								
//								
								System.out.println("Sign Out Page is Displayed and Clicked to perform the SignOut action");
						}
						else {System.out.println("Sign Out Page is Not-Displayed");}

	}

}
