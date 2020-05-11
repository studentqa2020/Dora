package com.login.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.config1.LoginPage;

		public class Highlighter {
			public static void getcolor(WebDriver driver,LoginPage loginPage) {
				JavascriptExecutor js = (JavascriptExecutor) driver; 
				js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", loginPage);

	}
						
		public void getcolor(WebDriver driver,WebElement element,String color) {
			  JavascriptExecutor js = (JavascriptExecutor) driver; 
			  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 4px solid red;');", element);

							}

		public static void getcolor(WebDriver driver, WebElement email) {
			// TODO Auto-generated method stub
			
		}
							
						}

	

