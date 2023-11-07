package StringPrograms;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		String str="Big black bug bit a big black dog on his big black nose";
		int count=0;
		
		str=str.toLowerCase();
		//String words[]=str.split(" ");
		char string[]=str.toCharArray();
		System.out.println("Duplicate words in a String is:");
		
		for(int i=0;i<string.length;i++) {
			count = 1;
			for(int j=i+1;j<string.length;j++) {
				//if(string[i].equals(string[j])) 
				if(string[i]==string[j]&&string[i]!=' ')
				{
					count++;
					
					string[j]=' ';
				}
			}
			if(count>1 && string[i]!=' ')	
				System.out.println(string[i]);
				

	}
	}
}
