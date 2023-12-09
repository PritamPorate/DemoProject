package com.tka.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ScrollPractice {

	WebDriver driver;
	RemoteWebDriver re;
	@Test
	public void scrollPage()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://javabykiran.com/playground/");
	
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("");
		
	}
}
