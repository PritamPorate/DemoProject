package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;

public class DashboardTest {

	WebDriver driver = null;
	DashboardPage dp = null;
	
	@BeforeSuite
	public void dashboardSetup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Selenium%20Software%20all/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		dp = new DashboardPage(driver);
	}
	
	@Test
	public void verifyCourses()
	{
		dp.verifyCourses();
		dp.verifyHeaderText();
	}
}
