package com.qa.freelance.firstcry.com.Helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.freelance.firstcry.com.Base.TestBase;


public class Log extends TestBase{
	
	
	// Initialize Log4j logs
		public static Logger Log = Logger.getLogger(Log.class.getName());
		
		// This is to print log for the beginning of the test case, as we usually run so
		// many test cases as a test suite
		public static void startTestCase(String sTestCaseName) {

			Log.info("****************************************************************************************");
			Log.info("*********************           " + sTestCaseName + "        ***************************");
			Log.info("****************************************************************************************");

		}

		// Need to create these methods, so that they can be called
	    //string info
		public static void info(String message) {

			Log.info(message);

		}
	    //bollean info
		public static void info(boolean trueoefalse) {

			Log.info(trueoefalse);

		}
		
		public static void info(WebElement element) {

			Log.info(element);

		}
		public static void warn(String message) {

			Log.warn(message);

		}

		public static void error(String message) {

			Log.error(message);

		}
		
		public static void error(String string, RuntimeException re) {
			// TODO Auto-generated method stub
			Log.error("Error : ", re);
		}


		public static void fatal(String message) {

			Log.fatal(message);

		}

		public static void debug(String message) {

			Log.debug(message);

		}

		// This is to print log for the ending of the test case

		public static void endTestCase(String sTestCaseName) {

			Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

		}

		public static void info(long timeout) {
			// TODO Auto-generated method stub
			Log.info(timeout);
		}


}
