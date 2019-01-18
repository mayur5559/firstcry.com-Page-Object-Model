package com.qa.freelance.firstcry.com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.qa.freelance.firstcry.com.Helper.Log;
import com.qa.freelance.firstcry.com.Helper.WaitHelper;
import com.qa.freelance.firstcry.com.WebEventListener.WebEventListener;


public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	
	public TestBase()
	{
		
		//PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\resources\\logs\\log4j.properties");
		try 
		{
			
			prop = new Properties();
			//Log.info("Properties Class Object Created");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configuration\\Config.properties");
			//Log.info("FileInputeStrean Class Object Created");
			prop.load(ip);
			//Log.info("Config.properties File Get Loaded");
			
		} catch (FileNotFoundException e) {
			Log.error("config.properties File Not Found In Given Directory");
			e.printStackTrace();
		} catch (IOException e) {
			Log.error("config.properties File Not Loaded Properly");
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization() {
		
		
		
		
		
		try {
			DOMConfigurator.configure("log4j.xml");
			Log.info("log4j.xml File configure properly");
		} catch (Exception e) {
			Log.error("log4j.xml is not configure Properly");
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browser");
		Log.info("Gets Browser Name From Config.properties File ");
		
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\Executables\\chromedriver.exe");
			Log.info("Sets The Properties For Chrome Driver OR Browser ");
			driver = new ChromeDriver();
			Log.info("Chrome Driver Object Created");
			
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\Executables\\geckodriver.exe");
			Log.info("Sets The Properties For FireFox(webdriver.gecko.driver) Driver OR Browser ");
			driver = new FirefoxDriver();
			Log.info("FireFox Driver Object Created");
			
		}else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\Executables\\MicrosoftWebDriver.exe");
			Log.info("Sets The Properties For Microsoft 'Edge' Driver OR Browser ");
			driver = new EdgeDriver(); 
			Log.info("Edge Driver Object Created");
			
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		Log.info("EventFiringWebDriver Object Created And Passes The Driver As an Argument");
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		Log.info("WebEventLister Object Created");
		e_driver.register(eventListener);
		Log.info("WebEventLister Registers With EventFiringWebDriver ");
		driver = e_driver;
		
		driver.manage().window().maximize();
		Log.info("Maximized The Window");
		driver.manage().deleteAllCookies();
		Log.info("Deleted All Cookies");
		
		
		driver.manage().timeouts().pageLoadTimeout(WaitHelper.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		Log.info("pageLoadTimeout");
		
		driver.manage().timeouts().implicitlyWait(WaitHelper.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("testsiteurl"));
		Log.info("Gets The Project URL");
		
		
	}
	

	
	
	
}
