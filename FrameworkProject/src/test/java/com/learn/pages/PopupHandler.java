package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupHandler {
	
	WebDriver driver;
	public PopupHandler(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[3]") WebElement PopupHandler;
	@FindBy(xpath = "/html/body/div[3]/div[7]/div/button") WebElement okbutton;
		
	public void PopupHandler() {
			
		PopupHandler.click();
		okbutton.click();
	}

}
