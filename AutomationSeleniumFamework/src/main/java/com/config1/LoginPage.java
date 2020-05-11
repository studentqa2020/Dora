package com.config1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//page object model=page factory
	
	 public LoginPage (WebDriver driver){
		 
	PageFactory.initElements(driver, this);	 
	 }
		@FindBy(xpath="// *[@class='login']")
		private WebElement login; 
		@FindBy(xpath="//*[@id='email']")
		private WebElement email;
		@FindBy(xpath="//*[@id='passwd']")
		private WebElement password;
		@FindBy(xpath="//*[@id='SubmitLogin']")
		private WebElement submit;
		
		
		public LoginPage getLogin() {
			return (LoginPage) login;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getSubmit() {
			return submit;
		}
		public void click() {
			// TODO Auto-generated method stub
			
		}
		
}
