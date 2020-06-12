package com.cucumberFramework.step_definitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cucumberFramework.CommonLibraries.BaseClass;
import com.cucumberFramework.enums.Browsers;
import com.cucumberFramework.helper.LoggerHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class ServiceHooks {

	BaseClass baseClass;

	Logger log = LoggerHelper.getLogger(ServiceHooks.class);

	@Before
	public void initializeTest() {
		baseClass = new BaseClass();
		baseClass.selectBrowser(Browsers.CHROME.name());
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) 
		{
			try 
			{
				log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} 
			catch (WebDriverException e) 
			{
				e.printStackTrace();
			}

		} 
		else 
		{
			try 
			{
				log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		BaseClass.driver.quit();
	}

}

