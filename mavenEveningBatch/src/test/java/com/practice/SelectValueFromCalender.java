package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectValueFromCalender {

	@Test
	public void selectDateFromCalendar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.ncs.gov.in/_layouts/15/NCSP/job-seeker/JSRegister.aspx?ST=NGXkGp7mNUw%3D&IsAmnsUserCRF=hBxxM4IjBW8%3D");
		// driver.findElement(By.id("ctl00_PlaceHolderMain_ddlRegisterType")).click();
		driver.manage().window().maximize();
		Select value = new Select(driver.findElement(By.id("ctl00_PlaceHolderMain_ddlRegisterType")));
		value.selectByVisibleText("Jobseeker");
		Select value1 = new Select(driver.findElement(By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_ddlKYCType")));
		value1.selectByVisibleText("Pan Card");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[contains(@id,'ctl00_PlaceHolderMain_JSLeftNavigation1_txtKYCNumber')]")).sendKeys("AP78965412");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_txtKYCNumber"))));
		driver.findElement(By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_txtKYCNumber")).sendKeys("AP78965412");

		driver.findElement(By.xpath("//span[@class='input-group-addon']")).click();
		String date = "20/Nov/1995";
		//WebElement yearOpt = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		WebElement monthOpt = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select selMonth = new Select(monthOpt);

		String month = date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'));// month
		selMonth.selectByVisibleText(month);
		Thread.sleep(3000);
		WebElement yearOpt = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selYear = new Select(yearOpt);
		String year = date.substring(date.lastIndexOf('/') + 1);
		selYear.selectByVisibleText(year);
		Thread.sleep(3000);
		
		String day = date.substring(0, 2);// date
		Thread.sleep(3000);
		driver.findElement(By.linkText(day)).click();
		Thread.sleep(3000);

	}
}
