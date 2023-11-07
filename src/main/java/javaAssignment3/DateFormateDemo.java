package javaAssignment3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {

	public static void main(String[] args) {
		 
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/YYYY:hh:mm:ss");
		System.out.println(sdf1.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		
	}
}
