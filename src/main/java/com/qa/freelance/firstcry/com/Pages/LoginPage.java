package com.qa.freelance.firstcry.com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.ObjectRepository.LoginPageObj;

public class LoginPage extends TestBase{
	
	@FindBy(xpath=LoginPageObj.login)
	WebElement login;
	@FindBy(xpath=LoginPageObj.email)
	WebElement email;
	@FindBy(xpath=LoginPageObj.password)
	WebElement password;
	@FindBy(xpath=LoginPageObj.loginbutton)
	WebElement loginbutton;
	
	
	public LoginPage() 
	{
		
		PageFactory.initElements(driver,this);
		
	}

	public void clickonLogin() 
	{
		login.click();
	}
	
	public HomePage login(String un,String pw) {
		
		email.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
		return new HomePage();
		
	}
}
