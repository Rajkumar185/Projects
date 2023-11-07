package StringPrograms;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
	
		String str1="Brag",str2="Grab";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Both the Strings are not anagram");
		}else {
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			
		Arrays.sort(string1);
        Arrays.sort(string2);			
		
	
		if(Arrays.equals(string1,string2)==true) {
			System.out.println("two Strings are Anagram");
		}else {
			System.out.println("two Strings are Not Anagram");
		}
		
	

	}

}
}
