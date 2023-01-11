package com.excelProject.mavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeTest {
public static void main(String args[]) {
	
	
	
	File fi= new File("C:\\Users\\anjalmishra\\Documents\\2022\\sheets\\sheetExcel.xls");
	
	
	try {
		FileInputStream fis = new FileInputStream(fi);
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i =0; i<rowcount; i++){
			int colcount = sheet.getRow(i).getLastCellNum();
			
			for(int j=0; j<colcount; j++) {
				
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(s);
				writeinSheet(rowcount, 4,"AM");
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}

public  static void writeinSheet(int rowcount, int colcount,String value) {
	// TODO Auto-generated method stub
	
	HSSFWorkbook wb = new HSSFWorkbook();
	
	HSSFSheet s=wb.getSheet("Sheet1");
	
	for(int j=1; j<= colcount; j++) {
		s.createRow(rowcount+j).createCell(j).setCellValue(value);
		
	}
	
	
	
	
	
}
	
	}


