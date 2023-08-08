package RbtPrograms;

import java.util.Scanner;

public class DonorsInfo {

	public void info(){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name");
	String name=sc.next();
	
	System.out.println("Enter the mobilenumber");
	int number=sc.nextInt();
	
	System.out.println("Enter the Age");
	int age=sc.nextInt();
	
	System.out.println("Enter the BloodGroup");
	String BloodGroup=sc.next();
	
	System.out.println("Name is:"+name);
	System.out.println("Number is:"+number);
	System.out.println("age is:"+age);
	System.out.println("BloodGroup is:"+BloodGroup);
	sc.close();
	}
	public static void main(String[] args) {
		
		DonorsInfo di=new DonorsInfo();
		di.info();
		
	
	}
	


}