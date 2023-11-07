package interviewQuestions;

public class StringDemo {

	public static void main(String[] args) {
		
//		String s = "Test";
//		s.concat("testing");
//		System.out.println(s);
//		
//		String s1=s.concat("testing");
//		String s2=s +"Raj";
//		System.out.println(s2);
//		s="Test"+"QA" ;
//		System.out.println(s);
//		String str1="rajkumar vijay";
//	   System.out.println(str1.indexOf("vijay"));
//	   System.out.println(str1.length());
//	   System.out.println(s.charAt(3));
//	   
	   StringBuffer sb=new StringBuffer("kumar");
	   System.out.println(sb.capacity());
	   System.out.println(sb.length());
       System.out.println(sb);	
       sb.insert(0,"Raj");
       System.out.println(sb);
       System.out.println(sb.indexOf("kumar"));
      
	}

}
