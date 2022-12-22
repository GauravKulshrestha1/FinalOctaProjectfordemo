package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	
	public DashboardPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/aside/ul/li[1]") WebElement dash;
	
	
	
	
	public void DashboardPage() {
			
			dash.click();
	}

}
