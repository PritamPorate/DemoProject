package com.tka.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollJavaScript {
	@Test
	public void scrollTestCase()
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.amazon.in/?ref_=nav_ya_signin&");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement footer_logo = driver.findElement(By.xpath("//a[@href='/ref=footer_logo']"));
		js.executeScript("arguments[0].scrollIntoView(true);",footer_logo);
	}
}
