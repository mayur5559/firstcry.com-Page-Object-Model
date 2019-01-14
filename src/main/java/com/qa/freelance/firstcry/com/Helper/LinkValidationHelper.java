/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.Helper;

import java.net.HttpURLConnection;
import java.net.URL;

import com.qa.freelance.firstcry.com.Base.TestBase;



public class LinkValidationHelper extends TestBase {

	//For Link Validations call linkValidation(hyperLinkUrl) method if needed.
		public static String linkValidation(String hyperLinkUrl) { 
	        String result = ""; 
	        try { 
	            URL url = new URL(hyperLinkUrl); 

	            HttpURLConnection openConnection = (HttpURLConnection) url.openConnection(); 
	            openConnection.setConnectTimeout(5000); 
	            openConnection.connect(); 

	            if (HttpURLConnection.HTTP_OK == openConnection.getResponseCode()) { 
	                result = hyperLinkUrl + " : " + openConnection.getResponseCode(); 
	            } else { 
	                result = hyperLinkUrl + " : " + openConnection.getResponseMessage(); 
	            } 
	        } catch (Exception e) { 
	            result = "Exception caught: " + e.getMessage(); 
	        } 
	        return result; 
	    } 
	
}
