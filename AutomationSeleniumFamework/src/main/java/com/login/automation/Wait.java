package com.login.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
public void getExplicitWait(WebDriver driver,WebElement element) {
		
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.elementToBeClickable(element));
	}

}


