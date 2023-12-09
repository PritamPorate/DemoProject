package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_EX2 {
  @Test(groups="login")
  public void login ()
  {
	  System.out.println("login");
  }
  @Test(groups="regression")
  public void dash()
  {
	  System.out.println("dash");

  }
  @Test(groups="login")
  public void logout()
  {
	  System.out.println("logout");

  }
  @Test(groups="regression")
  public void user()
  {
	  System.out.println("user");

  }
  @Test(groups="name")
  public void name()
  {
	  System.out.println("name");

  }
  
  @Test(groups="name")
  public void downloads()
  {
	  System.out.println("downloads");
/*	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
*/
  }
}
