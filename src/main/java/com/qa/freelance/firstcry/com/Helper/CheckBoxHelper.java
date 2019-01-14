/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import org.openqa.selenium.WebElement;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class CheckBoxHelper extends TestBase {
	
	// Call Check box Methods isIselected(element) if needed.
		public static boolean isIselected(WebElement element) {
			boolean flag = element.isSelected();
			Log.info(flag);
			return flag;
		}
		
		// Call Check box Methods selectCheckBox(element) if needed.
		public static void selectCheckBox(WebElement element) {
			Log.info("Check Box To be Selected Yet On Element :" + element);
			if(!isIselected(element)) {
				element.click();
				Log.info("Check Box Selected On Element  :" + element);
			}
		}
		// Call Check box Methods unSelectCheckBox(element) if needed.
		public static void unSelectCheckBox(WebElement element) {
			Log.info("Check Box To be UnSelected Yet On Element :" + element);
			if(isIselected(element))
			{
				element.click();
				Log.info("Check Box UnSelected On Element  :" + element);
			}
				
		}


}
