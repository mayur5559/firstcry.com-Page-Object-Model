package com.qa.freelance.firstcry.com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.Pages.HomePage;
import com.qa.freelance.firstcry.com.Pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	
	public LoginPageTest() 
	{
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void closeLoginPgTest() {
		loginpage.closeloginpopup();
		Assert.assertTrue(true, "Login page close Test Fail");
	}
	@Test(priority=2)
	public void subscriptionClose() {
		loginpage.closeloginpopup();
		loginpage.denySubscriptionPopup(driver);
		Assert.assertTrue(true, "Deny of subscription Test Fail");
	}
	
	@Test(enabled=false)
	public void loginTest() {
		
		loginpage.clickonLogin();
		HomePage correct =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(correct,correct);
	}
}
