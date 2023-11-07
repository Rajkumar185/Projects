package assignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile {
    
	@Test()
	public void readExcelFile() throws IOException {
	
		File src=new File("D:\\Training\\data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
	
	//Using Iterator
		Iterator itr=sheet.iterator();
		
		while(itr.hasNext())
		{
			XSSFRow row=(XSSFRow)itr.next();
			
			Iterator cellIterator=row.cellIterator();
			while(cellIterator.hasNext())
			{
				XSSFCell cell=(XSSFCell)cellIterator.next();
				
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue()); break;
				case NUMERIC:System.out.print(cell.getStringCellValue()); break;
				case BOOLEAN:System.out.print(cell.getStringCellValue()); break;
				}
				System.out.print("   |     ");
			}
			System.out.println();
			}
	}
			
		}
		


	
	


