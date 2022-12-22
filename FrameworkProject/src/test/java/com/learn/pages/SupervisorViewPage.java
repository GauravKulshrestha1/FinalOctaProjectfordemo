package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorViewPage {
	
	WebDriver driver;
	public SupervisorViewPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/a[2]") WebElement viewPage;
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div[7]/div/a") WebElement backButton;
	
		
	public void SupervisorViewPage() throws InterruptedException {
			
		viewPage.click();
		Thread.sleep(2000);
		backButton.click();
		Thread.sleep(2000);
		
	}

}
