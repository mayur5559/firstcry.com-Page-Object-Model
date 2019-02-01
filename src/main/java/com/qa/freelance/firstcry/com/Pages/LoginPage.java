package com.qa.freelance.firstcry.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.ObjectRepository.LoginPageObj;

public class LoginPage extends TestBase {

	@FindBy(xpath = LoginPageObj.login)
	WebElement login;
	@FindBy(xpath = LoginPageObj.email)
	WebElement email;
	@FindBy(xpath = LoginPageObj.password)
	WebElement password;
	@FindBy(xpath = LoginPageObj.loginbutton)
	WebElement loginbutton;
	@FindBy(xpath = LoginPageObj.closeloginpg)
	WebElement closeloginpg;
	@FindBy(xpath = LoginPageObj.wewidgeticon)
	WebElement wewidgeticon;
	@FindBy(xpath = LoginPageObj.iwilldothislater)
	WebElement iwilldothislater;
	@FindBy(xpath = LoginPageObj.webpushbubbleFrame)
	WebElement webpushbubbleFrame;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public void closeloginpopup() {

		closeloginpg.click();

	}

	public void denySubscriptionPopup(WebDriver driver) {
		
		driver.switchTo().frame(webpushbubbleFrame);
		iwilldothislater.click();
	}

	public void wewidgateiconclose() {

		wewidgeticon.click();
	}

	public void clickonLogin() {
		login.click();
	}

	public HomePage login(String un, String pw) {

		email.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
		return new HomePage();

	}
}
