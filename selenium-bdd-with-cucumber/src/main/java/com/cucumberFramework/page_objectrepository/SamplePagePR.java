package com.cucumberFramework.page_objectrepository;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumberFramework.CommonLibraries.ExcelLib;
import com.cucumberFramework.CommonLibraries.WebDriverCommonLib;
import com.cucumberFramework.helper.LoggerHelper;
import com.cucumberFramework.helper.WaitHelper;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import freemarker.core.Environment;

@EnableEncryptableProperties
public class SamplePagePR{
	WebDriver driver;	
	WaitHelper waitHelper;
	
	ExcelLib elib=new ExcelLib();	
	
	private static Logger log = LoggerHelper.getLogger(SamplePagePR.class);	
	
	//@FindBy(xpath="//input[contains(@placeholder,'Email')]")
	@FindBy(xpath="//input[contains(@type,'email')]")
	private WebElement username1;

	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next;
	
	@FindBy(xpath="//input[contains(@type,'password')]")
	private WebElement password1;	
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-checkmark']")
	private WebElement recaptcha;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//span[@id='myAccountTrigger']")
	private WebElement Account;	
	
	public SamplePagePR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public WebElement getUsername() {
		return username1;
	}
	
	public WebElement getPassword() {
		return password1;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	public static Map<String, String> Value() throws FileNotFoundException, IOException
	{
		/*
		* First, create (or ask some other component for) the adequate encryptor for   
		* decrypting the values in our .properties file.   
		*/  
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();     
		encryptor.setPassword("SAM"); // could be got from web, env variable...    
		/*   
		* Create our EncryptableProperties object and load it the usual way.   
		*/  
		Properties props = new EncryptableProperties(encryptor);  
		props.load(new FileInputStream("src/test/resources/Config.properties"));
		Map<String, String> Values = new HashMap<String, String>();		
		String URL = props.getProperty("URL");
		Values.put("URL", URL);
		String Username = props.getProperty("username");
		Values.put("username", Username);
		String Password = props.getProperty("password");
		Values.put("password", Password);
		return Values;
	}
	
	public boolean Login(String url,String username,String password) throws Throwable
	{
		
		//String url=elib.getExcelData("TestData", 1, 1);
		//String username=elib.getExcelData("TestData", 1, 2);
		//String password=elib.getExcelData("TestData", 1, 3);
		Map<String, String> actual = Value();
		String url1=actual.get("URL");
		String username2=actual.get("username");
		String password2=actual.get("password");
		boolean value=true;
		driver.get(url1);
		driver.manage().window().maximize();		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//wlib.waitForPageToLoad();
		waitHelper.waitForPageToLoad();		
		username1.sendKeys(username2);
		password1.sendKeys(password2);		
		Thread.sleep(1000);
		jse.executeScript("arguments[0].click();", login);
		waitHelper.waitForPageToLoad();
		if(logout.isDisplayed())
		{
			log.info(" Logged in to Application ");
		}
		else
		{
			value=false;
			log.info("Failed to Log into the Application");
		}		
		return value;
	}
	
	public boolean Login() throws Throwable
	{
		Map<String, String> actual = Value();
		String url1=actual.get("URL");
		String username2=actual.get("username");
		String password2=actual.get("password");
		boolean value=true;
		driver.get(url1);
		driver.manage().window().maximize();		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//wlib.waitForPageToLoad();
		waitHelper.waitForPageToLoad();			   
		WebElement Google = driver.findElement(By.xpath("//button[contains(text(),'Google')]"));
		Google.click();
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		          //driver.switchTo().window(parentWindow);
		          }
		       }
		   
		username1.sendKeys(username2);
		next.click();
		waitHelper.WaitForElement(password1,60);
		password1.sendKeys(password2);
		next.click();
		
		//jse.executeScript("arguments[0].click();", login);
		
		waitHelper.waitForPageToLoad();
		if(Account.isDisplayed())
		{
			log.info(" Logged in to Application ");
		}
		else
		{
			value=false;
			log.info("Failed to Log into the Application");
		}		
		return value;
	}

	
}
