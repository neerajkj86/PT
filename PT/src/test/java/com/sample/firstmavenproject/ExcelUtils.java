package com.sample.firstmavenproject;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String ProjectPath;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet ;
	
	
	public ExcelUtils(String excelPath,String sheetName) throws Throwable //Constructor which is used for reusable method for across the test
	{
		
		 workbook = new XSSFWorkbook(excelPath);

		sheet =  workbook.getSheet(sheetName); //we cannnot create the object of sheet .
	}

	
	public  int getRowCount() throws Throwable 
	{
		

		int rowCount=sheet.getPhysicalNumberOfRows();

		System.out.println("No of rows: " +rowCount);
		return rowCount;

	}
	
	public  int getColCount() throws Throwable 
	{
		

		int ColCount=sheet.getRow(0).getPhysicalNumberOfCells();

		//System.out.println("No of Columns: " +ColCount);
		return ColCount;

	}
	
	public static String getCellData(int rownum,int colNum) throws Throwable
	{
		
		String Celldata = null;
		Celldata=sheet.getRow(rownum).getCell(colNum).getStringCellValue();
		
		//System.out.println("Cell data:" + Celldata);
		return Celldata;
		
		
	}
	
	public  void getCellDataNumber(int rownum,int colNum) throws Throwable
	{
		
		
		double Celldata=sheet.getRow(rownum).getCell(colNum).getNumericCellValue();
		
		//System.out.println("Cell data:" + Celldata);
		
		
	}


}


