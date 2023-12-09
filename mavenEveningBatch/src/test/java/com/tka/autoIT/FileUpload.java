package com.tka.autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void fileUploadUsingAutoIT() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriverAutoIT.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://javabykiran.com/playground/file-upload");
		
		driver.findElement(By.id("file")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
		
	}
}
