package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {


	@FindBy(xpath="//*[text()='Java By Kiran']")
	WebElement header1;
	
	@FindBy(xpath="//h3")
	List<WebElement> courses;
	
	@FindBy(xpath="//ul[contains(@class,'sidebar-menu')]")
	List<WebElement> menu;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHeaderText()
	{
		String act_header="Java By Kiran";
		String exp_header=header1.getText();
		Assert.assertEquals(act_header, exp_header);
	}
	public void verifyCourses()
	{
		for (WebElement allCourses : courses) 
		{
			String act_courses = allCourses.getText().trim();
			
		}	
		
		String exp_courses="Selenium ,Java / J2EE , Python, Php";
		System.out.println(exp_courses);
		//Assert.assertEquals(act_courses, exp_courses);
	}	
}
