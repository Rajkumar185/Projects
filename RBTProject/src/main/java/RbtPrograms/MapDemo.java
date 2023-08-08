package RbtPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(1,"a");
		m.put(2,"b");
		m.put(3,"c");
		m.put(4,"d");
		m.put(5,"e");
		
		
		System.out.println(m);
		System.out.println("size is:"+m.size());
		System.out.println(m.remove(1));
		System.out.println(m.get(2));
		System.out.println(m.containsKey(3));
		System.out.println(m.replace(4, "d", "p"));
		System.out.println(m);
		System.out.println("size is:"+m.size());
		
		
		Set<Integer>keys=m.keySet();
		for(Integer integer:keys) {
			System.out.println(integer);
			String val=m.get(integer);
			System.out.println(val);
						
		}
		m.clear();
		
		System.out.println(m);

		

	}

}
