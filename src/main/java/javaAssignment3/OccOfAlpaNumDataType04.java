/**Check the occurrence of numeric, alphabetic & date type in an array
for e.g. array ar = {"12", "abc", "java" "12/12/2021"}  */
package javaAssignment3;
import java.text.SimpleDateFormat;
import java.util.*;

public class OccOfAlpaNumDataType04 {

	public static void main(String[] args) {
		
	
		String[] s= {"12","Selenium","java","Api","12/12/2021","01/11/2022"};
		int numericCount=0,dateCount=0,alphabeticCount=0;
		for(int i=0;i<s.length;i++)
		{
		 try
		 {
			 long l=Long.parseLong(s[i]);
			 numericCount++;
		 }
		 catch(Exception e) {
			 try {
				 Date d=new SimpleDateFormat("dd/MM/yyyy").parse(s[i]);
				 dateCount++;
			 }catch(Exception e1) {
				 alphabeticCount++;
			 }
		 }
		}
		
     System.out.println("Numeric: "+numericCount);
     System.out.println("Date: "+dateCount);
     System.out.println("Alphabetic: "+alphabeticCount);
	}

}
