package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testnghrm {
	WebDriver driver;
	wrappermethod wm = new wrappermethod();
	
        @BeforeTest
	  public void insertapp()
		{
			wm.insertapp("https://opensource-demo.orangehrmlive.com/");

		}
	
	@Test(priority=1)
	public void login()
	{
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
        wm.clickbyxpath("//*[@id='btnLogin']");

	}
	
	
	@Test(priority=2)
	public void admin()
	{
		
		wm.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");		
		wm.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");
		wm.enterbyid("searchSystemUser_userName", "thomas fleming");
		wm.clickbyxpath("//input[@id='searchBtn']");

	}
	
	
	@AfterTest
	public void quit()
	{
		wm.closeapp();
	}

	
}
	
	
	
