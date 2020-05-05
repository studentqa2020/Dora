package com.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoging {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");	
				
		WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
		email.sendKeys("sayeed@yahoo.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("12345577");
		
		WebElement login = driver.findElement(By.xpath("//*[@value='Log In']"));
		login.click();
		
		driver.quit();
	}
}
