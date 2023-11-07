package javaAssignment3;

public class PalindromeOfNoUsingWhileloop {
	
	public static void main(String args[]) {
	
	int lastDigit,sum=0,a,inputNumber;    
    inputNumber=171; //It is the number  to be checked for palindrome 

	a=inputNumber; 
    
    // Code to reverse a number
	while(a>0)
	{   System.out.println("Input Number "+a);  
		lastDigit=a%10; //getting remainder  
		System.out.println("Last Digit "+lastDigit); 
		System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
		sum=(sum*10)+lastDigit;  
		a=a/10;
		
	}    

	// if given number equal to sum than number is palindrome otherwise not palindrome
	if(sum==inputNumber)    
		System.out.println("Number is palindrome ");    
	else    
		System.out.println("Number is not palindrome");   
	
	/*
	  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    

	 */

}
}


