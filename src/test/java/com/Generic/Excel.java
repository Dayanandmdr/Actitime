package com.Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
	public static int rowcount(String xlpath,String sheetname)
	{
		
		try{
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
	          int rowcount = s.getLastRowNum();
	          return rowcount;
	          
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
		public static String getcellvalue(String xlpath,String sheetname,int row,int cell)
		{
			try {
				FileInputStream fis=new FileInputStream(xlpath);
				Workbook w=WorkbookFactory.create(fis);
				Sheet s=w.getSheet(sheetname);
				String value = s.getRow(row).getCell(cell).getStringCellValue();
				return value;
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		}
		
	}

	
	
	

