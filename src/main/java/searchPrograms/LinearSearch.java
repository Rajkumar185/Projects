package searchPrograms;

import java.util.Scanner;

public class LinearSearch {
	
//	public static int Linear(int[] ar,int key)
//	{
//		for(int i=0;i<ar.length;i++) {
//			if(ar[i]== key) {
//				return i;
//		}
//	}
//	return -1;
//}
//	public static void main(String args[]) {
//		int[] a1={10,20,30,40,50};
//		int key=60;
//		System.out.println(key +"found the key index is"+Linear(a1,key));
//		
//	}
	
	public static void main(String args[])
	{
    int c, n, search, array[];  
    
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (c = 0; c < n; c++)  
      array[c] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    search = in.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (c + 1) + ".");  
          break;  
      }  
   }  
   if (c == n)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}  


