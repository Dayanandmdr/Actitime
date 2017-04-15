package com.Scripts;

import org.testng.annotations.Test;

import com.Generic.Excel;
import com.page.Tasks;

public class Tasks_scripts extends Login_script {
	
	String xlpath="./data/sample.xlsx";
	String sheetname="sheet1";
	
	@Test(priority=2)
	public void create_task()
	{
	int rc = Excel.rowcount(xlpath, sheetname);
	System.out.println(rc);
	for(int i=1;i<=rc;i++)
	{
	
		String cnme = Excel.getcellvalue(xlpath, sheetname, i, 2);
		String crtbill = Excel.getcellvalue(xlpath, sheetname, i, 4);
		
		Tasks t=new Tasks(driver);
		t.Tasks();
		t.create_Task(cnme, crtbill);
	 
	}
	}
	
	
	
	
}
