package com.cucumberFramework.CommonLibraries;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {
	
	
	public void selectByVisibleText(WebElement selwb, String data){
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}
	
	public void selectByIndex(WebElement selwb, int index){
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement selwb, String value){
		Select sel = new Select(selwb);
		sel.selectByValue(value);
	}		

}
