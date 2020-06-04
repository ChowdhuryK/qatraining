package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsoOnGroups {

	@Test(groups={"smoketesting", "sanitytesting"})
	public void login() {
		System.out.println("Login");
	}

	@Test(groups={"smoketesting", "regressiontesting"})
	public void search() {
		System.out.println("Search");
		//Assert.assertEquals("xyz", "abc");
	}
	@Test(groups={"regressiontesting", "retesting"})
	public void logout() {
	System.out.println("Logout");


	 }
	}

	
	
	
}
