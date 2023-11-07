package StringPrograms;

public class CharlengthInString {

	public static void main(String[] args) {
		
		String str="Rajkumar raj ";
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)!= ' ') 
			{
				count++;
				
			}
		System.out.println("String length is:" +count);

	}

}
