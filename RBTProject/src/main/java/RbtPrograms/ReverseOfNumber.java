package RbtPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int rev=0;
	while(n!=0)
	{
		int remainder=n%10;
		rev=rev*10+remainder;
		n=n/10;
	}
	System.out.println("Reverse of a given number is:"+rev);

	}

}
