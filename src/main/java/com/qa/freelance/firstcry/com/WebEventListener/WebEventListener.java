/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.WebEventListener;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.Helper.Log;
import com.qa.freelance.firstcry.com.Helper.TestUtil;


public class WebEventListener extends TestBase implements WebDriverEventListener{

	public void beforeNavigateTo(String url, WebDriver driver) {
		Log.info("Before navigating to: '" + url + "'");
		//System.out.println("Before navigating to: '" + url + "'");
	}
    
	
	public void afterNavigateTo(String url, WebDriver driver) {
		Log.info("Navigated to:'" + url + "'");
		//System.out.println("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		Log.info("Value of the:" + element.toString() + " before any changes made");
		//System.out.println("Value of the:" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		Log.info("Element value changed to: " + element.toString());
		//System.out.println("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		Log.info("Trying to click on: " + element.toString());
		//System.out.println("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		Log.info("Clicked on: " + element.toString());
		System.out.println("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		Log.info("Navigating back to previous page" + driver.getCurrentUrl());
		//System.out.println("Navigating back to previous page" + driver.getCurrentUrl());
	}

	public void afterNavigateBack(WebDriver driver) {
		Log.info("Navigated back to previous page");
		//System.out.println("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		Log.info("Navigating forward to next page" + driver.getCurrentUrl());
		//System.out.println("Navigating forward to next page" + driver.getCurrentUrl());
	}

	public void afterNavigateForward(WebDriver driver) {
		Log.info("Navigated forward to next page" + driver.getCurrentUrl());
		//System.out.println("Navigated forward to next page" + driver.getCurrentUrl());
	}

	public void onException(Throwable error, WebDriver driver) {
		Log.info("Exception occured: " + error);
		//System.out.println("Exception occured: " + error);
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		Log.info("Trying to find Element By : " + by.toString());
		//System.out.println("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		Log.info("Found Element By : " + by.toString());
		//System.out.println("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
		Log.info("Just before beforeScript " + script);
		//System.out.println("Just before beforeScript " + script);
	}

	public void afterScript(String script, WebDriver driver) {
		
		Log.info("Inside the afterScript to, Script is " + script);
		//System.out.println("Inside the afterScript to, Script is " + script);
	}

	public void beforeAlertAccept(WebDriver driver) {
		Log.info("Before Alert Accept");
		//System.out.println("Before Alert Accept");

	}

	public void afterAlertAccept(WebDriver driver) {
		Log.info("Alert Accepted");
		//System.out.println("Alert Accepted");

	}

	public void afterAlertDismiss(WebDriver driver) {
		Log.info("Alert Dismissed");
		//System.out.println("Alert Dismissed");

	}

	public void beforeAlertDismiss(WebDriver driver) {
		Log.info("Before dismissing alert");
		//System.out.println("Before dismissing alert");

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		Log.info("Url before refreshing page : " + driver.getCurrentUrl());
		 //System.out.println("Url before refreshing page : " + driver.getCurrentUrl());

	}

	public void afterNavigateRefresh(WebDriver driver) {
		Log.info("Url after refreshing : "+driver.getCurrentUrl());
		//System.out.println("Url after refreshing : "+driver.getCurrentUrl());

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		Log.info("Inside the beforeChangeValueOf method" + keysToSend[0]);
		 //System.out.println("Inside the beforeChangeValueOf method" + keysToSend[0]);

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		 Log.info("inside method afterChangeValueOf on " + keysToSend[0]);
		 //System.out.println("inside method afterChangeValueOf on " + keysToSend[0]);

	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
