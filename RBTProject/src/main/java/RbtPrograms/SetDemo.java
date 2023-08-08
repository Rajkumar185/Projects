package RbtPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		System.out.println("size is:"+s.size());
		System.out.println("Hashset is:"+s);
		
		int sum=0;
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			sum +=it.next();
		}
		System.out.println("sum is:"+sum);
		
		int sum1=0;
		for(Integer i:s) {
			sum1 +=i;
		}
		System.out.println("sum1 is:"+sum1);
		
		s = new LinkedHashSet<Integer>();
		s.add(600);
		s.add(700);
		System.out.println("size is:"+s.size());
		System.out.println("LinkedHashSet is:"+s);
		
		s = new TreeSet<Integer>();
		s.add(800);
		s.add(900);
		s.add(1000);
		System.out.println("size is:"+s.size());
		System.out.println("TreeSet is:"+s);

	}

}
