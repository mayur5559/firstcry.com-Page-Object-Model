package com.qa.freelance.firstcry.com.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.Pages.DatePickerPage;

public class DatePickerPageTest extends TestBase{
	
	DatePickerPage datepickerpage;
	
	
	
	public DatePickerPageTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		datepickerpage = new DatePickerPage();
		
		
	}
	
	@Test(priority=1)
	public void datePickerTest() 
	{
		
		datepickerpage.datePicker();
		
	}

}
