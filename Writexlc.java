package Retrive;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Writexlc {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook =new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("HAPPY");
		sheet.getRow(0).createCell(1).setCellValue("DIWALI");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("MOHS10");
		sheet.getRow(1).createCell(1).setCellValue("TEAM");
		
		File file = new File("C:\\Users\\ANURAG\\Desktop\\Assignment\\Assignment\\Dwali.xls");
		
		workbook.write(file);
		workbook.close();


	}

}
