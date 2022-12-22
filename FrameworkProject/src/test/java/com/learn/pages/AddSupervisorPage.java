package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSupervisorPage {

	
	
WebDriver driver;
	
	
	public AddSupervisorPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[1]/a") WebElement AddSupervisorPage;
	
	
	
	
	public void AddSupervisorPage() {
			
		AddSupervisorPage.click();
	}
}
