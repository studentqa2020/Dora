package com.testingPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.HomeSelectionPage;

public class BasicAnnotatino {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
	BaseLogin.getLogin();
	}
	
	@Test
	public void test() throws Throwable {
		HomeSelectionPage.getProperty();
	}
		
	@AfterTest
	public void teardown() {
	driver.quit();
	}
}
