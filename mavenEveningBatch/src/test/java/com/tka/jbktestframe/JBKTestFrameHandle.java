package com.tka.jbktestframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JBKTestFrameHandle {
	@Test
	public void jbkTestFrame()
	{
		WebDriver driver= new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver.get("https://www.qa.jbktest.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);


		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='webform']"));
		driver.switchTo().frame(frameElement);
		
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='webform[email]']"))));
		
		driver.findElement(By.xpath("//input[@name='webform[email]']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@tabindex='2']")).click();

		
	}
}
