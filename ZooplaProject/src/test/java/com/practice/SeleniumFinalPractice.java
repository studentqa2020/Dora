package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumFinalPractice {

	public static void main(String[] args) {
		
		
		        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless");
				WebDriver driver = new ChromeDriver(chromeOptions);
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				System.out.println("Title of my current page :: "+driver.getTitle());
				System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
				driver.get("https://www.google.com/");
				System.out.println("Title of my current page :: "+driver.getTitle());
				System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
	}
		
}
