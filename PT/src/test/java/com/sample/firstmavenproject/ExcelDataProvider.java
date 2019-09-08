package com.sample.firstmavenproject;

public class ExcelDataProvider 
{
	
	public static void main(String[] args) throws Throwable 
	{
		String excelPath="C:\\Users\\jainne\\eclipse-workspace\\firstmavenproject\\excel\\data.xlsx";
		
		testdata(excelPath,"Sheet1");
	}
	public static void testdata(String excelPath,String sheetname) throws Throwable
	
	{
	ExcelUtils excel = new ExcelUtils(excelPath, sheetname)	;
	
	int rowCount = excel.getRowCount();
	
	int colCount = excel.getColCount();
	
	
	for (int i=1;i<rowCount;i++)
	{
		
		for (int j=0;j<colCount;j++)
		{
			String Celldata = ExcelUtils.getCellData(i, j);
			
			System.out.print(Celldata);
		}
		
		System.out.println();
	}
	
	
	
		
	}
	

}
