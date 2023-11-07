package assignment4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.logging.log4j.util.PropertySource.Comparator;

public class SortingOfStringWithSingleForloop {
	
	public static String[] sortArrays(String[] arr)
	{

		int length = arr.length;


		for (int  j = 0; j < length - 1; j++) {
			if (arr[j].compareTo(arr[j + 1])>0) {

				String temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

				j = -1;
			}
		}

		return arr;
	}
	public static void main(String args[])
	{
	
		String arr[] = { "raj","mohin","sai" };

		System.out.println("Original array: "
						+ Arrays.toString(arr));
		arr = sortArrays(arr);
		System.out.println("Sorted array: "
						+ Arrays.toString(arr));
	}
             
}

	
	
	
		


