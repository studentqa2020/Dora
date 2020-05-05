package com.travel.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelLogin {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");	
		
		WebElement email = driver.findElement(By.xpath("//*[@type='text']"));
				email.sendKeys("sayeedhasina@yahoo.com");
				
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		       password.sendKeys("Dor@");
		
		WebElement login = driver.findElement(By.xpath("//*[@type='image']"));
		      login.click();
		      
		 driver.quit();     
		
	}

}
