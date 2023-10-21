package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver =null;
//public static String link=null;
//public static void browser_launch(){
//		FileReader read;
//		try {
//			read = new FileReader("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\config.properties");
//			Properties p = new Properties();
//			
//				p.load(read);
//				String link = p.getProperty("url");
//				driver = new ChromeDriver();
//				
//				driver.get(link);
//				driver.manage().window().maximize();
//		}
//			 catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//}
	@BeforeClass
	public static void browser_launch(){
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	public static void inputValue(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void click_value(WebElement element) {
		element.click();
	}
	
	public static String excelreuse(int a , int b) {
		String value = null;
		try {
			// locate
			File f = new File("C:\\Users\\DELL\\Desktop\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			
//			System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
//				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");	
				value = sm.format(dateCellValue);
//					System.out.println(value);
				}else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					value = String.valueOf(l);
//					System.out.println(value);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void dropDownValuesSelect(WebElement element,String value) {
		 Select ss = new Select(element);
		    ss.selectByValue(value);
	}
	
	@AfterClass
	public static void closeBrowser() {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\DELL\\Desktop\\AaMaven\\ScreenShot\\image.png");
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
