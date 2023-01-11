package com.excelProject.mavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//			FileInputStream file = new FileInputStream(new File("C:\\Users\\anjalmishra\\Documents\\2022\\sheets\\sheetsExcel.xls"));
//			HSSFWorkbook workbook = new HSSFWorkbook(file);
//			HSSFSheet sheet = workbook.getSheet("Sheet1");
//			HSSFRow row = sheet.getRow(1);
//			HSSFCell cell = row.getCell(4);
//			String amount = cell.getStringCellValue();
//			System.out.println("string cell value:"+amount);
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
					FileInputStream fis = new FileInputStream(new File("C:\\Users\\anjalmishra\\Documents\\2022\\sheets\\sheetExcel.xls"));
					XSSFWorkbook workbook = new XSSFWorkbook();
					XSSFSheet sheet = workbook.getSheet("Sheet1");
					int rowcount = sheet.getLastRowNum()- sheet.getFirstRowNum();
					for(int i = 0 ;i<= rowcount; i++){
						
						
						int cellcount = sheet.getRow(i).getLastCellNum();
						
				        for(int j = 0 ; j<cellcount;j++){
					        System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"  ");
					
					
				}
				
				
				}} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
					
				}
			
			
		
			
			
		
		

	}
 