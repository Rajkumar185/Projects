package RbtPrograms;

public class EmployeeCollection {
	
	private int Empid;
	private String Name;
	private String Designation;
	
	public EmployeeCollection(int Empid,String Name,String Designation) {
		this.Empid=Empid;
		this.Name=Name;
		this.Designation=Designation;
	}
		public String toString() {
			return "EmployeeCollection [Empid="+Empid+",Name="+Name+",Designation="+Designation+"]";
			
		}
	}


