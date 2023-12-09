package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_EX {
  @Test(groups="login")
  public void login ()
  {
	  System.out.println("login");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
  }
  @Test(groups="regression")
  public void dash()
  {
	  System.out.println("dash");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();

  }
  @Test(groups="login")
  public void logout()
  {
	  System.out.println("logout");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();

  }
  @Test(groups="regression")
  public void user()
  {
	  System.out.println("user");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();


  }
  @Test  public void name()
  {
	  System.out.println("name");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();

  }
  
  @Test
  public void downloads()
  {
	  System.out.println("downloads");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();

  }
}
