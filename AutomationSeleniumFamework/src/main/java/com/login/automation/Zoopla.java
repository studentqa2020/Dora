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


public class Zoopla {

		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			WebDriver driver = new ChromeDriver();
			LoginPage login = new LoginPage(driver);
			driver.manage().window().maximize();
			driver.get(BaseConfig.getconfig("URL"));
			WebElement acceptcookies = driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']"));
			acceptcookies.click();
			//WebElement signin = driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']"));
			BaseLoginHW color = new BaseLoginHW();
			Highlighter.getcolor(driver, login.getLogin());
			login.getLogin().click();
			new Highlighter().getcolor(driver, getEmail());
			login.getEmail().sendKeys(BaseConfig.getconfig("username"));
			login.click();
			WebDriverWait obj = new WebDriverWait(driver, 30);
			obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='signin_email']"), 0));
			//WebElement email = driver.findElement(By.xpath("//*[@id='signin_email']"));
			new Highlighter().getcolor(driver, login.getEmail());	
			login.getEmail().sendKeys(BaseConfig.getconfig("username"));
			WebElement passwd = driver.findElement(By.xpath("//*[@name='signin_password']"));
			new Highlighter().getcolor(driver, passwd);
			passwd.sendKeys("pass");
			//WebElement login = driver.findElement(By.xpath("//*[@id='signin_submit']"));
			new Highlighter().getcolor(driver, login);
			login.click();
			//driver.quit();
		}

		private static WebElement getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
	}


