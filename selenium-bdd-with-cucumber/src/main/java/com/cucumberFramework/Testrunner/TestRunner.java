package com.cucumberFramework.Testrunner;

	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.TestNGCucumberRunner;
	import cucumber.api.testng.CucumberFeatureWrapper;
	
	import java.io.File;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import com.cucumber.listener.Reporter;
	 
	@CucumberOptions(
	        features = "src/test/resources/features",
	        glue = {"com/cucumberFramework/step_definitions"},
	        tags = {"@LoginProfile"},	        
	        format = {
	                "pretty",
	                "html:target/cucumber-reports/advanced-reports",
	                "json:target/cucumber-reports/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt",
	                "com.cucumber.listener.ExtentCucumberFormatter:target/AdvancedReport/advancereport.html"
	        })
	
	public class TestRunner {
	    private TestNGCucumberRunner testNGCucumberRunner;
	 
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	 
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider()
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	 
	    @AfterClass
	    public static void setup()
	    {
	    Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	    Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Application Name", "Test Application");
	    Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	    Reporter.setSystemInfo("Environment", "Production");
	    Reporter.setTestRunnerOutput("Test Execution Report");
	    }
	    
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
	    
	}
