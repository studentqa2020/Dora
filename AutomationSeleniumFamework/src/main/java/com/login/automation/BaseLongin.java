package com.login.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLongin {
	
	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("http://automationpractice.com/index.php");   
      System.out.println(driver.getTitle() );
      WebElement singBtn = driver.findElement(By.xpath("//*[@class='login']"));
      JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", singBtn);
      singBtn.click();
      System.out.println(driver.getTitle());

	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
		
	  WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		
	  WebDriverWait obj = new WebDriverWait(driver, 30);
	  obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='email']"), 0));
		
	  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", email);
	  email.sendKeys("sayeedhasina@yahoo.com");
		
		
	  WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
	  js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", password);
	  password.sendKeys("3531dora");
	  
	  WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	  loginBtn.click();
		
	  System.out.println(driver.getTitle());
	}

} 
		
	


