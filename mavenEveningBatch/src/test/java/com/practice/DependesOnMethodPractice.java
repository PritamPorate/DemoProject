package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DependesOnMethodPractice {

	@Test(groups="login")
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void dash()
	{
		System.out.println("dash");
	}
	@Test(groups="login")
	public void user()
	{
		System.out.println("user");
		Assert.assertEquals(1, 2);

	}
	@Test(dependsOnGroups="login")
	public void logout()
	{
		System.out.println("logout");
	}
	@Test(dependsOnMethods={"dash","user"})
	public void name()
	{
		System.out.println("name");
	}
}
