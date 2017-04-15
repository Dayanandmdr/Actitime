package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class Base_Test {

	public WebDriver driver;
	@BeforeClass
	public void precondition(XmlTest t)
	{
		String browser=t.getParameter("browser");
		System.out.println(browser);
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else
				{
				 System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
				 driver=new InternetExplorerDriver();	
				}
		driver.get("http://localhost/login.do");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	@AfterClass
	public void postcondition()
	{
		driver.close();
		
	}
	
		
	}
	

