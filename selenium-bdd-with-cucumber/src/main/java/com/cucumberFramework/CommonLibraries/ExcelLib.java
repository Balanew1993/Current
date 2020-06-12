package com.cucumberFramework.CommonLibraries;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String path="./testData/TestData-seleniumframework.xlsx";
	public String getExcelData(String sheetname,int rownum,int column) throws Throwable
	{
		FileInputStream fis= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		String data=row.getCell(column).getStringCellValue();
		fis.close();
		return data;
	}
}
