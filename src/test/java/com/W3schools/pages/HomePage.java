package com.W3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3schools.utils.Sewrappers;

public class HomePage extends Sewrappers {
	
	@FindBy(xpath="//div[text()='My learning']")
	public WebElement mylearning;
	
	public void waitForLearning() {
		waitForElement(mylearning,20);
		
	}
	

}
