package RbtPrograms;

import java.util.Scanner;

class Animal1//super  parent class
{  
    void eat()
    {
        System.out.println("eating...");
    }  
}  

 

class Dog1 extends Animal1 //parent
{  
    void bark()
    {
        System.out.println("barking...");
    }  
}  

 


class BabyDog extends Dog1 // child class
{  
    void weep()
    {
        System.out.println("weeping...");
    }  
    int addition(int a, int b)
    {
        //System.out.println("Sum is "+(a+b));
         return a+b;
    }

 

}  


public class InheritenceMultilevel {
	public static void main(String args[])
    {  
        BabyDog d=new BabyDog(); //child class object  
        d.weep();
        //d.addition(a,b);
        d.bark();  
        d.eat(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two digits ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum =d.addition(a,b);
        System.out.println("Sum is "+sum);
        sc.close();

}
}
