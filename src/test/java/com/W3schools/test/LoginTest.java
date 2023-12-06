package com.W3schools.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.W3schools.utils.Reports;
import com.W3schools.utils.Sewrappers;
import com.W3schools.utils.W3wrappers;



//this class is going to contain all test cases of w3 login
public class LoginTest extends Sewrappers{
	
	W3wrappers w3 = new W3wrappers();
	Reports report = new Reports();
	
	@Test
	public void loginWithCorrectCredentials() {
		
		try {
		report.setTCDesc("Validating login in W3 schools with valid credentials");
		launchBrowser("https://profile.w3schools.com/login");
		w3.loginW3schools("ashwinshre@gmail.com","Royalenfield@99");
		
		Assert.assertTrue(driver.getTitle().equals("My learning | W3Schools"));             
		System.out.println("assertion passed");
		
		
	        }
		
		catch(Exception ex)
		{
			System.out.println("problem");
			ex.printStackTrace();
		}
		
	}
	
	

}
