/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class DropDownHelper extends TestBase {

	public static void SelectUsingVisibleValue(WebElement element,String visibleValue) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleValue);
		Log.info("Element : " + element + " Value : " + visibleValue);
	}
	
	public static void SelectUsingValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		Log.info("Element : " + element + " Value : " + value);
	}
	
	public static void SelectUsingIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		Log.info("Element : " + element + " Index : " + index);
	}
	
	public static List<String> getAllDropDownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		
		for (WebElement element1 : elementList) {
			Log.info("Dropdown Value : " + element1.getText());
			valueList.add(element1.getText());
		}
		return valueList;
	}

}
	
	
	
	
