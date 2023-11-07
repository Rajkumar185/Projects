package assignment4;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ExcelData {
	
	@Test
	public void excelData() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String names=sc.nextLine();
		System.out.println("Enter the location name:");
		String location=sc.nextLine();
		System.out.println("Sucessfully updated row ");
		
		updateExcelFile wr=new updateExcelFile();
		wr.writeExcel(names,location);
		
	}

}
