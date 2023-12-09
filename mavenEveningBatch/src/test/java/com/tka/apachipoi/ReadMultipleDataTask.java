package com.tka.apachipoi;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadMultipleDataTask {
	@Test
	public void Login()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
	   // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("LoginData.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			Row rows=sh.getRow(i);
			String username = df.formatCellValue(rows.getCell(0));
            String pass = df.formatCellValue(rows.getCell(1));
               
			driver.findElement(By.id("email")).sendKeys(username);
		    driver.findElement(By.id("password")).sendKeys(pass);
		    driver.findElement(By.xpath("//button")).click();
		    if(driver.getTitle().contains("JavaByKiran | Dashboard"))
		    {
		    	driver.findElement(By.linkText("LOGOUT")).click();
			    driver.navigate().refresh();
 
		    }
		    
			    driver.navigate().refresh();
		 }
		}
	}



