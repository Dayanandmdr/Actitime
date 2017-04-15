package com.Scripts;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.testng.annotations.Test;

import com.Generic.Excel;
import com.page.User_List;

public class User_script extends Tasks_scripts {
	
	String xlpath="./data/sample.xlsx";
	String sheetname="sheet1";
	
	@Test(priority=3)
	public void create_user(){
	int rc = Excel.rowcount(xlpath, sheetname);
      System.out.println(rc);
      for(int i=1;i<=rc;i++)
      {
    	  
			String fstname = Excel.getcellvalue(xlpath, sheetname, i, 4);
			String lastname = Excel.getcellvalue(xlpath, sheetname, i, 5);
			String emailid = Excel.getcellvalue(xlpath, sheetname, i, 6);
			String name = Excel.getcellvalue(xlpath, sheetname, i, 7);
			String passwrd = Excel.getcellvalue(xlpath, sheetname, i, 8);
			String retype = Excel.getcellvalue(xlpath, sheetname, i, 9);
			System.out.println(name);

			User_List ul=new User_List(driver);
			ul.newuser(fstname, lastname, emailid, name, passwrd, retype);
			
			
	}
	}
}
	
	


