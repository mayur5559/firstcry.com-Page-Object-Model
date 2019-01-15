package com.qa.freelance.firstcry.com.Pages;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freelance.firstcry.com.Base.TestBase;
import com.qa.freelance.firstcry.com.Helper.Log;
import com.qa.freelance.firstcry.com.ObjectRepository.HomePageObj;

public class DatePickerPage extends TestBase {

	
	@FindBy(xpath=HomePageObj.clickdatepikelement)
	WebElement clickdatepikelement1;
	@FindBy(xpath=HomePageObj.table_element)
	WebElement table_element1;
	
	public String today = "26";
	
	public DatePickerPage() 
	{
		PageFactory.initElements(driver, this);
		Log.info("initializing WebElements of datepicker");
	}
	
	
	
	public void datePicker() {
        //Declare a implicit wait for synchronisation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
        //Get Today's number
        //today = getCurrentDay();
        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the datepickers
        clickdatepikelement1.click();
 
        //This is from date picker table
       // WebElement dateWidgetFrom = driver.findElement(By.xpath("//table[@class="ui-datepicker-calendar"]/tbody"));
 
        //This are the rows of the from date picker table
        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
 
        //This are the columns of the from date picker table
        List<WebElement> columns = table_element1.findElements(By.tagName("td"));
 
        //DatePicker is a table. Thus we can navigate to each cell
        //and if a cell matches with the current date then we will click it.
        for (WebElement cell: columns) 
        {
            /*
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            */
            //Select Today's Date
            if (cell.getText().equals(today)) 
            {
                cell.click();
                break;
            }
        }
 
        //Wait for 4 Seconds to see Today's date selected.
      /*  try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
	
	
	
	public String getCurrentDay (){
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
 
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
 
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
 
        return todayStr;
    }
}

