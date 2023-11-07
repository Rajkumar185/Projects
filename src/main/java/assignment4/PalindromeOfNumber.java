/** 6.	Palindrome program for Int*/
package assignment4;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		 int r,sum=0,temp,n;    
		  
		  Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter the Number");  
	      n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(sum==temp)    
		   System.out.println("given number is palindrome number ");    
		  else    
		   System.out.println("given number is not palindrome number ");    
	}

}

