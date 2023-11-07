package assignment01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Java");
		map.put(2,"Python");
		map.put(3,"R language");
		map.put(4,"Ruby Language");
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+ m.getValue()); */
		HashSet<String> set=new HashSet<String>();
		set.add("Java");
		set.add("Python");
		set.add("R Language");
		System.out.println("Iterating the set values");
		Iterator<String>it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		

	}

}
