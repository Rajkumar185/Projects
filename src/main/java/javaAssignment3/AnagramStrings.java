package javaAssignment3;

import java.util.Arrays;

public class AnagramStrings {
	
    public static boolean isAnagram(String s1,String s2) {
    	if(s1==null || s2==null) {
    		return false;
    	}
    	String str1 = s1.replaceAll("\\s","").toLowerCase();
    	String str2 = s2.replaceAll("\\s","").toLowerCase();
    	
    	if(str1.length()!=str2.length()) {
    		return false;
    	}else {
    		char c1[]=str1.toCharArray();
    		char c2[]=str1.toCharArray();
    		
    		return Arrays.equals(c1,c2);
    	}
    	
    }
	public static void main(String[] args) {
		System.out.println(isAnagram("cat","act"));
		System.out.println(isAnagram("cat","ac t"));
		
		//System.out.println("given strings is Anagram " +isAnagram("cat","act"));
		
		/*System.out.println(isAnagram("act","cat"));
		System.out.println(isAnagram("Cat","Act"));
		System.out.println(isAnagram("CAT","ACT"));
		System.out.println(isAnagram("CAT","act"));
		System.out.println(isAnagram("catt","act"));
		System.out.println(isAnagram("Listen","Silent"));
		System.out.println(isAnagram("Listen","Silen t"));
		System.out.println(isAnagram("Lives","ELVIS"));
		System.out.println(isAnagram("Toss","shot"));
		System.out.println(isAnagram("joy","enjoy"));
		System.out.println(isAnagram("cat","act"));
		System.out.println(isAnagram("Listen","Silent"));
		System.out.println(isAnagram("Li   ste   n","Si   l   e  nt"));
		System.out.println(isAnagram("T","t"));
		System.out.println(isAnagram(null,""));
		System.out.println(isAnagram(null,null));*/
		
		

	}

}
