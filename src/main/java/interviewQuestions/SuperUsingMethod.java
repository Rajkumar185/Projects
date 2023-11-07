package interviewQuestions;

class A{  
void eat(){
	System.out.println("eating...");}  
}  
class D extends A{  
void eat(){
	System.out.println("eating bread...");}  
void bark(){
	System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class SuperUsingMethod{  
public static void main(String args[]){  
D d=new D();  
d.work();  
}}  