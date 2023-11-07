package assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {

		  File f1=new File("D:\\Training\\readfile.txt"); 
	      String[] words=null;  
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	      String s;     
	      String input="Rajkumar";   
	      int count=0;   
	      while((s=br.readLine())!=null)   
	      {
	         words=s.split(" "); 
	          for (String word : words) 
	          {
	                 if (word.equals(input))   
	                 {
	                   count++;    
	                 }
	          }
	      }
	      if(count!=0)  
	      {
	         System.out.println("The given word is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }
	      
	         fr.close();
	 

	}

}
