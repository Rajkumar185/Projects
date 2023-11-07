/**Find length of string without using length function in java */
package assignment4;
import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		str=sc.nextLine();
		//System.out.println(str.length());
		int i=0;
		for(char ch:str.toCharArray())
		{
			i++;
		}
		System.out.println("Length of given String is :"+i);
	}

}
