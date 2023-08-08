package RbtPrograms;

class Employee{
	
	float salary=40000;
	
}

public class Inheritence_programmer extends Employee{
	int bonus=10000;

	public static void main(String[] args) {
	
		Inheritence_programmer in=new Inheritence_programmer();
		System.out.println("salary of employee:"+in.salary);
		System.out.println("bonus of employee:"+in.bonus);
		
		
}

}
