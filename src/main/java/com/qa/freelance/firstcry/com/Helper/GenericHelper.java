/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class GenericHelper extends TestBase {

	public String readValueFromElement(WebElement element) {

		if (null == element) {
			Log.info("weblement is null");
			return null;
		}

		boolean displayed = false;
		try {
			displayed = isDisplayed(element);
		} catch (RuntimeException re) {
			Log.error("Error : ", re);
			Reporter.log(re.fillInStackTrace().toString());
			return null;
		}

		if (!displayed) {
			return null;
		}
		String text = element.getText();
		Log.info("weblement valus is.." + text);
		return text;
	}

	public String readValueFromInput(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		String value = element.getAttribute("value");
		Log.info("weblement valus is.." + value);
		return value;
	}

	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			Log.info("element is displayed.." + element);
			return true;
		} catch (RuntimeException re) {
			Log.error("Error : ", re);
			Reporter.log(re.fillInStackTrace().toString());
			return false;
		}
	}

	protected boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			Log.info("element is displayed.." + element);
			return false;
		} catch (RuntimeException re) {
			Log.error("Error : ", re);
			Reporter.log(re.fillInStackTrace().toString());
			return true;
		}
	}

	protected String getDisplayText(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		return element.getText();
	}

	public static synchronized String getElementText(WebElement element) {
		if (null == element) {
			Log.info("weblement is null");
			return null;
		}
		String elementText = null;
		try {
			elementText = element.getText();
		} catch (RuntimeException re) {
			Log.error("Element not Found: ", re);
			Reporter.log(re.fillInStackTrace().toString());
		}
		return elementText;
	}

}
