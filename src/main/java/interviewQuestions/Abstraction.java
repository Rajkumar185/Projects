package interviewQuestions;

	abstract class Car  
	{   
	abstract void start();  

	public void stop()  
	{  
	System.out.println("The car engine is not started.");  
	}  
	}  
	public class Abstraction extends Car  
	{  

	void start()  
	{  
	System.out.println("The car engine has been started.");  
	}  
	public static void main(String[] args)  
	{  
		Abstraction obj = new Abstraction();  

	obj.start();  
	obj.stop();  
	}  
	}  

