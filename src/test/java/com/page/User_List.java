package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_List {


	@FindBy(id="Users")
	private WebElement usr;
	
	@FindBy(id="ext-gen7")
	private WebElement ugenr;
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement fn;
	
	@FindBy(id="\"userDataLightBox_lastNameField")
	private WebElement ln;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement email;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement usrname;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement password;
	
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypepwd;
	
	@FindBy(id="userDataLightBox_generateTimeReportsChBox")
	private WebElement timereport;
	
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement commit;
	
	public User_List(WebDriver driver)
	{
		//intialise the base page constructor 
		super();
		//PageFactory.initElements(driver, this);
	}
	public void newuser(String fstname,String lastname,String emailid,String name,String passwrd,String retype)
	{
		usr.click();
		ugenr.click();
		fn.sendKeys(fstname);
		ln.sendKeys(lastname);
		email.sendKeys(emailid);
		usrname.sendKeys(name);
		password.sendKeys(passwrd);
		retypepwd.sendKeys(retype);
		timereport.click();
		commit.click();
	}
	
}