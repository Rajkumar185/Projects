package interviewQuestions;

import java.util.Arrays;

public class StringSplitByWords {
	
	public static void main(String args[]) {
	
    String sentence = "Java String split by words from sentence";
    
    //get words from sentence
    String[] words = splitSentenceByWords(sentence);
        
    //print words
    System.out.println(Arrays.toString(words));
    
}

private static String[] splitSentenceByWords(String str){        
    
    //if string is empty or null, return empty array
    if(str == null || str.equals(""))
        return new String[0];
    
    String[] words = str.split(" ");
    
    return words;        
}

}
