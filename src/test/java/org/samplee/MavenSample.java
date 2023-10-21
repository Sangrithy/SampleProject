package org.samplee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MavenSample {

//	public static void excelRead() {
//
//		try {
//			// locate
//			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
//			// read
//			FileInputStream fis = new FileInputStream(f);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.getSheet("Sheet1");
//			Row row = sheet.getRow(0);
//			Cell cell = row.getCell(2);
//			System.out.println(cell);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

//	public static void excelReadAllData() {
//
//		try {
//			// locate
//			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
//			// read
//			FileInputStream fis = new FileInputStream(f);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.getSheet("Sheet1");
//			int phyrows = sheet.getPhysicalNumberOfRows();
//			for (int i = 0; i < phyrows; i++) {
//				Row row = sheet.getRow(i);
//				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//				for (int j = 0; j < physicalNumberOfCells; j++) {
//					Cell cell = row.getCell(j);
//					System.out.println(cell);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

//	public static void excelreuseable() {
//		try {
//			// locate
//			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
//			// read
//			FileInputStream fis = new FileInputStream(f);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.getSheet("Sheet1");
//			Row row = sheet.getRow(2);
//			Cell cell = row.getCell(2);
//			System.out.println(cell);
//			int cellType = cell.getCellType();
//			if(cellType==1) {
//				String value = cell.getStringCellValue();
//				System.out.println(value);
//			}else if(cellType==0) {
//				if(DateUtil.isCellDateFormatted(cell)) {
//					Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");	
//					String dateValue = sm.format(dateCellValue);
//					System.out.println(dateValue);
//				}else {
//					double numericCellValue = cell.getNumericCellValue();
//					long l = (long)numericCellValue;
//					String numericvalue = String.valueOf(l);
//					System.out.println(numericvalue);
//				}
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	public static String excelreuse(int a , int b) {
		String value = null;
		try {
			// locate
			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
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
	
//	public static void excelWrite() {
//
//		try {
//			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
//			
//			FileInputStream fis = new FileInputStream(f);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.createSheet("Order_No");
//			Row row = sheet.createRow(0);
//			Cell cell = row.createCell(1);
//			cell.setCellValue("Order Number : ");
//			
////			Row row1 = sheet.createRow(1);
////			Cell cell1 = row1.createCell(1);
////			cell1.setCellValue(ordrno);
//			
//		FileOutputStream fos = new FileOutputStream(f);
//		   wb.write(fos);
//		   wb.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(excelreuse(3,0));
		driver.findElement(By.id("password")).sendKeys(excelreuse(3,1));
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(dropdown);
		s.selectByValue("Adelaide");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(dropdown1);
		s1.selectByValue("Hotel Hervey");
		 
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(dropdown2);
		s2.selectByValue("Double");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(dropdown3);
		s3.selectByValue("4");
		
		driver.findElement(By.id("datepick_in")).sendKeys(excelreuse(2,0));
		driver.findElement(By.id("datepick_out")).sendKeys(excelreuse(2,1));
		
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(dropdown4);
		s4.selectByValue("2");
		
		WebElement dropdown5 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(dropdown5);
		s5.selectByValue("4");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement selectButton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		selectButton.click();
		
		WebElement continueb = driver.findElement(By.xpath("//input[@id='continue']"));
		continueb.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("first_name")).sendKeys(excelreuse(4,0));
		driver.findElement(By.id("last_name")).sendKeys(excelreuse(4,1));
		driver.findElement(By.id("address")).sendKeys(excelreuse(4,2));
		driver.findElement(By.id("cc_num")).sendKeys(excelreuse(5,1));
		
		WebElement cct = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6 = new Select(cct);
		s6.selectByValue("VISA");
		
		WebElement cce = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7 = new Select(cce);
		s7.selectByValue("3");
		
		WebElement ccr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(ccr);
		s8.selectByValue("2029");
		
		driver.findElement(By.id("cc_cvv")).sendKeys(excelreuse(5,2));
		
		WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNow.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
		String ordrno=orderNo.getAttribute("value");
		System.out.println("Order Number Is : ");
		System.err.println(ordrno);
		
//		excelWrite();
		try {
			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Order_No");
			Row row = sheet.createRow(5);
			Cell cell = row.createCell(7);
			cell.setCellValue("Order Number : " +ordrno);
			
//			Row row1 = sheet.createRow(1);
//			Cell cell1 = row1.createCell(1);
//			cell1.setCellValue(ordrno);
			
		FileOutputStream fos = new FileOutputStream(f);
		   wb.write(fos);
		   wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
		
	}

