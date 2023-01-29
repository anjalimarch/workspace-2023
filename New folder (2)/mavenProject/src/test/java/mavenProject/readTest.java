package mavenProject;

import java.io.File;
import java.io.FileInputStream;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream file = new FileInputStream(new File("C:\\Users\\anjalmishra\\Documents\\2022\\sheets\\sheetsExcel.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			HSSFRow row = sheet.getRow(1);
			HSSFCell cell = row.getCell(4);
			String amount = cell.getStringCellValue();
			System.out.println("string cell value:"+amount);
			
			
		}catch(Exception e){
			
			
			
		}
		

	}

}
 