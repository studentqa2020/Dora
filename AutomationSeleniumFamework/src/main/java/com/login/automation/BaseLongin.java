package com.login.automation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseLongin {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
		BaseLoginHW color = new BaseLoginHW();
		Highlighter.getcolor(driver, signBtn);
		signBtn.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='email']"), 0));
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		
		Highlighter.getcolor(driver, email);
		email.sendKeys("sayeedhasina@yahoo.com");
		WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
		Highlighter.getcolor(driver, password);
		password.sendKeys("3531dora");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		loginBtn.click();
		System.out.println(driver.getTitle());
	}
}
