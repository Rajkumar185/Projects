/**1.	Write a java program to check if the two strings are anagram Or not(for cat = act) */
package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class AnagarmProgramUsingScanner {

	public static void main(String[] args) {
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String str1");
	str1=sc.nextLine();
	System.out.println("Enter the String str2");
	str2=sc.nextLine();
	char ch1[]=str1.replaceAll("\\s","").toLowerCase().toCharArray();
	char ch2[]=str2.replaceAll("\\s","").toLowerCase().toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

	/*if(ch1.length!=ch2.length)
	{
		System.out.println("Given Strings are not Anagram");
	}else
	{
		System.out.println("Given Strings are  Anagram");
	}*/
    // if sorted char arrays are same
    // then the string is anagram
    boolean result = Arrays.equals(ch1, ch2);
    if(result) {
      System.out.println(str1 + " and " + str2 + " are anagram.");
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
  
}
  
	


