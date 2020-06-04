package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsUponMethod {

	@Test()
	public void login() {
		System.out.println("Login");
	}

	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("Search");
		Assert.assertEquals("xyz", "abc");
	}
	@Test(dependsOnMethods="search",alwaysRun=true)
	public void logout() {
	System.out.println("Logout");


	 }
	}


	
	

