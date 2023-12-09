package com.jbk.windohandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlesMultipleWindowTask {

	@Test
	public void TaskMultipleWindowHandle() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://javabykiran.com/playground/open-child-window");
		String mainWin = driver.getWindowHandle();

		/*System.out.println("Title of window : " + driver.getTitle());
		System.out.println(driver.getCurrentUrl());
        */
		driver.findElement(By.xpath("//a[text()='Read More']")).click();
		for(String winHandle : driver.getWindowHandles()){
			Thread.sleep(2000);
	    driver.switchTo().window(winHandle);
		    
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(!mainWin.equals(winHandle))
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'wonderful')]")).getText());
		}
		//driver.switchTo().window(winHandle);
		driver.quit();
		
		/*Set<String> childWin = driver.getWindowHandles();
		for (String nextWin : childWin) {
			System.out.println("Title of window : " + driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		 */		
		}
}
