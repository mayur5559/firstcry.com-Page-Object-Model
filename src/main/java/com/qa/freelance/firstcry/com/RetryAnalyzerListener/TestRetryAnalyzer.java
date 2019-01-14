/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.RetryAnalyzerListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qa.freelance.firstcry.com.Base.TestBase;
/*--------------------Purpose----------------------------------------------------------------------------
  In automation Test Suits or running test cases in a bulk suite, 
  we face unexpected Test failure or flaky test caused by network glitch, time-out or some other problem. 
  There is a need for running the failed test cases so that we can get the proper result for the flaky TestCase.
  
  TestNG provides IRetryAnalyzer interface which can be used to run and configure your retry related logic.
  
  How to use IRetryAnalyzer:
  First of all, we should create a class which implements the IRetryAnalyzer interface which has one method public boolean retry(ITestResult result); which needs to be implemented. 
  This method will return True if a test needs to be reRun or else False.
  --2 ways to use in  TestNg implementation
  1: Use TestRetryAnalyzer in Our @Test:
    ---->We have to pass TestRetryAnalyzer.class as an attribute in all our @Test methods
         ex:  @Test(retryAnalyzer=TestRetryAnalyzer.class)
  2: TestRetryAnalyzer.class as Listener and from testng.xml:
    --->TestNG Listeners are a very good way of implementing the retry logic on whole Suit level and need not put the TestRetryAnalyzer.class in all the @Test methods. 
        I prefer using Listeners from the TestNG.xml file.
        
       Ex: <listeners>
                <listener class-name="com.tutorial.testng.retrytest.TestRetryAnalyzerListener" />
            </listeners>
  
  */
public class TestRetryAnalyzer extends TestBase implements IRetryAnalyzer {

	int counter = 1;
	/*int retryMaxLimit variable value is the max value for retry. 
	 * Like Our Test will Run 3 times If you run this code. You can set the value of this variable as per your needs.*/
    int retryMaxLimit = 3;
    
    
   // TestNG will call this method every time a test fails.
	@Override
	public boolean retry(ITestResult result) 
	{
		if (counter < retryMaxLimit) 
		{
            counter++;
            return true;
        }
        return false;
    }
		
}

