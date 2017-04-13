package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Base_Page {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[text()='Time-Track']")
	private WebElement Timetrack;
	
	@FindBy(xpath="//div[text()='Tasks']/..//img")
	private WebElement Tasks;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement Users;
	
	@FindBy(xpath="//div[text()='Work Schedule']")
	private WebElement Schedule;
		
	
	public Base_Page(WebDriver driver)
	{
		//intialise the driver to current object
		PageFactory.initElements(driver, this);
	}
	
	public void Logout()
	{
		try
		{
		logout.click();
		Reporter.log("cliked Logout", true);
		}
		catch (Exception e) {
		Reporter.log("Fail.....Not cliked Logout " +e.getMessage(), true);
		}
	}
	public void Timetrack()
	{
	try
	{
			Timetrack.click();
			Reporter.log("cliked on Timetrack", true);
		}
		catch (Exception e) {
		Reporter.log("Fail.....Not cliked Timetrack " +e.getMessage(), true);
		}
}
	public void Reports()
	{
		try
		{
			Reports.click();
				Reporter.log("cliked on Reports", true);
			}
			catch (Exception e) {
			Reporter.log("Fail.....Not cliked Reports " +e.getMessage(), true);
			}
	}
	
     public void Tasks()
     {
 		try
 		{
 			Tasks.click();
 				Reporter.log("cliked on Tasks", true);
 			}
 			catch (Exception e) {
 			Reporter.log("Fail.....Not cliked Tasks " +e.getMessage(), true);
 			}
 	}
      public void Users()
      {
   		try
   		{
   			Users.click();
   				Reporter.log("cliked on Users", true);
   			}
   			catch (Exception e) {
   			Reporter.log("Fail.....Not cliked Users " +e.getMessage(), true);
   			}
   	}
      public void Schedule()
      {
     		try
     		{
     			Schedule.click();
     				Reporter.log("cliked on Schedule", true);
     			}
     			catch (Exception e) {
     			Reporter.log("Fail.....Not cliked Schedule " +e.getMessage(), true);
     			}
     	}
}