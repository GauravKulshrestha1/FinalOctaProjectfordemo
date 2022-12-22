package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
	
		this.driver=ldriver;
		
	}
	@FindBy(id="Email") WebElement uname;
	@FindBy(id="PasswordHash") WebElement pass;
	@FindBy(xpath="/html/body/div/div/main/div/form/div/div[3]/button") WebElement LoginButton;
	
	
	public void LogintoCRM(String username,String passwordApplication) throws InterruptedException {
		
			Thread.sleep(2000);
		
			 
	
		uname.sendKeys(username);
		pass.sendKeys(passwordApplication);
		LoginButton.click();
		
	}
}
