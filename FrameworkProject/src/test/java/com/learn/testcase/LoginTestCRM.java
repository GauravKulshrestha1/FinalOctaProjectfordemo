package com.learn.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learn.pages.BaseClass;
import com.learn.pages.DashboardPage;
import com.learn.pages.LoginPage;
import com.learn.utilities.BrowserFactory;
import com.learn.utilities.ExcelDataProvider;

import lombok.experimental.Helper;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCRM extends BaseClass {
	@Test(priority=1)
	public void loginApp() throws InterruptedException {
			
		
		ExcelDataProvider excel = new ExcelDataProvider();
		 
		LoginPage loginPage =PageFactory.initElements(driver,LoginPage.class); 
		loginPage.LogintoCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		System.out.println("Credentials apply Successfully");
		//Title Verify
		
		//BrowserFactory.quitBrowser(driver);	
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void Dashboard() throws InterruptedException {
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.DashboardPage();
		System.out.println("Dashboard Open Successfully");
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void ManageSupervisorPage() throws InterruptedException {
		com.learn.pages.ManageSupervisorPage ManageSupervisor = PageFactory.initElements(driver, com.learn.pages.ManageSupervisorPage.class);
		ManageSupervisor.ManageSupervisorPage();
		System.out.println("ManageSupervisor Page open successfully");
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void AddSupervisorPage() throws InterruptedException {
		com.learn.pages.AddSupervisorPage AddSupervisorPage = PageFactory.initElements(driver, com.learn.pages.AddSupervisorPage.class);
		AddSupervisorPage.AddSupervisorPage();
		System.out.println("ManageSupervisor Add user page open successfully");
		Thread.sleep(3000);
	}
	@Test(priority=5)
	public <InsertsupervisorPage> void InsertsupervisorPage() throws InterruptedException {
		com.learn.pages.InsertsupervisorPage InsertsupervisorPage = PageFactory.initElements(driver,com.learn.pages.InsertsupervisorPage.class); 
		InsertsupervisorPage.InsertsupervisorPage("Test Supervisor", "Testsuper@yopmail.com","Supervisor","Dots");
		System.out.println("supervisor added Successfully");
		Thread.sleep(6000);	
	}
	@Test(priority=6)
	public void PopupHandler() throws InterruptedException {
		com.learn.pages.PopupHandler PopupHandler = PageFactory.initElements(driver, com.learn.pages.PopupHandler.class);
		PopupHandler.PopupHandler();
		System.out.println(" PopupHandler on Manage Supervisor Page successfully manage");
		Thread.sleep(3000);
	}
	@Test(priority=7)
	public void SupervisorSearch() throws InterruptedException {
		com.learn.pages.SupervisorSearch SupervisorSearch = PageFactory.initElements(driver, com.learn.pages.SupervisorSearch.class);
		SupervisorSearch.SupervisorSearch("test");
		Thread.sleep(2000);
		System.out.println("Search the Supervisor successfully");
		
	}
	@Test(priority=8)
	public void SupervisorEditPage() throws InterruptedException {
		com.learn.pages.SupervisorEditPage SupervisorEditPage = PageFactory.initElements(driver, com.learn.pages.SupervisorEditPage.class);
		SupervisorEditPage.SupervisorEditPage("dotsquares");
		Thread.sleep(5000);
		System.out.println("Supervisor data updated successfully");
		
	}
	@Test(priority=9)
	public void SupervisorViewPage() throws InterruptedException {
		com.learn.pages.SupervisorViewPage SupervisorViewPage = PageFactory.initElements(driver, com.learn.pages.SupervisorViewPage.class);
		SupervisorViewPage.SupervisorViewPage();
		Thread.sleep(3000);
		System.out.println("Supervisor view data page successfully Back on supervisor page");
		
	}
	@Test(priority=10)
	public void SupervisorDelete() throws InterruptedException {
		com.learn.pages.SupervisorDelete SupervisorDelete = PageFactory.initElements(driver, com.learn.pages.SupervisorDelete.class);
		SupervisorDelete.SupervisorDelete();
		Thread.sleep(3000);
		System.out.println("Supervisor data Delete successfully on supervisor page");
	}
	
}
