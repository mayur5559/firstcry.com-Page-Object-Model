/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class AlertHelper extends TestBase {
	
	
	public Alert getAlert() {
		Log.debug("");
		return driver.switchTo().alert();
	}
	
	public void AcceptAlert() {
		Log.info("");
		getAlert().accept();
	}
	
	public void DismissAlert() {
		Log.info("");
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		Log.info(text);
		return text;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			Log.info("true");
			return true;
		} catch (NoAlertPresentException e) {
			// Ignore
			Log.info("false");
			return false;
		}
	}

	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
		Log.info("");
	}

	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
		Log.info("");
	}
	
	public void AcceptPrompt(String text) {
		
		if (!isAlertPresent())
			return;
		
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
		Log.info(text);
	}

}
