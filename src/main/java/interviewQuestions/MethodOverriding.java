package interviewQuestions;
  
class Vehicle{  

void run(){
	System.out.println("Vehicle is running");
	}  
}  

class Bike2 extends Vehicle{  

void run(){
	System.out.println("Bike is running safely");
}  
}

class MethodOverriding{
public static void main(String args[]){  
Bike2 obj = new Bike2();
//Vehicle c=new Bike2();
//c.run();
obj.run();  
}
}
