package interviewQuestions;

import java.util.*;  
class Arraylist{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
//list.add(10);
//list.add(20);  
//list.add(30);  
//list.add(40);  
list.add("Rajkumar");
list.add("Mohin");  
list.add("Rajkumar");  
list.add("Ajay");  

Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}