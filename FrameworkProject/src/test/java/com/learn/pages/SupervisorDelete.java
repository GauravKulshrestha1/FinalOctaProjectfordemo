package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorDelete {
	
	WebDriver driver;
	public SupervisorDelete(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/a[3]") WebElement SupervisorDelete;
	@FindBy(xpath = "/html/body/div[2]") WebElement Popup;
	@FindBy(xpath = "/html/body/div[2]/div[7]/button") WebElement backbutton;
	@FindBy(xpath = "/html/body/main/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/a[3]") WebElement SupervisorDelete1;
	@FindBy(xpath = "/html/body/div[2]") WebElement Popupagain;
	@FindBy(xpath = "/html/body/div[2]/div[7]/div/button") WebElement yesDelete;
	@FindBy(xpath = "/html/body/div[2]") WebElement Ypopup;
	@FindBy(xpath = "/html/body/div[2]/div[7]/div/button") WebElement Yesbutton;
	
	
	
	
	public void SupervisorDelete() throws InterruptedException {
		
	SupervisorDelete.click();
	Thread.sleep(3000);
	Popup.click();
	Thread.sleep(2000);
	backbutton.click();
	Thread.sleep(2000);
	SupervisorDelete1.click();
	Thread.sleep(2000);
	Popupagain.click();
	Thread.sleep(2000);
	yesDelete.click();  
	Thread.sleep(2000);
	Ypopup.click();
	Thread.sleep(2000);
	Yesbutton.click();
	Thread.sleep(2000);
	
	

		}
	}
