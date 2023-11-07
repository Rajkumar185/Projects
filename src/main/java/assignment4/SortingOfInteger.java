package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfInteger {

	public static void main(String[] args) {
		
		int[] array=new int[]{100,1,75,35,50,25};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
     //using forLoop
		
	/*	for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
			System.out.println(array[i]);
		}*/
		
	}

}
