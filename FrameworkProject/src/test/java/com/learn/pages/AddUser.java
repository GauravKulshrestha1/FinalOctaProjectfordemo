package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	
	WebDriver driver;
	public AddUser(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/aside/ul/li[2]") WebElement AddUserPage;
	
	public void AddUser() {
		
		AddUserPage.click();

		}
	}
