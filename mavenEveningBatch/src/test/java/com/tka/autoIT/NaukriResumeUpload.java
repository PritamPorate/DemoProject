package com.tka.autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriResumeUpload {

	@Test
	public void naukriResumeUpload()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.findElement(By.id("attachCV")).click();
		
	}
}
