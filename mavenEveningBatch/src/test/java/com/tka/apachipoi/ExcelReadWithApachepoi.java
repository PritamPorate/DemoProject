package com.tka.apachipoi;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelReadWithApachepoi {

	@Test
	public void readExcelData() throws Exception
	{
		DataFormatter df = new DataFormatter(); 
	 FileInputStream fis = new FileInputStream("LoginData.xls");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("Sheet1");
	 int rows = sh.getLastRowNum();
	 for(int i=0;i<rows;i++)
	 {
	 int cols = sh.getRow(i).getLastCellNum();
	 
	 	for(int j=0;j<cols;j++)
	 	{
		 Cell c = sh.getRow(i).getCell(j);
		 System.out.print(df.formatCellValue(c)+" ");
	 	}
	 	System.out.println();
	 }
	}
	
	public String getCellData(int row, int col)throws Exception
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("LoginData.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		return df.formatCellValue(sh.getRow(row).getCell(col));
	}
	
	@Test
	public void Login()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys(getCellData(0,0));
	    driver.findElement(By.id("password")).sendKeys(getCellData(0,1));
	}	
}
	
	

