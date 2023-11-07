/**Split a string in such a way so that every splitted substring can ends with a vowel
E.g. " Tgvugeojfhbejsba"->"Tqvu", "qeo", " jfhbe", "jsba"*/
package javaAssignment3;

import java.util.*;

public class WordEndsWithVowel {
	
	public static void main(String args[]) {

	String st;
	String str="Tgvugeojfhbejsba";
	str=str.toLowerCase();
	st = Arrays.toString(str.split("(?<=[aeiou])"));
	System.out.println(st);
	
	}
	
}
	