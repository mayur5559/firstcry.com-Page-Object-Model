package com.qa.freelance.firstcry.com.Helper;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.freelance.firstcry.com.Base.TestBase;


public class WaitHelper extends TestBase{
	
	//for base class reference
		public static long PAGE_LOAD_TIMEOUT = 60;
		public static long IMPLICIT_WAIT = 60;
		
		public void setImplicitWait(long timeout, TimeUnit unit) {
			Log.info(timeout);
			driver.manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
		}
		
		public void setPageLoadTimeout(long timeout, TimeUnit unit) {
			Log.info(timeout);
			driver.manage().timeouts().pageLoadTimeout(timeout, unit == null ? TimeUnit.SECONDS : unit);
		}
		
		
		private static WebDriverWait getWait(int timeOutInSeconds, int pollingEveryInMiliSec) {
			Log.debug("");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.withTimeout(Duration.ofSeconds(timeOutInSeconds));
			wait.pollingEvery(Duration.ofMillis(pollingEveryInMiliSec));
			wait.ignoring(NoSuchElementException.class);
			wait.ignoring(ElementNotVisibleException.class);
			wait.ignoring(StaleElementReferenceException.class);
			wait.ignoring(NoSuchFrameException.class);
			return wait;
		}
		
		public static void waitForElementVisible(WebElement element, int timeOutInSeconds, int pollingEveryInMiliSec) {
			Log.info(element);
			WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void waitForElement(WebDriver driver, WebElement element, long timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));
			Log.info("element found..."+element.getText());
		}
		
		public static WebElement waitForElement(WebDriver driver,long time,WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, time);
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		}


}
