package interviewQuestions;

 
public class Encapsulation {  
public static void main(String[] args) {  

  Account acc=new Account();  
  acc.setAcc_no(75605040008977744L);  
  acc.setName("Rajkumar");  
  acc.setEmail("Rajkumarraj@gmail.com");  
  acc.setAmount(500000f);  
  System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
