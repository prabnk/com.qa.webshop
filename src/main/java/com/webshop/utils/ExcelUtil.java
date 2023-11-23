package com.webshop.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * Name:ExcelUtils
 * Description: This is the utility class to fetch the data from excel sheet.
 * Developed By: Prabha
 * Approved By:Shantosh
 * Date Created/Modified:11/20/2023
 */


public class ExcelUtil {
	XSSFWorkbook excel;
	
	//this is the constructor which will be called whenever an object of this class is created
		
		public ExcelUtil(String excelpath) {
			try {
				File file = new File(excelpath);
				FileInputStream fis = new FileInputStream(file);
				excel = new XSSFWorkbook(fis);

			} catch (Exception e) {
				System.out.println("unable to load the excel sheet" + e.getMessage());
				e.printStackTrace();
			}
		}
		// this method is used to get the active rows from the excel using sheetnumber
		public int getRowCount(int sheetnum)
		{
			return excel.getSheetAt(sheetnum).getLastRowNum()+1;
			
		}
		//this method is used to get the active rows from the excel using sheetname
		public int getRowCount(String sheetname)
		{
			return excel.getSheet(sheetname).getLastRowNum()+1;
			
		}

		
		//this method is used to get the active column from the excel using sheetnum
			public int getColumnCount(int sheetnum )
			{
				return excel.getSheetAt(0).getRow(0).getLastCellNum();
				
			}
		// this method is used to get the  data of the cell using sheetnumber
		public String getCellData(int sheetnum,int row,int cell )
		{
			return excel.getSheetAt(sheetnum).getRow(row).getCell(cell).toString();
		}
		// this method is used to get the  data of the cell using sheetname
		public String getCellData(String sheetname,int row,int cell )
		{
			return excel.getSheet(sheetname).getRow(row).getCell(cell).toString();
		}
}
