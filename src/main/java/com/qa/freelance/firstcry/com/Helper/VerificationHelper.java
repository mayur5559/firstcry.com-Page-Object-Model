/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import org.openqa.selenium.WebElement;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class VerificationHelper extends TestBase{
	
	
	public static synchronized boolean verifyElementPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 isDispalyed= element.isDisplayed();
			 Log.info(element.getText()+" is dispalyed");
		}
		catch(Exception ex) {
			Log.error("Element not found " + ex);
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyElementNotPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 element.isDisplayed();
			 Log.info(element.getText()+" is dispalyed");
		}
		catch(Exception ex) {
			Log.error("Element not found " + ex);
			isDispalyed = true;
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyTextEquals( WebElement element,String expectedText) {
		boolean flag = false;
		try {
			String actualText=element.getText();
			if(actualText.equals(expectedText)) {
				Log.info("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag=true;
			}
			else {
				Log.error("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag;
			}
		}
		catch(Exception ex) {
			Log.error("actualText is :"+element.getText()+" expected text is: "+expectedText);
			Log.info("text not matching" + ex);
			return flag;
		}
	}

}
