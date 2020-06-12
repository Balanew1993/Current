package com.cucumberFramework.Testrunner;

import com.cucumberFramework.CommonLibraries.BaseClass;
import com.cucumberFramework.CommonLibraries.WebDriverCommonLib;
import com.cucumberFramework.page_objectrepository.SamplePagePR;

public interface AllObjects {
	
	static SamplePagePR samplePage = new SamplePagePR(BaseClass.driver);
	
}
