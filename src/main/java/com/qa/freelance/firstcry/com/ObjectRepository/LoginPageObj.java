package com.qa.freelance.firstcry.com.ObjectRepository;

import com.qa.freelance.firstcry.com.Base.TestBase;

public class LoginPageObj extends TestBase {

	//closing the loginpopup
	public static final String closeloginpg ="//div[@onclick='closelogin();'][@class='_pop_close _pop_reg_bg']";
	//we_close_icon
	public static final String wewidgeticon="//span[@class='wewidgeticon we_close icon-large']";
	//Subscription//Frame
	public static final String webpushbubbleFrame ="//iframe[@name='webpush-bubble']";
	public static final String iwilldothislater ="//button[@id='deny'][@class='button close']";
	//login page webelement
	public static final String login ="//a[@class='poplogin_main']";
	public static final String email ="//input[@id='txtLUNm'][@name='Email'][@placeholder='Email id*']";
	public static final String password="//input[@type='password'][@placeholder='Password*']";
	public static final String loginbutton="//input[@type='button'][@value='Login']";
	
}
