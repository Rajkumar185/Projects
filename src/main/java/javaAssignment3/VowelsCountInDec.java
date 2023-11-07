/**4.	Find out vowels present in each word of the sentence. After finding vowels present in each word. 
 *  Do sorting of words in descending order. Word with maximum vowel should come in beginning and word with least vowel should go in last. 
 *  Ignore the words which donot have any vowel. */
package javaAssignment3;

public class VowelsCountInDec {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sharma part Persistent";	
		String[] arr=s.split(" ");
		int[] count=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			count[i]=countVowels(arr[i]);
		}
		for(int i=0;i<count.length;i++)
		{
			for(int j=1;j<count.length-i;j++)
			{
				if(count[j-1]<count[j])
				{
					int tempCount=count[j-1];
					count[j-1]=count[j];
					count[j]=tempCount;
					
					String tempString=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tempString;
				}
			}
		}
		System.out.println(String.join(" ",arr));
			}
	public static int countVowels(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			String s=(str.charAt(i)+"").toLowerCase();
			if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u"))
			{
				c++;
			}
		}
		return c;
	}



}
