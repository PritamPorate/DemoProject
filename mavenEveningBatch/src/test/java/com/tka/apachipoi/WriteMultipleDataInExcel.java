package com.tka.apachipoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteMultipleDataInExcel {

	public class ExcelWrite {

		Sheet sh=null;
		Row row= null;
		Cell c= null;

		public void writeCellData(String sheetname, int rowNum, int col, String data)throws Exception {
			FileInputStream fis = new FileInputStream("LoginData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			if(wb.getSheet(sheetname)==null) {
				sh=wb.createSheet(sheetname);
				row= sh.createRow(rowNum);
				c= row.createCell(col);
			}
			else {
				sh= wb.getSheet(sheetname);
				if(sh.getRow(rowNum)==null) {
					row= sh.createRow(rowNum);
					c= row.createCell(col);
				}
				else {
					row=sh.getRow(rowNum);
					if(row.getCell(col)==null)
						c= row.createCell(col);
					else
						c=row.getCell(col);
				}
			}
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("LoginData.xlsx");
			wb.write(fos);
			wb.close();
			fos.close();
		}
		
		
		@Test
		public void test01()throws Exception {
			
			writeCellData("JBK", 3, 5,"TheKiranAcademy");
			writeCellData("JBK", 3, 6,"Selenium Automation");
		}
		
	}

}
