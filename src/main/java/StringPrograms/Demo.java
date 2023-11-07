package StringPrograms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str="Rajkumar";
//        for(int i=0;i<str.length();i++) {
//        	System.out.print(str.charAt(i)+" ");
//       
		String str1="Good",str2="Morning";
		
		System.out.println("Before Swapping:"+str1+" "+str2);
		
        //Concatenate both the string str1 and str2 and store it in str1    
		str1=str1+str2;
		
		////Extract str2 from updated str1   
		str2=str1.substring(0,(str1.length()-str2.length()));
		
		//Extract str1 from updated str1
		str1=str1.substring(str2.length());
	
		System.out.println("After Swapping:"+str1+" "+str2);
	}
	

}
