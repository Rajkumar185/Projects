package RbtPrograms;

import java.util.Scanner;

class Calculate{
	  public int deduction(int per_day_salary,int no_leaves,int pf,int pt){
		  return per_day_salary*no_leaves+pf+pt;
	  }
	  public int total_Salary(int per_day_salary){
		  return 30*per_day_salary;
	  }
	}
	public class EmployeeSalary extends Calculate{
		int Employee_salary(int deduction,int total_Salary){
			return total_Salary-deduction;
		}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			EmployeeSalary emp=new EmployeeSalary();
			System.out.println("Enter the per day Salary");
			int per_day_salary=sc.nextInt();
			System.out.println("Enter the number of leaves ");
			int no_leaves=sc.nextInt();
			System.out.println("Enter the pf");
			int pf=sc.nextInt();
			System.out.println("Enter the pt");
			int pt=sc.nextInt();
			
			int deductions=emp.deduction(per_day_salary, no_leaves, pf, pt);
			int Total_salary=emp.total_Salary(per_day_salary);
			int Net_salary=emp.Employee_salary(deductions,Total_salary);
			
			System.out.println("Employees Total salary  per month is :" +Net_salary);
			

		}

	}