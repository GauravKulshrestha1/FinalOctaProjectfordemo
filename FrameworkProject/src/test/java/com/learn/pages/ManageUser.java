package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUser {
	
	WebDriver driver;
	public ManageUser(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/aside/ul/li[3]/a") WebElement ManageUserPage;
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div/form/div[2]/div/div/button") WebElement savevalidate;
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div/form/div[2]/div/div/a") WebElement Backbutton;
	@FindBy(id = "UserType-error") WebElement form_validation;
	
	
	
	public void ManageUser() throws InterruptedException {
		ManageUserPage.click();
		Thread.sleep(2000);
		savevalidate.click();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(2000);
		
	}
	/*public boolean isTPgae() throws InterruptedException {
		
		Thread.sleep(2000);
		return form_validation.getText().toString().contains("User Type is required");
		
	}*/
	
	}
