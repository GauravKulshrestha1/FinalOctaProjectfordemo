package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorEditPage {
	
	WebDriver driver;
	public SupervisorEditPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/a[1]") WebElement editPage;
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div/form/div[2]/div/div/a") WebElement backButton;
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/a[1]") WebElement editPage2;
	@FindBy(id = "Company") WebElement company;
	@FindBy(xpath = "/html/body/main/div/div/div[2]/div/form/div[2]/div/div/button") WebElement savebutton;
	@FindBy(xpath = "/html/body/div[3]") WebElement popup1;
	@FindBy(xpath = "/html/body/div[3]/div[7]/div/button") WebElement popupokbutton;
	
		
	public void SupervisorEditPage(String companyname) throws InterruptedException {
			
		editPage.click();
		backButton.click();
		Thread.sleep(2000);
		editPage2.click();
		Thread.sleep(2000);
		company.clear();
		Thread.sleep(2000);
		company.sendKeys(companyname);
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		popup1.click();	
		popupokbutton.click();
		
	}

}
