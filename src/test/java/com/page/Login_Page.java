package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Generic.Base_Page;

public class Login_Page extends Base_Page {
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pw;
	
	@FindBy(id="loginButto")
	private WebElement login;
	
	
	public Login_Page(WebDriver driver)
	{
		//intialise the base page constructor 
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	public void Login(String unme,String pwd)
	{
		un.sendKeys(unme);
		pw.sendKeys(pwd);
		login.click();
		
	}
	
	
}
