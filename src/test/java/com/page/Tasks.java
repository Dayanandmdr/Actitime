package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Generic.Base_Page;

public class Tasks extends Base_Page {
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createtask;
	@FindBy(xpath="(//em)[1]")
	private WebElement list_custname;
	@FindBy(id="ext-gen202")
	private WebElement selcustomer;
	@FindBy(id="createTasksPopup_newCustomer")
	private WebElement custname;
	@FindBy(xpath="(//em)[2]")
	private WebElement list_project;
	@FindBy(id="createTasksPopup_newProject")
	private WebElement newproj;
    @FindBy(id="createTasksPopup_commitBtn")
	private WebElement submit;

	
	
	public Tasks(WebDriver driver)
	{
		//intialise the base page constructor 
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	public void create_Task(String cnme,String crtbill)
	   {
		createtask.click();	
		list_custname.click();
		selcustomer.click();
		custname.sendKeys(cnme);
		list_project.click();
		newproj.sendKeys(crtbill);
		submit.click();
		
	   }
}
