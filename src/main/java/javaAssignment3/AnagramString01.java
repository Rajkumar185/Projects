package javaAssignment3;

import java.util.Arrays;

public class AnagramString01 {

	public static void main(String[] args) {
		
		String s1="act";
		String s2="cat";
		char c1[]=s1.replaceAll("\\s","").toLowerCase().toCharArray();
		char c2[]=s2.replaceAll("\\s","").toLowerCase().toCharArray();
		if(c1.length!=c2.length)
		{
			System.out.println("Given Strings are Not Anagram");
	
		}else {
			System.out.println("Given Strings are Anagram");
		}
		/*Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				System.out.println("Given Strings are Not Anagram");
				
			}else {
				System.out.println("Given Strings are Anagram");
			}
		}
		//System.out.println("Given Strings are Anagram");*/
	}

}
