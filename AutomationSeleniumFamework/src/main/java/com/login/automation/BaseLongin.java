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

import com.config.BaseConfig;
import com.config1.LoginPage;


public class BaseLongin {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();
		LoginPage login = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(BaseConfig.getconfig("URL"));
		System.out.println(driver.getTitle());
		//WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
		BaseLoginHW color = new BaseLoginHW();
		Highlighter.getcolor(driver, login.getLogin());
		login.getLogin().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='email']"), 0));
		//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		Highlighter.getcolor(driver, login.getEmail());
		login.getEmail().sendKeys(BaseConfig.getconfig("username"));
		//WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
		Highlighter.getcolor(driver, login.getPassword());
		login.getPassword().sendKeys(BaseConfig.getconfig("pass"));
		Thread.sleep(3000);
		//WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		login.getSubmit().click();
		System.out.println(driver.getTitle());
	}
}
