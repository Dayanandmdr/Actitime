package com.Scripts;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.testng.annotations.Test;

import com.Generic.Excel;
import com.page.User_List;

public class User_script extends Login_script {
	
	String xlpath="./data/sample.xlsx";
	String sheetname="sheet1";
	
	@Test
	public void create_user(){
	int rc = Excel.rowcount(xlpath, sheetname);
      System.out.println(rc);
      for(int i=1;i<=rc;i++)
      {
    	  
			String cnme = Excel.getcellvalue(xlpath, sheetname, i, 2);
			String crtbill = Excel.getcellvalue(xlpath, sheetname, i, 3);
			System.out.println(cnme);

			User_List ul=new User_List(driver);
			ul.newuser(fstname, lastname, emailid, name, passwrd, retype);
			
			
	}
	}
}
	
	


