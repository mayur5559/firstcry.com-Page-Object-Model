/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.Helper.Log;



public class TestNGListener extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Test Started. "+ result.getStartMillis());
		
	}
	
	

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Test Success. "+ result.getEndMillis());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Test Failed. "+ result.getTestName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Test Skipped. "+ result.getTestName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Test failed but it is in defined success ratio " + result.getTestName());
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Context Name On Start = "+ context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Log.info("TestNG - Context Name On Finish = " + context.getPassedTests());
	}
	
		
}
