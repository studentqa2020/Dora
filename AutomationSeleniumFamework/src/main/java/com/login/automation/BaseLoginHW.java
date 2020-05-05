package com.login.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginHW {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
				
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
				
		driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='signin_email']")).sendKeys("sayeedhasina@yahoo.com");
				
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("3531dora");
		
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
				
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
	}
	
	
}
