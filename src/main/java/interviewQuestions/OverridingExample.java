package interviewQuestions;

class Super{
	   public static void sample(){
	      System.out.println("Method of the superclass");
	   }
	}
	public class OverridingExample extends Super {
	   public static void sample(){
	      System.out.println("Method of the subclass");
	   }  
	   public static void main(String args[]){
	      Super obj1 = (Super) new OverridingExample();
	      OverridingExample obj2 = new OverridingExample();
	      obj1.sample();
	     obj2.sample();
	   }
	}
