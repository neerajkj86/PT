package com.sample.firstmavenproject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider2 
{
	
	
	
	@Test(dataProvider ="test1data")
	public void test1(String Username,String Password)
	{
		System.out.println(Username+ "||"+Password);
	}
	
	
	
	
	
	
	
	
	@DataProvider(name = "test1data") 
	public Object[][] getData() throws Throwable
	{
String excelPath="C:\\Users\\jainne\\eclipse-workspace\\firstmavenproject\\excel\\data.xlsx";
		
		Object data[][]=testdata(excelPath,"Sheet1");
		return data;
	}
	
	
	public Object[][] testdata(String excelPath,String sheetname) throws Throwable
	
	{
	ExcelUtils excel = new ExcelUtils(excelPath, sheetname)	;
	
	int rowCount = excel.getRowCount();
	
	int colCount = excel.getColCount();
	
	Object data[][]=new Object[rowCount-1][colCount];
	
	for (int i=1;i<rowCount;i++)
	{
		
		for (int j=0;j<colCount;j++)
		{
			String Celldata = ExcelUtils.getCellData(i, j);
			
			System.out.print(Celldata + "  ");
		}
		
		System.out.println();
	}
	return data;
	
	
	
	
		
	}
	

}
