package com.sample.firstmavenproject;

public class ExcelDemo {

	public static void main(String[] args) throws Throwable 
	{
		String ProjectPath=System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(ProjectPath+"/excel/data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		
		excel.getCellData(0, 0);
		excel.getCellDataNumber(1, 1);

	}

}


//public static void main(String[] args) throws Throwable 
//{
//	getRowCount();
//	getCellData(0,1);
//	getCellDataNumber(1, 1);
//}
