package StringPrograms;

public class CountPunctuations {

	public static void main(String[] args) {
		
		String str="this ! the ' punctuations , ; : count?";
		int count=0;
		
		for (int i=0;i<str.length();i++)
			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)==';' || str.charAt(i)==':'|| str.charAt(i)=='?') {
				count++;
			}
		System.out.println("the Count of punctuations in a string is:"+count);

	}

}
