package com.jbk.windohandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandles {

	public WebDriver driver;
		
	@Test
	public void startTest() throws Exception
	{		
		driver=new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("file:///E:/Selenium/Selenium%20Software%20all/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String mainWin = driver.getWindowHandle();  //parent window
		List<WebElement> links= driver.findElements(By.partialLinkText("More info"));
		for (WebElement link : links) 
			link.click();
			Thread.sleep(2000);
			
			Set<String> handles = driver.getWindowHandles(); // total 5 windows includind parent window
			
			for (String win : handles) {
				System.out.println("handle of window :" + win);
				if(!win.equals(mainWin)){

				driver.switchTo().window(win); // 4 window will run
				Thread.sleep(2000);
				System.out.println(driver.getTitle()); // asked to sir why not getting title here?
				System.out.println(driver.getCurrentUrl());
				driver.close();
				}
			}
		}
	}
	
	

