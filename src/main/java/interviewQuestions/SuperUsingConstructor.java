package interviewQuestions;

class Ani{  
Ani(){
	System.out.println("dog is eating");}  
}  
class Do extends Ani{  
Do(){  
super();  
System.out.println("dog is running");  
}  
}  
class SuperUsingConstructor{  
public static void main(String args[]){  
Do d=new Do();  
}}  