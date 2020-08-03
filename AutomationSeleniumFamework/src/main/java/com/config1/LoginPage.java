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
			
		}
		// logout = //*[id='log out']
		@FindBy(xpath ="//*[id='log out']")
		private WebElement logout;
		
		public WebElement getlogout(){
			return logout;
		}
		//search =//*[class='search']
		@FindBy(xpath ="//*[id='search']")
		private WebElement search;
		
		public WebElement getsearch(){
			return search;
		
		}	
}
