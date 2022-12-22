package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSupervisorPage1 {
		WebDriver driver;
	public ManageSupervisorPage1(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/aside/ul/li[2]") WebElement SupervisorPage;
		
	public void ManageSupervisorPage1() {
			
		SupervisorPage.click();
	}
}
