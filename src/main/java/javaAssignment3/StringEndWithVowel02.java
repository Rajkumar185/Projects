/**	Split a string in such a way so that every splitted substring can ends with a vowel
E.g. " Tgvugeojfhbejsba"->"Tqvu", "qeo", " jfhbe", "jsba"*/
package javaAssignment3;
import java.util.*;

public class StringEndWithVowel02 {

	public static void main(String[] args) {
		
		String s="Tgvugeojfhbejsba".toLowerCase();
		boolean vowelFound = false;
		int p=0;
		List<String> stringList =new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			if(!isVowel(s.charAt(i)))
			{
				if(vowelFound)
				{
					stringList.add(s.substring(p,i));
 					p=i;
					vowelFound =false;
				}
			}
			else {
				if(i==s.length()-1) {
					stringList.add(s.substring(p, i+1));
				}
				else {
					vowelFound =true;
				}
			}
		}

		System.out.println(String.join(",",stringList));
        
	}
	public static boolean isVowel(char c)
	{
		boolean flag=false;
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	
			flag=true;
			break;
		}
		return flag;
	}

}
