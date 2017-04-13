package com.Scripts;

import org.testng.annotations.Test;

import com.Generic.Base_Test;
import com.Generic.Excel;
import com.page.Login_Page;

public class Login_script extends Base_Test {
	String xlpath="./data/sample.xlsx";
	String sheetname="sheet1";
	
	@Test
	public void login_action()
	{
	int rc = Excel.rowcount(xlpath, sheetname);
	System.out.println(rc);
	for(int i=1;i<=rc;i++)
	{
	
		String unme = Excel.getcellvalue(xlpath, sheetname, i, 0);
		String pwd = Excel.getcellvalue(xlpath, sheetname, i, 1);
		
		Login_Page lp=new Login_Page(driver);
		lp.Login(unme, pwd);
		
	}
}

	
}

