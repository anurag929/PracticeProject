package Retrive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataEXL {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ANURAG\\Downloads\\apache-jmeter-5.5\\results\\Country.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int size =wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			
		System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
			
		}
		
		
		
		
		
	}

}
