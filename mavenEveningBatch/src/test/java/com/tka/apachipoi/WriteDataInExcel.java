package com.tka.apachipoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataInExcel {

	Sheet sh=null;
	Row row =null;
	Cell c= null;
	
	@Test
	public void writeData() throws Exception
	{
		FileInputStream fis = new FileInputStream("LoginData.xlsx");
		Workbook wb = new WorkbookFactory().create(fis);
		
		if(wb.getSheet("JBK")==null)
			sh=wb.createSheet("JBK");
		else
			sh=wb.getSheet("JBK");
		
		if(sh.getRow(3)==null)
			row=sh.createRow(3);
		else
			row=sh.getRow(3);
		
		if(row.getCell(5)==null)
			c=row.createCell(5);
		else
			c=row.getCell(5);
		
		c.setCellValue("TheKIranAcademy");
		
		FileOutputStream fos = new FileOutputStream("LoginData.xlsx");
		wb.write(fos);
		fos.close();
		
	}
}
