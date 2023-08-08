package RbtPrograms;

import java.util.ArrayList;
import java.util.List;

public class GenericProgram {

	public static void main(String[] args) {
		
		List list=new ArrayList();//before generic
		list.add(123);
		list.add("Raj");
		System.out.println(list);
		
		List<Integer>list1=new ArrayList<Integer>();//adding generic
		list1.add(456);
	//	list1.add("ertyu");
		System.out.println(list1);
		
		

	}

}
