package RbtPrograms;

import java.util.Scanner;

public class ProductCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total_pa=0;
		double pr,dis;
		System.out.println("enter the number of products to be purchased:");
		int product=sc.nextInt();
		
		for(int i=1;i<=product;i++)
		{
			System.out.println("Enter the price of the product");
			pr=sc.nextDouble();
			System.out.println("Enter the discount applicable");
			dis=sc.nextDouble();
			double payment=payable_amount(pr,dis);
			System.out.println("Amount Payable is:"+payment);
			total_pa=total_pa + payment;
			System.out.println("Total payable is :"+total_pa);
			
		}
		if(total_pa>=2000)
		{
			System.out.println("Eligible for 20% more discount");
		}
		else
		{
			System.out.println("Not Eligible");
		}

	}
	public static double payable_amount(double pr,double dis){
		return (pr-(pr*(dis/100)));
	}

}
