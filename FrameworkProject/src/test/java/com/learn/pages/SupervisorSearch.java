package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupervisorSearch {
	
	WebDriver driver;
	
	public SupervisorSearch(WebDriver ldriver) {
	
		this.driver=ldriver;
		
	}
	@FindBy(xpath = "//*[@id=\"SearchKeyword\"]") WebElement search;
	@FindBy(xpath = "//*[@id=\"SearchKeyword\"]") WebElement findwhat;
	
	
	
	public void SupervisorSearch(String findwhatsearch) throws InterruptedException {
		
		Thread.sleep(2000);
		search.click();
		findwhat.sendKeys(findwhatsearch);
		
		
	}

}
