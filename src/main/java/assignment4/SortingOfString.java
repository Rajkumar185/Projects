package assignment4;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfString {

	public static void main(String[] args) {
		
		String[] name= {"Mohin","Rajkumar","Nitesh","Ajay","Saikiran"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		//using  ForLoop
		//int size=name.length;
		/*for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				String temp;
				if(name[i].compareTo(name[j])>=0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
					
				}
			}
			
			System.out.println(name[i]);
		}*/
	}
}

