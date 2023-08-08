package RbtPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("size is:"+list.size());
		System.out.println(list);
		
		
		list.add(100);
		list.add(new Integer(20));
		
		System.out.println(list);
		System.out.println("size is:"+list.size());
		
		//insertion 
		list.add(200);
		System.out.println("size is:"+list.size());
		System.out.println(list);
		
		//removing the element in list using the index value
		list.remove(1);
		//list.remove(20);
		System.out.println("size is:"+list.size());
		System.out.println(list);
		
		boolean isAvaiable=list.contains(100);
		if(isAvaiable) {
			System.out.println("Element is found");
		}else {
			System.out.println("Element is not Found");
		}
		//using for loop
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			sum+=list.get(i);
		}
		System.out.println("sum is:"+sum);
		
		//using foreach
		int sum1=0;
		for(int s:list) {
			sum1 += s;
			System.out.println("Sum1 is:"+sum1);
			
		}
		//using iterator
		int sum2=0;
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			sum2 +=it.next();
		}
		System.out.println("sum2 is:"+sum2);
		

	}

}
