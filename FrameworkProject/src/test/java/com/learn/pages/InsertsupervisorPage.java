package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsertsupervisorPage {
	WebDriver driver;
	
	public InsertsupervisorPage(WebDriver ldriver) {
	
		this.driver=ldriver;
		
	}
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div/form/div[2]/div/div/button") WebElement save;
	@FindBy(id="Name") WebElement name;
	@FindBy(id="Email") WebElement email;
	@FindBy(id = "RoleDuty") WebElement role;
	@FindBy(id = "Company") WebElement company;
	@FindBy(xpath="/html/body/main/div/div/div[2]/div/form/div[2]/div/div/button") WebElement saveButton;
	
	
	public void InsertsupervisorPage(String username,String passwordApplication,String roles,String companys) throws InterruptedException {
		
			Thread.sleep(2000);
		
			 
		save.click();
		name.sendKeys(username);
		email.sendKeys(passwordApplication);
		role.sendKeys(roles);
		company.sendKeys(companys);
		saveButton.click();
		
	}


}
