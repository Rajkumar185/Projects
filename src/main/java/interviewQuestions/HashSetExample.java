package interviewQuestions;
import java.util.*;  
public class HashSetExample{  
public static void main(String args[]){  
HashSet<String> set=new HashSet<String>();  
set.add("Rajkumar");  
set.add("Mohin");  
set.add("Rajkumar");  
set.add("Ajay"); 

Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
