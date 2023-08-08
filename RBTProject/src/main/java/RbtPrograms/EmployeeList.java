package RbtPrograms;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<EmployeeCollection>Employees=new ArrayList<EmployeeCollection>();
		
		Employees.add(new EmployeeCollection(123,"qwerty","Quality Engineer") );
		Employees.add(new EmployeeCollection(456,"zxfggfg","developer") );
		Employees.add(new EmployeeCollection(123,"qwerty","developer") );
		
		for(EmployeeCollection e:Employees) {
			System.out.println(e);
		}

	}

}
