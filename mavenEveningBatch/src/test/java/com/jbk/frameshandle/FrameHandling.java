package com.jbk.frameshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameHandling {
	WebDriver driver;
	@Test
	public void frameHandleTestCase() 
	{
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.redbus.in/");
		String mainWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frameElement);
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mobileNoInp"))));
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("9517531478");
		
		WebElement singnInFrame = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(singnInFrame);

		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']"))));

		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();

		for(String winHandle : driver.getWindowHandles()){
	
	    driver.switchTo().window(winHandle);
		    
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(!mainWin.equals(winHandle))
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kiran@gmail.com");		}
		
		
	}
}
