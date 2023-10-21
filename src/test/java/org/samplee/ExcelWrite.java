package org.samplee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void excelWrite() {

		try {
			File f = new File("C:\\Users\\Acer\\eclipse-workspace\\AaMaven\\src\\test\\resources\\TestData\\maven_project.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.createSheet("Project_Name");
			Row row = sheet.createRow(6);
			Cell cell = row.createCell(3);
			cell.setCellValue("Maven_Project");
			
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
	
	
	
	public static void main(String[] args) {
		excelWrite();
	}
}
