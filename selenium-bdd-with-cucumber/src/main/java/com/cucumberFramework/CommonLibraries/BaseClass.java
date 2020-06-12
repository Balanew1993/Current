package com.cucumberFramework.CommonLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumberFramework.enums.Browsers;
import com.cucumberFramework.enums.OS;

/**
 * 
 * @author Bala
 *
 */


public class BaseClass {	

	ExcelLib elib=new ExcelLib();
	public  static WebDriver driver;
	
	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) 
		{
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) 
			{
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} 
			else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) 
			{
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} 
		else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) 
		{
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) 
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) 
			{
				System.setProperty("webdriver.firefox.marionette", "./Drivers/geckodriver");
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}
}
