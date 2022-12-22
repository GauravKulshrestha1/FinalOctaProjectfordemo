package com.learn.pages;

import org.apache.commons.math3.stat.interval.ConfidenceInterval;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learn.utilities.BrowserFactory;
import com.learn.utilities.ConfigDataProvider;
import com.learn.utilities.ExcelDataProvider;

public class BaseClass {
	 protected WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
		System.out.println("Browser Closed Successfully");
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = BrowserFactory.startApplication(driver, "Chrome","http://octaviusqa.24livehost.com/");
		System.out.println(driver.getTitle()); 
		System.out.println("Browser Open Successfully");
	}

}
