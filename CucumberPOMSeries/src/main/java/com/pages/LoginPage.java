package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver; 
   //1. By Locators 
   private By firstName = By.id("loginModel_Username");
   private By lastName= By.id("loginModel_Password");
   private By company = By.id("company");
   private By phoneNumber = By.id("phone");
   private By emailId = By.id("email");
   private By interestedServices = By.id("interested_services");
   private By location = By.id("interested_city");
   private By scheduleAVisit = By.xpath("//button[contains(text(),'LOG IN')]");
   private By forgotPassword = By.xpath("//a[contains(text(),'Forgot Password?')]");
   
   
 
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver; 
		
	}
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean isForgotPwdLinkExist() {
		
		return driver.findElement(forgotPassword).isDisplayed();
		
	}
	
	
	public void enterUserName(String userName) {
		driver.findElement(firstName).sendKeys(userName);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(lastName).sendKeys(password);
		
	}
	
	
	public void clickOnLogin() {
		
		driver.findElement(scheduleAVisit).click();
		
		
	}
	
}
