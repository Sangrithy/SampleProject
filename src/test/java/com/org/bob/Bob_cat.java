package com.org.bob;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bob_cat {

	public static void excelWriteData(int a,int b,String c) {
	try {
		// locate
		File f = new File("C:\\Users\\DELL\\eclipse-workspace-Selenium\\Sample_five\\src\\test\\resources\\Test Data\\Excelread.xls.xlsx");
		// read
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//Sheet sheet = wb.createSheet("Aiite");
		Sheet sheet = wb.getSheet("Sample 1");
		Row createRow = sheet.createRow(a);
		Cell createCell = createRow.createCell(b);
		createCell.setCellValue(c);
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
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Equipment')])[3]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Skid-Steer Loaders')])[1]")).click();
		

		WebElement firstProd = driver.findElement(By.xpath("//a[@title='S450 Skid-Steer Loader']/preceding::a[contains(text(), 'S70')]"));
		String prodName1 = firstProd.getText();
		excelWriteData(0, 0, prodName1);
		
		WebElement secProd = driver.findElement(By.xpath("//a[contains(text(), 'S70')]/following::a[@title='S450 Skid-Steer Loader']"));
		String prodName2 = secProd.getText(); 
		excelWriteData(1, 0, prodName2);
		WebElement thirdProd = driver.findElement(By.xpath("//a[@title='S450 Skid-Steer Loader']/following::a[contains(@title, 'S590')]"));
		String prodName3 = thirdProd.getText();
		excelWriteData(2, 0, prodName3);
		
		WebElement forthProd = driver.findElement(By.xpath("//div[contains(@class, 'card')]/child::a[contains(@title, 'S770')]"));
		String prodName4 = forthProd.getText();
		excelWriteData(3, 0, prodName4);
}
		
		
	
	}