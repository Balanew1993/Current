package com.cucumberFramework.step_definitions;


import org.testng.Assert;
import com.cucumberFramework.CommonLibraries.BaseClass;
import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.page_objectrepository.SamplePagePR;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by Bala on 7/7/2020.
 */

public class SamplePageSD extends BaseClass{
	
	SamplePagePR samplePage = new SamplePagePR(driver);
	WaitHelper waitHelper;
	
    @Given("^I am on the Page \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String url, String username, String password) throws Throwable {
      System.out.println("Entered the Method");
      Assert.assertTrue(samplePage.Login(url,username,password));
      System.out.println("Closed the Method");
    }
    
}
