package com.cucumberFramework.page_objectrepository;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumberFramework.CommonLibraries.ExcelLib;
import com.cucumberFramework.CommonLibraries.WebDriverCommonLib;
import com.cucumberFramework.helper.LoggerHelper;
import com.cucumberFramework.helper.WaitHelper;


public class SamplePagePR{
	WebDriver driver;	
	WaitHelper waitHelper;
	
	ExcelLib elib=new ExcelLib();	
	
	private static Logger log = LoggerHelper.getLogger(SamplePagePR.class);	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username1;

	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password1;	
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-checkmark']")
	private WebElement recaptcha;
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	private WebElement login;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;	
	
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
	
	public boolean Login(String url,String username,String password) throws Throwable
	{
		//String url=elib.getExcelData("TestData", 1, 1);
		//String username=elib.getExcelData("TestData", 1, 2);
		//String password=elib.getExcelData("TestData", 1, 3);
		boolean value=true;
		driver.get(url);
		driver.manage().window().maximize();		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//wlib.waitForPageToLoad();
		waitHelper.waitForPageToLoad();
		username1.sendKeys(username);
		password1.sendKeys(password);
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
}
