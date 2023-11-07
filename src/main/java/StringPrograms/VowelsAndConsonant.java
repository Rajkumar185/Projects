package StringPrograms;

public class VowelsAndConsonant {
	
	public static void main(String[] args) {
		
		String str="this is Rajkumar";
		str.toLowerCase();
		int Vcount=0,Ccount=0;
		
		for(int i=0;i<str.length();i++) 
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				Vcount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				Ccount++;
				
			}
				System.out.println("Vowels count is: "+Vcount);
				System.out.println("Consonant count is:"+Ccount);
				
			}
	}


