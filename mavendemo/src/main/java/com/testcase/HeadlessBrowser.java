package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class HeadlessBrowser {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("Page title is: " + driver.getTitle());	
		}

}