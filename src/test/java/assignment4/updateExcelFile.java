package assignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class updateExcelFile {
	
	public void writeExcel(String name,String Location) throws IOException {
		
		File src=new File("D:\\Training\\data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
		//write data
		sheet.getRow(5).getCell(0).setCellValue(name);
		sheet.getRow(5).getCell(1).setCellValue(Location);
		
		FileOutputStream fos=new FileOutputStream(src);
		book.write(fos);
		book.close();
	}

}	
       