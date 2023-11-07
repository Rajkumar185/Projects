/**Find out number of occurrences of each word in a sentence  */
package javaAssignment3;
import java.util.HashMap;
import java.util.Map;

public class WordOccurrence03 {
	
	private static void findWordoccurence(String sentence)
	{
		Map<String,Integer>words =new HashMap<String,Integer>();
		for(String word:sentence.split(" ")) {
			if(words.containsKey(word)) {
				words.put(word, words.get(word) +1);
				
			}else {
				words.put(word,1);
			}
		}
		System.out.println(words);
	}
	
	public static void main(String[] args) {
	
		findWordoccurence("Rajkumar raj raj is part part of persistent");
	}

}
