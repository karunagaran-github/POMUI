package com.W3schools.utils;

import org.openqa.selenium.support.PageFactory;

import com.W3schools.pages.HomePage;
import com.W3schools.pages.LoginPage;

//this class contains all reusable codes of W3 schools

public class W3wrappers extends Sewrappers {
	
	public void loginW3schools(String username, String password) {
	
	LoginPage loginPage = PageFactory.initElements( driver,LoginPage.class);
	HomePage homePage = PageFactory.initElements( driver,HomePage.class);
	
	loginPage.setUserName(username);
	loginPage.setPassword(password);
	loginPage.clicklogin();
	homePage.waitForLearning();
	
}
}
